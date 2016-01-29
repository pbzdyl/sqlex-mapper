package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.BadSqlGrammarException;
import net.bzdyl.sqlexmapper.DuplicateKeyException;
import net.bzdyl.sqlexmapper.SqlException;
import net.bzdyl.sqlexmapper.SqlExceptionMapper;
import org.junit.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;

public class SqlExceptionMapperImplTest {
    @Test
    public void mapsNotUsingSqlState() throws Exception {
        // given
        int errorCode = 1;
        String sqlState = "2";
        ErrorCodesMapping errorCodesMapping = ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, String.valueOf(errorCode))
                .withEntry(DuplicateKeyException.class, sqlState)
                .build();
        SQLException sourceException = new SQLException("Test", sqlState, errorCode);
        SqlExceptionMapper mapper = new SqlExceptionMapperImpl(errorCodesMapping);

        // when
        SqlException resultException = mapper.map(sourceException);

        // then
        assertThat(resultException)
                .isNotNull()
                .isExactlyInstanceOf(BadSqlGrammarException.class)
                .hasCause(sourceException);
    }

    @Test
    public void mapsUsingSqlState() throws Exception {
        // given
        int errorCode = 1;
        String sqlState = "2";
        ErrorCodesMapping errorCodesMapping = ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, String.valueOf(errorCode))
                .withEntry(DuplicateKeyException.class, sqlState)
                .useSqlState()
                .build();
        SQLException sourceException = new SQLException("Test", sqlState, errorCode);
        SqlExceptionMapper mapper = new SqlExceptionMapperImpl(errorCodesMapping);

        // when
        SqlException resultException = mapper.map(sourceException);

        // then
        assertThat(resultException)
                .isNotNull()
                .isExactlyInstanceOf(DuplicateKeyException.class)
                .hasCause(sourceException);
    }

    @Test
    public void mapsUnknownErrorCodeToGenericSqlException() throws Exception {
        ErrorCodesMapping errorCodesMapping = ErrorCodesMappingImpl.builder()
                .withEntry(DuplicateKeyException.class, "0")
                .build();
        SQLException sourceException = new SQLException("Test", "unknown state", 1);
        SqlExceptionMapper mapper = new SqlExceptionMapperImpl(errorCodesMapping);

        // when
        SqlException resultException = mapper.map(sourceException);

        // then
        assertThat(resultException)
                .isNotNull()
                .isExactlyInstanceOf(SqlException.class)
                .hasCause(sourceException);
    }
}

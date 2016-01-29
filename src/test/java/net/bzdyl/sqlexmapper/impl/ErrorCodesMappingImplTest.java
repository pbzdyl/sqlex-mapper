package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.CannotAcquireLockException;
import net.bzdyl.sqlexmapper.DuplicateKeyException;
import net.bzdyl.sqlexmapper.SqlException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ErrorCodesMappingImplTest {
    @Test
    public void builderRejectsNullExceptionClass() throws Exception {
        assertThatThrownBy(() -> ErrorCodesMappingImpl.builder().withEntry(null, "0"))
                .isExactlyInstanceOf(NullPointerException.class)
                .hasMessage("exceptionClass is null");
    }

    @Test
    public void useSqlStateIsNotSetByDefault() throws Exception {
        // given
        ErrorCodesMapping errorCodesMapping = ErrorCodesMappingImpl.builder()
                .withEntry(SqlException.class, "0")
                .build();

        // expect
        assertThat(errorCodesMapping.usesSqlState()).isFalse();
    }

    @Test
    public void cannotBuildErrorCodesMappingWithNoEntries() throws Exception {
        assertThatThrownBy(() -> ErrorCodesMappingImpl.builder().build())
                .isExactlyInstanceOf(IllegalStateException.class)
                .hasMessage("no mappings provided");
    }

    @Test
    public void builderAddsAllMappings() throws Exception {
        // given
        ErrorCodesMapping errorCodesMapping = ErrorCodesMappingImpl.builder()
                .withEntry(DuplicateKeyException.class, "1")
                .withEntry(CannotAcquireLockException.class, "2")
                .build();

        // expect
        assertThat(errorCodesMapping.exceptionClassForErrorCode("1"))
                .isSameAs(DuplicateKeyException.class);

        assertThat(errorCodesMapping.exceptionClassForErrorCode("2"))
                .isSameAs(CannotAcquireLockException.class);
    }
}

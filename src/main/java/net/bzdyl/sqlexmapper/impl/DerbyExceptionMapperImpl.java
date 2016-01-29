package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class DerbyExceptionMapperImpl extends SqlExceptionMapperImpl {
    public DerbyExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "42802", "42821", "42X01", "42X02", "42X03", "42X04", "42X05", "42X06", "42X07", "42X08")
                .withEntry(DuplicateKeyException.class, "23505")
                .withEntry(DataIntegrityViolationException.class, "22001", "22005", "23502", "23503", "23513", "X0Y32")
                .withEntry(DataAccessResourceFailureException.class, "04501", "08004", "42Y07")
                .withEntry(CannotAcquireLockException.class, "40XL1")
                .withEntry(DeadlockLoserDataAccessException.class, "40001")
                .useSqlState()
                .build());
    }
}

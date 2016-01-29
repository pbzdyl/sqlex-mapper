package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class InformixExceptionMapperImpl extends SqlExceptionMapperImpl {
    public InformixExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "201", "-217", "-696")
                .withEntry(DuplicateKeyException.class, "239", "-268", "-6017")
                .withEntry(DataIntegrityViolationException.class, "-692", "-11030")
                .withEntry(DataAccessResourceFailureException.class, "04501", "08004", "42Y07")
                .withEntry(CannotAcquireLockException.class, "40XL1")
                .withEntry(DeadlockLoserDataAccessException.class, "40001")
                .build());
    }
}

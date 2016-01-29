package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class H2ExceptionMapperImpl extends SqlExceptionMapperImpl {
    public H2ExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "42000", "42001", "42101", "42102", "42111", "42112", "42121",
                        "42122", "42132")
                .withEntry(DuplicateKeyException.class, "23001", "23505")
                .withEntry(DataIntegrityViolationException.class, "22001", "22003", "22012", "22018", "22025", "23000",
                        "23002", "23003", "23502", "23503", "23506", "23507", "23513")
                .withEntry(DataAccessResourceFailureException.class, "90046", "90100", "90117", "90121", "90126")
                .withEntry(CannotAcquireLockException.class, "50200")
                .build());
    }
}

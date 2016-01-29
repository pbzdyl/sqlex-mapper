package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class PostgreSQLExceptionMapperImpl extends SqlExceptionMapperImpl {
    public PostgreSQLExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "03000", "42000", "42601", "42602", "42622", "42804", "42P01")
                .withEntry(DuplicateKeyException.class, "23505")
                .withEntry(DataIntegrityViolationException.class, "23000", "23502", "23503", "23514")
                .withEntry(DataAccessResourceFailureException.class, "53000", "53100", "53200", "53300")
                .withEntry(CannotAcquireLockException.class, "54", "30006")
                .withEntry(CannotSerializeTransactionException.class, "8177")
                .withEntry(DeadlockLoserDataAccessException.class, "60")
                .useSqlState()
                .build());
    }
}

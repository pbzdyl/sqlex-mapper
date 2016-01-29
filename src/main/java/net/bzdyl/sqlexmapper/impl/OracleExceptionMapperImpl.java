package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class OracleExceptionMapperImpl extends SqlExceptionMapperImpl {
    public OracleExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "900", "903", "904", "917", "936", "942", "17006", "6550")
                .withEntry(InvalidResultSetAccessException.class, "17003")
                .withEntry(DuplicateKeyException.class, "1")
                .withEntry(DataIntegrityViolationException.class, "1400", "1722", "2291", "2292")
                .withEntry(DataAccessResourceFailureException.class, "17002", "17447")
                .withEntry(CannotAcquireLockException.class, "54", "30006")
                .withEntry(CannotSerializeTransactionException.class, "8177")
                .withEntry(DeadlockLoserDataAccessException.class, "60")
                .build());
    }
}

package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class MSSQLExceptionMapperImpl extends SqlExceptionMapperImpl {
    public MSSQLExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "156", "170", "207", "208", "209")
                .withEntry(PermissionDeniedDataAccessException.class, "229")
                .withEntry(DuplicateKeyException.class, "2601", "2627")
                .withEntry(DataIntegrityViolationException.class, "544", "8114", "8115")
                .withEntry(DataAccessResourceFailureException.class, "4060")
                .withEntry(CannotAcquireLockException.class, "1222")
                .withEntry(DeadlockLoserDataAccessException.class, "1205")
                .build());
    }
}

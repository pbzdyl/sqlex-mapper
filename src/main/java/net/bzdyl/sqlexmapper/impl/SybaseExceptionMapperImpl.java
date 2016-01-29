package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class SybaseExceptionMapperImpl extends SqlExceptionMapperImpl {
    public SybaseExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "101", "102", "103", "104", "105", "106", "107", "108", "109",
                        "110", "111", "112", "113", "116", "120", "121", "123", "207", "208", "213", "257", "512")
                .withEntry(DuplicateKeyException.class, "2601", "2615", "2626")
                .withEntry(DataIntegrityViolationException.class, "233", "511", "515", "530", "546", "547", "2615", "2714")
                .withEntry(TransientDataAccessResourceException.class, "921", "1105")
                .withEntry(CannotAcquireLockException.class, "12205")
                .withEntry(DeadlockLoserDataAccessException.class, "1205")
                .build());
    }
}

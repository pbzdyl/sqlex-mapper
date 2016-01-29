package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class MySQLExceptionMapperImpl extends SqlExceptionMapperImpl {
    public MySQLExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "1054", "1064", "1146")
                .withEntry(DuplicateKeyException.class, "1062")
                .withEntry(DataIntegrityViolationException.class, "630", "839", "840", "893", "1169", "1215", "1216",
                        "1217", "1364", "1451", "1452", "1557")
                .withEntry(DataAccessResourceFailureException.class, "1")
                .withEntry(CannotAcquireLockException.class, "1205")
                .withEntry(DeadlockLoserDataAccessException.class, "1213")
                .build());
    }
}

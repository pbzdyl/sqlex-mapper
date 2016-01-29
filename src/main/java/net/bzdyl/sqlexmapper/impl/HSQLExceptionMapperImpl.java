package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class HSQLExceptionMapperImpl extends SqlExceptionMapperImpl {
    public HSQLExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "-22", "-28")
                .withEntry(DuplicateKeyException.class, "-104")
                .withEntry(DataIntegrityViolationException.class, "-9")
                .withEntry(DataAccessResourceFailureException.class, "-80")
                .build());
    }
}

package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.*;

public class DB2ExceptionMapperImpl extends SqlExceptionMapperImpl {
    public DB2ExceptionMapperImpl() {
        super(ErrorCodesMappingImpl.builder()
                .withEntry(BadSqlGrammarException.class, "-007", "-029", "-097", "-104", "-109", "-115", "-128", "-199", "-204", "-206", "-301", "-408", "-441", "-491")
                .withEntry(DuplicateKeyException.class, "803")
                .withEntry(DataIntegrityViolationException.class, "407", "-530", "-531", "-532", "-543", "-544", "-545", "-603", "-667")
                .withEntry(DataAccessResourceFailureException.class, "904", "-971")
                .withEntry(TransientDataAccessResourceException.class, "-1035", "-1218", "-30080", "-30081")
                .withEntry(DeadlockLoserDataAccessException.class, "-911", "-913")
                .build());
    }
}

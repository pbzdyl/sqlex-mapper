package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.SqlException;

public interface ErrorCodesMapping {
    boolean usesSqlState();
    Class<? extends SqlException> exceptionClassForErrorCode(String errorCode);
}

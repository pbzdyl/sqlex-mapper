package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.SqlException;
import net.bzdyl.sqlexmapper.SqlExceptionMapper;

import java.lang.reflect.Constructor;
import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.util.Objects;

public class SqlExceptionMapperImpl implements SqlExceptionMapper {
    private final ErrorCodesMapping errorCodes;

    public SqlExceptionMapperImpl(ErrorCodesMapping errorCodes) {
        this.errorCodes = Objects.requireNonNull(errorCodes, "errorCodes is null");
    }

    @Override
    public SqlException map(SQLException exception) {
        SQLException sqlEx = exception;
        if (sqlEx instanceof BatchUpdateException && sqlEx.getNextException() != null) {
            SQLException nestedSqlEx = sqlEx.getNextException();
            if (nestedSqlEx.getErrorCode() > 0 || nestedSqlEx.getSQLState() != null) {
                sqlEx = nestedSqlEx;
            }
        }

        String errorCode;
        if (this.errorCodes.usesSqlState()) {
            errorCode = sqlEx.getSQLState();
        } else {
            // Try to find SQLException with actual error code, looping through the causes.
            // E.g. applicable to java.sql.DataTruncation as of JDK 1.6.
            SQLException current = sqlEx;
            while (current.getErrorCode() == 0 && current.getCause() instanceof SQLException) {
                current = (SQLException) current.getCause();
            }
            errorCode = Integer.toString(current.getErrorCode());
        }

        Class<? extends SqlException> exceptionClass = this.errorCodes.exceptionClassForErrorCode(errorCode);
        if (exceptionClass != null) {
            return createException(exceptionClass, sqlEx);
        }

        return null;
    }

    private static SqlException createException(Class<? extends SqlException> exceptionClass, Throwable cause) {
        Constructor<? extends SqlException> constructor;
        try {
            constructor = exceptionClass.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e) {
            throw new SqlException("Missing SqlException(Throwable) constructor. Please, report a bug", e);
        }
        try {
            return constructor.newInstance(cause);
        } catch (Exception e) {
            throw new SqlException("Cannot construct SqlException. Please, report a bug", e);
        }
    }
}

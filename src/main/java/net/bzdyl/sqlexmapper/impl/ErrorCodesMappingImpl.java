package net.bzdyl.sqlexmapper.impl;

import net.bzdyl.sqlexmapper.SqlException;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class ErrorCodesMappingImpl implements ErrorCodesMapping {
    private final Map<String, Class<? extends SqlException>> exceptionClassByErrorCode;
    private final boolean useSqlState;

    public static Builder builder() {
        return new Builder();
    }

    private ErrorCodesMappingImpl(Map<String, Class<? extends SqlException>> mapping, boolean useSqlState) {
        assert mapping != null;
        this.exceptionClassByErrorCode = mapping;
        this.useSqlState = useSqlState;
    }

    @Override
    public boolean usesSqlState() {
        return useSqlState;
    }

    @Override
    public Class<? extends SqlException> exceptionClassForErrorCode(String errorCode) {
        return exceptionClassByErrorCode.get(errorCode);
    }

    public static class Builder {
        private final Map<String, Class<? extends SqlException>> exceptionClassByErrorCode = new HashMap<>();
        private boolean useSqlState;

        public Builder withEntry(Class<? extends SqlException> exceptionClass, String... errorCodes) {
            requireNonNull(exceptionClass, "exceptionClass is null");

            for (String errorCode : errorCodes) {
                if (errorCode != null && !errorCode.trim().isEmpty()) {
                    exceptionClassByErrorCode.put(errorCode, exceptionClass);
                }
            }

            return this;
        }

        public Builder useSqlState(boolean useSqlState) {
            this.useSqlState = useSqlState;
            return this;
        }

        public Builder useSqlState() {
            return useSqlState(true);
        }

        public Builder dontUseSqlState() {
            return useSqlState(false);
        }

        public ErrorCodesMapping build() {
            if (exceptionClassByErrorCode.isEmpty()) {
                throw new IllegalStateException("no mappings provided");
            }
            return new ErrorCodesMappingImpl(exceptionClassByErrorCode, useSqlState);
        }
    }
}

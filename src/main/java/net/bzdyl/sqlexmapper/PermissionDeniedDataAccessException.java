package net.bzdyl.sqlexmapper;

public class PermissionDeniedDataAccessException extends NonTransientDataAccessException {
    public PermissionDeniedDataAccessException(String message) {
        super(message);
    }

    public PermissionDeniedDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionDeniedDataAccessException(Throwable cause) {
        super(cause);
    }
}

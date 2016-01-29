package net.bzdyl.sqlexmapper;

public class TransientDataAccessException extends SqlException {
    public TransientDataAccessException(String message) {
        super(message);
    }

    public TransientDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransientDataAccessException(Throwable cause) {
        super(cause);
    }
}

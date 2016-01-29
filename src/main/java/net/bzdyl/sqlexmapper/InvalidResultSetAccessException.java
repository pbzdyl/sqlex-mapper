package net.bzdyl.sqlexmapper;

public class InvalidResultSetAccessException extends InvalidDataAccessResourceUsageException {
    public InvalidResultSetAccessException(String message) {
        super(message);
    }

    public InvalidResultSetAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidResultSetAccessException(Throwable cause) {
        super(cause);
    }
}

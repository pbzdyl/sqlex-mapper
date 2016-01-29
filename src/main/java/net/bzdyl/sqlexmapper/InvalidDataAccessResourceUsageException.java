package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 28/01/16.
 */
public class InvalidDataAccessResourceUsageException extends NonTransientDataAccessException {
    public InvalidDataAccessResourceUsageException(String message) {
        super(message);
    }

    public InvalidDataAccessResourceUsageException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDataAccessResourceUsageException(Throwable cause) {
        super(cause);
    }
}

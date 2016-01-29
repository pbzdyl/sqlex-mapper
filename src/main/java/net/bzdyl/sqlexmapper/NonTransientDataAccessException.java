package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class NonTransientDataAccessException extends SqlException {
    public NonTransientDataAccessException(String message) {
        super(message);
    }

    public NonTransientDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonTransientDataAccessException(Throwable cause) {
        super(cause);
    }
}

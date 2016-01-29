package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class DataIntegrityViolationException extends NonTransientDataAccessException {
    public DataIntegrityViolationException(String message) {
        super(message);
    }

    public DataIntegrityViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataIntegrityViolationException(Throwable cause) {
        super(cause);
    }
}

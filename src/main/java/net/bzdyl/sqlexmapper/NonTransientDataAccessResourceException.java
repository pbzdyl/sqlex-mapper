package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 28/01/16.
 */
public class NonTransientDataAccessResourceException extends NonTransientDataAccessException {
    public NonTransientDataAccessResourceException(String message) {
        super(message);
    }

    public NonTransientDataAccessResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonTransientDataAccessResourceException(Throwable cause) {
        super(cause);
    }
}

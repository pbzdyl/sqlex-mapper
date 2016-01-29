package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class TransientDataAccessResourceException extends TransientDataAccessException {
    public TransientDataAccessResourceException(String message) {
        super(message);
    }

    public TransientDataAccessResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransientDataAccessResourceException(Throwable cause) {
        super(cause);
    }
}

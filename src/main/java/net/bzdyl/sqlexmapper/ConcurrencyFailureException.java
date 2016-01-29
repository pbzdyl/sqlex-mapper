package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class ConcurrencyFailureException extends TransientDataAccessException {
    public ConcurrencyFailureException(String message) {
        super(message);
    }

    public ConcurrencyFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConcurrencyFailureException(Throwable cause) {
        super(cause);
    }
}

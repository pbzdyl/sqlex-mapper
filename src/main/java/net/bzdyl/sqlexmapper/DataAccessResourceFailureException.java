package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 28/01/16.
 */
public class DataAccessResourceFailureException extends NonTransientDataAccessResourceException {
    public DataAccessResourceFailureException(String message) {
        super(message);
    }

    public DataAccessResourceFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessResourceFailureException(Throwable cause) {
        super(cause);
    }
}

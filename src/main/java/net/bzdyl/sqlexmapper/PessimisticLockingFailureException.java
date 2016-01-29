package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class PessimisticLockingFailureException extends ConcurrencyFailureException {
    public PessimisticLockingFailureException(String message) {
        super(message);
    }

    public PessimisticLockingFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public PessimisticLockingFailureException(Throwable cause) {
        super(cause);
    }
}

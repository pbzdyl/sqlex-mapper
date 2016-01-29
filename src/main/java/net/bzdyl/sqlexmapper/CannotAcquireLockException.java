package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class CannotAcquireLockException extends PessimisticLockingFailureException {
    public CannotAcquireLockException(String message) {
        super(message);
    }

    public CannotAcquireLockException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotAcquireLockException(Throwable cause) {
        super(cause);
    }
}

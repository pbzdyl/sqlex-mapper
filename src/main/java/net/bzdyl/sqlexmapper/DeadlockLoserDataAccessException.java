package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class DeadlockLoserDataAccessException extends PessimisticLockingFailureException {
    public DeadlockLoserDataAccessException(String message) {
        super(message);
    }

    public DeadlockLoserDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeadlockLoserDataAccessException(Throwable cause) {
        super(cause);
    }
}

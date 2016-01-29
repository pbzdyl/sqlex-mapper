package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class CannotSerializeTransactionException extends PessimisticLockingFailureException {
    public CannotSerializeTransactionException(String message) {
        super(message);
    }

    public CannotSerializeTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotSerializeTransactionException(Throwable cause) {
        super(cause);
    }
}

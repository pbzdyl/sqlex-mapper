package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 27/01/16.
 */
public class DuplicateKeyException extends DataIntegrityViolationException {
    public DuplicateKeyException(String message) {
        super(message);
    }

    public DuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateKeyException(Throwable cause) {
        super(cause);
    }
}

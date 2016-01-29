package net.bzdyl.sqlexmapper;

/**
 * Created by badyl on 28/01/16.
 */
public class BadSqlGrammarException extends InvalidDataAccessResourceUsageException {
    public BadSqlGrammarException(String message) {
        super(message);
    }

    public BadSqlGrammarException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadSqlGrammarException(Throwable cause) {
        super(cause);
    }
}

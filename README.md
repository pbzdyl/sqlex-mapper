# sqlex-mapper

## Map `java.sql.SQLException` to more a meaningful exceptions hierarchy

Exception handling in JDBC is not easy. It provides base `java.sql.SQLException` with `getSQLState` and `getErrorCode`
information but it's vendor specific and cumbersome to use. Yes, JDBC 4 (since Java 6) provides some improvements
(additional exception hierarchy including classes like `java.sql.SQLIntegrityConstraintViolationException` etc.).
Unfortunately not all SQL vendors catched up with those improvements (e.g. PostgreSQL still uses
[a single class](https://github.com/pgjdbc/pgjdbc/blob/master/pgjdbc/src/main/java/org/postgresql/util/PSQLException.java)
for all kinds of errors).

This projects borrows the idea and code from [Spring Framework.](https://github.com/spring-projects/spring-framework)
It provides simplified version of [SQLExceptionTranslator](https://github.com/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/java/org/springframework/jdbc/support/SQLExceptionTranslator.java) - [SqlExceptionMapper](src/main/java/net/bzdyl/sqlexmapper/SqlExceptionMapper).

The default implementation of `SqlExceptionMapper` provides translation similar to [SQLErrorCodeSQLExceptionTranslator](https://github.com/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/java/org/springframework/jdbc/support/SQLErrorCodeSQLExceptionTranslator.java)
and uses the same [error codes mapping.](https://github.com/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/resources/org/springframework/jdbc/support/sql-error-codes.xml)

_This is a very early version and API can still change._

## Credits

Big 'thank you' goes to Spring Framework team for their implementation.

## License

This project is released under version 2.0 of the [Apache License][].

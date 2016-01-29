package net.bzdyl.sqlexmapper;

import net.bzdyl.sqlexmapper.impl.*;

import java.sql.SQLException;

public interface SqlExceptionMapper {
    SqlException map(SQLException exception);

    static SqlExceptionMapper db2ExceptionMapper() {
        return new DB2ExceptionMapperImpl();
    }

    static SqlExceptionMapper derbyExceptionMapper() {
        return new DerbyExceptionMapperImpl();
    }

    static SqlExceptionMapper h2ExceptionMapper() {
        return new H2ExceptionMapperImpl();
    }

    static SqlExceptionMapper hanaExceptionMapper() {
        return new HanaExceptionMapperImpl();
    }

    static SqlExceptionMapper hsqlExceptionMapper() {
        return new HSQLExceptionMapperImpl();
    }

    static SqlExceptionMapper informixExceptionMapper() {
        return new InformixExceptionMapperImpl();
    }

    static SqlExceptionMapper mssqlExceptionMapper() {
        return new MSSQLExceptionMapperImpl();
    }

    static SqlExceptionMapper mysqlExceptionMapper() {
        return new MySQLExceptionMapperImpl();
    }

    static SqlExceptionMapper oracleExceptionMapper() {
        return new OracleExceptionMapperImpl();
    }

    static SqlExceptionMapper postgresqlExceptionMapper() {
        return new PostgreSQLExceptionMapperImpl();
    }

    static SqlExceptionMapper sybaseExceptionMapper() {
        return new SybaseExceptionMapperImpl();
    }
}

package ch.qos.logback.classic.db;

import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;
import e.a.d.a.a;
/* loaded from: classes.dex */
public class SQLBuilder {
    public static String buildCreateExceptionTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        a.E(dBNameResolver, columnName, sb, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.I;
        a.E(dBNameResolver, columnName2, sb, " SMALLINT NOT NULL, ");
        sb.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb.append(" VARCHAR(254) NOT NULL, ");
        sb.append("PRIMARY KEY (");
        sb.append(dBNameResolver.getColumnName(columnName));
        sb.append(", ");
        sb.append(dBNameResolver.getColumnName(columnName2));
        sb.append("), ");
        sb.append("FOREIGN KEY (");
        sb.append(dBNameResolver.getColumnName(columnName));
        sb.append(") ");
        sb.append("REFERENCES ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb.append(" (");
        sb.append(dBNameResolver.getColumnName(columnName));
        return a.r(sb, ") ", ")");
    }

    public static String buildCreateLoggingEventTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb.append(" (");
        a.E(dBNameResolver, ColumnName.TIMESTMP, sb, " BIGINT NOT NULL, ");
        a.E(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb, " TEXT NOT NULL, ");
        a.E(dBNameResolver, ColumnName.LOGGER_NAME, sb, " VARCHAR(254) NOT NULL, ");
        a.E(dBNameResolver, ColumnName.LEVEL_STRING, sb, " VARCHAR(254) NOT NULL, ");
        a.E(dBNameResolver, ColumnName.THREAD_NAME, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.REFERENCE_FLAG, sb, " SMALLINT, ");
        a.E(dBNameResolver, ColumnName.ARG0, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.ARG1, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.ARG2, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.ARG3, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.CALLER_FILENAME, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.CALLER_CLASS, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.CALLER_METHOD, sb, " VARCHAR(254), ");
        a.E(dBNameResolver, ColumnName.CALLER_LINE, sb, " CHAR(4), ");
        sb.append(dBNameResolver.getColumnName(ColumnName.EVENT_ID));
        sb.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT");
        sb.append(")");
        return sb.toString();
    }

    public static String buildCreatePropertyTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        a.E(dBNameResolver, columnName, sb, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.MAPPED_KEY;
        a.E(dBNameResolver, columnName2, sb, " VARCHAR(254) NOT NULL, ");
        sb.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb.append(" VARCHAR(254) NOT NULL, ");
        sb.append("PRIMARY KEY (");
        sb.append(dBNameResolver.getColumnName(columnName));
        sb.append(", ");
        sb.append(dBNameResolver.getColumnName(columnName2));
        sb.append("), ");
        sb.append("FOREIGN KEY (");
        sb.append(dBNameResolver.getColumnName(columnName));
        sb.append(") ");
        sb.append("REFERENCES ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb.append(" (");
        sb.append(dBNameResolver.getColumnName(columnName));
        return a.r(sb, ") ", ")");
    }

    public static String buildDeleteExpiredLogsSQL(DBNameResolver dBNameResolver, long j2) {
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb.append(" WHERE ");
        a.E(dBNameResolver, ColumnName.TIMESTMP, sb, " <= ");
        return a.q(sb, j2, ";");
    }

    public static String buildInsertExceptionSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb.append(" (");
        a.E(dBNameResolver, ColumnName.EVENT_ID, sb, ", ");
        a.E(dBNameResolver, ColumnName.I, sb, ", ");
        sb.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb.append(") ");
        sb.append("VALUES (?, ?, ?)");
        return sb.toString();
    }

    public static String buildInsertPropertiesSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb.append(" (");
        a.E(dBNameResolver, ColumnName.EVENT_ID, sb, ", ");
        a.E(dBNameResolver, ColumnName.MAPPED_KEY, sb, ", ");
        sb.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb.append(") ");
        sb.append("VALUES (?, ?, ?)");
        return sb.toString();
    }

    public static String buildInsertSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb.append(" (");
        a.E(dBNameResolver, ColumnName.TIMESTMP, sb, ", ");
        a.E(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb, ", ");
        a.E(dBNameResolver, ColumnName.LOGGER_NAME, sb, ", ");
        a.E(dBNameResolver, ColumnName.LEVEL_STRING, sb, ", ");
        a.E(dBNameResolver, ColumnName.THREAD_NAME, sb, ", ");
        a.E(dBNameResolver, ColumnName.REFERENCE_FLAG, sb, ", ");
        a.E(dBNameResolver, ColumnName.ARG0, sb, ", ");
        a.E(dBNameResolver, ColumnName.ARG1, sb, ", ");
        a.E(dBNameResolver, ColumnName.ARG2, sb, ", ");
        a.E(dBNameResolver, ColumnName.ARG3, sb, ", ");
        a.E(dBNameResolver, ColumnName.CALLER_FILENAME, sb, ", ");
        a.E(dBNameResolver, ColumnName.CALLER_CLASS, sb, ", ");
        a.E(dBNameResolver, ColumnName.CALLER_METHOD, sb, ", ");
        sb.append(dBNameResolver.getColumnName(ColumnName.CALLER_LINE));
        sb.append(") ");
        sb.append("VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        return sb.toString();
    }
}

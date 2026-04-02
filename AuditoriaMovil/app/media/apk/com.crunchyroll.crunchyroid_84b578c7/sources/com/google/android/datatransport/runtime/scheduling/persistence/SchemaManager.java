package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SchemaManager extends SQLiteOpenHelper {
    private static final String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    private static final String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    private static final String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final String DB_NAME = "com.google.android.datatransport.events";
    private static final String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
    private static final String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
    private static final String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final List<Migration> INCREMENTAL_MIGRATIONS;
    private static final Migration MIGRATE_TO_V1;
    private static final Migration MIGRATE_TO_V2;
    private static final Migration MIGRATE_TO_V3;
    private static final Migration MIGRATE_TO_V4;
    private static final Migration MIGRATION_TO_V5;
    private boolean configured;
    private final int schemaVersion;
    private static final String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    static int SCHEMA_VERSION = 5;

    /* loaded from: classes2.dex */
    public interface Migration {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        x xVar = new x();
        MIGRATE_TO_V1 = xVar;
        y yVar = new y();
        MIGRATE_TO_V2 = yVar;
        z zVar = new z();
        MIGRATE_TO_V3 = zVar;
        a0 a0Var = new a0();
        MIGRATE_TO_V4 = a0Var;
        b0 b0Var = new b0();
        MIGRATION_TO_V5 = b0Var;
        INCREMENTAL_MIGRATIONS = Arrays.asList(xVar, yVar, zVar, a0Var, b0Var);
    }

    public SchemaManager(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.configured = false;
        this.schemaVersion = i;
    }

    private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
        if (!this.configured) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_EVENTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_METADATA_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_BACKEND_INDEX_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(CREATE_PAYLOADS_TABLE_V4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        sQLiteDatabase.execSQL(CREATE_LOG_EVENT_DROPPED_TABLE);
        sQLiteDatabase.execSQL(CREATE_GLOBAL_LOG_EVENT_STATE_TABLE);
        sQLiteDatabase.execSQL(CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL);
    }

    private void upgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<Migration> list = INCREMENTAL_MIGRATIONS;
        if (i2 <= list.size()) {
            while (i < i2) {
                INCREMENTAL_MIGRATIONS.get(i).upgrade(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder a = com.amazon.aps.iva.b6.x.a("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        a.append(list.size());
        a.append(" migrations are provided");
        throw new IllegalArgumentException(a.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.configured = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(sQLiteDatabase, this.schemaVersion);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(DROP_EVENTS_SQL);
        sQLiteDatabase.execSQL(DROP_EVENT_METADATA_SQL);
        sQLiteDatabase.execSQL(DROP_CONTEXTS_SQL);
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        onCreate(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, i, i2);
    }

    private void onCreate(SQLiteDatabase sQLiteDatabase, int i) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, 0, i);
    }
}

package com.amazon.aps.iva.oa0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: BatchManagerPersistenceSqlite.java */
/* loaded from: classes4.dex */
public final class n implements m {
    public static final /* synthetic */ int c = 0;
    public final a a;
    public final Context b;

    static {
        new com.amazon.aps.iva.b30.j(n.class.getSimpleName());
    }

    public n(Context context) {
        this.a = new a(context);
        this.b = context;
    }

    public final boolean a(String str, String str2) {
        a aVar = this.a;
        aVar.getClass();
        if (!aVar.a(str)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("eventKey", str);
            contentValues.put("value", str2);
            if (aVar.b.insert("events", null, contentValues) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        a aVar = this.a;
        aVar.getClass();
        if (aVar.a(str)) {
            if (aVar.b.delete("events", "eventKey =?", new String[]{str}) == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(String str, String str2) {
        a aVar = this.a;
        aVar.getClass();
        if (aVar.a(str)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("eventKey", str);
            contentValues.put("value", str2);
            if (aVar.b.replace("events", null, contentValues) != -1) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: BatchManagerPersistenceSqlite.java */
    /* loaded from: classes4.dex */
    public static class a extends SQLiteOpenHelper {
        public final SQLiteDatabase b;

        public a(Context context) {
            super(context, "singular-batch-managerx-1.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.b = getWritableDatabase();
        }

        public final boolean a(String str) {
            int i = n.c;
            Cursor rawQuery = this.b.rawQuery("SELECT * FROM events WHERE eventKey= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() != 0) {
                rawQuery.close();
                return true;
            } else if (rawQuery != null) {
                rawQuery.close();
                return false;
            } else {
                return false;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE events (eventKey  TEXT PRIMARY KEY NOT NULL,value TEXT )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}

package com.ironsource.environment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class f extends SQLiteOpenHelper {
    public f(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            readableDatabase = new f(e.a().a).getReadableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return rawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = readableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ironsource.environment.c> a() {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.e.a()
            android.content.Context r1 = r1.a
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM REPORTS ;"
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L4f
            android.database.Cursor r2 = r0.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L43
        L21:
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L4c
            r4 = 1
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L4c
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L4c
            r6 = 3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> L4c
            com.ironsource.environment.c r7 = new com.ironsource.environment.c     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            r1.add(r7)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L21
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4b
            r0.close()
        L4b:
            return r1
        L4c:
            r1 = move-exception
            r3 = r0
            goto L50
        L4f:
            r1 = move-exception
        L50:
            if (r3 == 0) goto L55
            r3.close()
        L55:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.f.a():java.util.List");
    }

    public static void a(c cVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = new f(e.a().a).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String a = cVar.a();
                String b = cVar.b();
                String c = cVar.c();
                contentValues.put("stack_trace", a);
                contentValues.put("crash_date", b);
                contentValues.put("crashType", c);
                writableDatabase.insert("REPORTS", null, contentValues);
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase != null) {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Cursor b() {
        f fVar = new f(e.a().a);
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = fVar.getReadableDatabase();
            try {
                Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS;", null);
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void c() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new f(e.a().a).getWritableDatabase();
            try {
                sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

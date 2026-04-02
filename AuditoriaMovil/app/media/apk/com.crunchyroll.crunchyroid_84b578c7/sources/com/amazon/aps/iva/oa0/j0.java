package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import java.io.IOException;
/* compiled from: SQLitePersistentQueue.java */
/* loaded from: classes4.dex */
public final class j0 implements f0 {
    public static final /* synthetic */ int b = 0;
    public final b a;

    /* compiled from: SQLitePersistentQueue.java */
    /* loaded from: classes4.dex */
    public static class b {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public static long a(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery("SELECT COUNT(_id) FROM events", null);
                    cursor.moveToFirst();
                    long j = cursor.getLong(0);
                    int i = j0.b;
                    cursor.close();
                    return j;
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        public static long c(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery("SELECT MIN(_id) FROM events", null);
                    cursor.moveToFirst();
                    long j = cursor.getLong(0);
                    int i = j0.b;
                    cursor.close();
                    return j;
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        public static String e(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursor;
            String[] strArr;
            Cursor cursor2 = null;
            try {
                try {
                    strArr = new String[]{String.valueOf(c(sQLiteDatabase))};
                    cursor = sQLiteDatabase.query("events", new String[]{"value"}, "_id = ?", strArr, null, null, null);
                } catch (SQLException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
            }
            try {
                cursor.moveToFirst();
                if (cursor.getCount() == 0) {
                    cursor.close();
                    return null;
                }
                String string = cursor.getString(cursor.getColumnIndex("value"));
                sQLiteDatabase.delete("events", "_id = ?", strArr);
                int i = j0.b;
                cursor.close();
                return string;
            } catch (SQLException e2) {
                e = e2;
                cursor2 = cursor;
                throw new IOException(e);
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b() throws java.io.IOException {
            /*
                r13 = this;
                r0 = 0
                com.amazon.aps.iva.oa0.j0$a r1 = r13.a     // Catch: java.lang.Throwable -> L4d android.database.SQLException -> L51
                android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d android.database.SQLException -> L51
                long r2 = c(r1)     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                r4 = 1
                java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                java.lang.String r6 = "value"
                r10 = 0
                r5[r10] = r6     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                java.lang.String r6 = "_id = ?"
                java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                r7[r10] = r2     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                java.lang.String r3 = "events"
                r8 = 0
                r9 = 0
                r11 = 0
                r2 = r1
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r11
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L46 android.database.SQLException -> L48
                r2.moveToFirst()     // Catch: android.database.SQLException -> L44 java.lang.Throwable -> L5b
                int r3 = r2.getCount()     // Catch: android.database.SQLException -> L44 java.lang.Throwable -> L5b
                if (r3 != 0) goto L37
                goto L3b
            L37:
                java.lang.String r0 = r2.getString(r10)     // Catch: android.database.SQLException -> L44 java.lang.Throwable -> L5b
            L3b:
                int r3 = com.amazon.aps.iva.oa0.j0.b     // Catch: android.database.SQLException -> L44 java.lang.Throwable -> L5b
                r2.close()
                r1.close()
                return r0
            L44:
                r0 = move-exception
                goto L55
            L46:
                r2 = move-exception
                goto L5f
            L48:
                r2 = move-exception
                r12 = r2
                r2 = r0
                r0 = r12
                goto L55
            L4d:
                r1 = move-exception
                r2 = r1
                r1 = r0
                goto L5f
            L51:
                r1 = move-exception
                r2 = r0
                r0 = r1
                r1 = r2
            L55:
                java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L5b
                throw r3     // Catch: java.lang.Throwable -> L5b
            L5b:
                r0 = move-exception
                r12 = r2
                r2 = r0
                r0 = r12
            L5f:
                if (r0 == 0) goto L64
                r0.close()
            L64:
                if (r1 == 0) goto L69
                r1.close()
            L69:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oa0.j0.b.b():java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long d(java.lang.String r9) throws java.io.IOException {
            /*
                r8 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                java.lang.String r1 = "value"
                r0.put(r1, r9)
                r9 = 0
                com.amazon.aps.iva.oa0.j0$a r1 = r8.a     // Catch: java.lang.Throwable -> L2e android.database.SQLException -> L30
                android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L2e android.database.SQLException -> L30
                java.lang.String r2 = "events"
                long r2 = r1.insert(r2, r9, r0)     // Catch: java.lang.Throwable -> L2a android.database.SQLException -> L2c
                int r9 = com.amazon.aps.iva.oa0.j0.b     // Catch: java.lang.Throwable -> L2a android.database.SQLException -> L2c
                long r4 = a(r1)     // Catch: java.lang.Throwable -> L2a android.database.SQLException -> L2c
                r6 = 10000(0x2710, double:4.9407E-320)
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L26
                e(r1)     // Catch: java.lang.Throwable -> L2a android.database.SQLException -> L2c
            L26:
                r1.close()
                return r2
            L2a:
                r9 = move-exception
                goto L39
            L2c:
                r9 = move-exception
                goto L33
            L2e:
                r0 = move-exception
                goto L3b
            L30:
                r0 = move-exception
                r1 = r9
                r9 = r0
            L33:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
                r0.<init>(r9)     // Catch: java.lang.Throwable -> L2a
                throw r0     // Catch: java.lang.Throwable -> L2a
            L39:
                r0 = r9
                r9 = r1
            L3b:
                if (r9 == 0) goto L40
                r9.close()
            L40:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oa0.j0.b.d(java.lang.String):long");
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(j0.class.getSimpleName());
    }

    public j0(Context context) {
        this.a = new b(new a(context.getApplicationContext()));
    }

    public final synchronized void a(String str) throws IOException {
        if (this.a.d(str) == -1) {
            throw new IOException("Failed to add element = " + str);
        }
    }

    /* compiled from: SQLitePersistentQueue.java */
    /* loaded from: classes4.dex */
    public static class a extends SQLiteOpenHelper implements BaseColumns {
        public a(Context context) {
            super(context, "singular-1.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,value TEXT )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}

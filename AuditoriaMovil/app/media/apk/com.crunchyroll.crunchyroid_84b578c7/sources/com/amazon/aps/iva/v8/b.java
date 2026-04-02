package com.amazon.aps.iva.v8;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazon.aps.iva.p8.h;
import com.amazon.aps.iva.u8.b;
import java.io.File;
/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.u8.b {
    public final Context b;
    public final String c;
    public final b.a d;
    public final boolean e;
    public final Object f = new Object();
    public a g;
    public boolean h;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final com.amazon.aps.iva.v8.a[] b;
        public final b.a c;
        public boolean d;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: com.amazon.aps.iva.v8.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0788a implements DatabaseErrorHandler {
            public final /* synthetic */ b.a a;
            public final /* synthetic */ com.amazon.aps.iva.v8.a[] b;

            public C0788a(b.a aVar, com.amazon.aps.iva.v8.a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
                if (r2 == false) goto L39;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    com.amazon.aps.iva.v8.a[] r0 = r3.b
                    r1 = 0
                    r2 = r0[r1]
                    if (r2 == 0) goto L10
                    android.database.sqlite.SQLiteDatabase r2 = r2.b
                    if (r2 != r4) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = r1
                Le:
                    if (r2 != 0) goto L17
                L10:
                    com.amazon.aps.iva.v8.a r2 = new com.amazon.aps.iva.v8.a
                    r2.<init>(r4)
                    r0[r1] = r2
                L17:
                    r4 = r0[r1]
                    com.amazon.aps.iva.u8.b$a r0 = r3.a
                    r0.getClass()
                    android.database.sqlite.SQLiteDatabase r0 = r4.b
                    r0.getPath()
                    android.database.sqlite.SQLiteDatabase r0 = r4.b
                    boolean r1 = r0.isOpen()
                    if (r1 != 0) goto L33
                    java.lang.String r4 = r0.getPath()
                    com.amazon.aps.iva.u8.b.a.a(r4)
                    goto L82
                L33:
                    r1 = 0
                    java.util.List r1 = r0.getAttachedDbs()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
                    goto L3b
                L39:
                    r4 = move-exception
                    goto L3f
                L3b:
                    r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L61
                    goto L61
                L3f:
                    if (r1 == 0) goto L59
                    java.util.Iterator r0 = r1.iterator()
                L45:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L60
                    java.lang.Object r1 = r0.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    com.amazon.aps.iva.u8.b.a.a(r1)
                    goto L45
                L59:
                    java.lang.String r0 = r0.getPath()
                    com.amazon.aps.iva.u8.b.a.a(r0)
                L60:
                    throw r4
                L61:
                    if (r1 == 0) goto L7b
                    java.util.Iterator r4 = r1.iterator()
                L67:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L82
                    java.lang.Object r0 = r4.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    com.amazon.aps.iva.u8.b.a.a(r0)
                    goto L67
                L7b:
                    java.lang.String r4 = r0.getPath()
                    com.amazon.aps.iva.u8.b.a.a(r4)
                L82:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v8.b.a.C0788a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, com.amazon.aps.iva.v8.a[] aVarArr, b.a aVar) {
            super(context, str, null, aVar.a, new C0788a(aVar, aVarArr));
            this.c = aVar;
            this.b = aVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
            if (r2 == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.v8.a a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                com.amazon.aps.iva.v8.a[] r0 = r3.b
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.b
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 != 0) goto L17
            L10:
                com.amazon.aps.iva.v8.a r2 = new com.amazon.aps.iva.v8.a
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v8.b.a.a(android.database.sqlite.SQLiteDatabase):com.amazon.aps.iva.v8.a");
        }

        public final synchronized com.amazon.aps.iva.u8.a c() {
            this.d = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.d) {
                close();
                return c();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.b[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            this.c.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[ORIG_RETURN, RETURN] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                com.amazon.aps.iva.v8.a r6 = r5.a(r6)
                com.amazon.aps.iva.u8.b$a r0 = r5.c
                com.amazon.aps.iva.p8.h r0 = (com.amazon.aps.iva.p8.h) r0
                r0.getClass()
                java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r1 = r6.i(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6c
                r3 = 0
                if (r2 == 0) goto L20
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6c
                if (r2 != 0) goto L20
                r2 = 1
                goto L21
            L20:
                r2 = r3
            L21:
                r1.close()
                com.amazon.aps.iva.p8.h$a r1 = r0.c
                r1.a(r6)
                if (r2 != 0) goto L4a
                com.amazon.aps.iva.p8.h$b r2 = r1.b(r6)
                boolean r4 = r2.a
                if (r4 == 0) goto L34
                goto L4a
            L34:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Pre-packaged database has an invalid schema: "
                r0.<init>(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L4a:
                r0.c(r6)
                androidx.work.impl.WorkDatabase_Impl$a r1 = (androidx.work.impl.WorkDatabase_Impl.a) r1
                int r6 = androidx.work.impl.WorkDatabase_Impl.s
                androidx.work.impl.WorkDatabase_Impl r6 = androidx.work.impl.WorkDatabase_Impl.this
                java.util.List<com.amazon.aps.iva.p8.g$b> r0 = r6.g
                if (r0 == 0) goto L6b
                int r0 = r0.size()
            L5b:
                if (r3 >= r0) goto L6b
                java.util.List<com.amazon.aps.iva.p8.g$b> r1 = r6.g
                java.lang.Object r1 = r1.get(r3)
                com.amazon.aps.iva.p8.g$b r1 = (com.amazon.aps.iva.p8.g.b) r1
                r1.getClass()
                int r3 = r3 + 1
                goto L5b
            L6b:
                return
            L6c:
                r6 = move-exception
                r1.close()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v8.b.a.onCreate(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.d = true;
            ((h) this.c).b(a(sQLiteDatabase), i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onOpen(android.database.sqlite.SQLiteDatabase r10) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v8.b.a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.d = true;
            this.c.b(a(sQLiteDatabase), i, i2);
        }
    }

    public b(Context context, String str, b.a aVar, boolean z) {
        this.b = context;
        this.c = str;
        this.d = aVar;
        this.e = z;
    }

    public final a a() {
        a aVar;
        synchronized (this.f) {
            if (this.g == null) {
                com.amazon.aps.iva.v8.a[] aVarArr = new com.amazon.aps.iva.v8.a[1];
                if (this.c != null && this.e) {
                    this.g = new a(this.b, new File(this.b.getNoBackupFilesDir(), this.c).getAbsolutePath(), aVarArr, this.d);
                } else {
                    this.g = new a(this.b, this.c, aVarArr, this.d);
                }
                this.g.setWriteAheadLoggingEnabled(this.h);
            }
            aVar = this.g;
        }
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // com.amazon.aps.iva.u8.b
    public final String getDatabaseName() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.u8.b
    public final com.amazon.aps.iva.u8.a getWritableDatabase() {
        return a().c();
    }

    @Override // com.amazon.aps.iva.u8.b
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.h = z;
        }
    }
}

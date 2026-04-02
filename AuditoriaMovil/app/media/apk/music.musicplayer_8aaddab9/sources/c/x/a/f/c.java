package c.x.a.f;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import c.v.g;
import c.x.a.c;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class c implements c.x.a.c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2836b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f2837c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2838d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2839e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public a f2840f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2841g;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final c.x.a.f.a[] a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a f2842b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2843c;

        /* renamed from: c.x.a.f.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0060a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c.x.a.f.a[] f2844b;

            public C0060a(c.a aVar, c.x.a.f.a[] aVarArr) {
                this.a = aVar;
                this.f2844b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                c.a aVar = this.a;
                c.x.a.f.a f2 = a.f(this.f2844b, sQLiteDatabase);
                Objects.requireNonNull(aVar);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + f2.a());
                if (!f2.f2835b.isOpen()) {
                    aVar.a(f2.a());
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = f2.f2835b.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        f2.f2835b.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            aVar.a((String) next.second);
                        }
                    } else {
                        aVar.a(f2.a());
                    }
                }
            }
        }

        public a(Context context, String str, c.x.a.f.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.a, new C0060a(aVar, aVarArr));
            this.f2842b = aVar;
            this.a = aVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
            if ((r1.f2835b == r3) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static c.x.a.f.a f(c.x.a.f.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Le
                android.database.sqlite.SQLiteDatabase r1 = r1.f2835b
                if (r1 != r3) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                if (r1 != 0) goto L15
            Le:
                c.x.a.f.a r1 = new c.x.a.f.a
                r1.<init>(r3)
                r2[r0] = r1
            L15:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: c.x.a.f.c.a.f(c.x.a.f.a[], android.database.sqlite.SQLiteDatabase):c.x.a.f.a");
        }

        public c.x.a.f.a a(SQLiteDatabase sQLiteDatabase) {
            return f(this.a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        public synchronized c.x.a.b h() {
            this.f2843c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f2843c) {
                return a(writableDatabase);
            }
            close();
            return h();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.f2842b;
            f(this.a, sQLiteDatabase);
            Objects.requireNonNull((g) aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[ORIG_RETURN, RETURN] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.database.sqlite.SQLiteDatabase r5) {
            /*
                r4 = this;
                c.x.a.c$a r0 = r4.f2842b
                c.x.a.f.a[] r1 = r4.a
                c.x.a.f.a r5 = f(r1, r5)
                c.v.g r0 = (c.v.g) r0
                java.util.Objects.requireNonNull(r0)
                c.x.a.a r1 = new c.x.a.a
                java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                r1.<init>(r2)
                android.database.Cursor r1 = r5.f(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L78
                r3 = 0
                if (r2 == 0) goto L27
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L78
                if (r2 != 0) goto L27
                r2 = 1
                goto L28
            L27:
                r2 = 0
            L28:
                r1.close()
                c.v.g$a r1 = r0.f2786c
                r1.a(r5)
                if (r2 != 0) goto L52
                c.v.g$a r1 = r0.f2786c
                c.v.g$b r1 = r1.b(r5)
                boolean r2 = r1.a
                if (r2 == 0) goto L3d
                goto L52
            L3d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Pre-packaged database has an invalid schema: "
                java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
                java.lang.String r1 = r1.f2787b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L52:
                r0.c(r5)
                c.v.g$a r5 = r0.f2786c
                androidx.work.impl.WorkDatabase_Impl$a r5 = (androidx.work.impl.WorkDatabase_Impl.a) r5
                androidx.work.impl.WorkDatabase_Impl r0 = androidx.work.impl.WorkDatabase_Impl.this
                int r1 = androidx.work.impl.WorkDatabase_Impl.f655l
                java.util.List<c.v.f$b> r0 = r0.f2770g
                if (r0 == 0) goto L77
                int r0 = r0.size()
            L65:
                if (r3 >= r0) goto L77
                androidx.work.impl.WorkDatabase_Impl r1 = androidx.work.impl.WorkDatabase_Impl.this
                java.util.List<c.v.f$b> r1 = r1.f2770g
                java.lang.Object r1 = r1.get(r3)
                c.v.f$b r1 = (c.v.f.b) r1
                java.util.Objects.requireNonNull(r1)
                int r3 = r3 + 1
                goto L65
            L77:
                return
            L78:
                r5 = move-exception
                r1.close()
                goto L7e
            L7d:
                throw r5
            L7e:
                goto L7d
            */
            throw new UnsupportedOperationException("Method not decompiled: c.x.a.f.c.a.onCreate(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2843c = true;
            ((g) this.f2842b).b(f(this.a, sQLiteDatabase), i2, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onOpen(android.database.sqlite.SQLiteDatabase r10) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.x.a.f.c.a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2843c = true;
            this.f2842b.b(f(this.a, sQLiteDatabase), i2, i3);
        }
    }

    public c(Context context, String str, c.a aVar, boolean z) {
        this.a = context;
        this.f2836b = str;
        this.f2837c = aVar;
        this.f2838d = z;
    }

    @Override // c.x.a.c
    public c.x.a.b A() {
        return a().h();
    }

    public final a a() {
        a aVar;
        synchronized (this.f2839e) {
            if (this.f2840f == null) {
                c.x.a.f.a[] aVarArr = new c.x.a.f.a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f2836b == null || !this.f2838d) {
                    this.f2840f = new a(this.a, this.f2836b, aVarArr, this.f2837c);
                } else {
                    this.f2840f = new a(this.a, new File(this.a.getNoBackupFilesDir(), this.f2836b).getAbsolutePath(), aVarArr, this.f2837c);
                }
                this.f2840f.setWriteAheadLoggingEnabled(this.f2841g);
            }
            aVar = this.f2840f;
        }
        return aVar;
    }

    @Override // c.x.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // c.x.a.c
    public String getDatabaseName() {
        return this.f2836b;
    }

    @Override // c.x.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f2839e) {
            a aVar = this.f2840f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f2841g = z;
        }
    }
}

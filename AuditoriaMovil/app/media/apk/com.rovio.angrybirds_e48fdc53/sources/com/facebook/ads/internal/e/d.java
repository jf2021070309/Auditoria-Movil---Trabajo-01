package com.facebook.ads.internal.e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import com.facebook.ads.internal.e.f;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes2.dex */
public class d {
    private static final String a = "SELECT tokens." + h.a.b + ", tokens." + h.b.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.a.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.c.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.d.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.e.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.f.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.g.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.h.b + ", " + com.umeng.analytics.pro.d.ar + "." + c.i.b + " FROM " + com.umeng.analytics.pro.d.ar + " JOIN tokens ON " + com.umeng.analytics.pro.d.ar + "." + c.b.b + " = tokens." + h.a.b + " ORDER BY " + com.umeng.analytics.pro.d.ar + "." + c.e.b + " ASC";
    private static final int b = Runtime.getRuntime().availableProcessors();
    private static final int c = Math.max(2, Math.min(b - 1, 4));
    private static final int d = (b * 2) + 1;
    private static final ThreadFactory e = new ThreadFactory() { // from class: com.facebook.ads.internal.e.d.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "DatabaseTask #" + this.a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> f = new LinkedBlockingQueue(128);
    private static final Executor g;
    private static final ReentrantReadWriteLock h;
    private static final Lock i;
    private static final Lock j;
    private final Context k;
    private final h l = new h(this);
    private final c m = new c(this);
    private SQLiteOpenHelper n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a<T> extends AsyncTask<Void, Void, T> {
        private final f<T> a;
        private final com.facebook.ads.internal.e.a<T> b;
        private f.a c;

        a(f<T> fVar, com.facebook.ads.internal.e.a<T> aVar) {
            this.a = fVar;
            this.b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public T doInBackground(Void... voidArr) {
            T t = null;
            try {
                t = this.a.b();
                this.c = this.a.c();
                return t;
            } catch (SQLiteException e) {
                this.c = f.a.UNKNOWN;
                return t;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(T t) {
            if (this.c == null) {
                this.b.a(t);
            } else {
                this.b.a(this.c.a(), this.c.b());
            }
            this.b.a();
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(c, d, 30L, TimeUnit.SECONDS, f, e);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        g = threadPoolExecutor;
        h = new ReentrantReadWriteLock();
        i = h.readLock();
        j = h.writeLock();
    }

    public d(Context context) {
        this.k = context;
    }

    private synchronized SQLiteDatabase i() {
        if (this.n == null) {
            this.n = new e(this.k, this);
        }
        return this.n.getWritableDatabase();
    }

    public Cursor a(int i2) {
        i.lock();
        try {
            return a().rawQuery(a + " LIMIT " + String.valueOf(i2), null);
        } finally {
            i.unlock();
        }
    }

    public SQLiteDatabase a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
        }
        return i();
    }

    public <T> AsyncTask a(f<T> fVar, com.facebook.ads.internal.e.a<T> aVar) {
        return com.facebook.ads.internal.q.a.d.a(g, new a(fVar, aVar), new Void[0]);
    }

    public AsyncTask a(final String str, final int i2, final String str2, final double d2, final double d3, final String str3, final Map<String, String> map, com.facebook.ads.internal.e.a<String> aVar) {
        return a(new i<String>() { // from class: com.facebook.ads.internal.e.d.2
            /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.facebook.ads.internal.e.f
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String b() {
                /*
                    r12 = this;
                    r10 = 0
                    java.lang.String r0 = r3
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto Lb
                    r0 = r10
                La:
                    return r0
                Lb:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.e.d.h()
                    r0.lock()
                    com.facebook.ads.internal.e.d r0 = com.facebook.ads.internal.e.d.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L8d
                    android.database.sqlite.SQLiteDatabase r11 = r0.a()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L8d
                    r11.beginTransaction()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    com.facebook.ads.internal.e.d r0 = com.facebook.ads.internal.e.d.this     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    com.facebook.ads.internal.e.c r0 = com.facebook.ads.internal.e.d.b(r0)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    com.facebook.ads.internal.e.d r1 = com.facebook.ads.internal.e.d.this     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    com.facebook.ads.internal.e.h r1 = com.facebook.ads.internal.e.d.a(r1)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.lang.String r1 = r1.a(r2)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    int r2 = r4     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.lang.String r3 = r5     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    double r4 = r6     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    double r6 = r8     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.lang.String r8 = r10     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.util.Map r9 = r11     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    java.lang.String r0 = r0.a(r1, r2, r3, r4, r6, r8, r9)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    r11.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                    if (r11 == 0) goto L4b
                    boolean r1 = r11.inTransaction()     // Catch: java.lang.Exception -> L53
                    if (r1 == 0) goto L4b
                    r11.endTransaction()     // Catch: java.lang.Exception -> L53
                L4b:
                    java.util.concurrent.locks.Lock r1 = com.facebook.ads.internal.e.d.h()
                    r1.unlock()
                    goto La
                L53:
                    r1 = move-exception
                    com.facebook.ads.internal.e.d r2 = com.facebook.ads.internal.e.d.this
                    android.content.Context r2 = com.facebook.ads.internal.e.d.c(r2)
                    com.facebook.ads.internal.q.d.a.a(r1, r2)
                    goto L4b
                L5e:
                    r0 = move-exception
                    r1 = r10
                L60:
                    com.facebook.ads.internal.e.f$a r2 = com.facebook.ads.internal.e.f.a.DATABASE_INSERT     // Catch: java.lang.Throwable -> Laf
                    r12.a(r2)     // Catch: java.lang.Throwable -> Laf
                    com.facebook.ads.internal.e.d r2 = com.facebook.ads.internal.e.d.this     // Catch: java.lang.Throwable -> Laf
                    android.content.Context r2 = com.facebook.ads.internal.e.d.c(r2)     // Catch: java.lang.Throwable -> Laf
                    com.facebook.ads.internal.q.d.a.a(r0, r2)     // Catch: java.lang.Throwable -> Laf
                    if (r1 == 0) goto L79
                    boolean r0 = r1.inTransaction()     // Catch: java.lang.Exception -> L82
                    if (r0 == 0) goto L79
                    r1.endTransaction()     // Catch: java.lang.Exception -> L82
                L79:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.e.d.h()
                    r0.unlock()
                    r0 = r10
                    goto La
                L82:
                    r0 = move-exception
                    com.facebook.ads.internal.e.d r1 = com.facebook.ads.internal.e.d.this
                    android.content.Context r1 = com.facebook.ads.internal.e.d.c(r1)
                    com.facebook.ads.internal.q.d.a.a(r0, r1)
                    goto L79
                L8d:
                    r0 = move-exception
                    r11 = r10
                L8f:
                    if (r11 == 0) goto L9a
                    boolean r1 = r11.inTransaction()     // Catch: java.lang.Exception -> La2
                    if (r1 == 0) goto L9a
                    r11.endTransaction()     // Catch: java.lang.Exception -> La2
                L9a:
                    java.util.concurrent.locks.Lock r1 = com.facebook.ads.internal.e.d.h()
                    r1.unlock()
                    throw r0
                La2:
                    r1 = move-exception
                    com.facebook.ads.internal.e.d r2 = com.facebook.ads.internal.e.d.this
                    android.content.Context r2 = com.facebook.ads.internal.e.d.c(r2)
                    com.facebook.ads.internal.q.d.a.a(r1, r2)
                    goto L9a
                Lad:
                    r0 = move-exception
                    goto L8f
                Laf:
                    r0 = move-exception
                    r11 = r1
                    goto L8f
                Lb2:
                    r0 = move-exception
                    r1 = r11
                    goto L60
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.e.d.AnonymousClass2.b():java.lang.String");
            }
        }, aVar);
    }

    public boolean a(String str) {
        boolean z = true;
        j.lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ").append(com.umeng.analytics.pro.d.ar).append(" SET ").append(c.i.b).append("=").append(c.i.b).append("+1").append(" WHERE ").append(c.a.b).append("=?");
            a().execSQL(sb.toString(), new String[]{str});
        } catch (SQLiteException e2) {
            z = false;
        }
        j.unlock();
        return z;
    }

    public synchronized void b() {
        for (g gVar : c()) {
            gVar.e();
        }
        if (this.n != null) {
            this.n.close();
            this.n = null;
        }
    }

    public boolean b(String str) {
        j.lock();
        try {
            return this.m.a(str);
        } finally {
            j.unlock();
        }
    }

    public g[] c() {
        return new g[]{this.l, this.m};
    }

    public Cursor d() {
        i.lock();
        try {
            return this.m.c();
        } finally {
            i.unlock();
        }
    }

    public Cursor e() {
        i.lock();
        try {
            return this.m.d();
        } finally {
            i.unlock();
        }
    }

    public Cursor f() {
        i.lock();
        try {
            return this.l.c();
        } finally {
            i.unlock();
        }
    }

    public void g() {
        j.lock();
        try {
            this.l.d();
        } finally {
            j.unlock();
        }
    }
}

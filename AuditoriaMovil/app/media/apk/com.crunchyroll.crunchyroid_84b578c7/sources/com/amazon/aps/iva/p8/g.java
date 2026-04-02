package com.amazon.aps.iva.p8;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.u8.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: RoomDatabase.java */
/* loaded from: classes.dex */
public abstract class g {
    @Deprecated
    public volatile com.amazon.aps.iva.u8.a a;
    public Executor b;
    public com.amazon.aps.iva.u8.b c;
    public final f d;
    public boolean e;
    public boolean f;
    @Deprecated
    public List<b> g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class a<T extends g> {
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public b.c g;
        public boolean h;
        public boolean k;
        public HashSet m;
        public final Class<T> a = WorkDatabase.class;
        public final c i = c.AUTOMATIC;
        public boolean j = true;
        public final d l = new d();

        public a(Context context, String str) {
            this.c = context;
            this.b = str;
        }

        public final void a(com.amazon.aps.iva.q8.a... aVarArr) {
            if (this.m == null) {
                this.m = new HashSet();
            }
            for (com.amazon.aps.iva.q8.a aVar : aVarArr) {
                this.m.add(Integer.valueOf(aVar.a));
                this.m.add(Integer.valueOf(aVar.b));
            }
            d dVar = this.l;
            dVar.getClass();
            for (com.amazon.aps.iva.q8.a aVar2 : aVarArr) {
                int i = aVar2.a;
                HashMap<Integer, TreeMap<Integer, com.amazon.aps.iva.q8.a>> hashMap = dVar.a;
                TreeMap<Integer, com.amazon.aps.iva.q8.a> treeMap = hashMap.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    hashMap.put(Integer.valueOf(i), treeMap);
                }
                int i2 = aVar2.b;
                com.amazon.aps.iva.q8.a aVar3 = treeMap.get(Integer.valueOf(i2));
                if (aVar3 != null) {
                    aVar3.toString();
                    aVar2.toString();
                }
                treeMap.put(Integer.valueOf(i2), aVar2);
            }
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class d {
        public final HashMap<Integer, TreeMap<Integer, com.amazon.aps.iva.q8.a>> a = new HashMap<>();
    }

    public g() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        boolean z;
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void b() {
        if (!((com.amazon.aps.iva.v8.a) this.c.getWritableDatabase()).b.inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        com.amazon.aps.iva.u8.a writableDatabase = this.c.getWritableDatabase();
        this.d.c(writableDatabase);
        ((com.amazon.aps.iva.v8.a) writableDatabase).a();
    }

    public abstract f d();

    public abstract com.amazon.aps.iva.u8.b e(com.amazon.aps.iva.p8.a aVar);

    @Deprecated
    public final void f() {
        ((com.amazon.aps.iva.v8.a) this.c.getWritableDatabase()).c();
        if (!((com.amazon.aps.iva.v8.a) this.c.getWritableDatabase()).b.inTransaction()) {
            f fVar = this.d;
            if (fVar.e.compareAndSet(false, true)) {
                fVar.d.b.execute(fVar.j);
            }
        }
    }

    public final Cursor g(com.amazon.aps.iva.u8.c cVar) {
        a();
        b();
        return ((com.amazon.aps.iva.v8.a) this.c.getWritableDatabase()).h(cVar);
    }

    @Deprecated
    public final void h() {
        ((com.amazon.aps.iva.v8.a) this.c.getWritableDatabase()).k();
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(com.amazon.aps.iva.v8.a aVar) {
        }
    }
}

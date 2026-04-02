package c.v;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import c.x.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public abstract class f {
    @Deprecated
    public volatile c.x.a.b a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f2765b;

    /* renamed from: c  reason: collision with root package name */
    public c.x.a.c f2766c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2767d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2768e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2769f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public List<b> f2770g;

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f2771h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f2772i = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class a<T extends f> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2773b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f2774c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f2775d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f2776e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f2777f;

        /* renamed from: g  reason: collision with root package name */
        public c.InterfaceC0058c f2778g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2779h;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2782k;

        /* renamed from: m  reason: collision with root package name */
        public Set<Integer> f2784m;

        /* renamed from: i  reason: collision with root package name */
        public c f2780i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2781j = true;

        /* renamed from: l  reason: collision with root package name */
        public final d f2783l = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f2774c = context;
            this.a = cls;
            this.f2773b = str;
        }

        public a<T> a(c.v.k.a... aVarArr) {
            if (this.f2784m == null) {
                this.f2784m = new HashSet();
            }
            for (c.v.k.a aVar : aVarArr) {
                this.f2784m.add(Integer.valueOf(aVar.a));
                this.f2784m.add(Integer.valueOf(aVar.f2804b));
            }
            d dVar = this.f2783l;
            Objects.requireNonNull(dVar);
            for (c.v.k.a aVar2 : aVarArr) {
                int i2 = aVar2.a;
                int i3 = aVar2.f2804b;
                TreeMap<Integer, c.v.k.a> treeMap = dVar.a.get(Integer.valueOf(i2));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    dVar.a.put(Integer.valueOf(i2), treeMap);
                }
                c.v.k.a aVar3 = treeMap.get(Integer.valueOf(i3));
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                treeMap.put(Integer.valueOf(i3), aVar2);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(c.x.a.b bVar) {
        }
    }

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
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, c.v.k.a>> a = new HashMap<>();
    }

    public f() {
        new ConcurrentHashMap();
        this.f2767d = e();
    }

    public void a() {
        if (this.f2768e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!h() && this.f2772i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        c.x.a.b A = this.f2766c.A();
        this.f2767d.d(A);
        ((c.x.a.f.a) A).f2835b.beginTransaction();
    }

    public c.x.a.f.f d(String str) {
        a();
        b();
        return new c.x.a.f.f(((c.x.a.f.a) this.f2766c.A()).f2835b.compileStatement(str));
    }

    public abstract e e();

    public abstract c.x.a.c f(c.v.a aVar);

    @Deprecated
    public void g() {
        ((c.x.a.f.a) this.f2766c.A()).f2835b.endTransaction();
        if (h()) {
            return;
        }
        e eVar = this.f2767d;
        if (eVar.f2752f.compareAndSet(false, true)) {
            eVar.f2751e.f2765b.execute(eVar.f2757k);
        }
    }

    public boolean h() {
        return ((c.x.a.f.a) this.f2766c.A()).f2835b.inTransaction();
    }

    public boolean i() {
        c.x.a.b bVar = this.a;
        return bVar != null && ((c.x.a.f.a) bVar).f2835b.isOpen();
    }

    public Cursor j(c.x.a.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            c.x.a.f.a aVar = (c.x.a.f.a) this.f2766c.A();
            return aVar.f2835b.rawQueryWithFactory(new c.x.a.f.b(aVar, eVar), eVar.a(), c.x.a.f.a.a, null, cancellationSignal);
        }
        return ((c.x.a.f.a) this.f2766c.A()).f(eVar);
    }

    @Deprecated
    public void k() {
        ((c.x.a.f.a) this.f2766c.A()).f2835b.setTransactionSuccessful();
    }
}

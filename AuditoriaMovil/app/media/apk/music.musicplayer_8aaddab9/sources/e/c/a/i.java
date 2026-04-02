package e.c.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import e.c.a.c;
import e.c.a.m.s.k;
import e.c.a.n.c;
import e.c.a.n.m;
import e.c.a.n.n;
import e.c.a.n.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class i implements ComponentCallbacks2, e.c.a.n.i {
    public static final e.c.a.q.e a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.b f5478b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5479c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.n.h f5480d;

    /* renamed from: e  reason: collision with root package name */
    public final n f5481e;

    /* renamed from: f  reason: collision with root package name */
    public final m f5482f;

    /* renamed from: g  reason: collision with root package name */
    public final p f5483g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f5484h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f5485i;

    /* renamed from: j  reason: collision with root package name */
    public final e.c.a.n.c f5486j;

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArrayList<e.c.a.q.d<Object>> f5487k;

    /* renamed from: l  reason: collision with root package name */
    public e.c.a.q.e f5488l;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            iVar.f5480d.a(iVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.a {
        public final n a;

        public b(n nVar) {
            this.a = nVar;
        }
    }

    static {
        e.c.a.q.e c2 = new e.c.a.q.e().c(Bitmap.class);
        c2.t = true;
        a = c2;
        new e.c.a.q.e().c(e.c.a.m.u.g.c.class).t = true;
        e.c.a.q.e.t(k.f5699c).l(f.LOW).p(true);
    }

    public i(e.c.a.b bVar, e.c.a.n.h hVar, m mVar, Context context) {
        e.c.a.q.e eVar;
        n nVar = new n();
        e.c.a.n.d dVar = bVar.f5443i;
        this.f5483g = new p();
        a aVar = new a();
        this.f5484h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f5485i = handler;
        this.f5478b = bVar;
        this.f5480d = hVar;
        this.f5482f = mVar;
        this.f5481e = nVar;
        this.f5479c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(nVar);
        Objects.requireNonNull((e.c.a.n.f) dVar);
        boolean z = c.i.d.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        e.c.a.n.c eVar2 = z ? new e.c.a.n.e(applicationContext, bVar2) : new e.c.a.n.j();
        this.f5486j = eVar2;
        if (e.c.a.s.j.g()) {
            handler.post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(eVar2);
        this.f5487k = new CopyOnWriteArrayList<>(bVar.f5439e.f5462f);
        d dVar2 = bVar.f5439e;
        synchronized (dVar2) {
            if (dVar2.f5467k == null) {
                Objects.requireNonNull((c.a) dVar2.f5461e);
                e.c.a.q.e eVar3 = new e.c.a.q.e();
                eVar3.t = true;
                dVar2.f5467k = eVar3;
            }
            eVar = dVar2.f5467k;
        }
        synchronized (this) {
            e.c.a.q.e clone = eVar.clone();
            if (clone.t && !clone.v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.v = true;
            clone.t = true;
            this.f5488l = clone;
        }
        synchronized (bVar.f5444j) {
            if (bVar.f5444j.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f5444j.add(this);
        }
    }

    public void i(e.c.a.q.h.h<?> hVar) {
        boolean z;
        if (hVar == null) {
            return;
        }
        boolean l2 = l(hVar);
        e.c.a.q.b f2 = hVar.f();
        if (l2) {
            return;
        }
        e.c.a.b bVar = this.f5478b;
        synchronized (bVar.f5444j) {
            Iterator<i> it = bVar.f5444j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().l(hVar)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || f2 == null) {
            return;
        }
        hVar.c(null);
        f2.clear();
    }

    public synchronized void j() {
        n nVar = this.f5481e;
        nVar.f5968c = true;
        Iterator it = ((ArrayList) e.c.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            e.c.a.q.b bVar = (e.c.a.q.b) it.next();
            if (bVar.isRunning()) {
                bVar.pause();
                nVar.f5967b.add(bVar);
            }
        }
    }

    public synchronized void k() {
        n nVar = this.f5481e;
        nVar.f5968c = false;
        Iterator it = ((ArrayList) e.c.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            e.c.a.q.b bVar = (e.c.a.q.b) it.next();
            if (!bVar.d() && !bVar.isRunning()) {
                bVar.c();
            }
        }
        nVar.f5967b.clear();
    }

    public synchronized boolean l(e.c.a.q.h.h<?> hVar) {
        e.c.a.q.b f2 = hVar.f();
        if (f2 == null) {
            return true;
        }
        if (this.f5481e.a(f2)) {
            this.f5483g.a.remove(hVar);
            hVar.c(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // e.c.a.n.i
    public synchronized void onDestroy() {
        this.f5483g.onDestroy();
        for (e.c.a.q.h.h<?> hVar : e.c.a.s.j.e(this.f5483g.a)) {
            i(hVar);
        }
        this.f5483g.a.clear();
        n nVar = this.f5481e;
        Iterator it = ((ArrayList) e.c.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            nVar.a((e.c.a.q.b) it.next());
        }
        nVar.f5967b.clear();
        this.f5480d.b(this);
        this.f5480d.b(this.f5486j);
        this.f5485i.removeCallbacks(this.f5484h);
        e.c.a.b bVar = this.f5478b;
        synchronized (bVar.f5444j) {
            if (!bVar.f5444j.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f5444j.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // e.c.a.n.i
    public synchronized void onStart() {
        k();
        this.f5483g.onStart();
    }

    @Override // e.c.a.n.i
    public synchronized void onStop() {
        j();
        this.f5483g.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5481e + ", treeNode=" + this.f5482f + "}";
    }
}

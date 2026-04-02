package com.amazon.aps.iva.ec;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.amazon.aps.iva.ad.a;
import com.amazon.aps.iva.ad.i;
import com.amazon.aps.iva.ad.j;
import com.amazon.aps.iva.ad.k;
import com.amazon.aps.iva.ad.n;
import com.amazon.aps.iva.nc.l;
import com.bumptech.glide.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public final class g implements ComponentCallbacks2, com.amazon.aps.iva.ad.h {
    public static final com.amazon.aps.iva.dd.h l;
    public final com.bumptech.glide.a b;
    public final Context c;
    public final com.amazon.aps.iva.ad.g d;
    public final k e;
    public final j f;
    public final n g;
    public final a h;
    public final com.amazon.aps.iva.ad.a i;
    public final CopyOnWriteArrayList<com.amazon.aps.iva.dd.g<Object>> j;
    public com.amazon.aps.iva.dd.h k;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.d.a(gVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0112a {
        public final k a;

        public b(k kVar) {
            this.a = kVar;
        }

        @Override // com.amazon.aps.iva.ad.a.InterfaceC0112a
        public final void a(boolean z) {
            if (z) {
                synchronized (g.this) {
                    this.a.b();
                }
            }
        }
    }

    static {
        com.amazon.aps.iva.dd.h c = new com.amazon.aps.iva.dd.h().c(Bitmap.class);
        c.u = true;
        l = c;
        new com.amazon.aps.iva.dd.h().c(com.amazon.aps.iva.yc.c.class).u = true;
        new com.amazon.aps.iva.dd.h().d(l.c).m(c.LOW).s(true);
    }

    public g(com.bumptech.glide.a aVar, com.amazon.aps.iva.ad.g gVar, j jVar, Context context) {
        boolean z;
        com.amazon.aps.iva.ad.a iVar;
        com.amazon.aps.iva.dd.h hVar;
        k kVar = new k();
        com.amazon.aps.iva.ad.b bVar = aVar.g;
        this.g = new n();
        a aVar2 = new a();
        this.h = aVar2;
        this.b = aVar;
        this.d = gVar;
        this.f = jVar;
        this.e = kVar;
        this.c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(kVar);
        ((com.amazon.aps.iva.ad.d) bVar).getClass();
        if (com.amazon.aps.iva.d3.a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            iVar = new com.amazon.aps.iva.ad.c(applicationContext, bVar2);
        } else {
            iVar = new i();
        }
        this.i = iVar;
        synchronized (aVar.h) {
            if (!aVar.h.contains(this)) {
                aVar.h.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = com.amazon.aps.iva.hd.l.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            com.amazon.aps.iva.hd.l.e().post(aVar2);
        } else {
            gVar.a(this);
        }
        gVar.a(iVar);
        this.j = new CopyOnWriteArrayList<>(aVar.d.e);
        com.bumptech.glide.c cVar = aVar.d;
        synchronized (cVar) {
            if (cVar.j == null) {
                ((b.a) cVar.d).getClass();
                com.amazon.aps.iva.dd.h hVar2 = new com.amazon.aps.iva.dd.h();
                hVar2.u = true;
                cVar.j = hVar2;
            }
            hVar = cVar.j;
        }
        synchronized (this) {
            com.amazon.aps.iva.dd.h clone = hVar.clone();
            if (clone.u && !clone.w) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.w = true;
            clone.u = true;
            this.k = clone;
        }
    }

    public final void a(com.amazon.aps.iva.ed.h<?> hVar) {
        boolean z;
        if (hVar == null) {
            return;
        }
        boolean d = d(hVar);
        com.amazon.aps.iva.dd.d request = hVar.getRequest();
        if (!d) {
            com.bumptech.glide.a aVar = this.b;
            synchronized (aVar.h) {
                Iterator it = aVar.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((g) it.next()).d(hVar)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (!z && request != null) {
                hVar.setRequest(null);
                request.clear();
            }
        }
    }

    public final synchronized void b() {
        k kVar = this.e;
        kVar.c = true;
        Iterator it = com.amazon.aps.iva.hd.l.d(kVar.a).iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.dd.d dVar = (com.amazon.aps.iva.dd.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                kVar.b.add(dVar);
            }
        }
    }

    public final synchronized void c() {
        k kVar = this.e;
        kVar.c = false;
        Iterator it = com.amazon.aps.iva.hd.l.d(kVar.a).iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.dd.d dVar = (com.amazon.aps.iva.dd.d) it.next();
            if (!dVar.f() && !dVar.isRunning()) {
                dVar.j();
            }
        }
        kVar.b.clear();
    }

    public final synchronized boolean d(com.amazon.aps.iva.ed.h<?> hVar) {
        com.amazon.aps.iva.dd.d request = hVar.getRequest();
        if (request == null) {
            return true;
        }
        if (this.e.a(request)) {
            this.g.b.remove(hVar);
            hVar.setRequest(null);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ad.h
    public final synchronized void onDestroy() {
        this.g.onDestroy();
        synchronized (this) {
            Iterator it = com.amazon.aps.iva.hd.l.d(this.g.b).iterator();
            while (it.hasNext()) {
                a((com.amazon.aps.iva.ed.h) it.next());
            }
            this.g.b.clear();
        }
        k kVar = this.e;
        Iterator it2 = com.amazon.aps.iva.hd.l.d(kVar.a).iterator();
        while (it2.hasNext()) {
            kVar.a((com.amazon.aps.iva.dd.d) it2.next());
        }
        kVar.b.clear();
        this.d.d(this);
        this.d.d(this.i);
        com.amazon.aps.iva.hd.l.e().removeCallbacks(this.h);
        this.b.d(this);
    }

    @Override // com.amazon.aps.iva.ad.h
    public final synchronized void onStart() {
        c();
        this.g.onStart();
    }

    @Override // com.amazon.aps.iva.ad.h
    public final synchronized void onStop() {
        this.g.onStop();
        b();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.e + ", treeNode=" + this.f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}

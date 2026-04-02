package com.amazon.aps.iva.xq;

import android.os.Process;
import android.os.SystemClock;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.xq.f;
import com.amazon.aps.iva.xq.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: RumViewManagerScope.kt */
/* loaded from: classes2.dex */
public final class j implements h {
    public static final Class<?>[] m = {f.d.class, f.r.class, f.s.class};
    public static final Class<?>[] n = {f.d.class, f.e.class, f.r.class, f.s.class};
    public static final Class<?>[] o = {f.g.class, f.j.class, f.m.class, f.y.class, f.a.class, f.b.class, f.h.class, f.i.class, f.k.class, f.l.class, f.n.class, f.o.class};
    public final h a;
    public final boolean b;
    public final com.amazon.aps.iva.l9.a c;
    public final com.amazon.aps.iva.er.g d;
    public final com.amazon.aps.iva.er.g e;
    public final com.amazon.aps.iva.er.g f;
    public final com.amazon.aps.iva.cq.c g;
    public final com.amazon.aps.iva.wq.d h;
    public final com.amazon.aps.iva.aq.d i;
    public final com.amazon.aps.iva.aq.a j;
    public final ArrayList k;
    public boolean l;

    public j(h hVar, boolean z, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.er.g gVar, com.amazon.aps.iva.er.g gVar2, com.amazon.aps.iva.er.g gVar3, com.amazon.aps.iva.cq.c cVar, com.amazon.aps.iva.wq.d dVar, com.amazon.aps.iva.aq.d dVar2, com.amazon.aps.iva.aq.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "parentScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "firstPartyHostDetector");
        com.amazon.aps.iva.yb0.j.f(gVar, "cpuVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar2, "memoryVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar3, "frameRateVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(cVar, "timeProvider");
        this.a = hVar;
        this.b = z;
        this.c = aVar;
        this.d = gVar;
        this.e = gVar2;
        this.f = gVar3;
        this.g = cVar;
        this.h = dVar;
        this.i = dVar2;
        this.j = aVar2;
        this.k = new ArrayList();
    }

    @Override // com.amazon.aps.iva.xq.h
    public final h a(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        int i;
        boolean z;
        k kVar;
        boolean z2;
        long j;
        com.amazon.aps.iva.yb0.j.f(cVar, "writer");
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((h) it.next()).a(fVar, cVar) == null) {
                it.remove();
            }
        }
        if (fVar instanceof f.t) {
            f.t tVar = (f.t) fVar;
            int i2 = k.M;
            com.amazon.aps.iva.l9.a aVar = this.c;
            com.amazon.aps.iva.yb0.j.f(aVar, "firstPartyHostDetector");
            com.amazon.aps.iva.er.g gVar = this.d;
            com.amazon.aps.iva.yb0.j.f(gVar, "cpuVitalMonitor");
            com.amazon.aps.iva.er.g gVar2 = this.e;
            com.amazon.aps.iva.yb0.j.f(gVar2, "memoryVitalMonitor");
            com.amazon.aps.iva.er.g gVar3 = this.f;
            com.amazon.aps.iva.yb0.j.f(gVar3, "frameRateVitalMonitor");
            com.amazon.aps.iva.cq.c cVar2 = this.g;
            com.amazon.aps.iva.yb0.j.f(cVar2, "timeProvider");
            com.amazon.aps.iva.wq.d dVar = this.h;
            com.amazon.aps.iva.yb0.j.f(dVar, "rumEventSourceProvider");
            com.amazon.aps.iva.aq.a aVar2 = this.j;
            com.amazon.aps.iva.yb0.j.f(aVar2, "androidInfoProvider");
            k kVar2 = new k(this, tVar.a, tVar.b, tVar.d, tVar.c, aVar, gVar, gVar2, gVar3, cVar2, dVar, null, aVar2, 14336);
            if (!this.l) {
                this.l = true;
                if (com.amazon.aps.iva.lp.a.v == 100) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (this.i.b() >= 24) {
                        j = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                    } else {
                        j = com.amazon.aps.iva.jp.c.b;
                    }
                    kVar = kVar2;
                    kVar.a(new f.g(tVar.d, j), cVar);
                    arrayList.add(kVar);
                }
            }
            kVar = kVar2;
            arrayList.add(kVar);
        } else {
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((h) it2.next()).isActive() && (i = i + 1) < 0) {
                        f1.R();
                        throw null;
                    }
                }
            }
            if (i == 0) {
                if (com.amazon.aps.iva.lp.a.v == 100) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = this.l;
                a0 a0Var = a0.b;
                Class<?>[] clsArr = o;
                if (!z3 && z) {
                    boolean N = com.amazon.aps.iva.lb0.o.N(n, fVar.getClass());
                    boolean N2 = com.amazon.aps.iva.lb0.o.N(clsArr, fVar.getClass());
                    if (N) {
                        k kVar3 = new k(this, "com/datadog/application-launch/view", "ApplicationLaunch", fVar.a(), a0Var, this.c, new com.amazon.aps.iva.e1.d(), new com.amazon.aps.iva.e1.d(), new com.amazon.aps.iva.e1.d(), this.g, this.h, k.a.APPLICATION_LAUNCH, this.j, 6144);
                        kVar3.a(fVar, cVar);
                        arrayList.add(kVar3);
                    } else if (!N2) {
                        com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "A RUM event was detected, but no view is active. To track views automatically, try calling the Configuration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.", null, 6);
                    }
                } else {
                    boolean N3 = com.amazon.aps.iva.lb0.o.N(m, fVar.getClass());
                    boolean N4 = com.amazon.aps.iva.lb0.o.N(clsArr, fVar.getClass());
                    if (N3 && this.b) {
                        k kVar4 = new k(this, "com/datadog/background/view", "Background", fVar.a(), a0Var, this.c, new com.amazon.aps.iva.e1.d(), new com.amazon.aps.iva.e1.d(), new com.amazon.aps.iva.e1.d(), this.g, this.h, k.a.BACKGROUND, this.j, 6144);
                        kVar4.a(fVar, cVar);
                        arrayList.add(kVar4);
                    } else if (!N4) {
                        com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "A RUM event was detected, but no view is active. To track views automatically, try calling the Configuration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.", null, 6);
                    }
                }
            }
        }
        return this;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return true;
    }
}

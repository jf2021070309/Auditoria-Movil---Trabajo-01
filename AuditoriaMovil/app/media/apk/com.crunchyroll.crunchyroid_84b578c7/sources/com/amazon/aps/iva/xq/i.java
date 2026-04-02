package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.xq.f;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: RumSessionScope.kt */
/* loaded from: classes2.dex */
public final class i implements h {
    public static final long n = TimeUnit.MINUTES.toNanos(15);
    public static final long o = TimeUnit.HOURS.toNanos(4);
    public final h a;
    public final float b;
    public final boolean c;
    public final com.amazon.aps.iva.sq.i d;
    public final long e;
    public final long f;
    public String g;
    public a h;
    public final AtomicLong i;
    public final AtomicLong j;
    public final SecureRandom k;
    public final com.amazon.aps.iva.sp.e<Object> l;
    public final j m;

    /* compiled from: RumSessionScope.kt */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_TRACKED,
        TRACKED,
        EXPIRED
    }

    public i(h hVar, float f, boolean z, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.er.g gVar, com.amazon.aps.iva.er.g gVar2, com.amazon.aps.iva.er.g gVar3, com.amazon.aps.iva.cq.c cVar, com.amazon.aps.iva.sq.i iVar, com.amazon.aps.iva.wq.d dVar, com.amazon.aps.iva.aq.a aVar2) {
        com.amazon.aps.iva.ab.r rVar = new com.amazon.aps.iva.ab.r();
        com.amazon.aps.iva.yb0.j.f(hVar, "parentScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "firstPartyHostDetector");
        com.amazon.aps.iva.yb0.j.f(gVar, "cpuVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar2, "memoryVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar3, "frameRateVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(cVar, "timeProvider");
        this.a = hVar;
        this.b = f;
        this.c = z;
        this.d = iVar;
        this.e = n;
        this.f = o;
        this.g = com.amazon.aps.iva.vq.a.i;
        this.h = a.NOT_TRACKED;
        this.i = new AtomicLong(System.nanoTime());
        this.j = new AtomicLong(0L);
        this.k = new SecureRandom();
        this.l = new com.amazon.aps.iva.sp.e<>();
        this.m = new j(this, z, aVar, gVar, gVar2, gVar3, cVar, dVar, rVar, aVar2);
        ConcurrentHashMap concurrentHashMap = com.amazon.aps.iva.sq.c.a;
        com.amazon.aps.iva.sq.c.c(b(), com.amazon.aps.iva.sq.b.h);
    }

    @Override // com.amazon.aps.iva.xq.h
    public final h a(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(cVar, "writer");
        if (fVar instanceof f.m) {
            c(System.nanoTime());
        }
        long nanoTime = System.nanoTime();
        boolean a2 = com.amazon.aps.iva.yb0.j.a(this.g, com.amazon.aps.iva.vq.a.i);
        AtomicLong atomicLong = this.j;
        boolean z3 = true;
        if (nanoTime - atomicLong.get() >= this.e) {
            z = true;
        } else {
            z = false;
        }
        if (nanoTime - this.i.get() >= this.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(fVar instanceof f.t) && !(fVar instanceof f.r)) {
            z3 = false;
        }
        boolean N = com.amazon.aps.iva.lb0.o.N(j.m, fVar.getClass());
        if (z3) {
            if (a2 || z || z2) {
                c(nanoTime);
            }
            atomicLong.set(nanoTime);
        } else if (z) {
            if (this.c && N) {
                c(nanoTime);
                atomicLong.set(nanoTime);
            } else {
                this.h = a.EXPIRED;
            }
        } else if (z2) {
            c(nanoTime);
        }
        if (this.h != a.TRACKED) {
            cVar = this.l;
        }
        this.m.a(fVar, cVar);
        return this;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        return com.amazon.aps.iva.vq.a.a(this.a.b(), this.g, null, null, null, null, this.h, null, 189);
    }

    public final void c(long j) {
        boolean z;
        a aVar;
        if (this.k.nextFloat() * 100.0f < this.b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar = a.TRACKED;
        } else {
            aVar = a.NOT_TRACKED;
        }
        this.h = aVar;
        this.g = j0.d("randomUUID().toString()");
        this.i.set(j);
        com.amazon.aps.iva.sq.i iVar = this.d;
        if (iVar != null) {
            iVar.a(this.g, !z);
        }
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return true;
    }
}

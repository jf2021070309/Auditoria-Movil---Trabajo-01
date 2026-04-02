package com.amazon.aps.iva.xq;
/* compiled from: RumApplicationScope.kt */
/* loaded from: classes2.dex */
public final class d implements h {
    public final com.amazon.aps.iva.vq.a a;
    public final i b;

    public d(String str, float f, boolean z, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.er.g gVar, com.amazon.aps.iva.er.g gVar2, com.amazon.aps.iva.er.g gVar3, com.amazon.aps.iva.cq.c cVar, com.amazon.aps.iva.sq.i iVar, com.amazon.aps.iva.aq.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "applicationId");
        com.amazon.aps.iva.yb0.j.f(aVar, "firstPartyHostDetector");
        com.amazon.aps.iva.yb0.j.f(gVar, "cpuVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar2, "memoryVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(gVar3, "frameRateVitalMonitor");
        com.amazon.aps.iva.yb0.j.f(cVar, "timeProvider");
        com.amazon.aps.iva.wq.d dVar = new com.amazon.aps.iva.wq.d(com.amazon.aps.iva.lp.a.r);
        this.a = new com.amazon.aps.iva.vq.a(str, 254);
        this.b = new i(this, f, z, aVar, gVar, gVar2, gVar3, cVar, iVar, dVar, aVar2);
    }

    @Override // com.amazon.aps.iva.xq.h
    public final h a(f fVar, com.amazon.aps.iva.sp.c<Object> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "writer");
        this.b.a(fVar, cVar);
        return this;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final com.amazon.aps.iva.vq.a b() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.xq.h
    public final boolean isActive() {
        return true;
    }
}

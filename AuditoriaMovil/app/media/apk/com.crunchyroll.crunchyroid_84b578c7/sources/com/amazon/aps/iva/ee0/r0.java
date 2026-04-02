package com.amazon.aps.iva.ee0;
/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes4.dex */
public final class r0 extends k1 {
    public final m0 a;

    public r0(com.amazon.aps.iva.lc0.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "kotlinBuiltIns");
        m0 p = kVar.p();
        com.amazon.aps.iva.yb0.j.e(p, "kotlinBuiltIns.nullableAnyType");
        this.a = p;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final j1 a(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final boolean b() {
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final v1 c() {
        return v1.OUT_VARIANCE;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final e0 getType() {
        return this.a;
    }
}

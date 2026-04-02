package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.de0.c;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public final class i0 extends w1 {
    public final com.amazon.aps.iva.de0.l c;
    public final com.amazon.aps.iva.xb0.a<e0> d;
    public final com.amazon.aps.iva.de0.i<e0> e;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.xb0.a<? extends e0> aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.c = lVar;
        this.d = aVar;
        this.e = lVar.g(aVar);
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return new i0(this.c, new h0(fVar, this));
    }

    @Override // com.amazon.aps.iva.ee0.w1
    public final e0 M0() {
        return this.e.invoke();
    }

    @Override // com.amazon.aps.iva.ee0.w1
    public final boolean N0() {
        c.f fVar = (c.f) this.e;
        if (fVar.d != c.l.NOT_COMPUTED && fVar.d != c.l.COMPUTING) {
            return true;
        }
        return false;
    }
}

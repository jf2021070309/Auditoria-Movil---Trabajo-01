package com.amazon.aps.iva.ee0;
/* compiled from: dynamicTypes.kt */
/* loaded from: classes4.dex */
public final class v extends y {
    public final a1 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(com.amazon.aps.iva.lc0.k r3, com.amazon.aps.iva.ee0.a1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "attributes"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            com.amazon.aps.iva.ee0.m0 r0 = r3.o()
            java.lang.String r1 = "builtIns.nothingType"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            com.amazon.aps.iva.ee0.m0 r3 = r3.p()
            java.lang.String r1 = "builtIns.nullableAnyType"
            com.amazon.aps.iva.yb0.j.e(r3, r1)
            r2.<init>(r0, r3)
            r2.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.v.<init>(com.amazon.aps.iva.lc0.k, com.amazon.aps.iva.ee0.a1):void");
    }

    @Override // com.amazon.aps.iva.ee0.y, com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ee0.y, com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new v(com.amazon.aps.iva.da0.a.n(this.d), a1Var);
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final m0 P0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String Q0(com.amazon.aps.iva.pd0.c cVar, com.amazon.aps.iva.pd0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
        com.amazon.aps.iva.yb0.j.f(jVar, "options");
        return "dynamic";
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        return this;
    }
}

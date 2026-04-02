package com.amazon.aps.iva.ee0;
/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes4.dex */
public final class s0 extends k1 {
    public final com.amazon.aps.iva.oc0.y0 a;
    public final com.amazon.aps.iva.kb0.e b;

    /* compiled from: StarProjectionImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e0> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e0 invoke() {
            return com.amazon.aps.iva.a0.k.l(s0.this.a);
        }
    }

    public s0(com.amazon.aps.iva.oc0.y0 y0Var) {
        com.amazon.aps.iva.yb0.j.f(y0Var, "typeParameter");
        this.a = y0Var;
        this.b = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a());
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
        return (e0) this.b.getValue();
    }
}

package com.amazon.aps.iva.ee0;
/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes4.dex */
public final class k extends y0<k> {
    public final com.amazon.aps.iva.pc0.h a;

    public k(com.amazon.aps.iva.pc0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.ee0.y0
    public final k a(y0 y0Var) {
        k kVar = (k) y0Var;
        if (kVar == null) {
            return this;
        }
        return new k(com.amazon.aps.iva.aq.k.i(this.a, kVar.a));
    }

    @Override // com.amazon.aps.iva.ee0.y0
    public final com.amazon.aps.iva.fc0.d<? extends k> b() {
        return com.amazon.aps.iva.yb0.e0.a(k.class);
    }

    @Override // com.amazon.aps.iva.ee0.y0
    public final k c(y0 y0Var) {
        if (com.amazon.aps.iva.yb0.j.a((k) y0Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(((k) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

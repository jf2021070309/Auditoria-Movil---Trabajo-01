package com.amazon.aps.iva.t1;
/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.ab.a {
    public g<?> a;

    public a(g<?> gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "element");
        this.a = gVar;
    }

    @Override // com.amazon.aps.iva.ab.a
    public final boolean d(c<?> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        if (cVar == this.a.getKey()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ab.a
    public final Object g(i iVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iVar, "key");
        if (iVar == this.a.getKey()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

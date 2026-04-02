package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: CircularProgressIndicator.kt */
/* loaded from: classes.dex */
public final class q implements com.amazon.aps.iva.p4.i {
    public com.amazon.aps.iva.p4.n a = n.a.b;
    public com.amazon.aps.iva.b5.a b = p1.a;

    @Override // com.amazon.aps.iva.p4.i
    public final com.amazon.aps.iva.p4.n a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<set-?>");
        this.a = nVar;
    }

    public final String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + this.a + ", color=" + this.b + ')';
    }
}

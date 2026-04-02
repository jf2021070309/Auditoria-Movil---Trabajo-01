package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: LinearProgressIndicator.kt */
/* loaded from: classes.dex */
public final class r implements com.amazon.aps.iva.p4.i {
    public com.amazon.aps.iva.p4.n a = n.a.b;
    public final com.amazon.aps.iva.b5.d b = p1.a;
    public final com.amazon.aps.iva.b5.d c = p1.b;

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
        return "EmittableLinearProgressIndicator(modifier=" + this.a + ", progress=0.0, indeterminate=false, color=" + this.b + ", backgroundColor=" + this.c + ')';
    }
}

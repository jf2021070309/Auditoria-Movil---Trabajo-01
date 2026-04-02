package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.p4.l {
    public com.amazon.aps.iva.p4.n d;
    public a e;

    public g() {
        super(0, 3, false);
        this.d = n.a.b;
        this.e = a.c;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final com.amazon.aps.iva.p4.n a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<set-?>");
        this.d = nVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.d + ", contentAlignment=" + this.e + ')';
    }
}

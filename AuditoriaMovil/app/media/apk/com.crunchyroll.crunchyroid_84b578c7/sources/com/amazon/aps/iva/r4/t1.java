package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: RemoteViewsRoot.kt */
/* loaded from: classes.dex */
public final class t1 extends com.amazon.aps.iva.p4.l {
    public com.amazon.aps.iva.p4.n d;

    public t1() {
        super(50, 2, false);
        this.d = n.a.b;
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
}

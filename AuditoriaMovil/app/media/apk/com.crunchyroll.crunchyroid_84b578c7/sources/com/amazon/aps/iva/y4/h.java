package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Column.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.p4.l {
    public com.amazon.aps.iva.p4.n d;
    public int e;
    public int f;

    public h() {
        super(0, 3, false);
        this.d = n.a.b;
        this.e = 0;
        this.f = 0;
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

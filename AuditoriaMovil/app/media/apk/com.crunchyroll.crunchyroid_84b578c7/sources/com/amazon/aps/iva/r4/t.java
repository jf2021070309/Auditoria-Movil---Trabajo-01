package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Switch.kt */
/* loaded from: classes.dex */
public final class t implements com.amazon.aps.iva.p4.i {
    public com.amazon.aps.iva.p4.n a = n.a.b;
    public final String b = "";
    public final y1 c = z1.a;
    public final int d = Integer.MAX_VALUE;

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
        StringBuilder sb = new StringBuilder("EmittableSwitch(");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.a);
        sb.append(", checked=false, style=null, colors=");
        sb.append(this.c);
        sb.append(", maxLines=");
        return com.amazon.aps.iva.d0.b2.b(sb, this.d, ')');
    }
}

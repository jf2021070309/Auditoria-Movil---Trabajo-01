package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.p4.n;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class j implements i {
    public n a;
    public final String b;
    public final e c;
    public final boolean d;
    public final int e;

    public j() {
        int i = n.a;
        this.a = n.a.b;
        this.b = "";
        this.c = f.a;
        this.d = true;
        this.e = Integer.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final n a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<set-?>");
        this.a = nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableButton('");
        sb.append(this.b);
        sb.append("', enabled=");
        sb.append(this.d);
        sb.append(", style=null, colors=");
        sb.append(this.c);
        sb.append(" modifier=");
        sb.append(this.a);
        sb.append(", maxLines=");
        return b2.b(sb, this.e, ')');
    }
}

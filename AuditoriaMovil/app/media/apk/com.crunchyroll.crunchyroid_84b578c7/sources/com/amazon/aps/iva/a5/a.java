package com.amazon.aps.iva.a5;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.p4.i;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Text.kt */
/* loaded from: classes.dex */
public final class a implements i {
    public n a;
    public String b;
    public e c;
    public int d;

    public a() {
        int i = n.a;
        this.a = n.a.b;
        this.b = "";
        this.d = Integer.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final n a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(n nVar) {
        j.f(nVar, "<set-?>");
        this.a = nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", modifier=");
        sb.append(this.a);
        sb.append(", maxLines=");
        return b2.b(sb, this.d, ')');
    }
}

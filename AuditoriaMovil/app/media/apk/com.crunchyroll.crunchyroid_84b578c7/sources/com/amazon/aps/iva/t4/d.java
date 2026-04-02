package com.amazon.aps.iva.t4;

import com.amazon.aps.iva.p4.l;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.t4.f;
import com.amazon.aps.iva.y4.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LazyVerticalGrid.kt */
/* loaded from: classes.dex */
public final class d extends l {
    public n d;
    public final f.b e;

    public d() {
        super(0, 1, true);
        this.d = n.a.b;
        this.e = new f.b(1);
    }

    @Override // com.amazon.aps.iva.p4.i
    public final n a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(n nVar) {
        j.f(nVar, "<set-?>");
        this.d = nVar;
    }

    /* renamed from: d */
    public final String toString() {
        return "EmittableLazyVerticalGridList(modifier=" + this.d + ", horizontalAlignment=" + ((Object) a.C0884a.b(0)) + ", numColumn=" + this.e + ", children=[\n" + c() + "\n])";
    }
}

package com.amazon.aps.iva.t4;

import com.amazon.aps.iva.p4.l;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.y4.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LazyList.kt */
/* loaded from: classes.dex */
public abstract class b extends l {
    public n d;

    public b() {
        super(0, 1, true);
        this.d = n.a.b;
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

    public final String toString() {
        return "EmittableLazyList(modifier=" + this.d + ", horizontalAlignment=" + ((Object) a.C0884a.b(0)) + ", children=[\n" + c() + "\n])";
    }
}

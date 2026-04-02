package com.amazon.aps.iva.t4;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.p4.i;
import com.amazon.aps.iva.p4.l;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LazyList.kt */
/* loaded from: classes.dex */
public final class c extends l {
    public com.amazon.aps.iva.y4.a d;

    public c() {
        super(0, 3, false);
        this.d = com.amazon.aps.iva.y4.a.d;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final n a() {
        n a;
        i iVar = (i) x.R0(this.c);
        if (iVar == null || (a = iVar.a()) == null) {
            return com.amazon.aps.iva.ff0.b.q(com.amazon.aps.iva.ff0.b.K(n.a.b));
        }
        return a;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(n nVar) {
        j.f(nVar, "<anonymous parameter 0>");
        throw new IllegalAccessError("You cannot set the modifier of an EmittableLazyListItem");
    }

    public final String toString() {
        return "EmittableLazyListItem(modifier=" + a() + ", alignment=" + this.d + ", children=[\n" + c() + "\n])";
    }
}

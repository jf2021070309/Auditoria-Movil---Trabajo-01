package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.q;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class i0 extends f.c implements com.amazon.aps.iva.u1.f1 {
    public a.b o;

    public i0(a.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "horizontal");
        this.o = bVar;
    }

    @Override // com.amazon.aps.iva.u1.f1
    public final Object i0(com.amazon.aps.iva.o2.c cVar, Object obj) {
        u1 u1Var;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (obj instanceof u1) {
            u1Var = (u1) obj;
        } else {
            u1Var = null;
        }
        if (u1Var == null) {
            u1Var = new u1(0);
        }
        int i = q.a;
        a.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.f(bVar, "horizontal");
        u1Var.c = new q.c(bVar);
        return u1Var;
    }
}

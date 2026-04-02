package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.q;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class e2 extends f.c implements com.amazon.aps.iva.u1.f1 {
    public a.c o;

    public e2(a.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "vertical");
        this.o = cVar;
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
        a.c cVar2 = this.o;
        com.amazon.aps.iva.yb0.j.f(cVar2, "vertical");
        u1Var.c = new q.e(cVar2);
        return u1Var;
    }
}

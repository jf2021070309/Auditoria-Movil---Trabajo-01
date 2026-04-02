package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class e1 extends f.c implements com.amazon.aps.iva.u1.f1 {
    public float o;
    public boolean p;

    public e1(float f, boolean z) {
        this.o = f;
        this.p = z;
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
        u1Var.a = this.o;
        u1Var.b = this.p;
        return u1Var;
    }
}

package com.amazon.aps.iva.ee0;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes4.dex */
public final class b0 extends m1 {
    public final com.amazon.aps.iva.oc0.y0[] b;
    public final j1[] c;
    public final boolean d;

    public b0() {
        throw null;
    }

    public b0(com.amazon.aps.iva.oc0.y0[] y0VarArr, j1[] j1VarArr, boolean z) {
        com.amazon.aps.iva.yb0.j.f(y0VarArr, "parameters");
        com.amazon.aps.iva.yb0.j.f(j1VarArr, "arguments");
        this.b = y0VarArr;
        this.c = j1VarArr;
        this.d = z;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final j1 d(e0 e0Var) {
        com.amazon.aps.iva.oc0.y0 y0Var;
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.y0) {
            y0Var = (com.amazon.aps.iva.oc0.y0) k;
        } else {
            y0Var = null;
        }
        if (y0Var == null) {
            return null;
        }
        int index = y0Var.getIndex();
        com.amazon.aps.iva.oc0.y0[] y0VarArr = this.b;
        if (index >= y0VarArr.length || !com.amazon.aps.iva.yb0.j.a(y0VarArr[index].h(), y0Var.h())) {
            return null;
        }
        return this.c[index];
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean e() {
        if (this.c.length == 0) {
            return true;
        }
        return false;
    }
}

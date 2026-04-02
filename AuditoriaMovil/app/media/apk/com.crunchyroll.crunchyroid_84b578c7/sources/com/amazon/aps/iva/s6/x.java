package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.a6.q1;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.s6.t;
import com.amazon.aps.iva.t5.g0;
/* compiled from: TrackSelectorResult.java */
/* loaded from: classes.dex */
public final class x {
    public final int a;
    public final q1[] b;
    public final r[] c;
    public final v0 d;
    public final Object e;

    public x(q1[] q1VarArr, r[] rVarArr, v0 v0Var, t.a aVar) {
        this.b = q1VarArr;
        this.c = (r[]) rVarArr.clone();
        this.d = v0Var;
        this.e = aVar;
        this.a = q1VarArr.length;
    }

    public final boolean a(x xVar, int i) {
        if (xVar == null || !g0.a(this.b[i], xVar.b[i]) || !g0.a(this.c[i], xVar.c[i])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i) {
        if (this.b[i] != null) {
            return true;
        }
        return false;
    }
}

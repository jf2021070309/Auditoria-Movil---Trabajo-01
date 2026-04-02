package com.amazon.aps.iva.rd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.fe0.j;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.k;
import com.amazon.aps.iva.oc0.h;
import com.amazon.aps.iva.oc0.y0;
import java.util.Collection;
import java.util.List;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class c implements b {
    public final j1 a;
    public j b;

    public c(j1 j1Var) {
        com.amazon.aps.iva.yb0.j.f(j1Var, "projection");
        this.a = j1Var;
        j1Var.c();
        v1 v1Var = v1.INVARIANT;
    }

    @Override // com.amazon.aps.iva.rd0.b
    public final j1 b() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection<e0> g() {
        e0 p;
        j1 j1Var = this.a;
        if (j1Var.c() == v1.OUT_VARIANCE) {
            p = j1Var.getType();
        } else {
            p = j().p();
        }
        com.amazon.aps.iva.yb0.j.e(p, "if (projection.projectio… builtIns.nullableAnyType");
        return f1.J(p);
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<y0> getParameters() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final k j() {
        k j = this.a.getType().I0().j();
        com.amazon.aps.iva.yb0.j.e(j, "projection.type.constructor.builtIns");
        return j;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final /* bridge */ /* synthetic */ h k() {
        return null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}

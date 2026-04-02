package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.a0.q0;
import com.amazon.aps.iva.a0.r0;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public abstract class g implements q0 {
    public final boolean a;
    public final float b;
    public final p3<x> c;

    public g() {
        throw null;
    }

    public g(boolean z, float f, q1 q1Var) {
        this.a = z;
        this.b = f;
        this.c = q1Var;
    }

    @Override // com.amazon.aps.iva.a0.q0
    public final r0 a(com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.o0.i iVar) {
        boolean z;
        long b;
        com.amazon.aps.iva.yb0.j.f(kVar, "interactionSource");
        iVar.s(988743187);
        e0.b bVar = e0.a;
        r rVar = (r) iVar.i(s.a);
        iVar.s(-1524341038);
        p3<x> p3Var = this.c;
        if (p3Var.getValue().a != x.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = p3Var.getValue().a;
        } else {
            b = rVar.b(iVar);
        }
        iVar.G();
        p b2 = b(kVar, this.a, this.b, com.amazon.aps.iva.cq.b.h0(new x(b), iVar), com.amazon.aps.iva.cq.b.h0(rVar.a(iVar), iVar), iVar);
        x0.d(b2, kVar, new f(kVar, b2, null), iVar);
        iVar.G();
        return b2;
    }

    public abstract p b(com.amazon.aps.iva.c0.k kVar, boolean z, float f, q1 q1Var, q1 q1Var2, com.amazon.aps.iva.o0.i iVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && com.amazon.aps.iva.o2.e.a(this.b, gVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + t0.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}

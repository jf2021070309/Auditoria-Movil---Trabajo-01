package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.fe0.e;
import com.amazon.aps.iva.fe0.f;
/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes4.dex */
public final class m implements l {
    public final f c;
    public final e d;
    public final com.amazon.aps.iva.qd0.n e;

    public m(f.a aVar) {
        e.a aVar2 = e.a.a;
        com.amazon.aps.iva.yb0.j.f(aVar, "kotlinTypeRefiner");
        com.amazon.aps.iva.yb0.j.f(aVar2, "kotlinTypePreparator");
        this.c = aVar;
        this.d = aVar2;
        this.e = new com.amazon.aps.iva.qd0.n(com.amazon.aps.iva.qd0.n.g, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.fe0.l
    public final com.amazon.aps.iva.qd0.n a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.fe0.d
    public final boolean b(e0 e0Var, e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "a");
        com.amazon.aps.iva.yb0.j.f(e0Var2, "b");
        b1 a = a.a(false, false, null, this.d, this.c, 6);
        u1 L0 = e0Var.L0();
        u1 L02 = e0Var2.L0();
        com.amazon.aps.iva.yb0.j.f(L0, "a");
        com.amazon.aps.iva.yb0.j.f(L02, "b");
        return com.amazon.aps.iva.ee0.e.e(a, L0, L02);
    }

    @Override // com.amazon.aps.iva.fe0.l
    public final f c() {
        return this.c;
    }

    public final boolean d(e0 e0Var, e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "subtype");
        com.amazon.aps.iva.yb0.j.f(e0Var2, "supertype");
        b1 a = a.a(true, false, null, this.d, this.c, 6);
        u1 L0 = e0Var.L0();
        u1 L02 = e0Var2.L0();
        com.amazon.aps.iva.yb0.j.f(L0, "subType");
        com.amazon.aps.iva.yb0.j.f(L02, "superType");
        return com.amazon.aps.iva.ee0.e.i(com.amazon.aps.iva.ee0.e.a, a, L0, L02);
    }
}

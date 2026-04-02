package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes4.dex */
public abstract class e0 implements com.amazon.aps.iva.pc0.a, com.amazon.aps.iva.he0.h {
    public int b;

    public abstract List<j1> G0();

    public abstract a1 H0();

    public abstract c1 I0();

    public abstract boolean J0();

    public abstract e0 K0(com.amazon.aps.iva.fe0.f fVar);

    public abstract u1 L0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (J0() == e0Var.J0()) {
            u1 L0 = L0();
            u1 L02 = e0Var.L0();
            com.amazon.aps.iva.yb0.j.f(L0, "a");
            com.amazon.aps.iva.yb0.j.f(L02, "b");
            if (com.amazon.aps.iva.aq.k.I(com.amazon.aps.iva.fe0.p.a, L0, L02)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return l.a(H0());
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        if (i != 0) {
            return i;
        }
        if (com.amazon.aps.iva.e4.l1.D(this)) {
            hashCode = super.hashCode();
        } else {
            int hashCode2 = G0().hashCode();
            hashCode = (J0() ? 1 : 0) + ((hashCode2 + (I0().hashCode() * 31)) * 31);
        }
        this.b = hashCode;
        return hashCode;
    }

    public abstract com.amazon.aps.iva.xd0.i l();
}

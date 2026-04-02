package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes4.dex */
public abstract class w1 extends e0 {
    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return M0().G0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        return M0().H0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return M0().I0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return M0().J0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final u1 L0() {
        e0 M0 = M0();
        while (M0 instanceof w1) {
            M0 = ((w1) M0).M0();
        }
        com.amazon.aps.iva.yb0.j.d(M0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (u1) M0;
    }

    public abstract e0 M0();

    public boolean N0() {
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return M0().l();
    }

    public final String toString() {
        if (N0()) {
            return M0().toString();
        }
        return "<Not computed yet>";
    }
}

package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements m0.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ m0 c;

    public /* synthetic */ c0(m0 m0Var, int i) {
        this.b = i;
        this.c = m0Var;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        boolean z;
        int i = this.b;
        m0 m0Var = this.c;
        switch (i) {
            case 0:
                v1 v1Var = m0Var.b.o;
                if (v1Var != null && v1Var.k0() && v1Var.h() != 1 && v1Var.h() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    com.amazon.aps.iva.t5.g0.I(v1Var);
                    return;
                } else if (v1Var != null && v1Var.V(1)) {
                    v1Var.pause();
                    return;
                } else {
                    return;
                }
            default:
                v1 v1Var2 = m0Var.b.o;
                if (v1Var2 != null && v1Var2.V(1)) {
                    v1Var2.pause();
                    return;
                }
                return;
        }
    }
}

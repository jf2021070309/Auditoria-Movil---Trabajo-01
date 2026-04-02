package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements m0.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ f0(m0 m0Var, int i, int i2) {
        this.b = i2;
        this.c = m0Var;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        int i;
        int i2 = this.b;
        int i3 = this.d;
        m0 m0Var = this.c;
        switch (i2) {
            case 0:
                if (i3 < 0) {
                    m0Var.getClass();
                    com.amazon.aps.iva.t5.p.g();
                    return;
                }
                m0Var.b.o.E(i3);
                return;
            default:
                v1 v1Var = m0Var.b.o;
                if (i3 != -1 && i3 != 0) {
                    i = 1;
                    if (i3 != 1) {
                        i = 2;
                        if (i3 != 2 && i3 != 3) {
                            com.amazon.aps.iva.t5.p.g();
                        }
                    }
                    v1Var.l(i);
                    return;
                }
                i = 0;
                v1Var.l(i);
                return;
        }
    }
}

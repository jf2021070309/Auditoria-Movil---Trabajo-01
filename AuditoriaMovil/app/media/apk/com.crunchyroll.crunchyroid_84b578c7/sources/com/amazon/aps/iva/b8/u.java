package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements t.c, m0.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(m0 m0Var, int i) {
        this.c = m0Var;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        boolean z;
        v1 v1Var = ((m0) this.c).b.o;
        int i = this.b;
        if (i != -1 && i != 0) {
            z = true;
            if (i != 1 && i != 2) {
                throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Unrecognized ShuffleMode: ", i));
            }
        } else {
            z = false;
        }
        v1Var.l0(z);
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        ((v1) this.c).K();
        cVar.v();
    }
}

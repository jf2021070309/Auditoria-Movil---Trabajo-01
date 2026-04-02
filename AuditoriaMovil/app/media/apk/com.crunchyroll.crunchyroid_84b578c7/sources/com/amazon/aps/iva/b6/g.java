package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements o.a, com.amazon.aps.iva.t5.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        com.amazon.aps.iva.b8.t tVar = ((com.amazon.aps.iva.b8.p1) this.c).a.get();
        if (tVar != null && !tVar.g() && tVar.i()) {
            if (v1Var.F() == 0) {
                tVar.k(v1Var);
            } else {
                com.amazon.aps.iva.t5.g0.I(v1Var);
            }
        }
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((b) obj).getClass();
                return;
            default:
                ((b) obj).getClass();
                return;
        }
    }
}

package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.i;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, int i) {
        super(3);
        this.h = obj;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        b3 b3Var2 = b3Var;
        com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
        int i = b3Var2.r;
        int i2 = this.i;
        if (com.amazon.aps.iva.yb0.j.a(this.h, b3Var2.I(i, i2))) {
            b3Var2.F(i2, i.a.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
        e0.c("Slot table is out of sync".toString());
        throw null;
    }
}

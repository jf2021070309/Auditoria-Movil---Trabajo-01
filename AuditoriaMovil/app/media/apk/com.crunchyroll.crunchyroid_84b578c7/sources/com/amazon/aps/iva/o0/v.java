package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.yb0.b0 h;
    public final /* synthetic */ List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.amazon.aps.iva.yb0.b0 b0Var, ArrayList arrayList) {
        super(3);
        this.h = b0Var;
        this.i = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        d<?> dVar2 = dVar;
        b3 b3Var2 = b3Var;
        u2 u2Var2 = u2Var;
        com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var2, "slots", u2Var2, "rememberManager");
        int i = this.h.b;
        if (i > 0) {
            dVar2 = new s1(dVar2, i);
        }
        List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).invoke(dVar2, b3Var2, u2Var2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

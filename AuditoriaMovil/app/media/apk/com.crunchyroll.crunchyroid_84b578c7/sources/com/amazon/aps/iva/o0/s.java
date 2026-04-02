package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.yb0.b0 h;
    public final /* synthetic */ List<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.yb0.b0 b0Var, ArrayList arrayList) {
        super(3);
        this.h = b0Var;
        this.i = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        d<?> dVar2 = dVar;
        com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var, "<anonymous parameter 1>", u2Var, "<anonymous parameter 2>");
        int i = this.h.b;
        List<Object> list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            dVar2.f(i3, obj);
            dVar2.c(i3, obj);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

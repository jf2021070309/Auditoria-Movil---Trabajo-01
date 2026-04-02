package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: NavBackStackEntryProvider.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.x0.e h;
    public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.amazon.aps.iva.x0.e eVar, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
        super(2);
        this.h = eVar;
        this.i = pVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        h.b(this.h, this.i, iVar, I);
        return q.a;
    }
}

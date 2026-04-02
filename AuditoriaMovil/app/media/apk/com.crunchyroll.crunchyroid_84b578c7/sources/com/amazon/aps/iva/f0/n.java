package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, int i, Object obj, int i2) {
        super(2);
        this.h = pVar;
        this.i = i;
        this.j = obj;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            int i = this.k;
            int i2 = this.i;
            Object obj = this.j;
            this.h.f(i2, obj, iVar2, ((i << 6) & 896) | ((i >> 6) & 14) | 64);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

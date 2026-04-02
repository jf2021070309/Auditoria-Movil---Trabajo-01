package com.amazon.aps.iva.pd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class f extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
    public final /* synthetic */ com.amazon.aps.iva.a1.f j;
    public final /* synthetic */ com.amazon.aps.iva.a1.f k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.f fVar2, int i, int i2) {
        super(2);
        this.h = aVar;
        this.i = aVar2;
        this.j = fVar;
        this.k = fVar2;
        this.l = i;
        this.m = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        g.c(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
        return q.a;
    }
}

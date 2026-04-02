package com.amazon.aps.iva.pd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ com.amazon.aps.iva.s1.f i;
    public final /* synthetic */ com.amazon.aps.iva.a1.f j;
    public final /* synthetic */ com.amazon.aps.iva.a1.f k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, com.amazon.aps.iva.s1.f fVar, com.amazon.aps.iva.a1.f fVar2, com.amazon.aps.iva.a1.f fVar3, int i, int i2) {
        super(2);
        this.h = aVar;
        this.i = fVar;
        this.j = fVar2;
        this.k = fVar3;
        this.l = i;
        this.m = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        g.b(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
        return q.a;
    }
}

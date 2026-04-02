package com.amazon.aps.iva.ke;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: TermsAndPolicy.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
    public final /* synthetic */ f j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, f fVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(2);
        this.h = aVar;
        this.i = aVar2;
        this.j = fVar;
        this.k = i;
        this.l = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        num.intValue();
        com.amazon.aps.iva.xb0.a<q> aVar = this.h;
        com.amazon.aps.iva.xb0.a<q> aVar2 = this.i;
        d.a(com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l, iVar, this.j, aVar, aVar2);
        return q.a;
    }
}

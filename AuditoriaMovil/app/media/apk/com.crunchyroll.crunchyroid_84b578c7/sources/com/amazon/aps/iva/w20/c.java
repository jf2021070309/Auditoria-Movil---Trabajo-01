package com.amazon.aps.iva.w20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MembershipCardFooter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ com.amazon.aps.iva.a1.f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.a1.f fVar, long j, int i, int i2) {
        super(2);
        this.h = j;
        this.i = fVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        num.intValue();
        long j = this.h;
        d.a(this.i, j, iVar, com.amazon.aps.iva.ff0.b.I(this.j | 1), this.k);
        return q.a;
    }
}

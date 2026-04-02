package com.amazon.aps.iva.ao;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Theme.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<i, Integer, q> {
    public final /* synthetic */ p<i, Integer, q> h;
    public final /* synthetic */ f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, int i2, f fVar, p pVar) {
        super(2);
        this.h = pVar;
        this.i = fVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        f fVar = this.i;
        p<i, Integer, q> pVar = this.h;
        c.b(I, this.k, iVar, fVar, pVar);
        return q.a;
    }
}

package com.amazon.aps.iva.ly;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrImage.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, long j, int i, int i2) {
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
        a.b(this.i, j, iVar, com.amazon.aps.iva.ff0.b.I(this.j | 1), this.k);
        return q.a;
    }
}

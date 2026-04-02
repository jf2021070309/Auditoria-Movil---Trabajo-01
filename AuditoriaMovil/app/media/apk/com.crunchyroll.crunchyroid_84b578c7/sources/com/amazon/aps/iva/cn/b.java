package com.amazon.aps.iva.cn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AvatarIcon.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ int h;
    public final /* synthetic */ com.amazon.aps.iva.a1.f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, com.amazon.aps.iva.a1.f fVar, int i2, int i3) {
        super(2);
        this.h = i;
        this.i = fVar;
        this.j = i2;
        this.k = i3;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        a.b(this.h, this.i, iVar, I, this.k);
        return q.a;
    }
}

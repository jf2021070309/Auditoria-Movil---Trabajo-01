package com.amazon.aps.iva.im;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AssetsCollectionTitle.kt */
/* loaded from: classes2.dex */
public final class a extends l implements p<i, Integer, q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ String i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, f fVar, int i, int i2) {
        super(2);
        this.h = fVar;
        this.i = str;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        b.a(this.i, this.h, iVar, I, this.k);
        return q.a;
    }
}

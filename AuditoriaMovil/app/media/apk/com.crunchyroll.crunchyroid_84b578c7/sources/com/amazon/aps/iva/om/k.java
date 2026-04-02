package com.amazon.aps.iva.om;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ProfilesOnboardingModalContent.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, int i2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(2);
        this.h = fVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = i;
        this.l = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        l.a(com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l, iVar, this.h, this.i, this.j);
        return q.a;
    }
}

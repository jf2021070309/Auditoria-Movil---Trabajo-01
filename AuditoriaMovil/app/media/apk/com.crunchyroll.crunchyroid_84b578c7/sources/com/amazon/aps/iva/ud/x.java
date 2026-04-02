package com.amazon.aps.iva.ud;
/* compiled from: ContinueWatchingLarge.kt */
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.sd.a h;
    public final /* synthetic */ com.amazon.aps.iva.sd.a i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i, com.amazon.aps.iva.sd.a aVar, com.amazon.aps.iva.sd.a aVar2) {
        super(2);
        this.h = aVar;
        this.i = aVar2;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        v.b(this.h, this.i, iVar, I);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

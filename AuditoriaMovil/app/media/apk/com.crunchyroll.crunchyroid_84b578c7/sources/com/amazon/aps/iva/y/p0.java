package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.h> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Integer, Integer> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.amazon.aps.iva.kl.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o2.h invoke(com.amazon.aps.iva.o2.j jVar) {
        return new com.amazon.aps.iva.o2.h(com.amazon.aps.iva.e.w.e(this.h.invoke(Integer.valueOf((int) (jVar.a >> 32))).intValue(), 0));
    }
}

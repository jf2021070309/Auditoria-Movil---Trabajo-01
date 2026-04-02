package com.amazon.aps.iva.b30;
/* compiled from: UnverifiedPurchaseMonitor.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.g30.e eVar, m mVar) {
        super(1);
        this.h = eVar;
        this.i = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wh.a aVar) {
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        if (aVar2 != null) {
            this.h.invoke(aVar2);
            this.i.g.i(null);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

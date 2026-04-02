package com.amazon.aps.iva.r00;
/* compiled from: DownloadAccessPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        super(0);
        this.h = eVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.getView().Wh();
        this.i.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

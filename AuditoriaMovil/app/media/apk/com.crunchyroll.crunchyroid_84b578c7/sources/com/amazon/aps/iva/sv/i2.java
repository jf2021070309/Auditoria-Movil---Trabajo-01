package com.amazon.aps.iva.sv;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class i2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.ob0.d<com.ellation.crunchyroll.downloading.e0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.amazon.aps.iva.ob0.i iVar) {
        super(0);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.resumeWith(null);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

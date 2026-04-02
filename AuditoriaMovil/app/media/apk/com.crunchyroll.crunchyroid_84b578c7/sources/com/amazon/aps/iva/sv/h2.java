package com.amazon.aps.iva.sv;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class h2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.ob0.d<com.ellation.crunchyroll.downloading.e0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.amazon.aps.iva.ob0.i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.ellation.crunchyroll.downloading.e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "localVideo");
        this.h.resumeWith(e0Var2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

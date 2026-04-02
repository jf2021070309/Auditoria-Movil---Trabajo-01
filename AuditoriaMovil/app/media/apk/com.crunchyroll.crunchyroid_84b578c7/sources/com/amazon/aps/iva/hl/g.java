package com.amazon.aps.iva.hl;
/* compiled from: PlayerRestrictionOverlay.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.dj.f h;
    public final /* synthetic */ com.amazon.aps.iva.cj.z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.dj.f fVar, com.amazon.aps.iva.cj.z zVar) {
        super(0);
        this.h = fVar;
        this.i = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.b().a();
        this.i.Qd();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.b50;
/* compiled from: WatchlistInteractor.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.b60.s, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.b60.s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.b60.k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.b60.s sVar) {
        com.amazon.aps.iva.b60.s sVar2 = sVar;
        com.amazon.aps.iva.yb0.j.f(sVar2, "it");
        return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(sVar2.getContentId(), this.h.getContentId()));
    }
}

package com.amazon.aps.iva.kl;

import com.amazon.aps.iva.ab.x;
/* compiled from: UpNextBannerViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.upnext.banner.UpNextBannerViewModelImpl$uiModel$2", f = "UpNextBannerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        super(2, dVar);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new p(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((p) create(eVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        this.h.e.setValue(Boolean.FALSE);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

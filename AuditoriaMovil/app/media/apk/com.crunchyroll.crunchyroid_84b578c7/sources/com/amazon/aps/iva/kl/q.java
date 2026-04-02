package com.amazon.aps.iva.kl;

import com.amazon.aps.iva.ab.x;
import com.crunchyroll.crunchyroid.R;
/* compiled from: UpNextBannerViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.upnext.banner.UpNextBannerViewModelImpl$uiModel$3", f = "UpNextBannerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.nk.j, com.amazon.aps.iva.ob0.d<? super j>, Object> {
    public /* synthetic */ com.amazon.aps.iva.kj.e h;
    public /* synthetic */ com.amazon.aps.iva.nk.j i;
    public final /* synthetic */ r j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(3, dVar);
        this.j = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        q qVar = new q(this.j, dVar);
        qVar.h = eVar;
        qVar.i = jVar;
        return qVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        String a;
        int i;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.e eVar = this.h;
        long j = this.i.b;
        r rVar = this.j;
        rVar.getClass();
        if (eVar.t == null) {
            a = null;
        } else {
            a = rVar.b.a(eVar);
        }
        com.amazon.aps.iva.pe0.a m0 = x.m0(eVar.r);
        if (com.amazon.aps.iva.yb0.j.a(a, "premium")) {
            i = R.drawable.ic_up_next_banner_premium;
        } else if (com.amazon.aps.iva.yb0.j.a(a, "matureBlocked")) {
            i = R.drawable.ic_up_next_banner_error;
        } else {
            i = R.drawable.ic_up_next_banner_play;
        }
        int i2 = i;
        s sVar = rVar.c;
        return new j(m0, i2, sVar.b(eVar), sVar.a(j), ((float) j) / 10000.0f);
    }
}

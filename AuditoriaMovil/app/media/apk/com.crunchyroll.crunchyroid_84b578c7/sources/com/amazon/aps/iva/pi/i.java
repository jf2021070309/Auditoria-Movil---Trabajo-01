package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.ab.x;
/* compiled from: WatchMusicPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.WatchMusicPlayerViewModelImpl$castStopFlow$1", f = "WatchMusicPlayerViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ve0.g<? super Long>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public i(com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(2, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new i(dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super Long> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return new i(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.oo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.xb0.q;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.player.WatchScreenPlayerViewModelImpl$upNextStreamsFlow$1", f = "WatchScreenPlayerViewModelImpl.kt", l = {52, 52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements q<com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c>, com.amazon.aps.iva.no.b, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ com.amazon.aps.iva.no.b j;
    public final /* synthetic */ m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(3, dVar);
        this.k = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c> gVar, com.amazon.aps.iva.no.b bVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        l lVar = new l(this.k, dVar);
        lVar.i = gVar;
        lVar.j = bVar;
        return lVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ve0.g gVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.i;
            x.i0(obj);
        } else {
            x.i0(obj);
            gVar = this.i;
            com.amazon.aps.iva.no.b bVar = this.j;
            com.amazon.aps.iva.po.e eVar = this.k.c;
            PlayableAsset playableAsset = bVar.a;
            this.i = gVar;
            this.h = 1;
            obj = eVar.a(playableAsset, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.i = null;
        this.h = 2;
        if (gVar.a(obj, this) == aVar) {
            return aVar;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

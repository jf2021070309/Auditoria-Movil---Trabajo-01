package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.ab.x;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: WatchMusicPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.WatchMusicPlayerViewModelImpl$upNextStreamsFlow$1", f = "WatchMusicPlayerViewModelImpl.kt", l = {66, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c>, MusicAsset, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ MusicAsset j;
    public final /* synthetic */ p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(3, dVar);
        this.k = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c> gVar, MusicAsset musicAsset, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        o oVar = new o(this.k, dVar);
        oVar.i = gVar;
        oVar.j = musicAsset;
        return oVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            MusicAsset musicAsset = this.j;
            b bVar = this.k.d;
            this.i = gVar;
            this.h = 1;
            obj = bVar.a(musicAsset, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.kj.c cVar = (com.amazon.aps.iva.kj.c) obj;
        if (cVar != null) {
            this.i = null;
            this.h = 2;
            if (gVar.a(cVar, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

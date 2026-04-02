package com.amazon.aps.iva.ni;

import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.Iterator;
import java.util.List;
/* compiled from: WatchMusicViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.WatchMusicViewModelImpl$nextAssetFlow$1", f = "WatchMusicViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.ve0.g<? super MusicAsset>, List<? extends MusicAsset>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ List j;
    public final /* synthetic */ w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(3, dVar);
        this.k = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super MusicAsset> gVar, List<? extends MusicAsset> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        u uVar = new u(this.k, dVar);
        uVar.i = gVar;
        uVar.j = list;
        return uVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.ve0.g gVar = this.i;
            List list = this.j;
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (com.amazon.aps.iva.yb0.j.a(((MusicAsset) it.next()).getId(), this.k.o0().b)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            MusicAsset musicAsset = (MusicAsset) com.amazon.aps.iva.lb0.x.w0(i2 + 1, list);
            if (musicAsset != null) {
                this.i = null;
                this.h = 1;
                if (gVar.a(musicAsset, this) == aVar) {
                    return aVar;
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

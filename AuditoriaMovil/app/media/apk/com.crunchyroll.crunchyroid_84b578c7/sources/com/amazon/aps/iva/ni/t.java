package com.amazon.aps.iva.ni;

import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.List;
/* compiled from: WatchMusicViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.WatchMusicViewModelImpl$assetsFlow$1", f = "WatchMusicViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<p, com.amazon.aps.iva.ob0.d<? super List<? extends MusicAsset>>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ w j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.j = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        t tVar = new t(this.j, dVar);
        tVar.i = obj;
        return tVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(p pVar, com.amazon.aps.iva.ob0.d<? super List<? extends MusicAsset>> dVar) {
        return ((t) create(pVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            p pVar = (p) this.i;
            w wVar = this.j;
            com.amazon.aps.iva.ji.a aVar2 = wVar.b;
            String b = wVar.d.b(pVar.a);
            com.amazon.aps.iva.x50.t type = pVar.a.getType();
            this.h = 1;
            obj = aVar2.F1(b, type, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}

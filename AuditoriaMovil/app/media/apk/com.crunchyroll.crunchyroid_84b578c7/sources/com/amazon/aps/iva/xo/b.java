package com.amazon.aps.iva.xo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenDownloadingViewModel.kt */
@e(c = "com.crunchyroll.watchscreen.screen.downloading.WatchScreenDownloadingViewModelImpl$downloadButtonState$1$1$1", f = "WatchScreenDownloadingViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public c h;
    public int i;
    public final /* synthetic */ c j;
    public final /* synthetic */ com.amazon.aps.iva.fg.c k;
    public final /* synthetic */ com.amazon.aps.iva.no.b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.amazon.aps.iva.fg.c cVar2, com.amazon.aps.iva.no.b bVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.j = cVar;
        this.k = cVar2;
        this.l = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                cVar = this.h;
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            PlayableAsset playableAsset = this.l.a;
            c cVar2 = this.j;
            this.h = cVar2;
            this.i = 1;
            obj = this.k.b(playableAsset, this);
            if (obj == aVar) {
                return aVar;
            }
            cVar = cVar2;
        }
        cVar.k(obj);
        return q.a;
    }
}

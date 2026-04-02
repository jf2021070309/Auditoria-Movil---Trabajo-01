package com.amazon.aps.iva.b50;

import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
/* compiled from: WatchlistItemsLoader.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.WatchlistItemsLoaderImpl$fetchWatchlistItems$1", f = "WatchlistItemsLoader.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(2, dVar);
        this.j = vVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        u uVar = new u(this.j, dVar);
        uVar.i = obj;
        return uVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((u) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    vVar = (v) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                v vVar2 = this.j;
                this.i = vVar2;
                this.h = 1;
                Object watchlistItems = vVar2.b.invoke().getWatchlistItems(this);
                if (watchlistItems == aVar) {
                    return aVar;
                }
                vVar = vVar2;
                obj = watchlistItems;
            }
            vVar.e = ((ContentApiResponse) obj).getData();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            com.amazon.aps.iva.ab.x.H(th);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

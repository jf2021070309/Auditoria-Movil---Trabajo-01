package com.amazon.aps.iva.b50;
/* compiled from: WatchlistInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.WatchlistInteractorImpl", f = "WatchlistInteractor.kt", l = {53}, m = "loadWatchlistPage")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.c {
    public s h;
    public com.amazon.aps.iva.xb0.l i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(dVar);
        this.k = sVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O0(null, null, null, this);
    }
}

package com.amazon.aps.iva.h50;
/* compiled from: EtpWatchlistInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.EtpWatchlistInteractorImpl", f = "EtpWatchlistInteractor.kt", l = {78}, m = "getWatchlistItemStatus")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.c {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ b j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(dVar);
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.t1(null, this);
    }
}

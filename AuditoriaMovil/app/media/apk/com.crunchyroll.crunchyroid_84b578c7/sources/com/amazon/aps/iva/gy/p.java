package com.amazon.aps.iva.gy;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
/* compiled from: MusicAssetsInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.MusicAssetsInteractorImpl", f = "MusicAssetsInteractor.kt", l = {81}, m = "getConcerts")
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.qb0.c {
    public o h;
    public HomeFeedItemRaw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        super(dVar);
        this.k = oVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, this);
    }
}

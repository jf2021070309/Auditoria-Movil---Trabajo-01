package com.amazon.aps.iva.n10;
/* compiled from: GenreFeedInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedInteractorImpl", f = "GenreFeedInteractor.kt", l = {117}, m = "getSubcategoriesFeed")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ d i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, com.amazon.aps.iva.ob0.d<? super f> dVar2) {
        super(dVar2);
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return d.z0(this.i, null, null, null, 0, this);
    }
}

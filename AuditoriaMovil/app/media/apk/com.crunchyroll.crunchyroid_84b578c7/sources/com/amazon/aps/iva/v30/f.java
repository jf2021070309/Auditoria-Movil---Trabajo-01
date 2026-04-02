package com.amazon.aps.iva.v30;
/* compiled from: SearchResultDetailInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailInteractorImpl", f = "SearchResultDetailInteractor.kt", l = {87}, m = "searchNextPage")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public e h;
    public com.amazon.aps.iva.xb0.l i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.k = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.U0(null, null, null, null, this);
    }
}

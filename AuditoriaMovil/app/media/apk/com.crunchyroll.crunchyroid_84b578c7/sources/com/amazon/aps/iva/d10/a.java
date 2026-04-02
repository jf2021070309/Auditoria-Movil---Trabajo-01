package com.amazon.aps.iva.d10;
/* compiled from: AsyncDownloadPanelFetcher.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.AsyncDownloadPanelFetcherImpl", f = "AsyncDownloadPanelFetcher.kt", l = {39, 40}, m = "getDownloadPanel")
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qb0.c {
    public f h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(dVar);
        this.l = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}

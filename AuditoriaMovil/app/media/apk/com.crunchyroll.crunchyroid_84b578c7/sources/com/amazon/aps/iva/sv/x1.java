package com.amazon.aps.iva.sv;
/* compiled from: DownloadsRepository.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {329, 330}, m = "deleteSeasonEpisodes")
/* loaded from: classes2.dex */
public final class x1 extends com.amazon.aps.iva.qb0.c {
    public v1 h;
    public com.amazon.aps.iva.xb0.l i;
    public com.amazon.aps.iva.xb0.l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super x1> dVar) {
        super(dVar);
        this.l = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(null, null, null, this);
    }
}

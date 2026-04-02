package com.amazon.aps.iva.sv;

import java.io.Serializable;
/* compiled from: DownloadsRepository.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {240, 240, 243, 243, 244, 245, 246, 247}, m = "getDataToDownload")
/* loaded from: classes2.dex */
public final class y1 extends com.amazon.aps.iva.qb0.c {
    public Object h;
    public Serializable i;
    public Object j;
    public Serializable k;
    public Serializable l;
    public Serializable m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super y1> dVar) {
        super(dVar);
        this.o = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.s(null, this);
    }
}

package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.model.Episode;
import java.util.Iterator;
/* compiled from: DownloadsRepository.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {338, 341, 342, 345, 346, 351, 352}, m = "deletePanelAssets")
/* loaded from: classes2.dex */
public final class w1 extends com.amazon.aps.iva.qb0.c {
    public v1 h;
    public Object i;
    public com.amazon.aps.iva.xb0.l j;
    public Object k;
    public Iterator l;
    public Episode m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ v1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super w1> dVar) {
        super(dVar);
        this.p = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(null, null, null, this);
    }
}

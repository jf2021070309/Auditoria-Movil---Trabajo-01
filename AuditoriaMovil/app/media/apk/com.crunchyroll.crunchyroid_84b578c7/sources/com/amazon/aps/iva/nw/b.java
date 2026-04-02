package com.amazon.aps.iva.nw;

import com.amazon.aps.iva.xb0.p;
/* compiled from: RenewContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.renew.RenewContentInteractorImpl", f = "RenewContentInteractor.kt", l = {53, 56}, m = "renewAllExpiredContent")
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qb0.c {
    public c h;
    public com.amazon.aps.iva.xb0.l i;
    public com.amazon.aps.iva.xb0.l j;
    public p k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(dVar);
        this.m = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.D(this, null, null, null);
    }
}

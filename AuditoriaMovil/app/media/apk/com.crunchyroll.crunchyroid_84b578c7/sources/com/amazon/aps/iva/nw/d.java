package com.amazon.aps.iva.nw;
/* compiled from: RenewContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.renew.RenewContentInteractorImpl", f = "RenewContentInteractor.kt", l = {118}, m = "syncOfflineViewingBenefit")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(dVar);
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return c.C(this.i, this);
    }
}

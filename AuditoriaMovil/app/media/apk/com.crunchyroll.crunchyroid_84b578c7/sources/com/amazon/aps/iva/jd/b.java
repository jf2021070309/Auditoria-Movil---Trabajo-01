package com.amazon.aps.iva.jd;
/* compiled from: AccountDataInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.account.AccountDataInteractorImpl", f = "AccountDataInteractorImpl.kt", l = {26}, m = "loadAndStoreAccount")
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.qb0.c {
    public c h;
    public /* synthetic */ Object i;
    public final /* synthetic */ c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(dVar);
        this.j = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v1(this);
    }
}

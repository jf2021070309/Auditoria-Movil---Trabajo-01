package com.amazon.aps.iva.fe;
/* compiled from: OtpViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.screen.OtpViewModelImpl", f = "OtpViewModel.kt", l = {89, 90}, m = "signUp")
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.qb0.c {
    public t h;
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(dVar);
        this.l = tVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return t.N8(this.l, null, null, this);
    }
}

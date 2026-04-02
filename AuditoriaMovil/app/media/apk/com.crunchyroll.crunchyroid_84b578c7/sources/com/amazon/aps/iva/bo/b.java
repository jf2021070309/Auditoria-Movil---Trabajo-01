package com.amazon.aps.iva.bo;
/* compiled from: UserDataInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.userdata.UserDataInteractorImpl", f = "UserDataInteractorImpl.kt", l = {64}, m = "loadAccount")
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qb0.c {
    public d h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
        super(dVar2);
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return d.C(this.j, this);
    }
}

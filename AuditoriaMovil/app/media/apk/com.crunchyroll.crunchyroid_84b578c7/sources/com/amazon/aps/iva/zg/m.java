package com.amazon.aps.iva.zg;

import java.io.IOException;
/* compiled from: SendConfirmationEmailInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.emailverification.banner.SendConfirmationEmailInteractorImpl", f = "SendConfirmationEmailInteractor.kt", l = {49}, m = "refreshJwtIfEmailAlreadyVerified")
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.qb0.c {
    public IOException h;
    public /* synthetic */ Object i;
    public final /* synthetic */ n j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, com.amazon.aps.iva.ob0.d<? super m> dVar) {
        super(dVar);
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.C(null, this);
    }
}

package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl", f = "UserTokenInteractorImpl.kt", l = {188}, m = "signInWithFun")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$signInWithFun$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserTokenInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTokenInteractorImpl$signInWithFun$1(UserTokenInteractorImpl userTokenInteractorImpl, d<? super UserTokenInteractorImpl$signInWithFun$1> dVar) {
        super(dVar);
        this.this$0 = userTokenInteractorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.signInWithFun(null, null, this);
    }
}

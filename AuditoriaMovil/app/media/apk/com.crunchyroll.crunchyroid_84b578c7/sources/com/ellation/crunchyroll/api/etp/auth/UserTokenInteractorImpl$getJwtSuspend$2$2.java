package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.l;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/Token;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$2$2", f = "UserTokenInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$getJwtSuspend$2$2 extends i implements l<d<? super Token>, Object> {
    final /* synthetic */ UserTokenInteractorImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTokenInteractorImpl$getJwtSuspend$2$2(UserTokenInteractorImpl userTokenInteractorImpl, d<? super UserTokenInteractorImpl$getJwtSuspend$2$2> dVar) {
        super(1, dVar);
        this.$this_runCatching = userTokenInteractorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(d<?> dVar) {
        return new UserTokenInteractorImpl$getJwtSuspend$2$2(this.$this_runCatching, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(d<? super Token> dVar) {
        return ((UserTokenInteractorImpl$getJwtSuspend$2$2) create(dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Token newToken;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            newToken = this.$this_runCatching.getNewToken();
            return newToken;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

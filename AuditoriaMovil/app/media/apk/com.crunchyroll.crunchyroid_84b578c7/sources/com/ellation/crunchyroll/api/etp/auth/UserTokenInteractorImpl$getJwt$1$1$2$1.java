package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$getJwt$1$1$2$1 extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    final /* synthetic */ UserTokenInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTokenInteractorImpl$getJwt$1$1$2$1(UserTokenInteractorImpl userTokenInteractorImpl) {
        super(1);
        this.this$0 = userTokenInteractorImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Throwable th) {
        invoke2(th);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.job = null;
    }
}

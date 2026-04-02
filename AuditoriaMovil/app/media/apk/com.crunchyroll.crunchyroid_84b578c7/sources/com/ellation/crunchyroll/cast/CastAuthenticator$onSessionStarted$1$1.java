package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import kotlin.Metadata;
/* compiled from: CastAuthenticator.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastAuthenticator$onSessionStarted$1$1 extends l implements com.amazon.aps.iva.xb0.a<q> {
    final /* synthetic */ UserCodeBody $userCodeBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastAuthenticator$onSessionStarted$1$1(UserCodeBody userCodeBody) {
        super(0);
        this.$userCodeBody = userCodeBody;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public /* bridge */ /* synthetic */ q invoke() {
        invoke2();
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        UserCodeBody userCodeBody = this.$userCodeBody;
        c0515a.a(userCodeBody + " activated successfully", new Object[0]);
    }
}

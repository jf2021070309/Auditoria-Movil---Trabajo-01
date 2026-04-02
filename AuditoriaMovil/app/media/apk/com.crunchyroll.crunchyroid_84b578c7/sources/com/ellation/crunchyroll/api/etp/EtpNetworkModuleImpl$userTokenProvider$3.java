package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.auth.Token;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/Token;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/ellation/crunchyroll/api/etp/auth/Token;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$userTokenProvider$3 extends l implements com.amazon.aps.iva.xb0.l<Token, q> {
    final /* synthetic */ EtpNetworkModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$userTokenProvider$3(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(1);
        this.this$0 = etpNetworkModuleImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Token token) {
        invoke2(token);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Token token) {
        j.f(token, "it");
        this.this$0.getRefreshTokenMonitor().onRefreshTokenValid(token);
    }
}

package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/api/etp/account/model/AccountApiModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$accountIdInterceptor$1 extends l implements a<AccountApiModel> {
    final /* synthetic */ EtpNetworkModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$accountIdInterceptor$1(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(0);
        this.this$0 = etpNetworkModuleImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final AccountApiModel invoke() {
        CrunchyrollApplication crunchyrollApplication;
        crunchyrollApplication = this.this$0.application;
        return crunchyrollApplication.b().m0();
    }
}

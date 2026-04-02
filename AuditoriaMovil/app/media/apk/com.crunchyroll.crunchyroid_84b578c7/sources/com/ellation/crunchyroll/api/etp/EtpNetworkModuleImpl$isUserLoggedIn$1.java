package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$isUserLoggedIn$1 extends l implements a<Boolean> {
    final /* synthetic */ EtpNetworkModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$isUserLoggedIn$1(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(0);
        this.this$0 = etpNetworkModuleImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        CrunchyrollApplication crunchyrollApplication;
        crunchyrollApplication = this.this$0.application;
        return Boolean.valueOf(crunchyrollApplication.b().m0() != null);
    }
}

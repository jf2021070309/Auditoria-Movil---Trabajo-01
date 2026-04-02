package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.application.e;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$drmProxyService$1 extends l implements a<String> {
    public static final EtpNetworkModuleImpl$drmProxyService$1 INSTANCE = new EtpNetworkModuleImpl$drmProxyService$1();

    public EtpNetworkModuleImpl$drmProxyService$1() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        String guid;
        AccountApiModel m0 = e.d().m0();
        return (m0 == null || (guid = m0.getGuid()) == null) ? "" : guid;
    }
}

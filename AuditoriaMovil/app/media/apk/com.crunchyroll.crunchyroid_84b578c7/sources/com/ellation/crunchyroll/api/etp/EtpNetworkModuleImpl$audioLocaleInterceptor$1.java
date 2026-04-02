package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ql.g;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$audioLocaleInterceptor$1 extends l implements a<String> {
    public static final EtpNetworkModuleImpl$audioLocaleInterceptor$1 INSTANCE = new EtpNetworkModuleImpl$audioLocaleInterceptor$1();

    public EtpNetworkModuleImpl$audioLocaleInterceptor$1() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        g gVar = g.g;
        if (gVar != null) {
            return (String) gVar.a.getValue();
        }
        j.m("instance");
        throw null;
    }
}

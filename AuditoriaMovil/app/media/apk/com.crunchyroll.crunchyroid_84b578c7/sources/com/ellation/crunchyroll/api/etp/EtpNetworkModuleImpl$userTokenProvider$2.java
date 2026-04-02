package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.Traits;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$userTokenProvider$2 extends l implements a<String> {
    public static final EtpNetworkModuleImpl$userTokenProvider$2 INSTANCE = new EtpNetworkModuleImpl$userTokenProvider$2();

    public EtpNetworkModuleImpl$userTokenProvider$2() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        AnalyticsContext analyticsContext;
        Traits traits;
        int i = com.amazon.aps.iva.ds.a.a;
        c cVar = c.b;
        Analytics analytics = c.c;
        if (analytics == null || (analyticsContext = analytics.getAnalyticsContext()) == null || (traits = analyticsContext.traits()) == null) {
            return null;
        }
        return traits.anonymousId();
    }
}

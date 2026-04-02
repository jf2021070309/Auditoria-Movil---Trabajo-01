package com.kwad.components.ad.reward.check;

import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class a {
    public static void a(AdTemplate adTemplate, int i, long j, int i2, String str) {
        KSLoggerReporter.j(new RewardCheckMonitorInfo(adTemplate.posId).setRequestStatus(2).setCheckType(i).setEnviType(0).setDataLoadInterval(j).setCode(i2).setErrorMsg(str).setCreativeId(com.kwad.sdk.core.response.b.a.E(d.ck(adTemplate))).toJson());
    }

    public static void c(AdTemplate adTemplate, int i) {
        KSLoggerReporter.j(new RewardCheckMonitorInfo(adTemplate.posId).setRequestStatus(1).setCheckType(i).setEnviType(0).setCreativeId(com.kwad.sdk.core.response.b.a.E(d.ck(adTemplate))).toJson());
    }
}

package com.kwad.sdk.ranger.b;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.p;
import com.kwad.sdk.ranger.b.a.d;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a {
    public static final String TAG = "Ranger_" + a.class.getSimpleName();

    public static void a(d dVar) {
        JSONObject json = dVar.toJson();
        if (json == null) {
            return;
        }
        String str = TAG;
        c.d(str, "report Stats:" + json.toString());
        KSLoggerReporter.a(new p.a().dz(ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.d.aNO).dA("ad_sdk_detect_info").C(json).Cc());
    }
}

package com.kwad.sdk.core.report;

import android.text.TextUtils;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.ReportResultData;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class y extends com.kwad.sdk.core.network.a<z> {
    private ReportResultData asM;

    private ReportResultData a(com.kwad.sdk.core.network.c cVar) {
        if (this.asM == null) {
            this.asM = new ReportResultData() { // from class: com.kwad.sdk.core.report.ReportNetwork$1
                @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
                public void parseJson(JSONObject jSONObject) {
                    super.parseJson(jSONObject);
                }
            };
        }
        if (cVar != null) {
            try {
                this.asM.parseJson(new JSONObject(cVar.aoR));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.asM;
    }

    private void a(z zVar) {
        try {
            List<String> Co = zVar.Co();
            for (String str : Co) {
                com.kwad.sdk.core.network.c doGetWithoutResponse = com.kwad.sdk.g.wW().doGetWithoutResponse(str, null);
                if (!isValidUrl(str) || doGetWithoutResponse.code != 200) {
                    KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_track").T("trackUrlError", str).aO(zVar.getAdTemplate()).report();
                }
            }
            a(zVar.getAdTemplate(), Co);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private static void a(AdTemplate adTemplate, List<String> list) {
        if (adTemplate.mTrackUrlReported || list == null || list.isEmpty()) {
            return;
        }
        adTemplate.mTrackUrlReported = true;
        r rVar = new r(10217L, adTemplate);
        rVar.aso = com.kwad.sdk.utils.t.toJsonArray(list);
        i.a2(rVar);
    }

    private static void a(String str, int i, AdTemplate adTemplate, com.kwad.sdk.core.network.c cVar) {
        if (TextUtils.isEmpty(str) || str.contains(" ") || !str.startsWith("http") || cVar.code != 200) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_track").T(i == 1 ? "showUrlError" : i == 2 ? "clickUrlError" : "convertUrlError", str).aO(adTemplate).report();
        }
    }

    private static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return false;
            }
            return uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https");
        } catch (URISyntaxException e) {
            return false;
        }
    }

    @Override // com.kwad.sdk.core.network.a
    public void fetch() {
        super.fetch();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // com.kwad.sdk.core.network.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fetchImpl() {
        /*
            r7 = this;
            java.lang.Class<com.kwad.sdk.service.a.e> r0 = com.kwad.sdk.service.a.e.class
            java.lang.Object r0 = com.kwad.sdk.service.ServiceProvider.get(r0)
            com.kwad.sdk.service.a.e r0 = (com.kwad.sdk.service.a.e) r0
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.kwad.sdk.utils.ag.isNetworkConnected(r0)
            java.lang.String r1 = "ReportNetwork"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "no network while report log"
            com.kwad.sdk.core.e.c.w(r1, r0)
            return
        L1a:
            com.kwad.sdk.core.network.g r0 = r7.createRequest()
            com.kwad.sdk.core.report.z r0 = (com.kwad.sdk.core.report.z) r0
            r2 = 0
            java.lang.String r3 = r0.getUrl()     // Catch: java.lang.Exception -> L52
            com.kwad.sdk.export.proxy.AdHttpProxy r4 = com.kwad.sdk.g.wW()     // Catch: java.lang.Exception -> L50
            org.json.JSONObject r5 = r0.getBody()     // Catch: java.lang.Exception -> L50
            com.kwad.sdk.core.network.c r2 = r4.doPost(r3, r2, r5)     // Catch: java.lang.Exception -> L50
            if (r2 == 0) goto L4d
            int r4 = r2.code     // Catch: java.lang.Exception -> L50
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = "report success actionType:"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L50
            int r5 = r0.asN     // Catch: java.lang.Exception -> L50
            r4.append(r5)     // Catch: java.lang.Exception -> L50
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L50
        L49:
            com.kwad.sdk.core.e.c.d(r1, r4)     // Catch: java.lang.Exception -> L50
            goto L57
        L4d:
            java.lang.String r4 = "report fail result is null"
            goto L49
        L50:
            r4 = move-exception
            goto L54
        L52:
            r4 = move-exception
            r3 = r2
        L54:
            com.kwad.sdk.core.e.c.printStackTrace(r4)
        L57:
            com.kwad.sdk.core.response.model.ReportResultData r4 = r7.a(r2)
            boolean r5 = r4.isCheatingFlow()
            if (r5 == 0) goto L6c
            com.kwad.sdk.core.response.model.AdTemplate r5 = r0.getAdTemplate()
            boolean r6 = r4.isCheatingFlow()
            r5.setCheatingFlow(r6)
        L6c:
            com.kwad.sdk.core.response.model.AdTemplate r5 = r0.getAdTemplate()
            boolean r5 = r5.mCheatingFlow
            if (r5 != 0) goto L77
            r7.a(r0)
        L77:
            int r5 = r0.getActionType()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            a(r3, r5, r0, r2)
            java.lang.Boolean r0 = com.kwad.framework.a.a.mp
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb5
            boolean r0 = r4.isResultOk()
            if (r0 != 0) goto Lb5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "请求返回失败 code:"
            r0.<init>(r2)
            int r2 = r4.result
            r0.append(r2)
            java.lang.String r2 = ", errorMsg:"
            r0.append(r2)
            java.lang.String r2 = r4.errorMsg
            r0.append(r2)
            java.lang.String r2 = "\nurl="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.e.c.d(r1, r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.report.y.fetchImpl():void");
    }

    @Override // com.kwad.sdk.core.network.a
    public /* bridge */ /* synthetic */ void onResponse(z zVar, com.kwad.sdk.core.network.c cVar) {
    }
}

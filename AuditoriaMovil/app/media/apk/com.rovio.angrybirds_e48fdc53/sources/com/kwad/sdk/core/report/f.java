package com.kwad.sdk.core.report;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes.dex */
public final class f {
    public double aqX;
    public double aqY;
    public String aqZ = BuildConfig.VERSION_NAME;

    private static double xH() {
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        return fVar != null ? fVar.xH() : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r3, org.json.JSONObject r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "minSDKVersion"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto Le
            java.lang.String r0 = r4.optString(r0)
            r2.aqZ = r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ratio"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ad_client_error_log"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L3d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "ratioRE"
            r3.<init>(r1)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            boolean r1 = r4.has(r3)
            if (r1 == 0) goto L3d
            double r0 = r4.optDouble(r3)
            goto L41
        L3d:
            double r0 = r4.optDouble(r0)
        L41:
            r2.aqX = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "ratioApmRL"
            r3.<init>(r0)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            boolean r5 = r4.has(r3)
            if (r5 == 0) goto L5e
            double r3 = r4.optDouble(r3)
        L5b:
            r2.aqY = r3
            return
        L5e:
            double r3 = xH()
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.report.f.a(java.lang.String, org.json.JSONObject, java.lang.String):void");
    }
}

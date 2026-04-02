package com.kwad.components.ad.interstitial.monitor;
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(com.kwad.sdk.core.response.model.AdTemplate r7) {
        /*
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.d.ck(r7)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.F(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            com.kwad.components.ad.interstitial.monitor.b.cM()
            if (r1 == 0) goto L18
            java.lang.String r0 = "empty videoUrl"
            com.kwad.components.ad.interstitial.monitor.b.a(r7, r0)
            r7 = 0
            return r7
        L18:
            com.kwad.components.ad.interstitial.monitor.b.j(r7)
            int r1 = com.kwad.sdk.core.config.d.zy()
            java.lang.String r2 = ""
            r3 = 0
            r5 = 1
            if (r1 >= 0) goto L50
            com.kwad.sdk.core.diskcache.b.a r1 = com.kwad.sdk.core.diskcache.b.a.At()
            java.io.File r1 = r1.bP(r0)
            boolean r6 = com.kwad.sdk.utils.q.L(r1)
            if (r6 == 0) goto L35
            goto L45
        L35:
            com.kwad.sdk.core.network.a.a$a r2 = new com.kwad.sdk.core.network.a.a$a
            r2.<init>()
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.At()
            boolean r0 = r5.a(r0, r2)
            java.lang.String r2 = r2.msg
            r5 = r0
        L45:
            if (r1 == 0) goto L4b
            long r3 = r1.length()
        L4b:
            r7.setDownloadSize(r3)
            r0 = 2
            goto L7a
        L50:
            if (r1 <= 0) goto L7e
            com.kwad.sdk.core.network.a.a$a r2 = new com.kwad.sdk.core.network.a.a$a
            r2.<init>()
            com.kwad.sdk.KsAdSDKImpl r3 = com.kwad.sdk.KsAdSDKImpl.get()
            android.content.Context r3 = r3.getContext()
            com.kwad.sdk.core.videocache.f r3 = com.kwad.sdk.core.videocache.c.a.bl(r3)
            boolean r4 = r3.dP(r0)
            if (r4 != 0) goto L70
            int r4 = r1 * 1024
            boolean r0 = r3.a(r0, r4, r2)
            r5 = r0
        L70:
            java.lang.String r2 = r2.msg
            long r0 = (long) r1
            r3 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r3
            r7.setDownloadSize(r0)
            r0 = 3
        L7a:
            r7.setDownloadType(r0)
            goto L84
        L7e:
            r7.setDownloadSize(r3)
            r7.setDownloadType(r5)
        L84:
            if (r5 != 0) goto L8c
            com.kwad.components.ad.interstitial.monitor.b.cM()
            com.kwad.components.ad.interstitial.monitor.b.a(r7, r2)
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.interstitial.monitor.a.h(com.kwad.sdk.core.response.model.AdTemplate):boolean");
    }
}

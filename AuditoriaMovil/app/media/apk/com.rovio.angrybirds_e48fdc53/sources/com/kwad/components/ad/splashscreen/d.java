package com.kwad.components.ad.splashscreen;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class d {
    public static int BZ;
    private String Ca;
    private int Cb = 2;
    private String title;

    private void V(String str) {
        this.Ca = str;
    }

    private void W(int i) {
        this.Cb = i;
    }

    public static d a(AdTemplate adTemplate, AdInfo adInfo, com.kwad.components.core.e.d.c cVar, int i) {
        String str;
        d dVar = new d();
        BZ = i;
        if (adInfo != null && cVar != null) {
            if (i == 1) {
                dVar.setTitle(com.kwad.sdk.core.response.b.b.cS(adInfo));
            } else if (i != 4) {
                if (com.kwad.sdk.core.response.b.a.ax(adInfo)) {
                    int nA = cVar.nA();
                    str = "或点击" + a(adTemplate, adInfo, nA);
                } else {
                    String a = com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CD);
                    if (TextUtils.isEmpty(a)) {
                        a = "点击跳转详情页或第三方应用";
                    }
                    str = "或" + a;
                }
                dVar.V(str);
            }
            str = a(adInfo, cVar);
            dVar.V(str);
        }
        dVar.W(com.kwad.sdk.core.response.b.b.db(adInfo));
        return dVar;
    }

    public static String a(AdInfo adInfo, int i) {
        AdMatrixInfo.DownloadTexts b = b(adInfo, BZ);
        return i != 8 ? i != 12 ? b.adActionDescription : b.openAppLabel : b.installAppLabel;
    }

    private static String a(AdInfo adInfo, com.kwad.components.core.e.d.c cVar) {
        if (!com.kwad.sdk.core.response.b.a.ax(adInfo)) {
            String d = d(adInfo, BZ);
            return TextUtils.isEmpty(d) ? "点击跳转详情页或第三方应用" : d;
        }
        int nA = cVar.nA();
        AdMatrixInfo.DownloadTexts b = b(adInfo, BZ);
        return nA != 8 ? nA != 12 ? b.adActionDescription : b.openAppLabel : b.installAppLabel;
    }

    public static String a(AdTemplate adTemplate, AdInfo adInfo, int i) {
        return i != 8 ? i != 12 ? com.kwad.sdk.core.response.b.a.aw(adInfo) : com.kwad.sdk.core.response.b.a.U(adInfo) : com.kwad.sdk.core.response.b.a.aQ(adTemplate);
    }

    private static AdMatrixInfo.DownloadTexts b(AdInfo adInfo, int i) {
        if (i == 1) {
            return com.kwad.sdk.core.response.b.b.cQ(adInfo) != null ? com.kwad.sdk.core.response.b.b.cQ(adInfo) : new AdMatrixInfo.DownloadTexts();
        }
        if (i == 4 && com.kwad.sdk.core.response.b.b.cV(adInfo) != null) {
            return com.kwad.sdk.core.response.b.b.cV(adInfo);
        }
        return new AdMatrixInfo.DownloadTexts();
    }

    public static String c(AdInfo adInfo, int i) {
        AdMatrixInfo.DownloadTexts cR = com.kwad.sdk.core.response.b.b.cR(adInfo) != null ? com.kwad.sdk.core.response.b.b.cR(adInfo) : new AdMatrixInfo.DownloadTexts();
        return i != 8 ? i != 12 ? cR.adActionDescription : cR.openAppLabel : cR.installAppLabel;
    }

    private static String d(AdInfo adInfo, int i) {
        return i == 1 ? com.kwad.sdk.core.response.b.b.cU(adInfo) != null ? com.kwad.sdk.core.response.b.b.cU(adInfo) : "" : (i != 4 || com.kwad.sdk.core.response.b.b.cW(adInfo) == null) ? "" : com.kwad.sdk.core.response.b.b.cW(adInfo);
    }

    private void setTitle(String str) {
        this.title = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int kA() {
        return this.Cb;
    }

    public final String kz() {
        return this.Ca;
    }
}

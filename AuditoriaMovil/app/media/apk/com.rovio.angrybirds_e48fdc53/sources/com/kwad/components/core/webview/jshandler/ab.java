package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ab implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private final Handler TW = new Handler(Looper.getMainLooper());
    private final AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public String UD;
        public int UE;
        public String UF;
        public String UG;
        public String UH;
        @Deprecated
        public boolean UI;
        public boolean UJ;
        public boolean UK;
        public String appId;
        public String appName;
        public String icon;
        public String qq;
        public int type;
        public String url;
        public String version;
        public int versionCode;
    }

    public ab(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
        AdTemplate adTemplate = new AdTemplate();
        this.mAdTemplate = adTemplate;
        try {
            AdTemplate adTemplate2 = bVar.getAdTemplate();
            if (adTemplate2 != null) {
                if (adTemplate2.mOriginJString != null) {
                    adTemplate.parseJson(new JSONObject(adTemplate2.mOriginJString));
                } else {
                    adTemplate.parseJson(adTemplate2.toJson());
                }
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private static void a(AdInfo adInfo, a aVar) {
        AdInfo.AdConversionInfo adConversionInfo = adInfo.adConversionInfo;
        adConversionInfo.deeplinkUrl = aVar.UG;
        adConversionInfo.marketUrl = aVar.UH;
        adInfo.adBaseInfo.adOperationType = aVar.type;
        adInfo.adBaseInfo.appPackageName = aVar.UD;
        adInfo.adBaseInfo.appName = aVar.appName;
        adInfo.adBaseInfo.appVersion = aVar.version;
        adInfo.adBaseInfo.packageSize = aVar.UE;
        adInfo.adBaseInfo.appIconUrl = aVar.icon;
        adInfo.adBaseInfo.appDescription = aVar.qq;
        if (!com.kwad.sdk.core.response.b.a.ax(adInfo)) {
            adInfo.adConversionInfo.h5Url = aVar.url;
            return;
        }
        adInfo.adConversionInfo.appDownloadUrl = aVar.url;
        adInfo.downloadId = com.kwad.sdk.utils.ad.bq(adInfo.adConversionInfo.appDownloadUrl);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.e.d.c cVar2;
        int i;
        if (com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            if (this.mApkDownloadHelper == null) {
                this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            }
            cVar2 = this.mApkDownloadHelper;
            i = 2;
        } else {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
            a aVar = new a();
            try {
                aVar.parseJson(new JSONObject(str));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
            a(ck, aVar);
            if (this.mApkDownloadHelper == null) {
                this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            }
            cVar2 = this.mApkDownloadHelper;
            i = 1;
        }
        cVar2.ar(i);
        this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.components.core.e.d.a.a(new a.C0197a(ab.this.TO.MZ.getContext()).S(ab.this.mAdTemplate).b(ab.this.mApkDownloadHelper).a(new a.b() { // from class: com.kwad.components.core.webview.jshandler.ab.1.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                    }
                }));
            }
        });
        cVar.a(null);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "handleAdUrl";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.TW.removeCallbacksAndMessages(null);
    }
}

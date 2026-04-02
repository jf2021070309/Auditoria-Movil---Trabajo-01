package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class am implements com.kwad.sdk.core.webview.c.a {
    private KsAppDownloadListener Tp;
    private com.kwad.sdk.core.webview.c.c Tx;
    private final com.kwad.sdk.core.webview.b cE;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public double Vi;
        public int status;
    }

    /* loaded from: classes.dex */
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public String UD;
        public String UF;
        public long Vp;
        public String appName;
        public String icon;
        public String qq;
        public String url;
        public String version;
        public int versionCode;
    }

    public am(com.kwad.sdk.core.webview.b bVar) {
        this.cE = bVar;
        try {
            this.mAdTemplate = new AdTemplate();
            AdTemplate adTemplate = bVar.getAdTemplate();
            if (adTemplate != null) {
                if (adTemplate.mOriginJString != null) {
                    this.mAdTemplate.parseJson(new JSONObject(adTemplate.mOriginJString));
                } else {
                    this.mAdTemplate.parseJson(adTemplate.toJson());
                }
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f) {
        if (this.Tx != null) {
            a aVar = new a();
            aVar.Vi = f;
            aVar.status = i;
            this.Tx.a(aVar);
        }
    }

    private static void a(AdInfo adInfo, b bVar) {
        adInfo.adBaseInfo.adOperationType = 1;
        adInfo.adBaseInfo.appPackageName = bVar.UD;
        adInfo.adBaseInfo.appName = bVar.appName;
        adInfo.adBaseInfo.appVersion = bVar.version;
        adInfo.adBaseInfo.packageSize = bVar.Vp;
        adInfo.adBaseInfo.appIconUrl = bVar.icon;
        adInfo.adBaseInfo.appDescription = bVar.qq;
        adInfo.adConversionInfo.appDownloadUrl = bVar.url;
        adInfo.downloadId = com.kwad.sdk.utils.ad.bq(adInfo.adConversionInfo.appDownloadUrl);
    }

    private KsAppDownloadListener rw() {
        return new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.webview.jshandler.am.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                am.this.a(1, 0.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                am.this.a(5, 1.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                am.this.a(1, 0.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                am.this.a(6, 1.0f);
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                am.this.a(3, (i * 1.0f) / 100.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                am.this.a(2, (i * 1.0f) / 100.0f);
            }
        };
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.e.d.c cVar2;
        int i;
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate == null) {
            cVar.onError(-1, "native photo is null");
            return;
        }
        if (com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            if (this.mApkDownloadHelper == null) {
                this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            }
            cVar2 = this.mApkDownloadHelper;
            i = 2;
        } else {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
            b bVar = new b();
            try {
                bVar.parseJson(new JSONObject(str));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
            a(ck, bVar);
            if (this.mApkDownloadHelper == null) {
                this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            }
            cVar2 = this.mApkDownloadHelper;
            i = 1;
        }
        cVar2.ar(i);
        this.Tx = cVar;
        KsAppDownloadListener ksAppDownloadListener = this.Tp;
        if (ksAppDownloadListener != null) {
            this.mApkDownloadHelper.d(ksAppDownloadListener);
            return;
        }
        KsAppDownloadListener rw = rw();
        this.Tp = rw;
        this.mApkDownloadHelper.b(rw);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerApkStatusListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        KsAppDownloadListener ksAppDownloadListener;
        this.Tx = null;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar == null || (ksAppDownloadListener = this.Tp) == null) {
            return;
        }
        cVar.c(ksAppDownloadListener);
        this.Tp = null;
    }
}

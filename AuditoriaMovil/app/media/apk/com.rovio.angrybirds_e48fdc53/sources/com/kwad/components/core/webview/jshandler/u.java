package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private boolean TQ;
    private Handler TW;
    private boolean Ua;
    private com.kwad.sdk.core.webview.d.a.a cH;
    private final com.kwad.components.core.e.d.c mApkDownloadHelper;

    public u(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar) {
        this(bVar, cVar, aVar, false, false);
    }

    public u(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar, boolean z, boolean z2) {
        this.TQ = false;
        this.Ua = false;
        this.TQ = z;
        this.TW = new Handler(Looper.getMainLooper());
        this.TO = bVar;
        this.mApkDownloadHelper = cVar;
        this.Ua = z2;
        if (cVar != null) {
            cVar.ar(1);
        }
        this.cH = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        Handler handler;
        Runnable runnable;
        if (this.TO.DX()) {
            cVar.onError(-1, "native adTemplate is null");
            return;
        }
        final com.kwad.sdk.core.webview.d.b.a aVar = new com.kwad.sdk.core.webview.d.b.a();
        try {
            aVar.parseJson(new JSONObject(str));
            aVar.JJ = true;
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (!this.TO.ayo) {
            if (this.cH != null) {
                handler = this.TW;
                runnable = new Runnable() { // from class: com.kwad.components.core.webview.jshandler.u.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (u.this.cH != null) {
                            u.this.cH.a(aVar);
                        }
                    }
                };
            }
            cVar.a(null);
        }
        handler = this.TW;
        runnable = new Runnable() { // from class: com.kwad.components.core.webview.jshandler.u.1
            @Override // java.lang.Runnable
            public final void run() {
                if (u.this.TO.ayp || aVar.Va) {
                    AdTemplate adTemplate = u.this.TO.getAdTemplate();
                    KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(adTemplate.mAdScene != null ? KSLoggerReporter.cs(adTemplate.mAdScene.getAdStyle()) : null, "adClick").c("isWebCard", Boolean.TRUE).report();
                    com.kwad.components.core.e.d.a.a(u.this.TO.MZ.getContext(), u.this.TO.getAdTemplate(), new a.b() { // from class: com.kwad.components.core.webview.jshandler.u.1.1
                        @Override // com.kwad.components.core.e.d.a.b
                        public final void onAdClicked() {
                            if (u.this.cH != null) {
                                u.this.cH.a(aVar);
                            }
                        }
                    }, u.this.mApkDownloadHelper, aVar.Va, u.this.TQ, u.this.Ua);
                }
            }
        };
        handler.post(runnable);
        cVar.a(null);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "convert";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.TW.removeCallbacksAndMessages(null);
        this.cH = null;
    }
}

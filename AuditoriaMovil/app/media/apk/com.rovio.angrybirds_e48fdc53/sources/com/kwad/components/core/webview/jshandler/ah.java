package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ah implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b cE;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public String Vb;
    }

    /* loaded from: classes.dex */
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public double Vi;
        public int status;
        public long totalBytes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f, com.kwad.sdk.core.webview.c.c cVar) {
        if (cVar != null) {
            b bVar = new b();
            bVar.Vi = f;
            bVar.status = i;
            bVar.totalBytes = com.kwad.sdk.core.response.b.d.ck(this.cE.getAdTemplate()).totalBytes;
            cVar.a(bVar);
        }
    }

    private KsAppDownloadListener aK(String str) {
        return new com.kwad.sdk.core.download.a.a(str) { // from class: com.kwad.components.core.webview.jshandler.ah.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(1, 0.0f, ah.this.cE.ayn.fA(nB()));
                }
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(5, 1.0f, ah.this.cE.ayn.fA(nB()));
                }
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(1, 0.0f, ah.this.cE.ayn.fA(nB()));
                }
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(6, 1.0f, ah.this.cE.ayn.fA(nB()));
                }
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(3, (i * 1.0f) / 100.0f, ah.this.cE.ayn.fA(nB()));
                }
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                if (ah.this.cE.ayn != null) {
                    ah.this.a(2, (i * 1.0f) / 100.0f, ah.this.cE.ayn.fA(nB()));
                }
            }
        };
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        a aVar = new a();
        AdTemplate adTemplate = new AdTemplate();
        try {
            aVar.parseJson(new JSONObject(str));
            adTemplate.parseJson(new JSONObject(aVar.Vb));
        } catch (Exception e) {
            adTemplate = null;
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        if (adTemplate == null || !com.kwad.sdk.core.response.b.d.cc(adTemplate) || this.cE.ayn == null) {
            return;
        }
        com.kwad.components.core.e.d.c cVar2 = new com.kwad.components.core.e.d.c(adTemplate);
        String nB = cVar2.nB();
        cVar2.b(aK(nB));
        this.cE.ayn.a(nB, cVar2);
        this.cE.ayn.b(nB, cVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerProgressListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        if (this.cE.ayn != null) {
            this.cE.ayn.release();
        }
    }
}

package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.api.KsAppDownloadListener;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class as implements com.kwad.sdk.core.webview.c.a {
    private KsAppDownloadListener Tp;
    private com.kwad.sdk.core.webview.c.c Tx;
    private KsAppDownloadListener Vw;
    private final com.kwad.sdk.core.webview.b cE;
    private final com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        public float Vy;
        public long creativeId;
        public int status;
        public long totalBytes;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", this.Vy);
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", this.status);
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.TOTAL_BYTES, this.totalBytes);
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", this.creativeId);
            return jSONObject;
        }
    }

    public as(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar) {
        this.cE = bVar;
        this.mApkDownloadHelper = cVar;
    }

    public as(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, KsAppDownloadListener ksAppDownloadListener) {
        this.cE = bVar;
        this.mApkDownloadHelper = cVar;
        this.Vw = ksAppDownloadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f) {
        if (this.Tx != null) {
            a aVar = new a();
            aVar.Vy = f;
            aVar.status = i;
            aVar.totalBytes = com.kwad.sdk.core.response.b.d.ck(this.cE.getAdTemplate()).totalBytes;
            this.Tx.a(aVar);
        }
    }

    private KsAppDownloadListener rw() {
        return new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.webview.jshandler.as.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                as.this.a(1, 0.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                as.this.a(5, 1.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                as.this.a(1, 0.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                as.this.a(6, 1.0f);
                if (as.this.Vw != null) {
                    as.this.Vw.onInstalled();
                }
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                as.this.a(3, (i * 1.0f) / 100.0f);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                as.this.a(2, (i * 1.0f) / 100.0f);
            }
        };
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.cE.DX()) {
            cVar.onError(-1, "native photo is null");
            return;
        }
        this.Tx = cVar;
        com.kwad.components.core.e.d.c cVar2 = this.mApkDownloadHelper;
        if (cVar2 != null) {
            KsAppDownloadListener ksAppDownloadListener = this.Tp;
            if (ksAppDownloadListener != null) {
                cVar2.d(ksAppDownloadListener);
                return;
            }
            KsAppDownloadListener rw = rw();
            this.Tp = rw;
            this.mApkDownloadHelper.b(rw);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerProgressListener";
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

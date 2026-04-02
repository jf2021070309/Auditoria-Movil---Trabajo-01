package com.kwad.components.core.webview.jshandler;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.e.d.c JN;
    private KsAppDownloadListener Tp;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private com.kwad.sdk.core.webview.c.c nE;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String TD;
        public String packageName;
    }

    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int progress;
        public int status;
    }

    public i(Context context, AdTemplate adTemplate) {
        this.mContext = context;
        this.mAdTemplate = adTemplate;
    }

    private synchronized void j(String str, String str2) {
        this.JN = new com.kwad.components.core.e.d.c(this.mAdTemplate, null, str, str2);
        if (this.Tp == null) {
            KsAppDownloadListener rw = rw();
            this.Tp = rw;
            this.JN.b(rw);
        }
    }

    private static boolean k(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i, int i2) {
        if (this.nE != null) {
            b bVar = new b();
            bVar.status = i;
            bVar.progress = i2;
            this.nE.a(bVar);
        }
    }

    private KsAppDownloadListener rw() {
        return new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.webview.jshandler.i.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                i.this.n(0, 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                i.this.n(8, 100);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                i.this.n(0, 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                i.this.n(12, 100);
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                i.this.n(4, i);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                if (i == 0) {
                    i.this.n(1, 0);
                } else {
                    i.this.n(2, i);
                }
            }
        };
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.nE = cVar;
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(str));
            if (k(aVar.TD, aVar.packageName)) {
                cVar.onError(-1, "param is empty");
                return;
            }
            if (this.JN == null) {
                j(aVar.TD, aVar.packageName);
            }
            if (this.JN.nJ()) {
                return;
            }
            this.JN.d(this.Tp);
            this.JN.m(new a.C0197a(this.mContext).al(true).am(false).S(this.mAdTemplate).ao(false));
        } catch (Exception e) {
            cVar.onError(-1, "data parse error");
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "installAppForDownload";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.nE = null;
    }
}

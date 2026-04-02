package com.kwad.components.core.webview.a;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bp;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private com.kwad.components.core.e.d.c JN;
    private WebView My;
    private boolean Te;
    private KsAppDownloadListener Tp;
    private int Tq = -100;
    private int Tr = 0;
    private com.kwad.sdk.core.webview.b cE;
    private AdTemplate mAdTemplate;

    /* renamed from: com.kwad.components.core.webview.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0213a extends com.kwad.sdk.core.response.a.a {
        public String packageName;
        public String url;
    }

    /* loaded from: classes.dex */
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public int progress;
        public int status;
    }

    public a(WebView webView, com.kwad.sdk.core.webview.b bVar) {
        this.My = webView;
        this.mAdTemplate = bVar.getAdTemplate();
        this.cE = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aF(String str) {
        try {
            C0213a c0213a = new C0213a();
            c0213a.parseJson(new JSONObject(str));
            if (k(c0213a.url, c0213a.packageName)) {
                return;
            }
            if (this.JN == null) {
                j(c0213a.url, c0213a.packageName);
            }
            if (this.JN.nJ()) {
                return;
            }
            this.JN.d(this.Tp);
            this.JN.m(new a.C0197a(this.cE.My.getContext()).al(true).am(false).S(this.mAdTemplate).ao(false));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private void h(String str, String str2) {
        WebView webView;
        if (this.Te || TextUtils.isEmpty(str) || (webView = this.My) == null) {
            return;
        }
        bp.a(webView, str, str2);
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
        this.Tr = i2;
        if (this.Tq != i) {
            this.Tq = i;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            h("onDownLoadStatusCallback", sb.toString());
        }
    }

    private KsAppDownloadListener rw() {
        return new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.webview.a.a.2
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                a.this.n(0, 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                a.this.n(8, 100);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                a.this.n(0, 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                a.this.n(12, 100);
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                a.this.n(4, i);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                if (i == 0) {
                    a.this.n(1, 0);
                } else {
                    a.this.n(2, i);
                }
            }
        };
    }

    public final void destroy() {
        this.Te = true;
        com.kwad.components.core.e.d.c cVar = this.JN;
        if (cVar != null) {
            cVar.c(this.Tp);
        }
    }

    @JavascriptInterface
    public final int getDownLoadStatus(String str, String str2) {
        if (k(str, str2)) {
            return 0;
        }
        if (this.JN == null) {
            j(str, str2);
        }
        return this.JN.nA();
    }

    @JavascriptInterface
    public final int getProgress(String str, String str2) {
        if (k(str, str2)) {
            return 0;
        }
        if (this.JN == null) {
            j(str, str2);
        }
        return this.Tr;
    }

    @JavascriptInterface
    public final void handleAdClick(final String str) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.aF(str);
            }
        });
    }
}

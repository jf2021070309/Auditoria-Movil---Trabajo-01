package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {
    private final com.applovin.impl.sdk.k a;
    private final WebViewRenderProcessClient b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                com.applovin.impl.sdk.a.g currentAd = ((d) webView).getCurrentAd();
                f.this.a.aa().a(currentAd).a(com.applovin.impl.sdk.d.b.D).a();
                com.applovin.impl.sdk.r z = f.this.a.z();
                z.e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewRenderProcessClient a() {
        return this.b;
    }
}

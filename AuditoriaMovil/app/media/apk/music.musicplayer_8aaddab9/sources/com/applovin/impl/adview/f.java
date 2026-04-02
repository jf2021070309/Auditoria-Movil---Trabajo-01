package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
@TargetApi(29)
/* loaded from: classes.dex */
public class f {
    private final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewRenderProcessClient f3217b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                com.applovin.impl.sdk.ad.e currentAd = ((d) webView).getCurrentAd();
                f.this.a.ab().a(currentAd).a(com.applovin.impl.sdk.d.b.D).a();
                com.applovin.impl.sdk.v B = f.this.a.B();
                B.e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
            }
        }
    };

    public f(com.applovin.impl.sdk.m mVar) {
        this.a = mVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f3217b;
    }
}

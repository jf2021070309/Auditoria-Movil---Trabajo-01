package com.kwad.sdk.core.webview.a;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kwad.sdk.core.config.d;
/* loaded from: classes.dex */
public class a extends WebViewClient {
    private boolean ayA = true;
    protected String mUniqueId = "";

    public final void setNeedHybridLoad(boolean z) {
        this.ayA = z;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.ayA && d.zE()) {
            String uri = webResourceRequest.getUrl().toString();
            com.kwad.sdk.core.e.c.d("HybridWebViewClient", "shouldInterceptRequestAPI 21: " + uri);
            WebResourceResponse U = com.kwad.sdk.core.webview.b.a.Ed().U(uri, this.mUniqueId);
            return U == null ? super.shouldInterceptRequest(webView, webResourceRequest) : U;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.ayA && d.zE()) {
            com.kwad.sdk.core.e.c.d("HybridWebViewClient", "shouldInterceptRequest: " + str);
            WebResourceResponse U = com.kwad.sdk.core.webview.b.a.Ed().U(str, this.mUniqueId);
            return U == null ? super.shouldInterceptRequest(webView, str) : U;
        }
        return super.shouldInterceptRequest(webView, str);
    }
}

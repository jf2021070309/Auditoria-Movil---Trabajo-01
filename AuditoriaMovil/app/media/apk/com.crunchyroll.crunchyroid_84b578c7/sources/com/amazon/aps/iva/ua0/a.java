package com.amazon.aps.iva.ua0;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.iva.c.b;
import com.truex.adrenderer.web.TruexWebView;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class a extends WebViewClient {
    public final /* synthetic */ TruexWebView a;

    public a(TruexWebView truexWebView) {
        this.a = truexWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (str2 != null) {
            TruexWebView truexWebView = this.a;
            if (str2.startsWith(truexWebView.c)) {
                String a = b.a("could not connect to webview: ", str, "\n at url: ", str2);
                HashMap hashMap = new HashMap();
                hashMap.put("errorMessage", a);
                truexWebView.a(com.amazon.aps.iva.qa0.b.AD_ERROR, hashMap);
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            String uri = url.toString();
            TruexWebView truexWebView = this.a;
            if (uri.startsWith(truexWebView.c)) {
                HashMap hashMap = new HashMap();
                hashMap.put("errorMessage", "could not connect to webview: " + ((Object) webResourceError.getDescription()) + "\n at url: " + url);
                truexWebView.a(com.amazon.aps.iva.qa0.b.AD_ERROR, hashMap);
                return;
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}

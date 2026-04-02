package com.amazon.aps.iva.wa;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.util.LogUtils;
/* compiled from: ApsIvaWebViewClient.java */
/* loaded from: classes.dex */
public final class o extends WebViewClient {
    public final com.amazon.aps.iva.xa.b a;

    public o(com.amazon.aps.iva.xa.b bVar) {
        this.a = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        LogUtils.d("o", "Page finished loading: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!com.amazon.aps.iva.l9.a.c(str)) {
            webView.stopLoading();
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        LogUtils.e("o", String.format("Error while loading WebView: %s", str));
        this.a.a(new MetricEvent("apsIva-errorLoadingWebViewCounter", Severity.ERROR));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        LogUtils.e("o", String.format("Error while loading WebView: %s", webResourceError.getDescription()));
        this.a.a(new MetricEvent("apsIva-errorLoadingWebViewCounter", Severity.ERROR));
    }
}

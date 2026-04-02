package com.amazon.aps.iva.wn;

import android.graphics.Bitmap;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.vn.g;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrStoreWebViewClient.kt */
/* loaded from: classes2.dex */
public final class b extends WebViewClient {
    public final l<Boolean, q> a;

    public b(g.a aVar) {
        this.a = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        j.f(webView, "view");
        super.onPageFinished(webView, str);
        CookieManager.getInstance().flush();
        this.a.invoke(Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        j.f(webView, "view");
        super.onPageStarted(webView, str, bitmap);
        this.a.invoke(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence charSequence;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        if (webResourceError != null) {
            charSequence = webResourceError.getDescription();
        } else {
            charSequence = null;
        }
        c0515a.c("Store WebView Error: " + ((Object) charSequence), new Object[0]);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        if (webResourceResponse != null) {
            str = webResourceResponse.getReasonPhrase();
        } else {
            str = null;
        }
        c0515a.c(com.amazon.aps.iva.oa.a.a("Store WebView HTTP Error: ", str), new Object[0]);
    }
}

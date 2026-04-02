package com.fyber.inneractive.sdk.m;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
final class f extends WebViewClient {
    b a;
    private final boolean b;
    private final int c;
    private final int d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar, boolean z, int i, int i2, int i3) {
        this.a = bVar;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        b bVar = this.a;
        return bVar != null && bVar.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.a("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.a("onPageFinished - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.a("Resources to load: %s", str);
        IAlog.a(IAlog.b, "%s %s", "RESOURCES", str);
        b bVar = this.a;
        if (bVar != null) {
            bVar.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.b && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.a("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            WebResourceResponse a = i.a().a(webResourceRequest, this.c, this.d, this.e);
            if (a != null) {
                return a;
            }
            IAlog.a("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.b("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.b("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        this.a.l();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.a("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
    }
}

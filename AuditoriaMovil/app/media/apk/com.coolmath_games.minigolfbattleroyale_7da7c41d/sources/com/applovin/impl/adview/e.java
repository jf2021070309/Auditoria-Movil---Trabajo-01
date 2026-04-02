package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.drive.DriveFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends WebViewClient {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.r b;
    private final b c;

    public e(b bVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        this.c = bVar;
    }

    private void a() {
        this.c.l();
    }

    private void a(PointF pointF) {
        this.c.a(pointF);
    }

    private void a(Uri uri, d dVar) {
        com.applovin.impl.sdk.r rVar;
        String str;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.r rVar2 = this.b;
                rVar2.b("AdWebView", "Loading new page externally: " + queryParameter);
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.a);
                com.applovin.impl.sdk.utils.i.c(this.c.g(), this.c.p(), this.c.r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.r rVar3 = this.b;
                rVar3.b("AdWebView", "Loading new page in WebView: " + queryParameter);
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.r rVar4 = this.b;
                rVar4.b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                this.a.ad().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            com.applovin.impl.sdk.utils.i.a(e.this.c.g(), e.this.c.p(), e.this.c.r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            com.applovin.impl.sdk.utils.i.b(e.this.c.g(), e.this.c.p(), e.this.c.r());
                            e.this.a.ad().b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.a.J(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.x());
                intent.setFlags(DriveFile.MODE_READ_ONLY);
                this.a.J().startActivity(intent);
                return;
            } else {
                rVar = this.b;
                str = "Could not find load type in original uri";
            }
        } else {
            rVar = this.b;
            str = "Could not find url to load from query in original uri";
        }
        rVar.e("AdWebView", str);
    }

    private void a(com.applovin.impl.a.a aVar, d dVar) {
        com.applovin.impl.a.b n = aVar.n();
        if (n != null) {
            com.applovin.impl.a.i.a(n.c(), this.c.q());
            a(dVar, n.a());
        }
    }

    private void a(d dVar, Uri uri) {
        com.applovin.impl.sdk.a.g currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.c.r();
        if (r != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            this.c.a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
            return;
        }
        com.applovin.impl.sdk.r rVar = this.b;
        rVar.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
        if (r6.o() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.webkit.WebView r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.e.a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    private void b() {
        this.c.k();
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        com.applovin.impl.sdk.r rVar = this.b;
        rVar.c("AdWebView", "Loaded resource: " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.c.a(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.applovin.impl.sdk.a.g p = this.c.p();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (p != null) {
            this.a.aa().a(p).a(com.applovin.impl.sdk.d.b.z, str3).a();
        }
        this.b.e("AdWebView", str3 + " for ad: " + p);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.a.g p = this.c.p();
        this.a.aa().a(p).a(com.applovin.impl.sdk.d.b.A).a();
        com.applovin.impl.sdk.r rVar = this.b;
        rVar.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.a.g p = this.c.p();
        String str = "Received SSL error: " + sslError;
        this.a.aa().a(p).a(com.applovin.impl.sdk.d.b.C, str).a();
        this.b.e("AdWebView", str + " for ad: " + p);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.applovin.impl.sdk.r.i("AdWebView", "Render process gone for ad: " + this.c.p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.a.g p = this.c.p();
        if (p != null) {
            this.a.aa().a(p).a(com.applovin.impl.sdk.d.b.B).a();
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eE)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eH)).booleanValue()) {
                String valueOf = p != null ? String.valueOf(p.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView == null || !webView.equals(this.c.s())) {
                return true;
            } else {
                this.c.f();
                AppLovinAdSize b = this.c.b();
                if (Utils.isBML(b)) {
                    this.c.a(b);
                    this.c.e();
                    return true;
                }
                return true;
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bz)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString(), hasGesture);
        }
        this.b.e("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str, true);
    }
}

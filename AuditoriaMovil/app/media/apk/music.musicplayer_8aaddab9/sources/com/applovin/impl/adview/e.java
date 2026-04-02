package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
/* loaded from: classes.dex */
public class e extends WebViewClient {
    private final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f3214b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3215c;

    public e(b bVar, com.applovin.impl.sdk.m mVar) {
        this.a = mVar;
        this.f3214b = mVar.B();
        this.f3215c = bVar;
    }

    private void a() {
        this.f3215c.l();
    }

    private void a(PointF pointF) {
        this.f3215c.a(pointF);
    }

    private void a(Uri uri, d dVar) {
        com.applovin.impl.sdk.v vVar;
        String str;
        final String queryParameter = uri.getQueryParameter(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.v vVar2 = this.f3214b;
                vVar2.b("AdWebView", "Loading new page externally: " + queryParameter);
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.a);
                com.applovin.impl.sdk.utils.j.c(this.f3215c.g(), this.f3215c.p(), this.f3215c.r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.v vVar3 = this.f3214b;
                vVar3.b("AdWebView", "Loading new page in WebView: " + queryParameter);
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                com.applovin.impl.sdk.v vVar4 = this.f3214b;
                vVar4.b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                this.a.ae().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            com.applovin.impl.sdk.utils.j.a(e.this.f3215c.g(), e.this.f3215c.p(), e.this.f3215c.r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            com.applovin.impl.sdk.utils.j.b(e.this.f3215c.g(), e.this.f3215c.p(), e.this.f3215c.r());
                            e.this.a.ae().b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.a.L(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.z());
                intent.setFlags(268435456);
                this.a.L().startActivity(intent);
                return;
            } else {
                vVar = this.f3214b;
                str = "Could not find load type in original uri";
            }
        } else {
            vVar = this.f3214b;
            str = "Could not find url to load from query in original uri";
        }
        vVar.e("AdWebView", str);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar) {
        String queryParameter = uri.getQueryParameter(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.a.U().a(com.applovin.impl.sdk.network.g.o().c(appendQueryParameter).a(false).c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        com.applovin.impl.sdk.v vVar = this.f3214b;
        vVar.e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
    }

    private void a(com.applovin.impl.a.a aVar, d dVar) {
        com.applovin.impl.a.d aK = aVar.aK();
        if (aK != null) {
            com.applovin.impl.a.l.a(aK.c(), this.f3215c.q());
            a(dVar, aK.a());
        }
    }

    private void a(d dVar, Uri uri) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.f3215c.r();
        if (r != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            this.f3215c.a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
            return;
        }
        com.applovin.impl.sdk.v vVar = this.f3214b;
        vVar.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
    }

    private void b() {
        this.f3215c.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r6.aL() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bd, code lost:
        if (r6.aL() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.webkit.WebView r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.e.a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        com.applovin.impl.sdk.v vVar = this.f3214b;
        vVar.c("AdWebView", "Loaded resource: " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f3215c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        b bVar = this.f3215c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            String str3 = "Received error with error code: " + i2 + " with description \\'" + str + "\\' for URL: " + str2;
            if (p != null) {
                this.a.ab().a(p).a(com.applovin.impl.sdk.d.b.z, str3).a();
            }
            this.f3214b.e("AdWebView", str3 + " for ad: " + p);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(ConnectionResult.API_DISABLED)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.f3215c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            this.a.ab().a(p).a(com.applovin.impl.sdk.d.b.A).a();
            com.applovin.impl.sdk.v vVar = this.f3214b;
            vVar.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.f3215c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.a.ab().a(p).a(com.applovin.impl.sdk.d.b.C, str).a();
            this.f3214b.e("AdWebView", str + " for ad: " + p);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f3215c == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        StringBuilder y = e.a.d.a.a.y("Render process gone for ad: ");
        y.append(this.f3215c.p());
        y.append(". Process did crash: ");
        y.append(renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.v.i("AdWebView", y.toString());
        com.applovin.impl.sdk.ad.e p = this.f3215c.p();
        if (p != null) {
            this.a.ab().a(p).a(com.applovin.impl.sdk.d.b.B).a();
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eJ)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eM)).booleanValue()) {
                throw new RuntimeException(e.a.d.a.a.k("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", p != null ? String.valueOf(p.getAdIdNumber()) : "null"));
            } else if (webView == null || !webView.equals(this.f3215c.s())) {
                return true;
            } else {
                this.f3215c.f();
                AppLovinAdSize b2 = this.f3215c.b();
                if (Utils.isBML(b2)) {
                    this.f3215c.a(b2);
                    this.f3215c.e();
                    return true;
                }
                return true;
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bJ)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString(), hasGesture);
        }
        this.f3214b.e("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str, true);
    }
}

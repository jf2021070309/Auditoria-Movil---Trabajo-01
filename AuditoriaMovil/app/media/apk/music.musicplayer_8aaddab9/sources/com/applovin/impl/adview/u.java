package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class u extends WebViewClient {
    private final com.applovin.impl.sdk.v a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<a> f3268b;

    /* loaded from: classes.dex */
    public interface a {
        void a(t tVar);

        void b(t tVar);

        void c(t tVar);
    }

    public u(com.applovin.impl.sdk.m mVar) {
        this.a = mVar.B();
    }

    private void a(WebView webView, String str) {
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        if (str == null || !(webView instanceof t)) {
            return;
        }
        t tVar = (t) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = this.f3268b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(tVar);
            } else if ("/close_ad".equals(path)) {
                aVar.b(tVar);
            } else if ("/skip_ad".equals(path)) {
                aVar.c(tVar);
            } else {
                com.applovin.impl.sdk.v vVar2 = this.a;
                vVar2.d("WebViewButtonClient", "Unknown URL: " + str);
                com.applovin.impl.sdk.v vVar3 = this.a;
                vVar3.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.f3268b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}

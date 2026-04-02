package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class w extends WebViewClient {
    private final com.applovin.impl.sdk.r a;
    private WeakReference<a> b;

    /* loaded from: classes.dex */
    public interface a {
        void a(v vVar);

        void b(v vVar);

        void c(v vVar);
    }

    public w(com.applovin.impl.sdk.k kVar) {
        this.a = kVar.z();
    }

    private void a(WebView webView, String str) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        if (str == null || !(webView instanceof v)) {
            return;
        }
        v vVar = (v) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = this.b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(vVar);
            } else if ("/close_ad".equals(path)) {
                aVar.b(vVar);
            } else if ("/skip_ad".equals(path)) {
                aVar.c(vVar);
            } else {
                com.applovin.impl.sdk.r rVar2 = this.a;
                rVar2.d("WebViewButtonClient", "Unknown URL: " + str);
                com.applovin.impl.sdk.r rVar3 = this.a;
                rVar3.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}

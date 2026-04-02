package com.applovin.impl.sdk;

import android.content.Intent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class y {
    private static WebView a;
    private static volatile String b;
    private static volatile Map<String, String> c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends WebViewClient {
        private final k a;

        private a(k kVar) {
            this.a = kVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            this.a.ai().sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
            return true;
        }
    }

    public static String a() {
        return b;
    }

    public static void a(k kVar) {
        if (a == null) {
            try {
                WebView webView = new WebView(kVar.J());
                a = webView;
                webView.setWebViewClient(new a(kVar));
            } catch (Throwable th) {
                kVar.z().b("WebViewDataCollector", "Failed to initialize WebView for data collection.", th);
            }
        }
    }

    public static Map<String, String> b() {
        return c != null ? c : Collections.emptyMap();
    }

    public static void b(final k kVar) {
        if (b != null) {
            return;
        }
        b = "";
        if (com.applovin.impl.sdk.utils.f.b()) {
            kVar.Q().a(new com.applovin.impl.sdk.e.y(kVar, true, new Runnable() { // from class: com.applovin.impl.sdk.y.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String unused = y.b = WebSettings.getDefaultUserAgent(k.this.J());
                    } catch (Throwable th) {
                        k.this.z().b("WebViewDataCollector", "Failed to collect user agent", th);
                    }
                }
            }), o.a.BACKGROUND);
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.y.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        y.a(k.this);
                        String unused = y.b = y.a.getSettings().getUserAgentString();
                    } catch (Throwable th) {
                        k.this.z().b("WebViewDataCollector", "Failed to collect user agent", th);
                    }
                }
            });
        }
    }

    public static void c(final k kVar) {
        if (c != null) {
            return;
        }
        c = Collections.emptyMap();
        if (com.applovin.impl.sdk.utils.f.d()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.y.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        y.a(k.this);
                        y.a.setWebViewClient(new a(k.this) { // from class: com.applovin.impl.sdk.y.3.1
                            @Override // android.webkit.WebViewClient
                            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                                HashMap hashMap = new HashMap();
                                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                                    hashMap.put("AppLovin-WebView-" + entry.getKey(), entry.getValue());
                                }
                                Map unused = y.c = hashMap;
                                return super.shouldInterceptRequest(webView, webResourceRequest);
                            }
                        });
                        y.a.loadUrl("https://blank");
                    } catch (Throwable th) {
                        k.this.z().b("WebViewDataCollector", "Failed to collect WebView HTTP headers", th);
                    }
                }
            });
        }
    }
}

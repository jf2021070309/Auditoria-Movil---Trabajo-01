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
public class ac {
    private static WebView a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f3838b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Map<String, String> f3839c;

    /* loaded from: classes.dex */
    public static class a extends WebViewClient {
        private final m a;

        private a(m mVar) {
            this.a = mVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            this.a.aj().sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
            return true;
        }
    }

    public static String a() {
        return f3838b;
    }

    public static void a(m mVar) {
        if (a == null) {
            try {
                WebView webView = new WebView(mVar.L());
                a = webView;
                webView.setWebViewClient(new a(mVar));
            } catch (Throwable th) {
                mVar.B().b("WebViewDataCollector", "Failed to initialize WebView for data collection.", th);
            }
        }
    }

    public static Map<String, String> b() {
        return f3839c != null ? f3839c : Collections.emptyMap();
    }

    public static void b(final m mVar) {
        if (f3838b != null) {
            return;
        }
        f3838b = "";
        if (com.applovin.impl.sdk.utils.g.b()) {
            mVar.S().a(new com.applovin.impl.sdk.e.z(mVar, true, new Runnable() { // from class: com.applovin.impl.sdk.ac.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String unused = ac.f3838b = WebSettings.getDefaultUserAgent(m.this.L());
                    } catch (Throwable th) {
                        m.this.B().b("WebViewDataCollector", "Failed to collect user agent", th);
                    }
                }
            }), o.a.BACKGROUND);
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ac.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ac.a(m.this);
                        String unused = ac.f3838b = ac.a.getSettings().getUserAgentString();
                    } catch (Throwable th) {
                        m.this.B().b("WebViewDataCollector", "Failed to collect user agent", th);
                    }
                }
            });
        }
    }

    public static void c(final m mVar) {
        if (f3839c != null) {
            return;
        }
        f3839c = Collections.emptyMap();
        if (com.applovin.impl.sdk.utils.g.d()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ac.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ac.a(m.this);
                        ac.a.setWebViewClient(new a(m.this) { // from class: com.applovin.impl.sdk.ac.3.1
                            @Override // android.webkit.WebViewClient
                            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                                HashMap hashMap = new HashMap();
                                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                                    StringBuilder y = e.a.d.a.a.y("AppLovin-WebView-");
                                    y.append(entry.getKey());
                                    hashMap.put(y.toString(), entry.getValue());
                                }
                                Map unused = ac.f3839c = hashMap;
                                return super.shouldInterceptRequest(webView, webResourceRequest);
                            }
                        });
                        ac.a.loadUrl("https://blank");
                    } catch (Throwable th) {
                        m.this.B().b("WebViewDataCollector", "Failed to collect WebView HTTP headers", th);
                    }
                }
            });
        }
    }
}

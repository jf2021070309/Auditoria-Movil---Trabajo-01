package com.amazon.aps.iva.j9;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
/* compiled from: ApiHelperForQ.java */
/* loaded from: classes.dex */
public final class t {
    @Deprecated
    public static int a(WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    public static WebViewRenderProcess b(WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    public static void e(WebView webView, com.amazon.aps.iva.i9.h hVar) {
        webView.setWebViewRenderProcessClient(null);
    }

    public static void f(WebView webView, Executor executor, com.amazon.aps.iva.i9.h hVar) {
        webView.setWebViewRenderProcessClient(executor, null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }
}

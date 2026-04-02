package com.fyber.inneractive.sdk.util;

import android.view.WindowManager;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class af {
    private static boolean a;
    private static WebView b;
    private static WindowManager c;

    public static void a() {
        WebView webView;
        a = false;
        if (c != null && (webView = b) != null && webView.getParent() != null) {
            try {
                c.removeView(b);
                IAlog.a("KitKatWebViewUtils | removed static webview from window", new Object[0]);
            } catch (Exception unused) {
            }
        }
        WebView webView2 = b;
        if (webView2 != null) {
            try {
                webView2.destroy();
                IAlog.a("KitKatWebViewUtils | destroyed static webview", new Object[0]);
            } catch (Exception unused2) {
            }
        }
        c = null;
        b = null;
    }
}

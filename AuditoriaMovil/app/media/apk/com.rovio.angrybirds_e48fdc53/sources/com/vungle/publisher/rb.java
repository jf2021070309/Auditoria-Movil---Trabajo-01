package com.vungle.publisher;

import android.webkit.WebView;
import com.vungle.publisher.log.Logger;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class rb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView, String str, String... strArr) {
        a("window.vungle.mraidBridgeExt", webView, str, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(WebView webView, String str, String... strArr) {
        a("window.vungle.mraidBridge", webView, str, strArr);
    }

    void a(String str, WebView webView, String str2, String... strArr) {
        a(webView, str + "." + str2 + "(" + zk.a(",", strArr) + ")");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView, String str) {
        Logger.v(Logger.AD_TAG, "load javascript: " + str);
        webView.loadUrl("javascript:" + str);
    }
}

package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends WebChromeClient {
    private final com.applovin.impl.sdk.r a;

    public c(com.applovin.impl.sdk.k kVar) {
        this.a = kVar.z();
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.d("AdWebView", "console.log[" + i + "] :" + str);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.a.b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }
}

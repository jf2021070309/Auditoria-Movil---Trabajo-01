package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* loaded from: classes.dex */
public class c extends WebChromeClient {
    private final com.applovin.impl.sdk.v a;

    public c(com.applovin.impl.sdk.m mVar) {
        this.a = mVar.B();
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i2, String str2) {
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.d("AdWebView", "console.log[" + i2 + "] :" + str);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.a.b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }
}

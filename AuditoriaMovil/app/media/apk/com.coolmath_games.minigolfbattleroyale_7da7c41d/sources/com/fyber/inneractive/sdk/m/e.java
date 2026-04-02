package com.fyber.inneractive.sdk.m;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
final class e extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.a("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        if (IAlog.a >= IAlog.b) {
            IAlog.a(IAlog.b, consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.a("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.a("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.a("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.a("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }
}

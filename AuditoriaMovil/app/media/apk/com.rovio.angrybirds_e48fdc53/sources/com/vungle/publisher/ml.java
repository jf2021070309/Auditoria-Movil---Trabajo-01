package com.vungle.publisher;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes4.dex */
public class ml extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        zo.b(webView);
    }
}

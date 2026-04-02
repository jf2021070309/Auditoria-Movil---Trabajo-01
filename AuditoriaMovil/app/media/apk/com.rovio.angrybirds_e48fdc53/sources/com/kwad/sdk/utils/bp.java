package com.kwad.sdk.utils;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class bp {
    private static void a(final WebView webView, final String str, ValueCallback<String> valueCallback) {
        if (Build.VERSION.SDK_INT >= 19) {
            runOnUiThread(new Runnable() { // from class: com.kwad.sdk.utils.bp.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        webView.evaluateJavascript(str, r3);
                    } catch (Exception e) {
                    }
                }
            });
        } else {
            webView.loadUrl(str);
        }
    }

    public static void a(WebView webView, String str, String str2) {
        a(webView, "javascript:" + str + "(" + JSONObject.quote(str2) + ")", (ValueCallback<String>) null);
    }

    private static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}

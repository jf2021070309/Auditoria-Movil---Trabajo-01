package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;
/* loaded from: classes.dex */
public class zzch {
    private static Boolean zza;

    private zzch() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        if (zza(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }

    @TargetApi(19)
    private static boolean zza(WebView webView) {
        boolean booleanValue;
        synchronized (zzch.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }
}

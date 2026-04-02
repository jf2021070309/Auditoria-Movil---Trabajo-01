package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzfs extends WebViewClient {
    final /* synthetic */ zzft zza;

    public zzfs(zzft zzftVar) {
        this.zza = zzftVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzhd.zzc("Finished loading WebView".concat(String.valueOf(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzhd.zzc("Started loading WebView".concat(String.valueOf(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzhd.zzc("Error: " + i + " " + str + " " + str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("gmsg://")) {
            return false;
        }
        this.zza.zzf(str, "0");
        return true;
    }
}

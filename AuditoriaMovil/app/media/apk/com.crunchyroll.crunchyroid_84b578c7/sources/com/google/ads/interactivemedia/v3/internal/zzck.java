package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzck extends zzcj {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzck(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzi(webView);
    }
}

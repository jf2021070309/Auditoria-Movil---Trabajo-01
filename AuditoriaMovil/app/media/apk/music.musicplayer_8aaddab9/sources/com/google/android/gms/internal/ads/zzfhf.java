package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class zzfhf extends zzfhe {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfhf(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzc(webView);
    }
}

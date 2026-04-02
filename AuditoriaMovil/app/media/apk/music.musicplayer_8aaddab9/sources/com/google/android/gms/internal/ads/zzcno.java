package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
@TargetApi(11)
/* loaded from: classes.dex */
public final class zzcno extends zzcnp {
    public zzcno(zzcml zzcmlVar, zzazb zzazbVar, boolean z) {
        super(zzcmlVar, zzazbVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcms, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzM(webView, str, (Map<String, String>) null);
    }
}

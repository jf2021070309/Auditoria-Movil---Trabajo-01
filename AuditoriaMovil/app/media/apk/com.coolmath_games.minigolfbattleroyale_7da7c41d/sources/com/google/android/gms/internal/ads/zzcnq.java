package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcnq extends zzcnp {
    public zzcnq(zzcml zzcmlVar, zzazb zzazbVar, boolean z) {
        super(zzcmlVar, zzazbVar, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzM(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}

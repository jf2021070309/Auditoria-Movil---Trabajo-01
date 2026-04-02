package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.common.api.CommonStatusCodes;
@TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
/* loaded from: classes.dex */
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

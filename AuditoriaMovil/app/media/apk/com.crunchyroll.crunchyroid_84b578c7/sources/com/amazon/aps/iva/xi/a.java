package com.amazon.aps.iva.xi;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.amazon.aps.iva.i9.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView;
import java.util.Iterator;
/* compiled from: OctopusSubtitlesWebViewClient.kt */
/* loaded from: classes.dex */
public final class a extends WebViewClientCompat {
    public final f b;
    public final com.amazon.aps.iva.xb0.a<q> c;

    public a(f fVar, OctopusSubtitlesView.b bVar) {
        this.b = fVar;
        this.c = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.c.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        j.f(webView, "view");
        j.f(webResourceRequest, "request");
        Uri url = webResourceRequest.getUrl();
        Iterator<f.d> it = this.b.a.iterator();
        while (true) {
            webResourceResponse = null;
            r2 = null;
            r2 = null;
            r2 = null;
            f.c cVar = null;
            if (!it.hasNext()) {
                break;
            }
            f.d next = it.next();
            next.getClass();
            boolean equals = url.getScheme().equals("http");
            String str = next.c;
            if ((!equals || next.a) && ((url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(next.b) && url.getPath().startsWith(str))) {
                cVar = next.d;
            }
            if (cVar != null && (webResourceResponse = cVar.a(url.getPath().replaceFirst(str, ""))) != null) {
                break;
            }
        }
        if (webResourceResponse != null) {
            String uri = webResourceRequest.getUrl().toString();
            j.e(uri, "request.url.toString()");
            if (m.Y(uri, "wasm", true)) {
                webResourceResponse.setMimeType("application/wasm");
            }
        }
        return webResourceResponse;
    }
}

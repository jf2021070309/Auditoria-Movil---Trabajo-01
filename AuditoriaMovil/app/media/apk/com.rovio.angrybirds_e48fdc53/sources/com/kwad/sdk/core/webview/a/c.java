package com.kwad.sdk.core.webview.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes.dex */
public class c extends com.kwad.sdk.core.webview.a.a {
    private a jZ;

    /* loaded from: classes.dex */
    public static class a {
        private KsAdWebView.c Ne;
        private z.b asO;
        private KsAdWebView.d ayB;
        private KsAdWebView.b ayC;
        private boolean ayF;
        private AdTemplate mAdTemplate;
        private final Context mContext;
        private boolean ayD = true;
        private boolean ayE = true;
        private boolean ayA = true;

        public a(Context context) {
            this.mContext = context;
        }

        public final boolean DZ() {
            return this.ayE;
        }

        public final boolean Ea() {
            return this.ayA;
        }

        public final boolean Eb() {
            return this.ayD;
        }

        public final boolean Ec() {
            return this.ayF;
        }

        public final a a(KsAdWebView.b bVar) {
            this.ayC = bVar;
            return this;
        }

        public final a b(z.b bVar) {
            this.asO = bVar;
            return this;
        }

        public final a b(KsAdWebView.d dVar) {
            this.ayB = dVar;
            return this;
        }

        public final a bk(boolean z) {
            this.ayE = z;
            return this;
        }

        public final a bl(boolean z) {
            this.ayD = z;
            return this;
        }

        public final a bm(boolean z) {
            this.ayF = true;
            return this;
        }

        public final a c(KsAdWebView.c cVar) {
            this.Ne = cVar;
            return this;
        }

        public final a cC(AdTemplate adTemplate) {
            this.mAdTemplate = adTemplate;
            return this;
        }

        public final KsAdWebView.d dd() {
            return this.ayB;
        }

        public final AdTemplate getAdTemplate() {
            return this.mAdTemplate;
        }

        public final z.b getClientParams() {
            return this.asO;
        }

        public final Context getContext() {
            return this.mContext;
        }

        public final KsAdWebView.b lX() {
            return this.ayC;
        }

        public final KsAdWebView.c oV() {
            return this.Ne;
        }
    }

    public final void dX(String str) {
        this.mUniqueId = str;
    }

    public final a getClientConfig() {
        return this.jZ;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        com.kwad.sdk.core.webview.b.c.b.Y(this.mUniqueId, "onPageFinished");
        a aVar = this.jZ;
        if (aVar == null || aVar.dd() == null) {
            return;
        }
        this.jZ.dd().onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.kwad.sdk.core.webview.b.c.b.Y(this.mUniqueId, "onPageStart");
        a aVar = this.jZ;
        if (aVar == null || aVar.dd() == null) {
            return;
        }
        this.jZ.dd().onPageStart();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.kwad.sdk.core.e.c.d("KsAdWebViewClient", "onReceivedError " + i);
        a aVar = this.jZ;
        if (aVar != null && aVar.dd() != null) {
            this.jZ.dd().onReceivedHttpError(i, str, str2);
        }
        com.kwad.sdk.core.webview.b.c.b.aa(str2, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return (Build.VERSION.SDK_INT >= 26 && renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) || super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void setClientConfig(a aVar) {
        this.jZ = aVar;
        setNeedHybridLoad(aVar.Ea());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.kwad.sdk.core.e.c.w("KsAdWebViewClient", "shouldOverrideUrlLoading url=" + str);
        com.kwad.sdk.core.webview.b.c.b.Y(this.mUniqueId, "shouldOverrideUrlLoading");
        try {
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (!str.startsWith("http") && !str.startsWith("https")) {
            if (!str.startsWith("tel:") && !str.startsWith("sms:")) {
                a aVar = this.jZ;
                if (aVar != null && aVar.DZ()) {
                    int i = ((com.kwad.sdk.service.a.a) ServiceProvider.get(com.kwad.sdk.service.a.a.class)).i(this.jZ.getContext(), str);
                    if (i == 1) {
                        if (this.jZ.lX() != null) {
                            this.jZ.lX().onSuccess();
                        }
                        com.kwad.sdk.core.report.a.a(this.jZ.getAdTemplate(), "", 2, (z.b) null);
                        return true;
                    }
                    if (this.jZ.lX() != null) {
                        this.jZ.lX().onFailed();
                    }
                    if (i == -1) {
                        com.kwad.sdk.core.report.a.b(this.jZ.getAdTemplate(), "", 2, (z.b) null);
                    }
                }
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            a aVar2 = this.jZ;
            if (aVar2 != null) {
                aVar2.getContext().startActivity(intent);
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}

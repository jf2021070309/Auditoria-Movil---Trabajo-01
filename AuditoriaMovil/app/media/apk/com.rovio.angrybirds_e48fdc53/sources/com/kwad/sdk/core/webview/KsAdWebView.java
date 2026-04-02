package com.kwad.sdk.core.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.a.c;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.bo;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.utils.s;
/* loaded from: classes.dex */
public class KsAdWebView extends com.kwad.sdk.core.webview.c {
    private com.kwad.sdk.core.webview.a.c ayt;
    private String ayu;
    private long ayv;
    private com.kwad.sdk.core.webview.d ayw;
    private c.a jZ;
    private String mUniqueId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DownloadListener {
        private a() {
        }

        /* synthetic */ a(KsAdWebView ksAdWebView, byte b) {
            this();
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            boolean o = bm.o(KsAdWebView.this, 100);
            com.kwad.sdk.core.e.c.d("KsAdWebView", "onDownloadStart: currentVisible " + o);
            if (o) {
                if (KsAdWebView.this.jZ == null || KsAdWebView.this.jZ.getAdTemplate() == null || !KsAdWebView.this.jZ.Eb()) {
                    try {
                        KsAdWebView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return;
                    } catch (Exception e) {
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                        return;
                    }
                }
                com.kwad.sdk.core.response.b.d.ck(KsAdWebView.this.jZ.getAdTemplate()).adConversionInfo.appDownloadUrl = str;
                KsAdWebView.this.jZ.getAdTemplate().isWebViewDownload = true;
                c.a readyClientConfig = KsAdWebView.this.getReadyClientConfig();
                if (readyClientConfig != null) {
                    readyClientConfig.cC(KsAdWebView.this.jZ.getAdTemplate());
                }
                ((com.kwad.sdk.service.a.a) ServiceProvider.get(com.kwad.sdk.service.a.a.class)).g(l.wrapContextIfNeed(KsAdWebView.this.getContext()), KsAdWebView.this.jZ.getAdTemplate());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onFailed();

        void onSuccess();
    }

    /* loaded from: classes.dex */
    public interface c {
        void oW();
    }

    /* loaded from: classes.dex */
    public interface d {
        void onPageFinished();

        void onPageStart();

        void onReceivedHttpError(int i, String str, String str2);
    }

    public KsAdWebView(Context context) {
        super(context);
        init(context);
    }

    public KsAdWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public KsAdWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public KsAdWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        init(context);
    }

    private String DY() {
        return "KSADSDK_V3.3.44_" + getContext().getPackageName() + "_" + k.bS(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.a getReadyClientConfig() {
        com.kwad.sdk.core.webview.a.c cVar = this.ayt;
        if (cVar == null || cVar.getClientConfig() == null) {
            return null;
        }
        return this.ayt.getClientConfig();
    }

    private void init(Context context) {
        com.kwad.sdk.core.e.c.i("KsAdWebView", "init");
        setAccessibilityStateDisable(context);
        WebSettings a2 = bo.a(this);
        a2.setUseWideViewPort(true);
        a2.setDomStorageEnabled(true);
        setVerticalScrollBarEnabled(false);
        com.kwad.sdk.core.webview.a.c cVar = new com.kwad.sdk.core.webview.a.c() { // from class: com.kwad.sdk.core.webview.KsAdWebView.1
            @Override // com.kwad.sdk.core.webview.a.c, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (KsAdWebView.this.ayw != null) {
                    KsAdWebView.this.ayw.c(KsAdWebView.this.jZ);
                }
                AdTemplate adTemplate = KsAdWebView.this.jZ.getAdTemplate();
                KSLoggerReporter.ReportClient.CONVERT_H5WEB.buildMethodCheck(adTemplate != null ? adTemplate.getBusinessType() : null, "h5WebLoadFinish").report();
            }

            @Override // com.kwad.sdk.core.webview.a.c, android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (KsAdWebView.this.ayw != null) {
                    com.kwad.sdk.core.webview.d unused = KsAdWebView.this.ayw;
                    com.kwad.sdk.core.webview.d.d(KsAdWebView.this.jZ);
                }
            }
        };
        this.ayt = cVar;
        cVar.dX(this.mUniqueId);
        setWebViewClient(this.ayt);
        setWebChromeClient(new com.kwad.sdk.core.webview.a.b());
        setDownloadListener(new a(this, (byte) 0));
        String userAgentString = a2.getUserAgentString();
        a2.setUserAgentString(userAgentString + DY());
        c.a aVar = new c.a(getContext());
        this.jZ = aVar;
        if (aVar.Ec()) {
            this.ayw = new com.kwad.sdk.core.webview.d();
        }
    }

    private void setAccessibilityStateDisable(Context context) {
        if (Build.VERSION.SDK_INT != 17 || context == null) {
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                s.f(accessibilityManager, "setState", 0);
            }
        } catch (Throwable th) {
        }
    }

    public c.a getClientConfig() {
        return this.jZ;
    }

    public long getLoadTime() {
        return this.ayv;
    }

    public String getLoadUrl() {
        return this.ayu;
    }

    public String getUniqueId() {
        return this.mUniqueId;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        com.kwad.sdk.core.webview.b.c.b.ei(this.mUniqueId);
        this.ayu = str;
        this.ayv = System.currentTimeMillis();
        super.loadUrl(str);
        AdTemplate adTemplate = this.jZ.getAdTemplate();
        KSLoggerReporter.ReportClient.CONVERT_H5WEB.buildMethodCheck(adTemplate != null ? adTemplate.getBusinessType() : null, "h5WebLoadStart").report();
    }

    public final void onActivityCreate() {
        com.kwad.sdk.core.webview.d dVar = this.ayw;
        if (dVar != null) {
            dVar.a(this.jZ);
        }
    }

    public final void onActivityDestroy() {
        release();
        com.kwad.sdk.core.webview.d dVar = this.ayw;
        if (dVar != null) {
            dVar.b(this.jZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        c.a aVar = this.jZ;
        if (aVar == null || aVar.oV() == null) {
            return;
        }
        this.jZ.oV().oW();
    }

    public void setClientConfig(c.a aVar) {
        this.ayt.setClientConfig(aVar);
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (com.kwad.framework.a.a.mp.booleanValue() && !(webChromeClient instanceof com.kwad.sdk.core.webview.a.b)) {
            throw new IllegalArgumentException("client is not instanceof KSWebChromeClient");
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (com.kwad.framework.a.a.mp.booleanValue() && !(webViewClient instanceof com.kwad.sdk.core.webview.a.a)) {
            throw new IllegalArgumentException("Not supported set webViewClient, please check it");
        }
        super.setWebViewClient(webViewClient);
    }
}

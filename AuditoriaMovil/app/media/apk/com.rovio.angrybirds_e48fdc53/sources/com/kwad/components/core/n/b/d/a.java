package com.kwad.components.core.n.b.d;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.kwad.components.offline.api.core.webview.BaseKsWebView;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.bp;
/* loaded from: classes.dex */
public final class a extends BaseKsWebView {
    private KsAdWebView Mv;
    private boolean enableScroll;

    public a(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setBackgroundColor(0);
        this.Mv = new KsAdWebView(context);
        this.Mv.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.Mv.setBackgroundColor(0);
        this.Mv.setClientConfig(this.Mv.getClientConfig().b(new KsAdWebView.d() { // from class: com.kwad.components.core.n.b.d.a.2
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                if (a.this.mWebLoadListener != null) {
                    a.this.mWebLoadListener.onPageFinished();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
                if (a.this.mWebLoadListener != null) {
                    a.this.mWebLoadListener.onPageStart();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                if (a.this.mWebLoadListener != null) {
                    a.this.mWebLoadListener.onReceivedHttpError(i, str, str2);
                }
            }
        }).a(new KsAdWebView.b() { // from class: com.kwad.components.core.n.b.d.a.1
            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onFailed() {
                if (a.this.mDeeplinkListener != null) {
                    a.this.mDeeplinkListener.onFailed();
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onSuccess() {
                if (a.this.mDeeplinkListener != null) {
                    a.this.mDeeplinkListener.onSuccess();
                }
            }
        }));
        addView(this.Mv);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void addJavascriptInterface(Object obj, String str) {
        this.Mv.addJavascriptInterface(obj, str);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void callJs(String str) {
        bp.a(this.Mv, str, (String) null);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void callJs(String str, String str2) {
        bp.a(this.Mv, str, str2);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void destroy() {
        this.Mv.destroy();
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void loadUrl(String str) {
        this.Mv.loadUrl(str);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView, android.view.View
    public final void scrollBy(int i, int i2) {
        if (this.enableScroll) {
            this.Mv.scrollBy(i, i2);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView, android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.enableScroll) {
            this.Mv.scrollTo(i, i2);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setAcceptThirdPartyCookies(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.Mv, z);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setAllowContentAccess(boolean z) {
        this.Mv.getSettings().setAllowContentAccess(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setAllowFileAccess(boolean z) {
        this.Mv.getSettings().setAllowFileAccess(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setAllowFileAccessFromFileURLs(boolean z) {
        this.Mv.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setAllowUniversalAccessFromFileURLs(boolean z) {
        this.Mv.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setCacheMode(int i) {
        this.Mv.getSettings().setCacheMode(i);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setContextUniqId(int i) {
        AdTemplate au = com.kwad.components.core.n.a.c.a.a.au(i);
        if (au != null) {
            this.Mv.getClientConfig().cC(au);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setDebugEnabled(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setDeeplinkEnabled(boolean z) {
        this.Mv.getClientConfig().bk(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setEnableScroll(boolean z) {
        this.enableScroll = z;
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setEnableWebCache(boolean z) {
        this.Mv.setNeedHybridLoad(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setInnerDownloadEnabled(boolean z) {
        this.Mv.getClientConfig().bl(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setJavaScriptEnabled(boolean z) {
        this.Mv.getSettings().setJavaScriptEnabled(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setMixedContentMode(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.Mv.getSettings().setMixedContentMode(i);
        }
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setSavePassword(boolean z) {
        this.Mv.getSettings().setSavePassword(z);
    }

    @Override // com.kwad.components.offline.api.core.webview.BaseKsWebView
    public final void setTextZoom(int i) {
        this.Mv.getSettings().setTextZoom(i);
    }
}

package com.vungle.publisher;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.vungle.publisher.iz;
import com.vungle.publisher.jn;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.ro;
import com.vungle.publisher.rv;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.json.JSONException;
/* loaded from: classes4.dex */
public class rg extends ml {
    iz.b a;
    @Inject
    qg b;
    @Inject
    rr c;
    @Inject
    rv.a d;
    @Inject
    bz e;
    @Inject
    com.vungle.publisher.env.i f;
    @Inject
    jn.a g;
    private p h;
    private boolean i = false;
    private boolean j = true;
    private boolean k = false;
    private boolean l = false;
    private x m;
    private String n;

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.e(Logger.AD_TAG, "received error in WebViewClient: " + str, new RuntimeException());
        this.b.a(new sm("100"));
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Logger.e(Logger.AD_TAG, "received ssl error: " + sslError.getPrimaryError());
        this.b.a(new sm("101"));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Logger.v(Logger.AD_TAG, "mraid page started loading: " + str);
    }

    @Override // com.vungle.publisher.ml, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.v(Logger.AD_TAG, "mraid page finished loading: " + str);
        if (this.j) {
            Logger.d(Logger.AD_TAG, "mraid webview finished loading");
            this.c.a(webView, this.h, this.i, this.m);
        } else {
            if (this.l && !"about:blank".equalsIgnoreCase(str)) {
                Logger.v(Logger.AD_TAG, "clear history");
                this.l = false;
                webView.clearHistory();
            }
            this.b.a(new st(ro.b.visible));
            this.b.a(new sr(ry.NONE, true));
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.v(Logger.AD_TAG, "mraid attempted to navigate to url: " + str);
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ("mraid".equals(scheme)) {
                try {
                    HashMap hashMap = new HashMap();
                    for (String str2 : zk.a(parse)) {
                        hashMap.put(str2, parse.getQueryParameter(str2));
                    }
                    a(webView, this.d.a(host), hashMap);
                } catch (Exception e) {
                    Logger.e(Logger.AD_TAG, "exception while overriding mraid url", e);
                    this.b.a(new sn());
                }
                return true;
            }
            return a(parse);
        } catch (Exception e2) {
            Logger.e(Logger.AD_TAG, "Invalid URL: " + str, e2);
            this.b.a(new sn());
            return true;
        }
    }

    void a(WebView webView, Uri uri) {
        if (!a(uri)) {
            webView.loadUrl("about:blank");
            webView.setBackgroundColor(-16777216);
            this.j = false;
            this.l = true;
            webView.loadUrl(uri.toString());
            webView.clearHistory();
            this.b.a(new sp());
        }
    }

    boolean a(Uri uri) {
        String scheme = uri.getScheme();
        jn jnVar = (jn) this.g.a((jn.a) this.n, false);
        if (!ru.a.contains(scheme) || ((jnVar != null && jnVar.w()) || Build.VERSION.SDK_INT >= 26)) {
            Logger.d(Logger.AD_TAG, "navigating to external location: " + uri.toString());
            this.b.a(new so(uri));
            return true;
        }
        return false;
    }

    void a(WebView webView) {
        if (!this.k) {
            try {
                this.c.a(webView, this.a);
            } catch (JSONException e) {
                Logger.e(Logger.AD_TAG, "failed to inject JSON tokens", e);
            }
            this.k = true;
            this.b.a(new sq());
        }
    }

    void a(WebView webView, rv rvVar, Map<String, String> map) {
        Logger.d(Logger.AD_TAG, "received MRAID event from js: " + rvVar);
        switch (rvVar) {
            case CLOSE:
                this.b.a(new sj());
                break;
            case PROPERTIES_SET:
                a(webView);
                return;
            case USE_CUSTOM_CLOSE:
                this.b.a(new st(ro.b.valueOf(map.get("sdkCloseButton"))));
                break;
            case USE_CUSTOM_PRIVACY:
                this.b.a(new su(zk.c(map.get("useCustomPrivacy"))));
                break;
            case OPEN:
                a(webView, Uri.parse(map.get("url")));
                break;
            case PRIVACY_PAGE_EVENT:
                this.b.a(new aq(map.get("url")));
                break;
            case SET_ORIENTATION_PROPERTIES:
                this.b.a(new sr(zk.e(map.get("forceOrientation")), zk.c(map.get("allowOrientationChange"))));
                break;
            case TPAT_EVENT:
                this.b.a(new sg(a(map)));
                break;
            case USER_ACTION_EVENT:
            case USER_VALUE_ACTION_EVENT:
                this.b.a(new si(a(map), map.get("value")));
                break;
            case ERROR_EVENT:
                this.b.a(new sm(map.get(PluginConstants.KEY_ERROR_CODE)));
                break;
            case SUCCESSFUL_VIEW_EVENT:
                this.b.a(new ax());
                break;
            case THROW_INCENTIVIZED_DIALOG:
                break;
            case PLAY_HTML_VIDEO_EVENT:
                try {
                    this.e.a(rh.a(this, webView, ut.a(map.get("selector"))), 500L);
                    break;
                } catch (Exception e) {
                    Logger.e(Logger.AD_TAG, "invalid mraid video selector: " + map.get("selector"), e);
                    this.b.a(new sn());
                    break;
                }
            default:
                Logger.w(Logger.AD_TAG, "Unknown MRAID Javascript command: " + rvVar);
                break;
        }
        this.c.c(webView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(WebView webView, String str) {
        this.c.a(webView, str);
    }

    public boolean a() {
        return this.j;
    }

    public boolean b() {
        return this.l;
    }

    private hf a(Map<String, String> map) {
        return new hf(map.get("event"));
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<rg> a;
        @Inject
        iz.a b;

        public rg a(String str, p pVar, boolean z, x xVar) {
            rg rgVar = this.a.get();
            rgVar.m = xVar;
            rgVar.a = this.b.b(str);
            rgVar.h = pVar;
            rgVar.i = z;
            rgVar.n = str;
            return rgVar;
        }
    }
}

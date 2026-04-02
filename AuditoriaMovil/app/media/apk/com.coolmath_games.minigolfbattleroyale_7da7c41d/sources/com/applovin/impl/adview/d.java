package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.a.e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class d extends i {
    private static WebView c;
    private final com.applovin.impl.sdk.r a;
    private final com.applovin.impl.sdk.k b;
    private com.applovin.impl.sdk.d.d d;
    private com.applovin.impl.sdk.a.g e;
    private boolean f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, com.applovin.impl.sdk.k kVar, Context context) {
        this(eVar, kVar, context, false);
    }

    d(e eVar, com.applovin.impl.sdk.k kVar, Context context, boolean z) {
        super(context);
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.b = kVar;
        this.a = kVar.z();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(eVar);
        setWebChromeClient(new c(kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.sdk.utils.f.h() && ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.eK)).booleanValue()) {
            setWebViewRenderProcessClient(new f(kVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                d.this.a.b("AdWebView", "Received a LongClick event.");
                return true;
            }
        });
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return Utils.replaceCommonMacros(this.g, str).replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.h hVar, final com.applovin.impl.sdk.k kVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String a = com.applovin.impl.sdk.network.h.this.a();
                d.c();
                if (d.c == null) {
                    appLovinPostbackListener.onPostbackFailure(a, -1);
                    return;
                }
                if (com.applovin.impl.sdk.network.h.this.c() != null) {
                    a = StringUtils.appendQueryParameters(a, com.applovin.impl.sdk.network.h.this.c(), ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.di)).booleanValue());
                }
                String str = "al_firePostback('" + a + "');";
                if (com.applovin.impl.sdk.utils.f.c()) {
                    d.c.evaluateJavascript(str, null);
                } else {
                    d.c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a);
            }
        });
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        String a = a(str3, str);
        if (StringUtils.isValidString(a)) {
            com.applovin.impl.sdk.r rVar = this.a;
            rVar.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a);
            loadDataWithBaseURL(str2, a, "text/html", null, "");
            return;
        }
        String a2 = a((String) kVar.a(com.applovin.impl.sdk.c.b.ed), str);
        if (StringUtils.isValidString(a2)) {
            com.applovin.impl.sdk.r rVar2 = this.a;
            rVar2.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            loadDataWithBaseURL(str2, a2, "text/html", null, "");
            return;
        }
        com.applovin.impl.sdk.r rVar3 = this.a;
        rVar3.b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        loadUrl(str);
    }

    private void b(com.applovin.impl.sdk.a.g gVar) {
        Boolean n;
        Integer a;
        loadUrl("about:blank");
        int az = this.e.az();
        if (az >= 0) {
            setLayerType(az, null);
        }
        if (com.applovin.impl.sdk.utils.f.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(gVar.av());
        }
        if (com.applovin.impl.sdk.utils.f.c() && gVar.ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        x ay = gVar.ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = ay.b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean c2 = ay.c();
            if (c2 != null) {
                settings.setAllowFileAccess(c2.booleanValue());
            }
            Boolean d = ay.d();
            if (d != null) {
                settings.setLoadWithOverviewMode(d.booleanValue());
            }
            Boolean e = ay.e();
            if (e != null) {
                settings.setUseWideViewPort(e.booleanValue());
            }
            Boolean f = ay.f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g = ay.g();
            if (g != null) {
                settings.setBuiltInZoomControls(g.booleanValue());
            }
            Boolean h = ay.h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean i = ay.i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = ay.j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = ay.k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = ay.l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = ay.m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.f.d() && (a = ay.a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (!com.applovin.impl.sdk.utils.f.e() || (n = ay.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(n.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (c != null) {
            return;
        }
        try {
            WebView webView = new WebView(com.applovin.impl.sdk.k.K());
            c = webView;
            webView.getSettings().setJavaScriptEnabled(true);
            c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
            c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (webView2 == d.c) {
                        d.c.destroy();
                        WebView unused = d.c = null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                d.c();
                            }
                        });
                        return true;
                    }
                    return true;
                }
            });
        } catch (Throwable th) {
            com.applovin.impl.sdk.r.c("AdWebView", "Failed to initialize WebView for postbacks.", th);
        }
    }

    public void a(com.applovin.impl.sdk.a.g gVar) {
        com.applovin.impl.sdk.r rVar;
        String str;
        com.applovin.impl.sdk.r rVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        com.applovin.impl.sdk.k kVar;
        if (this.f) {
            com.applovin.impl.sdk.r.i("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.e = gVar;
        try {
            b(gVar);
            if (Utils.isBML(gVar.getSize())) {
                setVisibility(0);
            }
            if (gVar instanceof com.applovin.impl.sdk.a.a) {
                loadDataWithBaseURL(gVar.aw(), Utils.replaceCommonMacros(this.g, ((com.applovin.impl.sdk.a.a) gVar).c()), "text/html", null, "");
                rVar = this.a;
                str = "AppLovinAd rendered";
            } else if (!(gVar instanceof com.applovin.impl.a.a)) {
                return;
            } else {
                com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) gVar;
                com.applovin.impl.a.b n = aVar.n();
                if (n != null) {
                    com.applovin.impl.a.e b = n.b();
                    Uri b2 = b.b();
                    String uri = b2 != null ? b2.toString() : "";
                    String c2 = b.c();
                    String aO = aVar.aO();
                    if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(c2)) {
                        rVar2 = this.a;
                        str2 = "Unable to load companion ad. No resources provided.";
                        rVar2.e("AdWebView", str2);
                        return;
                    }
                    if (b.a() == e.a.STATIC) {
                        this.a.b("AdWebView", "Rendering WebView for static VAST ad");
                        loadDataWithBaseURL(gVar.aw(), a((String) this.b.a(com.applovin.impl.sdk.c.b.ec), uri), "text/html", null, "");
                        return;
                    } else if (b.a() == e.a.HTML) {
                        if (!StringUtils.isValidString(c2)) {
                            if (StringUtils.isValidString(uri)) {
                                this.a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                aw2 = gVar.aw();
                                kVar = this.b;
                                a(uri, aw2, aO, kVar);
                                return;
                            }
                            return;
                        }
                        String a = a(aO, c2);
                        str3 = StringUtils.isValidString(a) ? a : c2;
                        com.applovin.impl.sdk.r rVar3 = this.a;
                        rVar3.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                        aw = gVar.aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (b.a() != e.a.IFRAME) {
                        rVar2 = this.a;
                        str2 = "Failed to render VAST companion ad of invalid type";
                        rVar2.e("AdWebView", str2);
                        return;
                    } else if (StringUtils.isValidString(uri)) {
                        this.a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                        aw2 = gVar.aw();
                        kVar = this.b;
                        a(uri, aw2, aO, kVar);
                        return;
                    } else if (StringUtils.isValidString(c2)) {
                        String a2 = a(aO, c2);
                        str3 = StringUtils.isValidString(a2) ? a2 : c2;
                        com.applovin.impl.sdk.r rVar4 = this.a;
                        rVar4.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                        aw = gVar.aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else {
                        return;
                    }
                }
                rVar = this.a;
                str = "No companion ad provided.";
            }
            rVar.b("AdWebView", str);
        } catch (Throwable th) {
            String valueOf = gVar != null ? String.valueOf(gVar.getAdIdNumber()) : "null";
            throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            com.applovin.impl.sdk.r rVar = this.a;
            rVar.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            loadUrl(str);
        } catch (Throwable th) {
            this.a.b("AdWebView", "Unable to forward to template", th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.applovin.impl.sdk.a.g getCurrentAd() {
        return this.e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.d;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setIsShownOutOfContext(boolean z) {
        this.g = z;
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.d = dVar;
    }
}

package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.a.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: c  reason: collision with root package name */
    private static WebView f3206c;
    private final com.applovin.impl.sdk.v a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f3207b;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f3208d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.ad.e f3209e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3210f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3211g;

    public d(e eVar, com.applovin.impl.sdk.m mVar, Context context) {
        this(eVar, mVar, context, false);
    }

    public d(e eVar, com.applovin.impl.sdk.m mVar, Context context, boolean z) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f3207b = mVar;
        this.a = mVar.B();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(eVar);
        setWebChromeClient(new c(mVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.sdk.utils.g.h() && ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eP)).booleanValue()) {
            setWebViewRenderProcessClient(new f(mVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
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
            return Utils.replaceCommonMacros(this.f3211g, str).replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.h hVar, final com.applovin.impl.sdk.m mVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String a = com.applovin.impl.sdk.network.h.this.a();
                d.c();
                if (d.f3206c == null) {
                    appLovinPostbackListener.onPostbackFailure(a, -1);
                    return;
                }
                if (com.applovin.impl.sdk.network.h.this.c() != null) {
                    a = StringUtils.appendQueryParameters(a, com.applovin.impl.sdk.network.h.this.c(), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.di)).booleanValue());
                }
                String l2 = e.a.d.a.a.l("al_firePostback('", a, "');");
                if (com.applovin.impl.sdk.utils.g.c()) {
                    d.f3206c.evaluateJavascript(l2, null);
                } else {
                    WebView webView = d.f3206c;
                    webView.loadUrl("javascript:" + l2);
                }
                appLovinPostbackListener.onPostbackSuccess(a);
            }
        });
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.m mVar) {
        String a = a(str3, str);
        if (StringUtils.isValidString(a)) {
            com.applovin.impl.sdk.v vVar = this.a;
            vVar.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a);
            loadDataWithBaseURL(str2, a, "text/html", null, "");
            return;
        }
        String a2 = a((String) mVar.a(com.applovin.impl.sdk.c.b.ej), str);
        if (StringUtils.isValidString(a2)) {
            com.applovin.impl.sdk.v vVar2 = this.a;
            vVar2.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            loadDataWithBaseURL(str2, a2, "text/html", null, "");
            return;
        }
        com.applovin.impl.sdk.v vVar3 = this.a;
        vVar3.b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        loadUrl(str);
    }

    private void b(com.applovin.impl.sdk.ad.e eVar) {
        Boolean n2;
        Integer a;
        loadUrl("about:blank");
        int av = this.f3209e.av();
        if (av >= 0) {
            setLayerType(av, null);
        }
        if (com.applovin.impl.sdk.utils.g.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.ar());
        }
        if (com.applovin.impl.sdk.utils.g.c() && eVar.at()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        v au = eVar.au();
        if (au != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b2 = au.b();
            if (b2 != null) {
                settings.setPluginState(b2);
            }
            Boolean c2 = au.c();
            if (c2 != null) {
                settings.setAllowFileAccess(c2.booleanValue());
            }
            Boolean d2 = au.d();
            if (d2 != null) {
                settings.setLoadWithOverviewMode(d2.booleanValue());
            }
            Boolean e2 = au.e();
            if (e2 != null) {
                settings.setUseWideViewPort(e2.booleanValue());
            }
            Boolean f2 = au.f();
            if (f2 != null) {
                settings.setAllowContentAccess(f2.booleanValue());
            }
            Boolean g2 = au.g();
            if (g2 != null) {
                settings.setBuiltInZoomControls(g2.booleanValue());
            }
            Boolean h2 = au.h();
            if (h2 != null) {
                settings.setDisplayZoomControls(h2.booleanValue());
            }
            Boolean i2 = au.i();
            if (i2 != null) {
                settings.setSaveFormData(i2.booleanValue());
            }
            Boolean j2 = au.j();
            if (j2 != null) {
                settings.setGeolocationEnabled(j2.booleanValue());
            }
            Boolean k2 = au.k();
            if (k2 != null) {
                settings.setNeedInitialFocus(k2.booleanValue());
            }
            Boolean l2 = au.l();
            if (l2 != null) {
                settings.setAllowFileAccessFromFileURLs(l2.booleanValue());
            }
            Boolean m2 = au.m();
            if (m2 != null) {
                settings.setAllowUniversalAccessFromFileURLs(m2.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.g.d() && (a = au.a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (!com.applovin.impl.sdk.utils.g.e() || (n2 = au.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(n2.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (f3206c != null) {
            return;
        }
        try {
            WebView webView = new WebView(com.applovin.impl.sdk.m.M());
            f3206c = webView;
            webView.getSettings().setJavaScriptEnabled(true);
            f3206c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
            f3206c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (webView2 == d.f3206c) {
                        d.f3206c.destroy();
                        WebView unused = d.f3206c = null;
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
            com.applovin.impl.sdk.v.c("AdWebView", "Failed to initialize WebView for postbacks.", th);
        }
    }

    public void a(com.applovin.impl.sdk.ad.e eVar) {
        com.applovin.impl.sdk.v vVar;
        String str;
        com.applovin.impl.sdk.v vVar2;
        String str2;
        String str3;
        String as;
        String str4;
        String str5;
        String str6;
        String as2;
        com.applovin.impl.sdk.m mVar;
        if (this.f3210f) {
            com.applovin.impl.sdk.v.i("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.f3209e = eVar;
        try {
            b(eVar);
            if (Utils.isBML(eVar.getSize())) {
                setVisibility(0);
            }
            if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                String replaceCommonMacros = Utils.replaceCommonMacros(this.f3211g, aVar.b());
                if (aVar.isOpenMeasurementEnabled()) {
                    replaceCommonMacros = this.f3207b.am().a(replaceCommonMacros);
                }
                loadDataWithBaseURL(eVar.as(), replaceCommonMacros, "text/html", null, "");
                if (aVar.isOpenMeasurementEnabled()) {
                    aVar.getAdEventTracker().b(this);
                    aVar.getAdEventTracker().a((View) this);
                    aVar.getAdEventTracker().c();
                    aVar.getAdEventTracker().d();
                }
                vVar = this.a;
                str = "AppLovinAd rendered";
            } else if (!(eVar instanceof com.applovin.impl.a.a)) {
                return;
            } else {
                com.applovin.impl.a.a aVar2 = (com.applovin.impl.a.a) eVar;
                com.applovin.impl.a.d aK = aVar2.aK();
                if (aK != null) {
                    com.applovin.impl.a.h b2 = aK.b();
                    Uri b3 = b2.b();
                    String uri = b3 != null ? b3.toString() : "";
                    String c2 = b2.c();
                    String aM = aVar2.aM();
                    if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(c2)) {
                        vVar2 = this.a;
                        str2 = "Unable to load companion ad. No resources provided.";
                        vVar2.e("AdWebView", str2);
                        return;
                    }
                    if (b2.a() == h.a.STATIC) {
                        this.a.b("AdWebView", "Rendering WebView for static VAST ad");
                        loadDataWithBaseURL(eVar.as(), a((String) this.f3207b.a(com.applovin.impl.sdk.c.b.ei), uri), "text/html", null, "");
                        return;
                    } else if (b2.a() == h.a.HTML) {
                        if (!StringUtils.isValidString(c2)) {
                            if (StringUtils.isValidString(uri)) {
                                this.a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                as2 = eVar.as();
                                mVar = this.f3207b;
                                a(uri, as2, aM, mVar);
                                return;
                            }
                            return;
                        }
                        String a = a(aM, c2);
                        str3 = StringUtils.isValidString(a) ? a : c2;
                        com.applovin.impl.sdk.v vVar3 = this.a;
                        vVar3.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                        as = eVar.as();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(as, str3, str4, str5, str6);
                        return;
                    } else if (b2.a() != h.a.IFRAME) {
                        vVar2 = this.a;
                        str2 = "Failed to render VAST companion ad of invalid type";
                        vVar2.e("AdWebView", str2);
                        return;
                    } else if (StringUtils.isValidString(uri)) {
                        this.a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                        as2 = eVar.as();
                        mVar = this.f3207b;
                        a(uri, as2, aM, mVar);
                        return;
                    } else if (StringUtils.isValidString(c2)) {
                        String a2 = a(aM, c2);
                        str3 = StringUtils.isValidString(a2) ? a2 : c2;
                        com.applovin.impl.sdk.v vVar4 = this.a;
                        vVar4.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                        as = eVar.as();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(as, str3, str4, str5, str6);
                        return;
                    } else {
                        return;
                    }
                }
                vVar = this.a;
                str = "No companion ad provided.";
            }
            vVar.b("AdWebView", str);
        } catch (Throwable th) {
            String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
            throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            com.applovin.impl.sdk.v vVar = this.a;
            vVar.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
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
        this.f3210f = true;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.e getCurrentAd() {
        return this.f3209e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.f3208d;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void setIsShownOutOfContext(boolean z) {
        this.f3211g = z;
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.f3208d = dVar;
    }
}

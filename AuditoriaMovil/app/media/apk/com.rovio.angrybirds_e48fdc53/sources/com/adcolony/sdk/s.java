package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s extends WebView implements g {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private JSONArray t;
    private JSONObject u;
    private aa v;
    private d w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Context context, d dVar, int i, int i2, aa aaVar) {
        super(context);
        this.c = "";
        this.d = "";
        this.f = "";
        this.g = "";
        this.t = as.b();
        this.u = as.a();
        this.w = dVar;
        a(dVar, i, i2, aaVar);
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Context context, int i, boolean z) {
        super(context);
        this.c = "";
        this.d = "";
        this.f = "";
        this.g = "";
        this.t = as.b();
        this.u = as.a();
        this.m = i;
        this.p = z;
    }

    void a(String str) {
        if (this.s) {
            au.b.b("Ignoring call to execute_js as WebView has been destroyed.");
        } else if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl("javascript:" + str);
        }
    }

    @Override // com.adcolony.sdk.g
    public int a() {
        return this.m;
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.h && as.c(b, "container_id") == this.v.c() && as.b(b, "ad_session_id").equals(this.v.a());
    }

    void d() {
        a(false, (d) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, d dVar) {
        a aVar;
        if (this.w == null) {
            this.w = dVar;
        }
        final JSONObject b = this.w.b();
        this.o = z;
        this.p = as.d(b, "is_display_module");
        if (z) {
            String b2 = as.b(b, "filepath");
            this.b = b2;
            this.a = "file://" + b2;
            this.u = as.f(b, DBDefinition.SEGMENT_INFO);
            this.n = true;
        }
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
        setWebChromeClient(new WebChromeClient() { // from class: com.adcolony.sdk.s.1
            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                au.d.a("JS Alert: ").b(str2);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.WARNING) {
                    au.f.b("onConsoleMessage: " + consoleMessage.message());
                } else if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    if ((consoleMessage.message().contains("ADC3_update is not defined") || consoleMessage.message().contains("NativeLayer.dispatch_messages is not a function")) && com.adcolony.sdk.a.d() && (com.adcolony.sdk.a.c() instanceof t)) {
                        d dVar2 = new d("AdSession.finish_fullscreen_ad", 0);
                        as.b(b, "status", 1);
                        au.g.b("Unable to communicate with ad, closing. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
                        ((t) com.adcolony.sdk.a.c()).a(dVar2);
                    }
                    au.h.b("onConsoleMessage: " + consoleMessage.message());
                }
                return true;
            }
        });
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            aVar = new a() { // from class: com.adcolony.sdk.s.2
                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (s.this.v != null) {
                        JSONObject a2 = as.a();
                        as.b(a2, "id", s.this.h);
                        as.a(a2, "ad_session_id", s.this.e);
                        as.b(a2, "container_id", s.this.v.c());
                        as.b(a2, PluginConstants.KEY_ERROR_CODE, webResourceError.getErrorCode());
                        as.a(a2, "error", webResourceError.getDescription().toString());
                        as.a(a2, "url", s.this.a);
                        new d("WebView.on_error", s.this.v.b(), a2).a();
                    }
                    au.h.b("onReceivedError: " + webResourceError.getDescription().toString());
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s.this.f.getBytes("UTF-8"));
                            s.this.r = true;
                            return new WebResourceResponse("text/javascript", "UTF-8", byteArrayInputStream);
                        } catch (UnsupportedEncodingException e) {
                            au.h.b("UTF-8 not supported.");
                            return null;
                        }
                    }
                    return null;
                }
            };
        } else if (Build.VERSION.SDK_INT >= 21) {
            aVar = new a() { // from class: com.adcolony.sdk.s.3
                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s.this.f.getBytes("UTF-8"));
                            s.this.r = true;
                            return new WebResourceResponse("text/javascript", "UTF-8", byteArrayInputStream);
                        } catch (UnsupportedEncodingException e) {
                            au.h.b("UTF-8 not supported.");
                            return null;
                        }
                    }
                    return null;
                }
            };
        } else {
            aVar = new a();
        }
        addJavascriptInterface(new Object() { // from class: com.adcolony.sdk.s.4
            @JavascriptInterface
            public void dispatch_messages(String str) {
                JSONArray b3 = as.b(str);
                if (b3 == null) {
                    au.g.b("[INTERNAL] ADCJSON parse error in dispatch_messages javascript interface function");
                    return;
                }
                for (int i = 0; i < b3.length(); i++) {
                    com.adcolony.sdk.a.a().n().a(as.d(b3, i));
                }
            }
        }, "NativeLayer");
        setWebViewClient(aVar);
        if (this.p) {
            String str = "";
            try {
                FileInputStream fileInputStream = new FileInputStream(this.b);
                StringBuilder sb = new StringBuilder(fileInputStream.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                }
                str = sb.toString().replaceFirst("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;", "var ADC_DEVICE_INFO = " + as.b(as.f(b, DBDefinition.SEGMENT_INFO), "metadata") + ";\n");
            } catch (IOException e) {
                au.g.a("Failed to find or open display module at URL: ").a(this.a).a(" with error: ").b(e.toString());
            }
            loadDataWithBaseURL(this.a, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, null);
        } else if (this.a.startsWith("http") || this.a.startsWith("file")) {
            loadUrl(this.a);
        } else {
            loadDataWithBaseURL(this.d.equals("") ? ShareConstants.WEB_DIALOG_PARAM_DATA : this.d, z ? as.b(b, ShareConstants.WEB_DIALOG_PARAM_DATA) : this.a, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, null);
        }
        if (!z) {
            e();
            f();
        }
        if (z || this.n) {
            com.adcolony.sdk.a.a().n().a(this);
        }
        if (!this.c.equals("")) {
            a(this.c);
        }
    }

    void e() {
        this.v.l().add(com.adcolony.sdk.a.a("WebView.set_visible", new f() { // from class: com.adcolony.sdk.s.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (s.this.a(dVar)) {
                    s.this.c(dVar);
                }
            }
        }, true));
        this.v.l().add(com.adcolony.sdk.a.a("WebView.set_bounds", new f() { // from class: com.adcolony.sdk.s.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (s.this.a(dVar)) {
                    s.this.b(dVar);
                }
            }
        }, true));
        this.v.l().add(com.adcolony.sdk.a.a("WebView.execute_js", new f() { // from class: com.adcolony.sdk.s.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (s.this.a(dVar)) {
                    s.this.a(as.b(dVar.b(), "custom_js"));
                }
            }
        }, true));
        this.v.m().add("WebView.set_visible");
        this.v.m().add("WebView.set_bounds");
        this.v.m().add("WebView.execute_js");
    }

    void f() {
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.k, this.l);
        layoutParams.setMargins(this.i, this.j, 0, 0);
        layoutParams.gravity = 0;
        this.v.addView(this, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar, int i, aa aaVar) {
        a(dVar, i, -1, aaVar);
        f();
    }

    void a(d dVar, int i, int i2, aa aaVar) {
        boolean z = false;
        JSONObject b = dVar.b();
        this.a = as.b(b, "url");
        if (this.a.equals("")) {
            this.a = as.b(b, ShareConstants.WEB_DIALOG_PARAM_DATA);
        }
        this.d = as.b(b, "base_url");
        this.c = as.b(b, "custom_js");
        this.e = as.b(b, "ad_session_id");
        this.u = as.f(b, DBDefinition.SEGMENT_INFO);
        this.g = as.b(b, "mraid_filepath");
        if (!this.p) {
            try {
                this.f = com.adcolony.sdk.a.a().g().a(this.g, false).toString();
                this.f = this.f.replaceFirst("bridge.os_name\\s*=\\s*\"\"\\s*;", "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.u.toString() + ";\n");
            } catch (IOException e) {
                au.g.a("Could not load MRAID from filepath: ").b(this.g);
                JSONObject a2 = as.a();
                as.a(a2, "id", this.e);
                new d("AdSession.on_error", aaVar.b(), a2).a();
            }
        }
        this.h = i;
        this.v = aaVar;
        if (i2 >= 0) {
            this.m = i2;
        } else {
            e();
        }
        this.k = as.c(b, "width");
        this.l = as.c(b, "height");
        this.i = as.c(b, "x");
        this.j = as.c(b, "y");
        this.n = (as.d(b, "enable_messages") || this.o) ? true : true;
    }

    void b(d dVar) {
        JSONObject b = dVar.b();
        this.i = as.c(b, "x");
        this.j = as.c(b, "y");
        this.k = as.c(b, "width");
        this.l = as.c(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.i, this.j, 0, 0);
        layoutParams.width = this.k;
        layoutParams.height = this.l;
        setLayoutParams(layoutParams);
        if (this.o) {
            JSONObject a2 = as.a();
            as.a(a2, "success", true);
            as.b(a2, "id", this.m);
            dVar.a(a2).a();
        }
    }

    void c(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
        if (this.o) {
            JSONObject a2 = as.a();
            as.a(a2, "success", true);
            as.b(a2, "id", this.m);
            dVar.a(a2).a();
        }
    }

    @Override // com.adcolony.sdk.g
    public void a(JSONObject jSONObject) {
        synchronized (this.t) {
            this.t.put(jSONObject);
        }
    }

    @Override // com.adcolony.sdk.g
    public void b() {
    }

    @Override // com.adcolony.sdk.g
    public void c() {
        if (com.adcolony.sdk.a.d() && this.q) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.s.8
                @Override // java.lang.Runnable
                public void run() {
                    String str = "";
                    synchronized (s.this.t) {
                        if (s.this.t.length() > 0) {
                            if (s.this.n) {
                                str = s.this.t.toString();
                            }
                            s.this.t = as.b();
                        }
                    }
                    if (s.this.n) {
                        s.this.a("NativeLayer.dispatch_messages(ADC3_update(" + str + "));");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (str.equals(s.this.a)) {
                s.this.a("if (typeof(CN) != 'undefined' && CN.div) {\n  if (typeof(cn_dispatch_on_touch_begin) != 'undefined') CN.div.removeEventListener('mousedown',  cn_dispatch_on_touch_begin, true);\n  if (typeof(cn_dispatch_on_touch_end) != 'undefined')   CN.div.removeEventListener('mouseup',  cn_dispatch_on_touch_end, true);\n  if (typeof(cn_dispatch_on_touch_move) != 'undefined')  CN.div.removeEventListener('mousemove',  cn_dispatch_on_touch_move, true);\n}\n");
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s.this.q = false;
            s.this.r = false;
            au.d.b("onPageStarted with URL = " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            JSONObject a = as.a();
            as.b(a, "id", s.this.h);
            as.a(a, "url", str);
            au.b.a("onPageFinished called with URL = ").b(str);
            if (s.this.v == null) {
                new d("WebView.on_load", s.this.m, a).a();
            } else {
                as.a(a, "ad_session_id", s.this.e);
                as.b(a, "container_id", s.this.v.c());
                new d("WebView.on_load", s.this.v.b(), a).a();
            }
            if ((s.this.n || s.this.o) && !s.this.q && (str.startsWith(ShareConstants.WEB_DIALOG_PARAM_DATA) || str.startsWith("file") || str.equals(s.this.d) || s.this.r)) {
                au.b.b("WebView data loaded - executing ADC3_init");
                au.b.b("===============================================================================");
                au.b.b("ADC3_init(" + s.this.m + "," + s.this.u.toString() + ");");
                au.b.b("===============================================================================");
                s.this.a("ADC3_init(" + s.this.m + "," + s.this.u.toString() + ");");
                s.this.q = true;
            }
            if (s.this.o) {
                JSONObject a2 = as.a();
                as.a(a2, "success", true);
                as.b(a2, "id", s.this.m);
                s.this.w.a(a2).a();
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21 && str.endsWith("mraid.js")) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s.this.f.getBytes("UTF-8"));
                    s.this.r = true;
                    return new WebResourceResponse("text/javascript", "UTF-8", byteArrayInputStream);
                } catch (UnsupportedEncodingException e) {
                    au.h.b("UTF-8 not supported.");
                    return null;
                }
            }
            return null;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                JSONObject a = as.a();
                as.b(a, "id", s.this.h);
                as.a(a, "ad_session_id", s.this.e);
                as.b(a, "container_id", s.this.v.c());
                as.b(a, PluginConstants.KEY_ERROR_CODE, i);
                as.a(a, "error", str);
                as.a(a, "url", str2);
                new d("WebView.on_error", s.this.v.b(), a).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.s = z;
    }
}

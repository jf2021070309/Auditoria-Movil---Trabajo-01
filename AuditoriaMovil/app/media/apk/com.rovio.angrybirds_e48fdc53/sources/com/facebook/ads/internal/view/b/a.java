package com.facebook.ads.internal.view.b;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.q.a.j;
import com.facebook.ads.internal.q.a.s;
import com.facebook.ads.internal.r.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a extends com.facebook.ads.internal.q.c.a {
    private static final String a = a.class.getSimpleName();
    private final WeakReference<b> b;
    private s c;
    private com.facebook.ads.internal.r.a d;
    private a.AbstractC0116a e;

    /* renamed from: com.facebook.ads.internal.view.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0120a {
        private final String a;
        private final WeakReference<a> b;
        private final WeakReference<b> c;
        private final WeakReference<com.facebook.ads.internal.r.a> d;

        private C0120a(a aVar, b bVar, com.facebook.ads.internal.r.a aVar2) {
            this.a = C0120a.class.getSimpleName();
            this.b = new WeakReference<>(aVar);
            this.c = new WeakReference<>(bVar);
            this.d = new WeakReference<>(aVar2);
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.a, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return j.a(com.facebook.ads.internal.g.a.a());
        }

        @JavascriptInterface
        public void onPageInitialized() {
            a aVar = this.b.get();
            if (aVar == null || aVar.c()) {
                return;
            }
            b bVar = this.c.get();
            if (bVar != null) {
                bVar.a();
            }
            new Handler(Looper.getMainLooper()).post(new c(this.d));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void a(int i);

        void a(String str, Map<String, String> map);

        void b();
    }

    /* loaded from: classes2.dex */
    static class c implements Runnable {
        private final WeakReference<com.facebook.ads.internal.r.a> a;

        c(WeakReference<com.facebook.ads.internal.r.a> weakReference) {
            this.a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.ads.internal.r.a aVar = this.a.get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends WebViewClient {
        private final WeakReference<b> a;
        private final WeakReference<com.facebook.ads.internal.r.a> b;
        private final WeakReference<s> c;

        d(WeakReference<b> weakReference, WeakReference<com.facebook.ads.internal.r.a> weakReference2, WeakReference<s> weakReference3) {
            this.a = weakReference;
            this.b = weakReference2;
            this.c = weakReference3;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap hashMap = new HashMap();
            if (this.b.get() != null) {
                this.b.get().a(hashMap);
            }
            if (this.c.get() != null) {
                hashMap.put("touch", j.a(this.c.get().e()));
            }
            if (this.a.get() != null) {
                this.a.get().a(str, hashMap);
                return true;
            }
            return true;
        }
    }

    public a(Context context, WeakReference<b> weakReference, int i) {
        super(context);
        this.c = new s();
        this.b = weakReference;
        this.e = new a.AbstractC0116a() { // from class: com.facebook.ads.internal.view.b.a.1
            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void a() {
                a.this.c.a();
                if (a.this.b.get() != null) {
                    ((b) a.this.b.get()).b();
                }
            }
        };
        this.d = new com.facebook.ads.internal.r.a(this, i, this.e);
        setWebChromeClient(a());
        setWebViewClient(b());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C0120a(weakReference.get(), this.d), "AdControl");
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebChromeClient a() {
        return new WebChromeClient() { // from class: com.facebook.ads.internal.view.b.a.2
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }
        };
    }

    public void a(int i, int i2) {
        this.d.a(i);
        this.d.b(i2);
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebViewClient b() {
        return new d(this.b, new WeakReference(this.d), new WeakReference(this.c));
    }

    @Override // com.facebook.ads.internal.q.c.a, android.webkit.WebView
    public void destroy() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        this.e = null;
        this.c = null;
        com.facebook.ads.internal.q.c.b.a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.c.e();
    }

    public com.facebook.ads.internal.r.a getViewabilityChecker() {
        return this.d;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.c.a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.b.get() != null) {
            this.b.get().a(i);
        }
        if (this.d != null) {
            if (i == 0) {
                this.d.a();
            } else if (i == 8) {
                this.d.b();
            }
        }
    }
}

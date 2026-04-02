package com.fyber.inneractive.sdk.m;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.m.c;
import com.fyber.inneractive.sdk.m.g;
import com.fyber.inneractive.sdk.m.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.al;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.q;
import com.fyber.inneractive.sdk.util.u;
import com.fyber.inneractive.sdk.util.w;
/* loaded from: classes.dex */
public abstract class a<L extends l> implements com.fyber.inneractive.sdk.m.b, c.a, g.a, w.b {
    protected com.fyber.inneractive.sdk.m.c c;
    e d;
    f e;
    protected b f;
    protected L g;
    protected boolean j;
    protected boolean k;
    InterfaceC0044a l;
    Runnable m;
    long n;
    long o;
    AsyncTask<Void, Void, String> p;
    protected String q;
    protected String r;
    protected InneractiveAdRequest s;
    protected com.fyber.inneractive.sdk.d.g t;
    protected boolean b = false;
    float h = 0.0f;
    Rect i = new Rect();
    private boolean a = false;
    private final Runnable v = new Runnable() { // from class: com.fyber.inneractive.sdk.m.a.1
        @Override // java.lang.Runnable
        public final void run() {
            IAlog.a("Removing clicked state after timeout", new Object[0]);
            a.this.m();
        }
    };
    private final Runnable u = new Runnable() { // from class: com.fyber.inneractive.sdk.m.a.2
        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.k) {
                IAlog.b("No user web action detected for : %s blocking.", a.this.l);
                a aVar = a.this;
                aVar.a(aVar.l.a(), a.this.l.b());
                a.this.l.d();
                a.this.m();
            } else {
                IAlog.b("User web action detected for: %s", a.this.l);
                a.this.l.c();
            }
            a.this.l = null;
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.fyber.inneractive.sdk.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0044a {
        String a();

        String b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(InneractiveErrorCode inneractiveErrorCode);

        void a(a aVar);
    }

    public abstract String a(String str, String str2, String str3);

    public abstract boolean a(String str, aj ajVar);

    /* loaded from: classes.dex */
    class c implements InterfaceC0044a {
        String a;
        aj b;

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final String a() {
            return "open";
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final String b() {
            return null;
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final void d() {
        }

        c(String str, aj ajVar) {
            this.b = ajVar;
            this.a = str;
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final void c() {
            a.this.b(this.a, this.b);
        }

        public final String toString() {
            return "action: open url: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, boolean z) {
        this.k = z;
        this.c = b(context);
    }

    public void c() {
        b(false);
    }

    public void b(boolean z) {
        AsyncTask<Void, Void, String> asyncTask = this.p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        if (this.c != null) {
            w.a().a(this.c);
            q.a(this.c);
            this.c.setWebChromeClient(null);
            this.c.setWebViewClient(null);
            this.c.destroy();
        }
        f fVar = this.e;
        if (fVar != null) {
            fVar.a = null;
        }
        if (this.v != null) {
            m.a().removeCallbacks(this.v);
        }
        if (this.u != null) {
            m.a().removeCallbacks(this.u);
        }
        this.g = null;
        if (!z) {
            this.f = null;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.t = null;
        this.s = null;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void a(final String str, final String str2, final String str3, final String str4, b bVar, long j) {
        this.f = bVar;
        this.n = j;
        try {
            j();
            AsyncTask<Void, Void, String> asyncTask = new AsyncTask<Void, Void, String>() { // from class: com.fyber.inneractive.sdk.m.a.3
                @Override // android.os.AsyncTask
                protected final /* synthetic */ void onPostExecute(String str5) {
                    String str6 = str5;
                    String str7 = p.a() ? "http://" : "https://";
                    if (!TextUtils.isEmpty(str6) && !isCancelled()) {
                        a.this.p = null;
                        if (!TextUtils.isEmpty(str)) {
                            a aVar = a.this;
                            aVar.q = str7 + str;
                        } else {
                            a aVar2 = a.this;
                            aVar2.q = str7 + "wv.inner-active.mobi/";
                        }
                        if (a.this.c == null) {
                            a.this.a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
                            return;
                        }
                        a.this.c.loadDataWithBaseURL(a.this.q, str6, "text/html", "utf-8", null);
                        a.this.r = str6;
                    } else if (isCancelled()) {
                    } else {
                        a.this.a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
                    }
                }

                @Override // android.os.AsyncTask
                protected final /* synthetic */ String doInBackground(Void[] voidArr) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String a = a.this.a(str2, str3, str4);
                    IAlog.b("%sbuild html string took %d msec", IAlog.a(a.this), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    return a;
                }
            };
            this.p = asyncTask;
            com.fyber.inneractive.sdk.util.l.a(asyncTask, new Void[0]);
            a();
        } catch (Throwable unused) {
            a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    public final boolean a(Context context) {
        this.c = b(context);
        try {
            j();
            this.c.loadDataWithBaseURL(this.q, this.r, "text/html", "utf-8", null);
            a();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setListener(L l) {
        this.g = l;
    }

    public final com.fyber.inneractive.sdk.m.c e() {
        return this.c;
    }

    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        com.fyber.inneractive.sdk.m.c cVar = this.c;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            w.a().a(viewGroup.getContext(), this.c, this);
            f();
        }
    }

    public final void f() {
        this.c.setTapListener(this);
    }

    @Override // com.fyber.inneractive.sdk.m.g.a
    public final void h() {
        m();
    }

    @Override // com.fyber.inneractive.sdk.m.g.a
    public final void i() {
        m();
    }

    public final void b(String str) {
        com.fyber.inneractive.sdk.m.c cVar = this.c;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    private static com.fyber.inneractive.sdk.m.c b(Context context) {
        return new com.fyber.inneractive.sdk.m.c(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        int i;
        int i2;
        int i3;
        boolean z;
        s i4;
        com.fyber.inneractive.sdk.config.a.a.c cVar;
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.l() && p.a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.a && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        com.fyber.inneractive.sdk.m.c cVar2 = this.c;
        cVar2.setHorizontalScrollBarEnabled(false);
        cVar2.setHorizontalScrollbarOverlay(false);
        cVar2.setVerticalScrollBarEnabled(false);
        cVar2.setVerticalScrollbarOverlay(false);
        cVar2.getSettings().setSupportZoom(false);
        com.fyber.inneractive.sdk.m.c cVar3 = this.c;
        if (Build.VERSION.SDK_INT < 18) {
            try {
                cVar3.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.b("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.c.setFocusable(true);
        this.c.setBackgroundColor(0);
        e eVar = new e();
        this.d = eVar;
        this.c.setWebChromeClient(eVar);
        com.fyber.inneractive.sdk.d.g gVar = this.t;
        if (gVar == null || (i4 = gVar.i()) == null || (cVar = (com.fyber.inneractive.sdk.config.a.a.c) i4.a(com.fyber.inneractive.sdk.config.a.a.c.class)) == null) {
            i = 500;
            i2 = 500;
            i3 = 2;
            z = false;
        } else {
            boolean a = cVar.a("agg_res", false);
            int max = Math.max(cVar.a("agg_res_ct", 500), 50);
            i2 = Math.max(cVar.a("agg_res_rt", 500), 50);
            i3 = Math.max(cVar.a("agg_res_retries", 2), 1);
            z = a;
            i = max;
        }
        f fVar = new f(this, z, i, i2, i3);
        this.e = fVar;
        this.c.setWebViewClient(fVar);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                com.fyber.inneractive.sdk.m.c.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.b("Could not set web contents debugging flag", new Object[0]);
        }
        this.c.setListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InneractiveErrorCode inneractiveErrorCode) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(inneractiveErrorCode);
        }
        b(true);
    }

    @Override // com.fyber.inneractive.sdk.util.w.b
    public final void a(float f, Rect rect) {
        if (f == this.h && rect.equals(this.i)) {
            return;
        }
        this.h = f;
        this.i.set(rect);
        com.fyber.inneractive.sdk.m.c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    protected final boolean b(String str, aj ajVar) {
        L l = this.g;
        return (l == null || l.a(str, ajVar).a == u.c.FAILED) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.m.b
    public final void l() {
        L l = this.g;
        if (l != null) {
            l.b();
        }
        b(true);
    }

    @Override // com.fyber.inneractive.sdk.m.b
    public final void c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http://") || p.a()) {
            return;
        }
        IAlog.b("%s Found a portential unsecure resource url: %s", IAlog.a(this), str);
    }

    public final void m() {
        IAlog.b("IAWebViewController resetClick()", new Object[0]);
        if (this.v != null) {
            m.a().removeCallbacks(this.v);
        }
        if (this.u != null) {
            m.a().removeCallbacks(this.u);
        }
        this.j = false;
    }

    protected final void a(String str, String str2) {
        L l = this.g;
        if (l != null) {
            l.a(str, str2);
        }
        IAlog.a(IAlog.b, "AD_AUTO_CLICK_DETECTED", new Object[0]);
    }

    private void a() {
        IAlog.b("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.n));
        this.o = System.currentTimeMillis();
        this.m = new Runnable() { // from class: com.fyber.inneractive.sdk.m.a.4
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this);
            }
        };
        m.a().postDelayed(this.m, this.n);
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.s = inneractiveAdRequest;
    }

    public void setAdContent(com.fyber.inneractive.sdk.d.g gVar) {
        this.t = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(InterfaceC0044a interfaceC0044a) {
        IAlog.a("IAWebViewController Web view click detected", new Object[0]);
        if (this.j) {
            IAlog.a("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            interfaceC0044a.c();
            m();
            return true;
        }
        if (this.k) {
            IAlog.a("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            b();
            this.l = interfaceC0044a;
            if (this.u != null) {
                m.a().postDelayed(this.u, IAConfigManager.c().a.a("click_timeout", 1000, 1000));
            }
        } else {
            b();
            interfaceC0044a.c();
        }
        return false;
    }

    private void b() {
        if (this.u != null) {
            m.a().removeCallbacks(this.u);
        }
        this.l = null;
    }

    @Override // com.fyber.inneractive.sdk.m.g.a
    public final void g() {
        IAlog.b("IAWebViewController onClicked()", new Object[0]);
        if (this.l != null) {
            IAlog.a("Native click detected in time. Processing pending click", new Object[0]);
            this.l.c();
            if (this.u != null) {
                m.a().removeCallbacks(this.u);
            }
            this.l = null;
            m();
            return;
        }
        if (this.v != null) {
            m.a().postDelayed(this.v, IAConfigManager.c().a.a("click_timeout", 1000, 1000));
        }
        this.j = true;
    }

    @Override // com.fyber.inneractive.sdk.m.b
    public boolean a(WebView webView, String str) {
        IAlog.b("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.c == null) {
            IAlog.b("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (al.a(str)) {
            this.c.loadUrl("chrome://crash");
            return true;
        } else {
            aj k = k();
            if (a(str, k)) {
                return true;
            }
            a(new c(str, k));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aj k() {
        com.fyber.inneractive.sdk.m.c cVar = this.c;
        if (cVar != null) {
            return cVar.getLastClickedLocation();
        }
        return new aj();
    }

    @Override // com.fyber.inneractive.sdk.m.c.a
    public void a(boolean z) {
        IAlog.b("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z));
        L l = this.g;
        if (l != null) {
            l.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        IAlog.b("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.a(this), Long.valueOf(System.currentTimeMillis() - this.o));
        if (this.m != null) {
            m.a().removeCallbacks(this.m);
            this.m = null;
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    static /* synthetic */ void a(a aVar) {
        AsyncTask<Void, Void, String> asyncTask = aVar.p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            aVar.p = null;
        }
        IAlog.b("%sonLoadTimeout after %d msec", IAlog.a(aVar), Long.valueOf(aVar.n));
        aVar.a(InneractiveErrorCode.LOAD_TIMEOUT);
    }
}

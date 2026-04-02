package com.fyber.inneractive.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.d.j;
import com.fyber.inneractive.sdk.d.l;
import com.fyber.inneractive.sdk.d.m;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.h.p;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ad;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.ao;
import com.fyber.inneractive.sdk.util.u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class g extends l<m, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.e.c {
    d.c l;
    private IAmraidWebViewController n;
    private ao t;
    private c.b y;
    private ad z;
    boolean m = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean u = false;
    private UnitDisplayType v = UnitDisplayType.INTERSTITIAL;
    private boolean w = false;
    private boolean x = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean c(m mVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.e.c
    public final boolean q() {
        return true;
    }

    static /* synthetic */ boolean K(g gVar) {
        gVar.u = true;
        return true;
    }

    static /* synthetic */ boolean a(g gVar) {
        gVar.w = true;
        return true;
    }

    static /* synthetic */ boolean y(g gVar) {
        gVar.s = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* synthetic */ boolean a(m mVar) {
        return this.v != UnitDisplayType.REWARDED && ((com.fyber.inneractive.sdk.config.a.a.b) mVar.i().a(com.fyber.inneractive.sdk.config.a.a.b.class)).a("show_fallback_close_btn", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* synthetic */ boolean b(m mVar) {
        return this.v != UnitDisplayType.REWARDED && ((com.fyber.inneractive.sdk.config.a.a.b) mVar.i().a(com.fyber.inneractive.sdk.config.a.a.b.class)).a("add_transparent_close_btn", false);
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.a(aVar, activity);
        o h = (this.b == 0 || ((m) this.b).h() == null) ? null : ((m) this.b).h().h();
        boolean z = false;
        if (h == null) {
            IAlog.d("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = this.b != 0 ? ((m) this.b).a : null;
        this.n = iAmraidWebViewController;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.d()) {
            IAlog.d("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        this.v = h.a();
        this.o = false;
        this.p = false;
        this.z = new ad(this.a);
        this.h = aVar;
        if (this.n == null) {
            IAlog.d("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.b);
            return;
        }
        int i = ((m) this.b).f().g;
        int i2 = ((m) this.b).f().h;
        if ((i == 300 && i2 == 250) || (i == 600 && i2 == 500)) {
            z = true;
        }
        this.q = z;
        if (z) {
            this.n.setAdDefaultSize(com.fyber.inneractive.sdk.util.l.a(i), com.fyber.inneractive.sdk.util.l.a(i2));
        }
        if (this.l == null) {
            this.l = new d.c() { // from class: com.fyber.inneractive.sdk.i.g.2
                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void c() {
                    IAlog.b("%sweb view callback: onExpand", IAlog.a(g.this));
                    g.this.r = true;
                    g.this.d();
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void d() {
                    IAlog.b("%sweb view callback: onResize", IAlog.a(g.this));
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void e() {
                    IAlog.b("%sweb view callback: onClose", IAlog.a(g.this));
                    if (g.this.r) {
                        g.this.r = false;
                        g.this.d();
                        return;
                    }
                    if (g.this.v == UnitDisplayType.REWARDED) {
                        g.this.a();
                    }
                    if (g.this.h != null) {
                        g.this.h.dismissAd(true);
                    }
                }

                @Override // com.fyber.inneractive.sdk.m.l
                public final u.a a(String str, aj ajVar) {
                    IAlog.b("%sweb view callback: onClicked", IAlog.a(g.this));
                    Context p = com.fyber.inneractive.sdk.util.l.p();
                    if (g.this.h != null && g.this.h.getLayout() != null && g.this.h.getLayout().getContext() != null) {
                        p = g.this.h.getLayout().getContext();
                    }
                    if (p != null && ((com.fyber.inneractive.sdk.d.h) g.this).g) {
                        com.fyber.inneractive.sdk.j.f f = g.this.b == null ? null : ((m) g.this.b).f();
                        if (f != null) {
                            g.this.b(f);
                        }
                        g.a(com.fyber.inneractive.sdk.a.a.a.a.b, g.this.v == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.a.a.a.b.REWARDED_DISPLAY : com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_DISPLAY);
                        return g.this.a(p, str, ajVar);
                    }
                    return new u.a(u.c.FAILED, new Exception("No context or no native click detected"), p == null ? "null" : p.getClass().getName());
                }

                @Override // com.fyber.inneractive.sdk.m.l
                public final void b() {
                    g.this.a(new WebViewRendererProcessHasGoneError());
                    g.this.destroy();
                }

                @Override // com.fyber.inneractive.sdk.m.l
                public final void a(String str, String str2) {
                    IAlog.b("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(g.this));
                    if (g.this.h == null || g.this.h.getLayout() == null) {
                        return;
                    }
                    if (g.this.s) {
                        IAlog.b("%sredirect already reported for this ad", IAlog.a(g.this));
                        return;
                    }
                    p.a(g.this.h.getLayout().getContext(), str, str2, g.this.b);
                    g.y(g.this);
                    IAlog.b("%sreporting auto redirect", IAlog.a(g.this));
                }

                @Override // com.fyber.inneractive.sdk.m.l
                public final void b(boolean z2) {
                    if (z2 && !g.this.m) {
                        g.this.m = true;
                        g.B(g.this);
                    }
                    IAlog.b("%sweb view callback: onVisibilityChanged: %s", IAlog.a(g.this), Boolean.valueOf(z2));
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void a(boolean z2, Orientation orientation) {
                    if (g.this.h != null) {
                        g.this.h.setActivityOrientation(z2, orientation);
                    }
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final boolean a(String str) {
                    if (g.this.h == null || g.this.h.getLayout() == null) {
                        return false;
                    }
                    boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(g.this.h.getLayout().getContext(), str);
                    if (startRichMediaIntent) {
                        g.this.n();
                        return startRichMediaIntent;
                    }
                    return startRichMediaIntent;
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void a(boolean z2) {
                    if (z2) {
                        if (g.this.v != UnitDisplayType.REWARDED && !g.this.u) {
                            g.K(g.this);
                            if (g.this.h != null) {
                                g gVar = g.this;
                                g.b(gVar, gVar.h.isCloseButtonDisplay());
                            }
                        }
                        g.this.v();
                        if (g.this.h == null || !g.this.h.isCloseButtonDisplay()) {
                            return;
                        }
                        g.this.a(true);
                    }
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void a() {
                    g.this.n();
                }

                @Override // com.fyber.inneractive.sdk.m.d.c
                public final void a(InneractiveUnitController.AdDisplayError adDisplayError) {
                    g.this.a(false);
                    if (g.this.c != null) {
                        ((InneractiveFullscreenAdEventsListener) g.this.c).onAdEnteredErrorState(g.this.a, adDisplayError);
                    }
                }
            };
        }
        this.n.setListener(this.l);
        d();
        this.n.a(this.h.getLayout(), (ViewGroup.LayoutParams) null);
        this.o = true;
        if (this.v == UnitDisplayType.REWARDED) {
            ao aoVar = new ao(TimeUnit.SECONDS, c());
            this.t = aoVar;
            aoVar.b = new ao.b() { // from class: com.fyber.inneractive.sdk.i.g.1
                @Override // com.fyber.inneractive.sdk.util.ao.b
                public final void a() {
                    g.a(g.this);
                }
            };
            this.t.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void k() {
        d();
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void w() {
        ao aoVar;
        super.w();
        if (this.v == UnitDisplayType.REWARDED && (aoVar = this.t) != null) {
            aoVar.b();
        }
        ad adVar = this.z;
        if (adVar != null) {
            adVar.c = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void x() {
        ao aoVar;
        super.x();
        if (this.v == UnitDisplayType.REWARDED && (aoVar = this.t) != null) {
            aoVar.c();
        }
        ad adVar = this.z;
        if (adVar != null) {
            if (adVar.b == 0) {
                adVar.b = System.currentTimeMillis();
            }
            if (adVar.c > 0) {
                adVar.d += System.currentTimeMillis() - adVar.c;
                adVar.c = 0L;
            }
        }
    }

    private void b() {
        if (this.p || this.c == 0) {
            return;
        }
        this.p = true;
        ((InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.a);
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void j() {
        if (this.v == UnitDisplayType.REWARDED) {
            a();
        }
        b();
        if (this.a != null && (this.a instanceof j)) {
            ((j) this.a).a();
        }
        ad adVar = this.z;
        if (adVar == null || adVar.b == 0) {
            return;
        }
        String format = new SimpleDateFormat("ss:S", Locale.getDefault()).format(new Date((System.currentTimeMillis() - adVar.b) - adVar.d));
        adVar.b = 0L;
        adVar.c = 0L;
        adVar.d = 0L;
        com.fyber.inneractive.sdk.d.g adContent = adVar.a != null ? adVar.a.getAdContent() : null;
        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.m.INTERSTITIAL_VIEW_TIME, adContent != null ? adContent.g() : null, adContent != null ? adContent.f() : null, (adContent == null || adContent.i() == null) ? null : adContent.i().b());
        aVar.a("time", format);
        aVar.b(null);
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (this.o) {
            b();
        }
        this.l = null;
        ao aoVar = this.t;
        if (aoVar != null) {
            aoVar.b = null;
            this.t = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long f() {
        int i = 2;
        if (this.v == UnitDisplayType.REWARDED) {
            int c = c();
            IAlog.b("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(c));
            i = c;
        } else {
            try {
                i = Integer.parseInt(IAConfigManager.c().a.a("mraid_x_delay", Long.toString(2L)));
            } catch (Throwable unused) {
            }
        }
        return i * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long a(long j) {
        if (this.v == UnitDisplayType.REWARDED) {
            return 0L;
        }
        return (this.b != 0 ? ((com.fyber.inneractive.sdk.config.a.a.b) ((m) this.b).i().a(com.fyber.inneractive.sdk.config.a.a.b.class)).a("fallback_close_btn_delay", 15) - (j / 1000) : 13L) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean h() {
        return this.v != UnitDisplayType.REWARDED;
    }

    private static int c() {
        return IAConfigManager.c().a.a("rewarded_mraid_delay", 31, 30);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean g() {
        return !this.q && this.n.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.b == 0 || this.n == null) {
            IAlog.b("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.fyber.inneractive.sdk.m.c e = this.n.e();
        layoutParams.gravity = 17;
        e.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void a(c.b bVar) {
        this.y = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        IAlog.b("%sprovide reward called", IAlog.a(this));
        if (this.x) {
            IAlog.b("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.b("%sreward sent", IAlog.a(this));
        if (this.y != null) {
            a(com.fyber.inneractive.sdk.a.a.a.a.c, com.fyber.inneractive.sdk.a.a.a.b.REWARDED_DISPLAY);
            this.y.a();
        }
        g_();
        this.x = true;
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final boolean i() {
        boolean z;
        if (this.h == null) {
            z = true;
        } else if (this.v == UnitDisplayType.REWARDED) {
            if (this.w) {
                a();
            }
            z = this.w;
        } else {
            z = ((l) this).i;
        }
        if (z) {
            if (this.h != null) {
                this.h.dismissAd(true);
                return true;
            }
            return false;
        }
        return true;
    }

    static /* synthetic */ void B(g gVar) {
        String str;
        if (gVar.b != 0) {
            IAmraidWebViewController iAmraidWebViewController = gVar.n;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.b();
            }
            com.fyber.inneractive.sdk.j.f f = ((m) gVar.b).f();
            if (f != null && (str = f.n) != null && str.trim().length() > 0) {
                IAlog.a("%sfiring impression!", IAlog.a(gVar));
                IAlog.a(IAlog.b, "AD_IMPRESSION", new Object[0]);
                gVar.b(str);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                gVar.n.b("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
            }
            a(com.fyber.inneractive.sdk.a.a.a.a.a, gVar.v == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.a.a.a.b.REWARDED_DISPLAY : com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_DISPLAY);
            gVar.m();
            gVar.u();
        }
    }

    static /* synthetic */ void b(g gVar, boolean z) {
        n.a aVar;
        if (gVar.b == 0) {
            aVar = new n.a(com.fyber.inneractive.sdk.h.m.MRAID_CUSTOM_CLOSE_DETECTED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.j.e) null, (JSONArray) null);
        } else {
            aVar = new n.a(com.fyber.inneractive.sdk.h.m.MRAID_CUSTOM_CLOSE_DETECTED, ((m) gVar.b).g(), ((m) gVar.b).f(), ((m) gVar.b).i().b());
        }
        aVar.a(new n.b().a("fyber_close_enabled", Boolean.valueOf(z)));
        aVar.b(null);
    }
}

package com.fyber.inneractive.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import com.fyber.inneractive.mraidkit.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.d.m;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.h.p;
import com.fyber.inneractive.sdk.i.b;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.ak;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.t;
import com.fyber.inneractive.sdk.util.u;
import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes.dex */
public final class d extends com.fyber.inneractive.sdk.d.h<m, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.e.b, t.b {
    InneractiveAdViewUnitController h;
    IAmraidWebViewController i;
    d.c j;
    ViewGroup l;
    FrameLayout m;
    private Runnable p;
    private com.fyber.inneractive.sdk.i.b v;
    private long n = 0;
    boolean k = false;
    private long o = 0;
    private int q = 0;
    private long r = 0;
    private boolean s = false;
    private boolean t = true;
    private boolean u = false;

    @Override // com.fyber.inneractive.sdk.e.b
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void f() {
    }

    static /* synthetic */ boolean B(d dVar) {
        dVar.s = true;
        return true;
    }

    /* loaded from: classes.dex */
    public enum b {
        BANNER_WIDTH(320),
        BANNER_HEIGHT(50),
        BANNER_TABLET_HEIGHT(90),
        BANNER_TABLET_WIDTH(728),
        RECTANGLE_HEIGHT(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
        RECTANGLE_WIDTH(Strategy.TTL_SECONDS_DEFAULT);
        
        final int g;

        b(int i) {
            this.g = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(com.fyber.inneractive.sdk.d.g gVar) {
        return gVar instanceof m;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(ViewGroup viewGroup) {
        t tVar;
        if (this.a == null) {
            IAlog.d("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.k = false;
        this.f = false;
        if (viewGroup != null) {
            this.l = viewGroup;
            this.h = (InneractiveAdViewUnitController) this.a.getSelectedUnitController();
        } else if (!this.u) {
            a();
            if (this.a.getAdContent() instanceof m) {
                this.b = (m) this.a.getAdContent();
                this.e = false;
                super.f_();
            } else {
                IAlog.d("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.a.getAdContent());
                return;
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.b != 0 ? ((m) this.b).a : null;
        this.i = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.j == null) {
                this.j = new d.c() { // from class: com.fyber.inneractive.sdk.i.d.2
                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void a(boolean z) {
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void a(boolean z, Orientation orientation) {
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void c() {
                        IAlog.b("%sweb view callback: onExpand", IAlog.a(d.this));
                        if (d.this.c != null) {
                            ((InneractiveAdViewEventsListener) d.this.c).onAdExpanded(d.this.a);
                        }
                        IAlog.b("%sweb view callback: onExpand", IAlog.a(d.this));
                        d.this.b(true);
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void d() {
                        d.this.b(true);
                        IAlog.b("%sweb view callback: onResize", IAlog.a(d.this));
                        if (d.this.c != null) {
                            ((InneractiveAdViewEventsListener) d.this.c).onAdResized(d.this.a);
                        }
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void e() {
                        IAlog.b("%sweb view callback: onClose", IAlog.a(d.this));
                        if (d.this.c != null) {
                            ((InneractiveAdViewEventsListener) d.this.c).onAdCollapsed(d.this.a);
                        }
                        d.this.k();
                        IAlog.b("%sweb view callback: onClose", IAlog.a(d.this));
                    }

                    @Override // com.fyber.inneractive.sdk.m.l
                    public final u.a a(String str, aj ajVar) {
                        IAlog.b("%sweb view callback: onClicked", IAlog.a(d.this));
                        Context p = (d.this.l == null || d.this.l.getContext() == null) ? l.p() : d.this.l.getContext();
                        if (p != null && ((com.fyber.inneractive.sdk.d.h) d.this).g) {
                            com.fyber.inneractive.sdk.j.f f = d.this.b != null ? ((m) d.this.b).f() : null;
                            if (f != null) {
                                d.this.b(f);
                            }
                            if (d.this.b != null && ((m) d.this.b).h() != null && ((m) d.this.b).h().h() != null) {
                                d.a(com.fyber.inneractive.sdk.a.a.a.a.b, ((m) d.this.b).h().h().a() == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.a.a.a.b.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.a.a.a.b.BANNER_DISPLAY);
                            }
                            return d.this.a(p, str, ajVar);
                        }
                        return new u.a(u.c.FAILED, new Exception("No context or no native click detected"), p == null ? "null" : p.getClass().getName());
                    }

                    @Override // com.fyber.inneractive.sdk.m.l
                    public final void b() {
                        d.this.a(new WebViewRendererProcessHasGoneError());
                    }

                    @Override // com.fyber.inneractive.sdk.m.l
                    public final void a(String str, String str2) {
                        IAlog.b("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(d.this));
                        if (d.this.l == null || d.this.l.getContext() == null) {
                            return;
                        }
                        if (d.this.s) {
                            IAlog.b("%sredirect already reported for this ad", IAlog.a(d.this));
                            return;
                        }
                        p.a(d.this.l.getContext(), str, str2, d.this.b);
                        d.B(d.this);
                        IAlog.b("%sreporting auto redirect", IAlog.a(d.this));
                    }

                    @Override // com.fyber.inneractive.sdk.m.l
                    public final void b(boolean z) {
                        IAlog.b("%sweb view callback: onVisibilityChanged: %s", IAlog.a(d.this), Boolean.valueOf(z));
                        if (!z) {
                            if (d.this.v != null) {
                                d.this.v.b();
                            }
                            d.this.b(false);
                        } else if (d.this.k) {
                            if (d.this.v != null) {
                                d.this.v.c();
                            }
                            d.this.k();
                        } else {
                            d.F(d.this);
                            d.this.k = true;
                        }
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final boolean a(String str) {
                        if (d.this.l == null || d.this.l.getContext() == null) {
                            return false;
                        }
                        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(d.this.l.getContext(), str);
                        if (!startRichMediaIntent || d.this.c == null) {
                            return startRichMediaIntent;
                        }
                        d.this.n();
                        return startRichMediaIntent;
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void a() {
                        d.this.n();
                        d.this.o();
                    }

                    @Override // com.fyber.inneractive.sdk.m.d.c
                    public final void a(InneractiveUnitController.AdDisplayError adDisplayError) {
                        if (d.this.c != null) {
                            ((InneractiveAdViewEventsListener) d.this.c).onAdEnteredErrorState(d.this.a, adDisplayError);
                        }
                    }
                };
            }
            this.i.setListener(this.j);
            if (((m) this.b).h() != null && ((m) this.b).h().h() != null && ((m) this.b).h().h().a() != null && ((m) this.b).h().h().a().isFullscreenUnit()) {
                a aVar = new a(this.l.getContext(), 1.5f);
                this.m = aVar;
                this.i.a(aVar, new ViewGroup.LayoutParams(-1, -1));
                this.l.addView(this.m, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.m = new a(this.l.getContext(), 0.0f);
                ak a2 = a(((m) this.b).f().g, ((m) this.b).f().h, ((m) this.b).h());
                this.i.setAdDefaultSize(a2.a, a2.b);
                com.fyber.inneractive.sdk.m.c e = this.i.e();
                if (e == null && l.p() != null) {
                    if (!this.u) {
                        this.u = true;
                        if (!this.i.a(l.p())) {
                            a(a2);
                        }
                    } else {
                        a(a2);
                    }
                } else {
                    ViewParent parent = e != null ? e.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    this.i.a(this.m, new FrameLayout.LayoutParams(a2.a, a2.b, 17));
                    this.l.addView(this.m, new ViewGroup.LayoutParams(-2, -2));
                }
            }
            com.fyber.inneractive.sdk.j.f f = this.b != 0 ? ((m) this.b).f() : null;
            if (f != null) {
                com.fyber.inneractive.sdk.i.b bVar = new com.fyber.inneractive.sdk.i.b(f, this.m, new b.a() { // from class: com.fyber.inneractive.sdk.i.d.1
                    @Override // com.fyber.inneractive.sdk.i.b.a
                    public final void a() {
                        d.a(d.this);
                    }
                });
                this.v = bVar;
                bVar.h = false;
                bVar.d = 1;
                bVar.e = 0.0f;
                if (bVar.b.x > 0) {
                    bVar.d = Math.min(bVar.b.x, 100);
                }
                if (bVar.b.y >= -1.0f) {
                    bVar.e = bVar.b.y;
                }
                if (bVar.e >= 0.0f) {
                    IAlog.b("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    bVar.c = 0.0f;
                    bVar.f = System.currentTimeMillis();
                    bVar.g = true;
                    bVar.d();
                }
            }
        } else {
            IAlog.d("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.b);
        }
        tVar = t.a.a;
        if (tVar.a.contains(this)) {
            return;
        }
        tVar.a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        t tVar;
        j();
        a();
        this.j = null;
        tVar = t.a.a;
        tVar.a.remove(this);
        if (this.p != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.p);
        }
        super.destroy();
    }

    private void a() {
        com.fyber.inneractive.sdk.i.b bVar = this.v;
        if (bVar != null) {
            bVar.a();
        }
        if (this.i != null) {
            j();
            if (this.b != 0) {
                ((m) this.b).b();
            }
            this.i = null;
            this.b = null;
            ViewGroup viewGroup = this.l;
            if (viewGroup != null) {
                viewGroup.removeView(this.m);
            }
        }
        this.s = false;
    }

    private int b() {
        o h;
        int intValue;
        int i = this.q;
        if (i == -1) {
            IAlog.b("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i > 0) {
            IAlog.b("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.q));
            intValue = this.q;
        } else {
            com.fyber.inneractive.sdk.config.u h2 = this.a.getAdContent().h();
            if (h2 != null && (h = h2.h()) != null) {
                Integer b2 = h.b();
                IAlog.b("%sreturning refreshConfig = %d", IAlog.a(this), b2);
                if (b2 != null) {
                    intValue = b2.intValue();
                }
            }
            IAlog.b("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        return intValue * 1000;
    }

    private void a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        if (!TextUtils.isEmpty(this.a.getMediationNameString()) || j == 0 || (this.a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.q == -1 || (iAmraidWebViewController = this.i) == null || iAmraidWebViewController.e() == null) {
            return;
        }
        if (!this.i.e().getIsVisible()) {
            IAlog.b("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.o = System.currentTimeMillis();
        this.n = z ? this.n : j;
        IAlog.b("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j), Long.valueOf(this.n));
        if (j > 1) {
            if (this.p != null) {
                com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.p);
            }
            j();
            this.p = new Runnable() { // from class: com.fyber.inneractive.sdk.i.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.i();
                }
            };
            com.fyber.inneractive.sdk.util.m.a().postDelayed(this.p, j);
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController == null || iAmraidWebViewController.e() == null) {
            return;
        }
        IAlog.b("%srefreshing ad", IAlog.a(this));
        if (!this.i.q() || this.i.r()) {
            this.o = 0L;
            this.h.refreshAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (this.p != null) {
            this.t = z;
            j();
            this.r = this.n - (System.currentTimeMillis() - this.o);
            IAlog.b("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.r), Long.valueOf(this.n));
        }
    }

    private void j() {
        if (this.p != null) {
            IAlog.b("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.p);
            this.p = null;
        }
    }

    public static ak a(int i, int i2, com.fyber.inneractive.sdk.config.u uVar) {
        int a2;
        int a3;
        IAlog.b("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            a2 = l.a(i);
            a3 = l.a(i2);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (uVar != null && uVar.h() != null) {
                unitDisplayType = uVar.h().a();
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                a2 = l.a(b.RECTANGLE_WIDTH.g);
                a3 = l.a(b.RECTANGLE_HEIGHT.g);
            } else if (k.n()) {
                a2 = l.a(b.BANNER_TABLET_WIDTH.g);
                a3 = l.a(b.BANNER_TABLET_HEIGHT.g);
            } else {
                a2 = l.a(b.BANNER_WIDTH.g);
                a3 = l.a(b.BANNER_HEIGHT.g);
            }
        }
        IAlog.a("View layout params: final scaled width and height: %d, %d", Integer.valueOf(a2), Integer.valueOf(a3));
        return new ak(a2, a3);
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(View view) {
        return view.equals(this.l);
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void e() {
        com.fyber.inneractive.sdk.i.b bVar = this.v;
        if (bVar != null) {
            bVar.a();
        }
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController == null || iAmraidWebViewController.e() == null || !this.i.e().getIsVisible() || this.o == 0 || this.i.q() || this.i.r()) {
            return;
        }
        if (!this.t) {
            if (this.n < System.currentTimeMillis() - this.o) {
                this.r = 1L;
            } else {
                this.r = this.n - (System.currentTimeMillis() - this.o);
            }
        }
        IAlog.b("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.r));
        a(this.r, false);
    }

    /* loaded from: classes.dex */
    private static class a extends FrameLayout {
        private final float a;

        public a(Context context, float f) {
            super(context);
            this.a = f;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
                int size = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                float f = this.a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            super.onMeasure(i3, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.q() || this.i.r()) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int g() {
        return this.i.x();
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int h() {
        return this.i.y();
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(int i) {
        this.q = i;
    }

    @Override // com.fyber.inneractive.sdk.d.h
    public final int r() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.e() != null && this.i.q()) {
                return l.a(this.i.e().getWidth());
            }
            return l.a(this.i.x());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.d.h
    public final int s() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.e() != null && this.i.q()) {
                return l.a(this.i.e().getHeight());
            }
            return l.a(this.i.y());
        }
        return -1;
    }

    private void a(ak akVar) {
        FrameLayout frameLayout = new FrameLayout(this.l.getContext());
        frameLayout.setBackgroundResource(R.color.blank_background);
        this.l.removeAllViews();
        this.l.addView(frameLayout, new FrameLayout.LayoutParams(akVar.a, akVar.b, 17));
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void c() {
        t tVar;
        IAlog.b("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController == null || iAmraidWebViewController.e() == null) {
            return;
        }
        if (this.i.e().getIsVisible()) {
            tVar = t.a.a;
            if (!tVar.b && !this.i.q() && !this.i.r()) {
                IAlog.b("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
                long b2 = b();
                this.n = b2;
                if (b2 != 0) {
                    a(WorkRequest.MIN_BACKOFF_MILLIS, false);
                    return;
                }
                return;
            }
        }
        IAlog.b("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
        this.r = 1L;
    }

    @Override // com.fyber.inneractive.sdk.util.t.b
    public final void a(boolean z) {
        IAlog.b("%sgot onLockScreenStateChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        if (z) {
            b(false);
            com.fyber.inneractive.sdk.i.b bVar = this.v;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        k();
        com.fyber.inneractive.sdk.i.b bVar2 = this.v;
        if (bVar2 != null) {
            bVar2.c();
        }
    }

    static /* synthetic */ void a(d dVar) {
        String str;
        try {
            if (dVar.b == 0 || ((m) dVar.b).f() == null || (str = ((m) dVar.b).f().z) == null || str.trim().length() <= 0) {
                return;
            }
            IAlog.a("%sfiring banner mrc visibility impression!", IAlog.a(dVar));
            IAlog.a(IAlog.b, "MRC_VISIBILITY_IMPRESSION", new Object[0]);
            dVar.b(str);
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void F(d dVar) {
        IAlog.b("%sonShownForTheFirstTime called", IAlog.a(dVar));
        com.fyber.inneractive.sdk.j.f f = dVar.b != 0 ? ((m) dVar.b).f() : null;
        if (f != null) {
            IAmraidWebViewController iAmraidWebViewController = dVar.i;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.b();
            }
            dVar.a(f);
        }
        long b2 = dVar.b();
        dVar.n = b2;
        if (b2 != 0) {
            dVar.a(b2, true);
        }
        if (dVar.b != 0 && ((m) dVar.b).h() != null && ((m) dVar.b).h().h() != null) {
            a(com.fyber.inneractive.sdk.a.a.a.a.a, ((m) dVar.b).h().h().a() == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.a.a.a.b.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.a.a.a.b.BANNER_DISPLAY);
        }
        dVar.m();
    }
}

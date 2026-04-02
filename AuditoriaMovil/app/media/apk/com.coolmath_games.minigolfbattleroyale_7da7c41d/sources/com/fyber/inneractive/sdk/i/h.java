package com.fyber.inneractive.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.a.f;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.d.l;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.h.p;
import com.fyber.inneractive.sdk.player.b;
import com.fyber.inneractive.sdk.player.b.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.u;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class h extends l<q, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.e.c, j {
    c.a l;
    com.fyber.inneractive.sdk.player.e.e m;
    com.fyber.inneractive.sdk.player.b.b n;
    WeakReference<InneractiveFullscreenVideoContentController> o;
    private c.b s;
    private i u;
    private boolean q = false;
    private boolean r = false;
    private UnitDisplayType t = UnitDisplayType.INTERSTITIAL;
    private final b.a v = new b.a() { // from class: com.fyber.inneractive.sdk.i.h.1
        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a() {
            h.this.n.a(false);
            h.this.n.d();
        }

        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                h.this.n.a(bitmap);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a(com.fyber.inneractive.sdk.player.b bVar) {
            if (h.this.n != null) {
                h.this.n.a();
            }
            if (h.this.b != null) {
                ((q) h.this.b).b();
            }
            if (bVar != null) {
                bVar.a();
            }
            h.this.c_();
        }
    };
    private final RelativeLayout.LayoutParams w = new RelativeLayout.LayoutParams(-1, -1);
    boolean p = false;
    private boolean x = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean a(q qVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean b(q qVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean h() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* synthetic */ boolean c(q qVar) {
        com.fyber.inneractive.sdk.g.a.a aVar;
        boolean a;
        q qVar2 = qVar;
        if (IAConfigManager.c().a.a(IAConfigManager.k()).a.containsKey("endcard") || qVar2.f() == null || (aVar = qVar2.f().E) == null || aVar.g == null || aVar.g.a != com.fyber.inneractive.sdk.g.a.g.Static) {
            return false;
        }
        com.fyber.inneractive.sdk.config.a.a.f fVar = (com.fyber.inneractive.sdk.config.a.a.f) qVar2.i().a(com.fyber.inneractive.sdk.config.a.a.f.class);
        int i = f.AnonymousClass1.a[this.t.ordinal()];
        if (i == 1) {
            a = fVar.a("countdown_rv", false);
        } else if (i != 2) {
            return false;
        } else {
            a = fVar.a("countdown_iv", false);
        }
        return a;
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.a(aVar, activity);
        this.l = aVar;
        this.q = false;
        this.r = false;
        this.x = false;
        InneractiveUnitController selectedUnitController = this.a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (!(selectedUnitController instanceof InneractiveFullscreenUnitController)) {
                IAlog.d("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.a(this));
            } else {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.o = new WeakReference<>((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.d("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            }
        }
        u h = this.a.getAdContent().h();
        if (h != null && h.g() != null) {
            this.t = h.g().h();
        }
        com.fyber.inneractive.sdk.player.g gVar = ((q) this.b).a;
        Context context = this.l.getLayout().getContext();
        if (gVar != null) {
            if (!(gVar.d != null && gVar.d.b())) {
                IAlog.d("%sFull screen video ad renderer is not valid.", IAlog.a(this));
                throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            i a = gVar.a(true);
            this.u = a;
            this.m = a.a(context);
            com.fyber.inneractive.sdk.player.b.b a2 = this.u.a(this.a, (q) this.b);
            this.n = a2;
            a2.a(this.u.a());
            this.n.a((com.fyber.inneractive.sdk.player.b.b) this);
            this.m.c();
            this.w.addRule(13);
            this.l.getLayout().addView((View) this.m, this.w);
            this.u.a(this.v);
            this.q = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void a(c.b bVar) {
        this.s = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void b() {
        IAConfigManager.n().a(this.t == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.a.a.a.b.REWARDED_VIDEO, com.fyber.inneractive.sdk.a.a.a.a.a);
        m();
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final u.a a(aj ajVar) {
        y();
        return a(this.m.getContext() == null ? com.fyber.inneractive.sdk.util.l.p() : this.m.getContext(), ((q) this.b).c(), ajVar);
    }

    private void y() {
        if (this.b == 0 || ((q) this.b).h() == null || ((q) this.b).h().h() == null) {
            return;
        }
        IAConfigManager.n().a(((q) this.b).h().h().a() == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.a.a.a.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.a.a.a.a.b);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void p() {
        this.p = true;
        if (this.k != null) {
            this.k.cancel();
            this.k = null;
        }
        c.a aVar = this.l;
        if (aVar == null || !aVar.isCloseButtonDisplay()) {
            return;
        }
        a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(boolean z, Orientation orientation) {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(String str, String str2) {
        IAlog.b(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        c.a aVar = this.l;
        if (aVar == null || aVar.getLayout() == null || this.l.getLayout().getContext() == null) {
            return;
        }
        if (!this.x) {
            p.a(this.l.getLayout().getContext(), str, str2, this.b);
            this.x = true;
            IAlog.b(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.b(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void c() {
        com.fyber.inneractive.sdk.g.a.b bVar;
        if (this.b == 0 || ((q) this.b).g() == null || ((q) this.b).f() == null) {
            return;
        }
        String str = null;
        y();
        com.fyber.inneractive.sdk.g.a.a aVar = ((q) this.b).f().E;
        if (aVar != null && (bVar = aVar.g) != null && bVar.b != null) {
            str = bVar.b.toString();
        }
        a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final u.a a(String str, aj ajVar) {
        if (this.b != 0 && ((q) this.b).f() != null && ((q) this.b).f() != null) {
            com.fyber.inneractive.sdk.g.a.a aVar = ((q) this.b).f().E;
            y();
            if (aVar != null) {
                com.fyber.inneractive.sdk.g.a.b bVar = aVar.g;
                String str2 = null;
                if (bVar != null && bVar.b != null) {
                    str2 = bVar.b.toString();
                }
                a(str2);
                u.a a = a(this.m.getContext() == null ? com.fyber.inneractive.sdk.util.l.p() : this.m.getContext(), str, ajVar);
                if (bVar != null && a.a != u.c.FAILED) {
                    ((q) this.b).a("EVENT_TRACKING", r.EVENT_CLICK.toString());
                }
                return a;
            }
        }
        return new u.a(u.c.FAILED, new Exception("Internal SDK Error"), "null");
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void d() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.o);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void l() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.o);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        IAConfigManager.n().a(this.t == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.a.a.a.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.a.a.a.a.c);
        if (this.t == UnitDisplayType.REWARDED) {
            c.b bVar = this.s;
            if (bVar != null) {
                bVar.a();
            }
            g_();
        }
        if (((q) this.b).a != null) {
            u();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a_(boolean z) {
        c.a aVar;
        if (((q) this.b).a != null) {
            ((q) this.b).a.a("TRACKING_COMPLETED", new String[0]);
            u();
            ((q) this.b).a("TRACKING_COMPLETED", new String[0]);
            if (IAConfigManager.c().a.b("endcard").b("dsos") && z && (aVar = this.l) != null) {
                aVar.dismissAd(true);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void c_() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.o);
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        n();
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void d_() {
        n();
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void e_() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void j() {
        z();
        if (this.a == null || !(this.a instanceof com.fyber.inneractive.sdk.d.j)) {
            return;
        }
        ((com.fyber.inneractive.sdk.d.j) this.a).a();
    }

    private void z() {
        if (this.r || this.c == 0) {
            return;
        }
        this.r = true;
        c.a aVar = this.l;
        if (aVar != null && aVar.wasDismissedByUser()) {
            a(r.EVENT_CLOSE);
            a(r.EVENT_CLOSE_LINEAR);
        }
        ((InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.a);
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.q) {
            z();
        }
        com.fyber.inneractive.sdk.player.b.b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            this.n = null;
        }
        com.fyber.inneractive.sdk.player.e.e eVar = this.m;
        if (eVar != null) {
            eVar.a();
            this.m = null;
        }
        this.l = null;
        this.o = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final boolean i() {
        if (this.b == 0 || ((q) this.b).a == null || this.n == null || this.l == null || this.m == null) {
            return false;
        }
        com.fyber.inneractive.sdk.player.g gVar = ((q) this.b).a;
        gVar.d.a(this, this.n, this.m, this.l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean e() {
        com.fyber.inneractive.sdk.player.e.e eVar = this.m;
        return eVar != null && eVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long f() {
        com.fyber.inneractive.sdk.g.a.a aVar;
        com.fyber.inneractive.sdk.config.g b = IAConfigManager.c().a.b("endcard");
        if (b.a("endcard_cr") || b.a("endcard_ci")) {
            long d = b.d(this.t != UnitDisplayType.REWARDED ? "endcard_ci" : "endcard_cr");
            if (d < 0 || d > 5) {
                return 3000L;
            }
            return d * 1000;
        }
        long j = 3;
        try {
            j = Long.parseLong(IAConfigManager.c().a.a("vast_endcard_x_delay", Long.toString(3L)));
        } catch (Throwable unused) {
        }
        if (this.b != 0 && ((q) this.b).f() != null && (aVar = ((q) this.b).f().E) != null && aVar.g != null && aVar.g.a == com.fyber.inneractive.sdk.g.a.g.Static) {
            com.fyber.inneractive.sdk.config.a.a.f fVar = (com.fyber.inneractive.sdk.config.a.a.f) ((q) this.b).i().a(com.fyber.inneractive.sdk.config.a.a.f.class);
            int i = f.AnonymousClass1.a[this.t.ordinal()];
            int i2 = 3;
            if (i == 1) {
                i2 = fVar.a("endcard_x_btn_delay_rv", 3);
            } else if (i == 2) {
                i2 = fVar.a("endcard_x_btn_delay_iv", 3);
            }
            j = i2;
        }
        return j * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long a(long j) {
        long j2 = 12;
        try {
            j2 = Long.parseLong(IAConfigManager.c().a.a("vast_endcard_x_fallback_delay", Long.toString(12L)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean g() {
        return this.p;
    }

    private void a(r rVar) {
        if (this.b == 0 || ((q) this.b).a == null) {
            return;
        }
        ((q) this.b).a("EVENT_TRACKING", rVar.w);
    }

    public final boolean a() {
        return ((l) this).i;
    }
}

package com.fyber.inneractive.sdk.i;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.h.p;
import com.fyber.inneractive.sdk.player.b;
import com.fyber.inneractive.sdk.player.b.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.u;
import com.fyber.inneractive.sdk.util.w;
import com.google.android.gms.drive.DriveFile;
/* loaded from: classes.dex */
public final class e extends com.fyber.inneractive.sdk.d.h<q, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.e.b, InneractiveNativeVideoContentController.Renderer, w.b {
    FrameLayout h;
    com.fyber.inneractive.sdk.player.e.e i;
    com.fyber.inneractive.sdk.player.b.i j;
    VideoContentListener k;
    ViewGroup l;
    Runnable m;
    private i o;
    private final b.a n = new b.a() { // from class: com.fyber.inneractive.sdk.i.e.1
        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a() {
            if (e.this.j != null) {
                e.this.j.a(false);
                e.this.j.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a(Bitmap bitmap) {
            if (bitmap == null || e.this.j == null) {
                return;
            }
            e.this.j.a(bitmap);
        }

        @Override // com.fyber.inneractive.sdk.player.b.a
        public final void a(com.fyber.inneractive.sdk.player.b bVar) {
            if (e.this.k == null || e.this.i == null || !e.this.i.b()) {
                return;
            }
            e.this.k.onPlayerError();
        }
    };
    private float p = 0.0f;
    private Rect q = new Rect();
    private boolean r = false;
    private boolean s = false;
    private final i.a t = new i.a() { // from class: com.fyber.inneractive.sdk.i.e.3
        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void a(boolean z, Orientation orientation) {
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void a_(boolean z) {
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void d() {
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void p() {
        }

        @Override // com.fyber.inneractive.sdk.player.b.i.a
        public final void a() {
            if (e.this.c != null) {
                ((InneractiveAdViewEventsListener) e.this.c).onAdExpanded(e.this.a);
            }
            if (e.this.l == null || e.this.l.getContext() == null || !(com.fyber.inneractive.sdk.c.a.a(e.this.b) instanceof com.fyber.inneractive.sdk.b.c)) {
                return;
            }
            Context context = e.this.l.getContext();
            InneractiveAdSpot inneractiveAdSpot = e.this.a;
            Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
            intent.putExtra(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, inneractiveAdSpot.getLocalUniqueId());
            if (!(context instanceof Activity)) {
                intent.setFlags(DriveFile.MODE_READ_ONLY);
            }
            try {
                IAlog.b("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a((Object) context), inneractiveAdSpot.getLocalUniqueId());
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a((Object) context));
            }
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void a(String str, String str2) {
            IAlog.b("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(e.this));
            if (e.this.l == null || e.this.l.getContext() == null) {
                return;
            }
            if (e.this.s) {
                IAlog.b("%s redirect already reported for this ad", IAlog.a(e.this));
                return;
            }
            p.a(e.this.l.getContext(), str, str2, e.this.b);
            e.k(e.this);
            IAlog.b("%s reporting auto redirect", IAlog.a(e.this));
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void a(View view, String str) {
            if (view == null || view.getContext() == null) {
                return;
            }
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            e.this.n();
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void b() {
            if (((q) e.this.b).b) {
                return;
            }
            ((q) e.this.b).b = true;
            e.this.m();
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final u.a a(aj ajVar) {
            e eVar = e.this;
            return eVar.a(eVar.i.getContext() == null ? l.p() : e.this.i.getContext(), ((q) e.this.b).c(), ajVar);
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void c() {
            com.fyber.inneractive.sdk.g.a.b bVar;
            if (e.this.b == null || ((q) e.this.b).g() == null || ((q) e.this.b).f() == null) {
                return;
            }
            String str = null;
            com.fyber.inneractive.sdk.g.a.a aVar = ((q) e.this.b).f().E;
            if (aVar != null && (bVar = aVar.g) != null && bVar.b != null) {
                str = bVar.b.toString();
            }
            e.this.a(str);
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final u.a a(String str, aj ajVar) {
            com.fyber.inneractive.sdk.g.a.b bVar;
            if (e.this.b != null && ((q) e.this.b).g() != null && ((q) e.this.b).f() != null) {
                String str2 = null;
                com.fyber.inneractive.sdk.g.a.a aVar = ((q) e.this.b).f().E;
                if (aVar != null && (bVar = aVar.g) != null && bVar.b != null) {
                    str2 = bVar.b.toString();
                }
                e.this.a(str2);
            }
            Context p = l.p();
            if (e.this.l != null && e.this.l.getContext() != null) {
                p = e.this.l.getContext();
            }
            if (TextUtils.isEmpty(str)) {
                str = ((q) e.this.b).e();
            }
            return e.this.a(p, str, ajVar);
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void a(int i, int i2) {
            if (e.this.k == null || e.this.i == null || !e.this.i.b()) {
                return;
            }
            e.this.k.onProgress(i, i2);
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void l() {
            if (e.this.k == null || e.this.i == null || !e.this.i.b()) {
                return;
            }
            e.this.k.onCompleted();
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void c_() {
            if (e.this.k == null || e.this.i == null || !e.this.i.b()) {
                return;
            }
            e.this.k.onPlayerError();
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void d_() {
            if (e.this.c != null) {
                e.this.n();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.b.j
        public final void e_() {
            e.this.a(new WebViewRendererProcessHasGoneError());
        }
    };

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int h() {
        return 0;
    }

    static /* synthetic */ boolean a(e eVar) {
        eVar.r = true;
        return true;
    }

    static /* synthetic */ boolean k(e eVar) {
        eVar.s = true;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(com.fyber.inneractive.sdk.d.g gVar) {
        return gVar instanceof q;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(ViewGroup viewGroup) {
        if (this.a == null) {
            IAlog.d("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.l = viewGroup;
        InneractiveUnitController selectedUnitController = this.a.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.d("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.k = ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.d("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.s = false;
        this.h = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.player.g gVar = ((q) this.b).a;
        Context context = viewGroup.getContext();
        if (gVar != null) {
            i a = gVar.a(false);
            this.o = a;
            this.i = a.a(context);
            this.j = (com.fyber.inneractive.sdk.player.b.i) this.o.a(this.a, (q) this.b);
            this.l.addView(this.h, new ViewGroup.LayoutParams(-1, -2));
            this.l.setLayoutTransition(null);
            this.h.addView((View) this.i, new FrameLayout.LayoutParams(-2, -2, 17));
            this.j.a((com.fyber.inneractive.sdk.player.b.i) this.t);
            this.j.a(this.o.a());
            this.o.a(this.n);
            if (this.o instanceof a) {
                com.fyber.inneractive.sdk.player.d dVar = (com.fyber.inneractive.sdk.player.d) gVar.d;
                Bitmap bitmap = dVar.g;
                if (bitmap != null) {
                    this.j.a(bitmap);
                }
                dVar.c();
            }
            w a2 = w.a();
            ViewGroup viewGroup2 = this.l;
            a2.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        e();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.player.b.i iVar = this.j;
        if (iVar != null) {
            iVar.b(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.player.b.i iVar = this.j;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.util.w.b
    public final void a(float f, Rect rect) {
        if (this.p == f && this.q.equals(rect)) {
            return;
        }
        this.p = f;
        this.q.set(rect);
        this.r = false;
        com.fyber.inneractive.sdk.player.b.i iVar = this.j;
        if (iVar != null) {
            iVar.g(false);
            this.i.c();
            this.j.a(f);
        }
        if (f <= 0.0f) {
            a();
            return;
        }
        a();
        Runnable runnable = new Runnable() { // from class: com.fyber.inneractive.sdk.i.e.2
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.m != null) {
                    e.a(e.this);
                    IAlog.b("%sIdle state reached!", IAlog.a(e.this));
                    if (e.this.j != null) {
                        e.this.j.g(true);
                    }
                    e.this.m = null;
                }
            }
        };
        this.m = runnable;
        this.l.postDelayed(runnable, 100L);
    }

    private void a() {
        ViewGroup viewGroup;
        Runnable runnable = this.m;
        if (runnable == null || (viewGroup = this.l) == null) {
            return;
        }
        viewGroup.removeCallbacks(runnable);
        this.m = null;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void e() {
        a();
        w.a().a(this.l);
        IAlog.b("%sunbind called. root is %s", IAlog.a(this), this.l);
        if (this.j != null) {
            IAlog.b("%sdestroying video ui controller", IAlog.a(this));
            this.j.a((com.fyber.inneractive.sdk.player.b.i) null);
            this.j.a();
            this.j = null;
        }
        if (this.i != null) {
            this.l.setLayoutTransition(null);
            this.l.removeView(this.h);
            this.i.a();
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(View view) {
        return view.equals(this.l);
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void d() {
        com.fyber.inneractive.sdk.player.b.i iVar = this.j;
        if (iVar != null) {
            iVar.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void f() {
        com.fyber.inneractive.sdk.player.b.i iVar = this.j;
        if (iVar != null) {
            iVar.s();
        }
    }
}

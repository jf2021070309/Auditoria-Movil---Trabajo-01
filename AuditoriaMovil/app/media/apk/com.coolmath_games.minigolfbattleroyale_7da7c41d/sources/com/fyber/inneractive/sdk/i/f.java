package com.fyber.inneractive.sdk.i;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.d.l;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.h.p;
import com.fyber.inneractive.sdk.player.b.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.u;
/* loaded from: classes.dex */
public final class f extends l<q, InneractiveNativeAdEventsListener> implements com.fyber.inneractive.sdk.e.c, j {
    c.a l;
    com.fyber.inneractive.sdk.player.e.e m;
    com.fyber.inneractive.sdk.player.b.b n;
    VideoContentListener o;
    InneractiveAdViewUnitController p;
    private boolean q = false;
    private boolean r = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void a(c.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(boolean z, Orientation orientation) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean a(q qVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a_(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean b(q qVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean c(q qVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long f() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean g() {
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

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void w() {
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void x() {
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final u.a a(aj ajVar) {
        a();
        return a(this.m.getContext() == null ? com.fyber.inneractive.sdk.util.l.p() : this.m.getContext(), ((q) this.b).c(), ajVar);
    }

    private void a() {
        if (this.b == 0 || ((q) this.b).h() == null || ((q) this.b).h().h() == null) {
            return;
        }
        IAConfigManager.n().a(((q) this.b).h().h().a() == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.a.a.a.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.a.a.a.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.a.a.a.a.b);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void a(String str, String str2) {
        IAlog.b(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        c.a aVar = this.l;
        if (aVar == null || aVar.getLayout() == null || this.l.getLayout().getContext() == null) {
            return;
        }
        if (!this.r) {
            p.a(this.l.getLayout().getContext(), str, str2, this.b);
            this.r = true;
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
        com.fyber.inneractive.sdk.g.a.a aVar = ((q) this.b).f().E;
        if (aVar != null && (bVar = aVar.g) != null && bVar.b != null) {
            str = bVar.b.toString();
        }
        a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final u.a a(String str, aj ajVar) {
        com.fyber.inneractive.sdk.g.a.b bVar;
        if (this.b != 0 && ((q) this.b).g() != null && ((q) this.b).f() != null) {
            a();
            String str2 = null;
            com.fyber.inneractive.sdk.g.a.a aVar = ((q) this.b).f().E;
            if (aVar != null && (bVar = aVar.g) != null && bVar.b != null) {
                str2 = bVar.b.toString();
            }
            a(str2);
        }
        return a(this.m.getContext() == null ? com.fyber.inneractive.sdk.util.l.p() : this.m.getContext(), str, ajVar);
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
        VideoContentListener videoContentListener = this.o;
        if (videoContentListener != null) {
            videoContentListener.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void l() {
        VideoContentListener videoContentListener = this.o;
        if (videoContentListener != null) {
            videoContentListener.onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void c_() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        VideoContentListener videoContentListener = this.o;
        if (videoContentListener != null) {
            videoContentListener.onPlayerError();
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
        c.a aVar;
        this.q = true;
        if (this.b != 0 && ((q) this.b).a != null && (aVar = this.l) != null && aVar.wasDismissedByUser()) {
            r rVar = r.EVENT_COLLAPSE;
            if (this.b != 0) {
                ((q) this.b).a("EVENT_TRACKING", rVar.toString());
            }
        }
        com.fyber.inneractive.sdk.player.b.b bVar = this.n;
        if (bVar != null) {
            bVar.b(false);
            this.n.a();
        }
        if (this.p != null) {
            IAlog.b("%sunbinding native full screen ad renderer", IAlog.a(this));
            this.p.unbindFullscreenRenderer(this);
            return;
        }
        IAlog.b("%sunit controller is null!", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (!this.q) {
            j();
        }
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
            this.l = null;
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
        this.o = null;
        this.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final boolean i() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.dismissAd(true);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean e() {
        com.fyber.inneractive.sdk.player.e.e eVar = this.m;
        return eVar != null && eVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.b.j
    public final void p() {
        IAlog.b("%snShownCloseButton", IAlog.a(this));
    }
}

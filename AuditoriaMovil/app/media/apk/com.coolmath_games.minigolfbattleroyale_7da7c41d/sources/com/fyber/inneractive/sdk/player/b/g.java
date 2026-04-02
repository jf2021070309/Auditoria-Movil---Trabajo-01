package com.fyber.inneractive.sdk.player.b;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.player.b.i;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
/* loaded from: classes.dex */
public final class g extends h<i.a> implements i {
    Runnable a;
    boolean b;
    boolean c;
    private float t;
    private float u;
    private boolean v;

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.b.b
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final boolean f() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final int g() {
        return 0;
    }

    public g(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.e.g gVar, t tVar, s sVar, boolean z) {
        super(bVar, gVar, tVar, sVar, z);
        this.u = 0.0f;
        this.b = false;
        this.c = false;
        this.v = false;
        this.t = this.e.e().b.intValue() / 100.0f;
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final boolean e() {
        if (super.e()) {
            if (this.d != null && this.d.f() != null) {
                IAlog.b("%sconnectToTextureView playing state = %s", IAlog.a(this), this.d.f().p());
                if (this.d.f().m()) {
                    this.g.f(!this.d.d());
                    this.g.b(false, false);
                    this.g.a(false);
                    B();
                }
            }
            a(this.u);
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.b.b
    public final void a(boolean z) {
        if (this.d != null && this.d.f() != null && !this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            z();
        }
        Bitmap bitmap = this.d != null ? this.d.g : null;
        if (bitmap != null) {
            this.g.a(true);
            this.g.setLastFrameBitmap(bitmap);
        }
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.e.f
    public final void e(boolean z) {
        if (z) {
            a(this.u);
        }
        super.e(z);
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.e.f
    public final void o() {
        super.o();
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void b(int i) {
        if (this.d == null || this.d.f() == null || this.d.f().p() == com.fyber.inneractive.sdk.player.enums.b.Playing || this.a != null) {
            return;
        }
        IAlog.b("%splayVideo %s", IAlog.a(this), this.g);
        if (i == 0) {
            f(false);
            return;
        }
        this.a = new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.this.f(false);
                g.this.a = null;
            }
        };
        this.g.postDelayed(this.a, i);
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.b.b
    public final void b() {
        y();
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.b.b
    public final void a() {
        y();
        this.j = null;
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final int i() {
        return IAConfigManager.c().a.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    private void y() {
        if (this.a != null) {
            IAlog.b("%sCancelling play runnable", IAlog.a(this));
            this.g.removeCallbacks(this.a);
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void k() {
        super.k();
        z();
        this.g.a(false);
        this.b = true;
    }

    private void z() {
        if (this.e.g().g() != TapAction.FULLSCREEN) {
            com.fyber.inneractive.sdk.player.e.g gVar = this.g;
            if (gVar.t != null) {
                gVar.t.setVisibility(0);
                gVar.t.setSelected(false);
            }
        }
        this.g.a(true, ((com.fyber.inneractive.sdk.config.a.a.f) this.f.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("cta_text_all_caps", false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void p() {
        super.p();
        y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void h() {
        if (this.d == null || this.d.f() == null) {
            return;
        }
        e();
        f(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void q() {
        y();
        super.q();
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void a(aj ajVar) {
        TapAction g = this.e.g().g();
        if (this.d == null || this.d.f() == null || this.u >= this.t) {
            if (g != TapAction.CTR) {
                if (g == TapAction.FULLSCREEN) {
                    A();
                    return;
                } else if (g == TapAction.DO_NOTHING) {
                    if (this.d != null) {
                        this.d.e();
                        return;
                    }
                    return;
                } else {
                    IAlog.b("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), g);
                    return;
                }
            }
            Bitmap b = b(false);
            if (!super.a(false, VideoClickOrigin.CTA, ajVar) || b == null) {
                return;
            }
            this.g.setLastFrameBitmap(b);
            this.g.a(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void m() {
        A();
    }

    private void A() {
        if (this.j == 0 || this.v) {
            return;
        }
        q();
        ((i.a) this.j).a();
        IAlog.b("%sopening fullscreen", IAlog.a(this));
        this.v = true;
        if (this.d != null) {
            this.d.a(VideoClickOrigin.InvalidOrigin, r.EVENT_FULLSCREEN, r.EVENT_EXPAND);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.i
    public final void a(float f) {
        this.u = f;
        if (IAlog.a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f), Float.valueOf(this.t), Float.valueOf(1.0f - this.t));
        }
        if (this.d == null || this.d.f() == null) {
            return;
        }
        if (this.d.f().p() == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            if (f <= this.t) {
                IAlog.a("%sonVisibilityChanged pausing player", IAlog.a(this));
                if (this.d.f().m != null) {
                    this.b = false;
                    b(false);
                    b();
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void r() {
        super.r();
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void f(boolean z) {
        if (this.d == null || this.d.f() == null) {
            return;
        }
        B();
        super.f(z);
    }

    private void B() {
        if (this.d == null || this.d.f() == null || this.d.f().q()) {
            return;
        }
        if (this.e.g().b().booleanValue()) {
            this.d.f().a(false);
        } else if (v()) {
        } else {
            this.d.f().b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.i
    public final void g(boolean z) {
        this.c = z;
        if (!z || this.d == null || this.d.f() == null || this.d.f().m != null || !this.g.b() || this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            return;
        }
        e();
        a(this.u);
    }

    private void C() {
        if (this.u < this.t || this.d == null || this.d.f() == null || this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || this.g == null || this.g.e() || this.d.f().m == null) {
            return;
        }
        if (this.e.g().a().booleanValue() || this.b) {
            b(IAConfigManager.n.h.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void j() {
        IAlog.b("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (this.g.b()) {
            this.q = true;
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.i
    public final void s() {
        IAlog.b("%sfullscreenExited called", IAlog.a(this));
        this.v = false;
        g(this.c);
        if (this.d == null || this.d.f() == null) {
            return;
        }
        a(this.d.f().p());
        a(this.d.f().g());
    }
}

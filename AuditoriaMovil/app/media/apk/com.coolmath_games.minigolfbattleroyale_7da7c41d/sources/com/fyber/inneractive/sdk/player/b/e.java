package com.fyber.inneractive.sdk.player.b;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.a.f;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
/* loaded from: classes.dex */
public final class e extends h<j> {
    private boolean a;
    private boolean b;
    private boolean c;

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void b(int i) {
    }

    public e(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.e.b bVar2, u uVar, s sVar, boolean z, Skip skip, boolean z2) {
        super(bVar, bVar2, uVar, sVar, z, skip);
        this.a = false;
        this.b = false;
        this.a = false;
        this.c = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.b.b
    public final void a(boolean z) {
        super.a(z);
        if (this.a) {
            this.g.g();
            this.g.e(false);
            this.i = 0;
        }
        boolean z2 = true;
        this.g.a(true, ((com.fyber.inneractive.sdk.config.a.a.f) this.f.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("cta_text_all_caps", false));
        if (this.d == null || this.d.f() == null || (this.d.f().p() != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.d.f().p() != com.fyber.inneractive.sdk.player.enums.b.Prepared)) {
            z2 = false;
        }
        this.g.a(z2);
        this.g.f(false);
        this.g.b(false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // com.fyber.inneractive.sdk.player.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r7 = this;
            boolean r0 = super.e()
            r1 = 0
            if (r0 == 0) goto L86
            com.fyber.inneractive.sdk.player.b r0 = r7.d
            r2 = 1
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.player.b r0 = r7.d
            com.fyber.inneractive.sdk.player.b.f r0 = r0.f()
            if (r0 == 0) goto L82
            boolean r0 = r7.b
            if (r0 == 0) goto L1a
            goto L82
        L1a:
            r0 = 2
            com.fyber.inneractive.sdk.player.e.g r3 = r7.g     // Catch: java.lang.Throwable -> L32
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L32
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch: java.lang.Throwable -> L32
            int r4 = r3.getRingerMode()     // Catch: java.lang.Throwable -> L32
            int r3 = r3.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L33
            goto L34
        L32:
            r4 = r1
        L33:
            r3 = r1
        L34:
            boolean r5 = r7.a
            if (r5 != 0) goto L4a
            com.fyber.inneractive.sdk.config.u r5 = r7.e
            com.fyber.inneractive.sdk.config.w r5 = r5.g()
            java.lang.Boolean r5 = r5.b()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4a
            r5 = r2
            goto L4b
        L4a:
            r5 = r1
        L4b:
            if (r5 != 0) goto L7a
            boolean r5 = r7.c
            if (r5 == 0) goto L61
            com.fyber.inneractive.sdk.config.u r5 = r7.e
            com.fyber.inneractive.sdk.config.w r5 = r5.g()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.h()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L61
            r5 = r2
            goto L62
        L61:
            r5 = r1
        L62:
            if (r5 == 0) goto L65
            goto L7a
        L65:
            if (r3 <= 0) goto L7d
            if (r4 != r0) goto L7d
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.a(r7)
            r0[r1] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.b(r3, r0)
            r7.i(r1)
            goto L7d
        L7a:
            r7.h(r1)
        L7d:
            r7.w()
            r7.b = r2
        L82:
            r7.f(r1)
            return r2
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.b.e.e():boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final boolean f() {
        return !this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final int g() {
        com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.c().a;
        u uVar = this.e;
        Skip skip = this.s;
        int c = iVar.b("vast_configuration").c("skip_d");
        if (c >= 0) {
            return c;
        }
        if (skip == null) {
            skip = uVar.g().f();
        }
        if (skip == Skip.DEFAULT) {
            return 99999;
        }
        return skip.value().intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void h() {
        super.h();
        this.g.a(true, ((com.fyber.inneractive.sdk.config.a.a.f) this.f.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("cta_text_all_caps", false));
        x();
        e();
        f(true);
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final int i() {
        return IAConfigManager.c().a.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void j() {
        this.q = true;
        IAlog.b("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        d(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void k() {
        super.k();
        this.g.a(false);
        if (this.a) {
            this.g.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.e.f
    public final void l() {
        super.l();
        if (this.k) {
            u();
        } else {
            e();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.h, com.fyber.inneractive.sdk.player.e.f
    public final void e(boolean z) {
        if (z && this.d != null && this.d.f() != null && !this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed) && !this.g.e()) {
            f(false);
        }
        super.e(z);
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void a(aj ajVar) {
        TapAction g = this.e.g().g();
        if (g == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, ajVar);
        } else if (g == TapAction.FULLSCREEN || g == TapAction.DO_NOTHING) {
            if (f.a.a(((com.fyber.inneractive.sdk.config.a.a.f) this.f.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("click_action", com.fyber.inneractive.sdk.config.a.a.f.e.c)).equals(f.a.OPEN)) {
                a(false, VideoClickOrigin.VIDEO, ajVar);
            }
        } else {
            IAlog.b("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), g);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.h
    protected final void m() {
        if (this.j != 0) {
            this.j.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b.h
    public final void n() {
        super.n();
        if (this.d == null || this.d.f() == null || !this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || !this.a) {
            return;
        }
        this.g.g();
    }
}

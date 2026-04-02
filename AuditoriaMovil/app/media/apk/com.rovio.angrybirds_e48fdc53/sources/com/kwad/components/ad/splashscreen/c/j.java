package com.kwad.components.ad.splashscreen.c;

import android.os.SystemClock;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class j extends e {
    private com.kwad.components.core.n.a.c.b Dg;
    private long Dh;
    private volatile boolean Di = false;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.splashscreen.c.j.1
        @Override // com.kwad.components.core.webview.b.e.e
        public final void a(String str, long j, long j2, long j3) {
            if (com.kwad.components.core.webview.b.j.b("ksad-splash-play-card", j.this.CS.mAdTemplate).equals(str)) {
                com.kwad.components.ad.splashscreen.monitor.a.kP();
                com.kwad.components.ad.splashscreen.monitor.a.a(j.this.CS.mAdTemplate, j.this.CS.Ci, j.this.CS.Cq, j.this.CS.Cs, j.this.CS.Cr, j.this.CS.Ct, j, j2, j3, SystemClock.elapsedRealtime() - j.this.Dh);
                j.this.CS.Cu = j;
                j.this.CS.Cv = j2;
                j.this.CS.Cw = j3;
                bj.b(j.this.Dj);
            }
        }

        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            j.this.CS.Co = true;
            if (com.kwad.components.core.webview.b.j.b("ksad-splash-play-card", j.this.CS.mAdTemplate).equals(str)) {
                j.this.ll();
            }
        }
    };
    private final Runnable Dj = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.j.2
        @Override // java.lang.Runnable
        public final void run() {
            if (!j.this.Di) {
                j.this.lk();
                return;
            }
            j.this.CS.Co = true;
            j.this.ll();
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.c(j.this.CS.mAdTemplate, j.this.CS.Ci);
        }
    };
    private com.kwad.components.core.n.a.c.a Dk = new com.kwad.components.core.n.a.c.a() { // from class: com.kwad.components.ad.splashscreen.c.j.3
        @Override // com.kwad.components.core.n.a.c.a
        public final void a(int i, int i2, long j, long j2) {
            j.this.CS.Cq = i;
            j.this.CS.Cr = i2;
            j.this.CS.Cs = j;
            j.this.CS.Ct = j2;
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.e(j.this.CS.mAdTemplate, SystemClock.elapsedRealtime() - j.this.Dh);
            j.this.lk();
        }
    };

    private void lj() {
        com.kwad.components.core.n.a.c.b bVar = (com.kwad.components.core.n.a.c.b) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.c.b.class);
        this.Dg = bVar;
        if (bVar != null) {
            bVar.a(this.Dk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        if (this.Di) {
            return;
        }
        this.Di = true;
        if (lm()) {
            bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.j.4
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a(new com.kwad.components.ad.splashscreen.c.b.a(), true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ll() {
        if (!com.kwad.sdk.core.response.b.b.dk(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate)) || this.CS.Cn) {
            return;
        }
        this.CS.Cn = true;
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.j.5
            @Override // java.lang.Runnable
            public final void run() {
                j.this.a(new p(), true);
            }
        });
    }

    private boolean lm() {
        if (com.kwad.sdk.core.config.d.zq()) {
            return com.kwad.sdk.core.response.b.b.cN(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate));
        }
        return false;
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Dh = SystemClock.elapsedRealtime();
        if (lm()) {
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.a(this.CS.mAdTemplate, this.CS.Ci);
            this.CS.Cp = this.Dh;
            bj.runOnUiThreadDelay(this.Dj, com.kwad.sdk.core.response.b.b.cT(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate)));
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        }
        lj();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.n.a.c.b bVar = this.Dg;
        if (bVar != null) {
            bVar.b(this.Dk);
        }
        if (lm()) {
            bj.b(this.Dj);
            com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        }
    }
}

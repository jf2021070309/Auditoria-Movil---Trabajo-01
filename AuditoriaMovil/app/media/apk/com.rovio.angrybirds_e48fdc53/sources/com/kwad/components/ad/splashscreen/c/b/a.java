package com.kwad.components.ad.splashscreen.c.b;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.kwad.components.ad.splashscreen.c.c.b;
import com.kwad.components.ad.splashscreen.f;
import com.kwad.components.ad.splashscreen.g;
import com.kwad.components.core.webview.b.a.m;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.h.c;
import com.kwad.sdk.core.response.b.d;
/* loaded from: classes.dex */
public final class a extends b implements g, c {
    f EF = new f() { // from class: com.kwad.components.ad.splashscreen.c.b.a.2
        @Override // com.kwad.components.ad.splashscreen.f
        public final void kB() {
            a.this.lv.setVisibility(8);
            if (a.this.wL != null) {
                a.this.wL.rE();
                a.this.wL.rF();
            }
        }
    };
    private m EJ;
    private FrameLayout lv;
    private ap wL;

    private r a(com.kwad.sdk.core.webview.b bVar) {
        return new r(bVar, this.CS.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.splashscreen.c.b.a.1
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar != null) {
                    a.this.CS.mRootContainer.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.b.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.CS.kG();
                        }
                    });
                }
            }
        });
    }

    private m lD() {
        m mVar = new m();
        this.EJ = mVar;
        return mVar;
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void X(int i) {
        m mVar = this.EJ;
        if (mVar != null) {
            mVar.aP(i);
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(a(bVar));
        lVar.c(lD());
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        ap apVar;
        if (this.CS.Co || (apVar = this.wL) == null) {
            return;
        }
        apVar.rG();
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        ap apVar;
        if (this.CS.Co || (apVar = this.wL) == null) {
            return;
        }
        apVar.rH();
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.b(this.CS.mAdTemplate, this.CS.Ci);
        this.CS.Cj.a(this);
        this.CS.a(this);
        this.CS.a(this.EF);
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        super.b(apVar);
        this.wL = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        aVar.width = com.kwad.sdk.d.a.a.b(getContext(), this.CS.mRootContainer.getWidth());
        aVar.height = com.kwad.sdk.d.a.a.b(getContext(), this.CS.mRootContainer.getHeight());
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        if (this.CS.Co) {
            return;
        }
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rC();
            this.wL.rD();
        }
        this.lv.setVisibility(0);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.lv;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return j.b("ksad-splash-play-card", this.CS.mAdTemplate);
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void kF() {
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b
    public final int lC() {
        return (int) (com.kwad.sdk.core.response.b.b.cT(d.ck(this.CS.mAdTemplate)) - (SystemClock.elapsedRealtime() - this.CS.Cp));
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.lv = (FrameLayout) findViewById(R.id.splash_tk_play_card_view);
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        super.onUnbind();
        this.CS.Cj.b(this);
        this.CS.b(this.EF);
        this.CS.b(this);
    }
}

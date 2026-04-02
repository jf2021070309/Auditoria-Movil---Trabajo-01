package com.kwad.components.ad.interstitial.d.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Vibrator;
import android.widget.FrameLayout;
import com.kwad.components.ad.g.a.a.b;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.ad.interstitial.d.h;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.webview.b.a.g;
import com.kwad.components.core.webview.b.a.n;
import com.kwad.components.core.webview.b.a.q;
import com.kwad.components.core.webview.b.b;
import com.kwad.components.core.webview.b.b.k;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.b.x;
import com.kwad.components.core.webview.b.f;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ai;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.ar;
import com.kwad.components.core.webview.jshandler.ay;
import com.kwad.components.core.webview.jshandler.p;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.g.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bm;
import java.io.File;
/* loaded from: classes.dex */
public final class b extends a {
    private static long jO = 400;
    private d dO;
    private Vibrator dP;
    private ap fn;
    private com.kwad.components.ad.g.a.a.b ka;
    private volatile boolean kc;
    private FrameLayout lv;
    private boolean lx;
    private f ly;
    private boolean lw = false;
    private final c.a jn = new c.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.1
        @Override // com.kwad.components.ad.interstitial.d.c.a
        public final void cl() {
            if (b.this.ly != null) {
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = b.this.jh.jk ? 1 : 0;
                b.this.ly.b(aVar);
            }
        }
    };
    private h kd = new h() { // from class: com.kwad.components.ad.interstitial.d.a.b.10
        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dw() {
            b.this.kc = false;
            b.this.cV.aK();
        }

        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dx() {
            b.this.cV.aL();
            b.this.kc = true;
        }
    };
    private com.kwad.sdk.core.h.c cV = new com.kwad.sdk.core.h.d() { // from class: com.kwad.components.ad.interstitial.d.a.b.11
        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aK() {
            if (b.this.kc) {
                return;
            }
            if (b.this.fn != null && !b.this.lw) {
                b.b(b.this, true);
                b.this.fn.rC();
                b.this.fn.rD();
            }
            if (b.this.fn != null) {
                b.this.fn.rG();
            }
            if (b.this.ka != null) {
                b.this.ka.fb();
            }
            if (!b.this.lx) {
                b.this.jh.hI.getTimerHelper().startTiming();
            }
            if (b.this.lx || b.this.jh.jm || b.this.jh.hB == null) {
                return;
            }
            b.this.jh.hB.onAdShow();
            com.kwad.components.ad.interstitial.monitor.b.cM();
            com.kwad.components.ad.interstitial.monitor.b.b(b.this.jh.mAdTemplate, 3);
            b.c(b.this, true);
        }

        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aL() {
            if (b.this.kc) {
                return;
            }
            if (b.this.fn != null) {
                b.this.fn.rH();
            }
            if (b.this.ka != null) {
                b.this.ka.fa();
            }
        }
    };

    private r a(com.kwad.sdk.core.webview.b bVar) {
        return new r(bVar, this.jh.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.3
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar != null) {
                    if (!b.this.jh.jm && b.this.jh.hB != null) {
                        b.this.jh.hB.onAdClicked();
                    }
                    b.this.jh.jk = true;
                    if (!b.this.jh.jm) {
                        b.this.jh.cl();
                    }
                    if (b.this.jh.hI == null || !com.kwad.components.ad.interstitial.a.b.cH()) {
                        return;
                    }
                    b.this.jh.a(false, -1, b.this.jh.ex);
                    b.this.jh.hI.dismiss();
                }
            }
        });
    }

    private static boolean a(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        return (ownerActivity == null || ownerActivity.isFinishing()) ? false : true;
    }

    static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.lw = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        if (getContext() != null) {
            this.dP = (Vibrator) getContext().getSystemService("vibrator");
        }
        float bD = com.kwad.sdk.core.response.b.b.bD(this.jh.mAdTemplate);
        if (this.dO == null) {
            d dVar = new d(bD);
            this.dO = dVar;
            dVar.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.interstitial.d.a.b.8
                @Override // com.kwad.sdk.core.g.b
                public final void a(double d) {
                    if (bm.o(b.this.getTKContainer(), 100)) {
                        b.this.d(d);
                    }
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.a.b.8.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.dO.CF();
                        }
                    }, null, 500L);
                }

                @Override // com.kwad.sdk.core.g.b
                public final void aT() {
                }
            });
        }
        this.dO.e(bD);
        this.dO.bi(getContext());
    }

    static /* synthetic */ boolean c(b bVar, boolean z) {
        bVar.lx = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(double d) {
        this.jh.a(new c.b(getContext()).l(true).c(d).y(2).a(this.jh.jq.getTouchCoords()).z(157));
        bj.vibrate(getContext(), this.dP, jO);
    }

    private g dh() {
        k kVar = new k();
        kVar.Xd = this.jh.jw;
        return new g(kVar);
    }

    private com.kwad.components.ad.g.a.a.a dk() {
        final com.kwad.components.ad.g.a.a.a aVar = new com.kwad.components.ad.g.a.a.a();
        this.jh.js.add(new c.InterfaceC0156c() { // from class: com.kwad.components.ad.interstitial.d.a.b.2
            @Override // com.kwad.components.ad.interstitial.d.c.InterfaceC0156c
            public final void db() {
                aVar.eY();
            }
        });
        return aVar;
    }

    private ay dq() {
        ay ayVar = new ay(getContext(), this.jh.mAdTemplate);
        ayVar.a(new ay.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.4
            @Override // com.kwad.components.core.webview.jshandler.ay.a
            public final boolean dy() {
                com.kwad.components.core.page.a.launch(b.this.getContext(), b.this.jh.mAdTemplate);
                b.this.jh.a(true, -1, (com.kwad.sdk.core.video.videoview.a) null);
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.a.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.dt();
                    }
                }, 0L);
                return false;
            }
        });
        return ayVar;
    }

    private ac dr() {
        return new ac(new ac.b() { // from class: com.kwad.components.ad.interstitial.d.a.b.6
            @Override // com.kwad.components.core.webview.jshandler.ac.b
            public final void a(final ac.a aVar) {
                if (b.this.jh.hI != null) {
                    b.this.jh.jq.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.a.b.6.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (aVar.type == 0 && !b.this.jh.jk && !b.this.jh.jl && com.kwad.components.ad.interstitial.e.a.c(b.this.jh)) {
                                b.this.jh.jl = true;
                                com.kwad.components.ad.interstitial.b.b.K(b.this.getContext());
                                return;
                            }
                            b.this.ep();
                            b.this.jh.a(aVar.type == 3, aVar.UM, (com.kwad.sdk.core.video.videoview.a) null);
                            b.this.dt();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dt() {
        if (this.jh == null) {
            return;
        }
        if (this.jh.hI != null && a(this.jh.hI)) {
            this.jh.hI.dismiss();
        }
        try {
            KsInterstitialAd.AdInteractionListener adInteractionListener = this.jh.hB;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        } catch (Throwable th) {
            com.kwad.components.core.d.a.b(th);
        }
    }

    private com.kwad.components.core.webview.b.c ek() {
        return new com.kwad.components.core.webview.b.c() { // from class: com.kwad.components.ad.interstitial.d.a.b.16
            @Override // com.kwad.components.core.webview.b.c, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.c cVar2 = new com.kwad.components.core.webview.b.b.c();
                cVar2.WY = com.kwad.components.ad.interstitial.c.a.cL();
                cVar.a(cVar2);
            }
        };
    }

    private f el() {
        return new f() { // from class: com.kwad.components.ad.interstitial.d.a.b.17
            @Override // com.kwad.components.core.webview.b.f, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = b.this.jh.jk ? 1 : 0;
                cVar.a(aVar);
            }
        };
    }

    private n em() {
        return new n() { // from class: com.kwad.components.ad.interstitial.d.a.b.5
            @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
            public final void a(String str, final com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.a.b.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.components.core.webview.b.b.d dVar = new com.kwad.components.core.webview.b.b.d();
                        dVar.WZ = ag.isWifiConnected(b.this.getContext()) || b.this.jh.dJ.isDataFlowAutoStart() || b.m(b.this.jh.mAdTemplate);
                        cVar.a(dVar);
                    }
                }, 0L);
            }
        };
    }

    private p en() {
        return new p() { // from class: com.kwad.components.ad.interstitial.d.a.b.7
            @Override // com.kwad.components.core.webview.jshandler.p
            public final void a(x xVar) {
                super.a(xVar);
                if (b.this.jh.jm || b.this.jh.hB == null) {
                    return;
                }
                b.this.jh.hB.onVideoPlayStart();
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void b(x xVar) {
                super.b(xVar);
                b.this.jh.mAdTemplate.setmCurPlayTime(xVar.nQ);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void c(x xVar) {
                super.c(xVar);
                if (b.this.jh.jm || b.this.jh.hB == null) {
                    return;
                }
                b.this.jh.hB.onVideoPlayEnd();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ep() {
        ap apVar = this.fn;
        if (apVar != null) {
            apVar.rE();
            this.fn.rF();
        }
        com.kwad.components.ad.g.a.a.b bVar = this.ka;
        if (bVar != null) {
            bVar.fa();
        }
    }

    private ai.a getOpenNewPageListener() {
        return new ai.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.9
            @Override // com.kwad.components.core.webview.jshandler.ai.a
            public final void a(com.kwad.components.core.webview.a.b bVar) {
                AdWebViewActivityProxy.launch(b.this.getContext(), new AdWebViewActivityProxy.a.C0206a().as(bVar.title).at(bVar.url).ax(true).V(b.this.jh.mAdTemplate).oE());
            }
        };
    }

    public static boolean m(AdTemplate adTemplate) {
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
        return bP != null && bP.exists();
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
        super.a(tVar);
        if (this.jh.hB != null) {
            this.jh.hB.onSkippedAd();
        }
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        com.kwad.components.ad.g.a.a.b o = com.kwad.components.ad.g.a.a.b.o(this.jh.mAdTemplate);
        this.ka = o;
        if (o != null) {
            o.a(new b.InterfaceC0149b() { // from class: com.kwad.components.ad.interstitial.d.a.b.12
                @Override // com.kwad.components.ad.g.a.a.b.InterfaceC0149b
                public final void C(int i) {
                    if (i == com.kwad.components.ad.g.a.a.b.nG) {
                        b.this.jh.b(b.this.getContext(), b.this.jh.mAdTemplate);
                        b bVar2 = b.this;
                        bVar2.b(bVar2.jh.mAdTemplate, true);
                    }
                    b.this.dt();
                }
            });
            lVar.c(this.ka);
            this.ka.eZ();
        }
        lVar.c(dr());
        lVar.c(new ai(getOpenNewPageListener()));
        if (com.kwad.sdk.core.response.b.b.cX(com.kwad.sdk.core.response.b.d.ck(this.jh.mAdTemplate))) {
            lVar.c(new ar(new ar.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.13
                @Override // com.kwad.components.core.webview.jshandler.ar.a
                public final void bA() {
                    b.this.bs();
                }
            }));
        }
        lVar.c(em());
        lVar.c(dq());
        lVar.c(dh());
        lVar.c(a(bVar));
        lVar.c(en());
        lVar.c(dk());
        lVar.c(new q() { // from class: com.kwad.components.ad.interstitial.d.a.b.14
            @Override // com.kwad.components.core.webview.b.a.q, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.t.h.f(b.this.getContext(), b.this.jh.mAdTemplate);
            }
        });
        this.ly = el();
        this.jh.a(this.jn);
        lVar.c(this.ly);
        lVar.c(new com.kwad.components.core.webview.b.b(new b.a() { // from class: com.kwad.components.ad.interstitial.d.a.b.15
            @Override // com.kwad.components.core.webview.b.b.a
            public final void eq() {
                com.kwad.components.ad.interstitial.c.a.L(b.this.getContext());
            }
        }));
        lVar.c(ek());
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.jh.a(this.kd);
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        super.b(apVar);
        this.fn = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        b(this.jh.mAdTemplate, true);
        dt();
    }

    public final void b(AdTemplate adTemplate, boolean z) {
        com.kwad.sdk.core.report.a.a(adTemplate, 14, -1L, -1, this.jh.hI.getTimerHelper().getTime(), null);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        this.lv.setVisibility(8);
        if (this.jh.gv != null) {
            this.jh.gv.q(getTkTemplateId());
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        if (this.fn != null && this.jh.hz.er()) {
            this.lw = true;
            this.fn.rC();
            this.fn.rD();
        }
        this.jh.hz.a(this.cV);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.lv;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return j.b("ksad-interstitial-card", this.jh.mAdTemplate);
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ksad_tk_view);
        this.lv = frameLayout;
        frameLayout.setVisibility(0);
    }

    @Override // com.kwad.components.ad.interstitial.d.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.lw = false;
        this.lx = false;
        bj.b(getContext(), this.dP);
        d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
        if (this.jh.hz != null) {
            this.jh.hz.b(this.cV);
        }
        this.jh.b(this.jn);
        this.jh.b(this.kd);
    }
}

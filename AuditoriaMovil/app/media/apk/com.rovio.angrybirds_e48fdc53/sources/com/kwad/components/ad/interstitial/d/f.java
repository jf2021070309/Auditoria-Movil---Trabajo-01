package com.kwad.components.ad.interstitial.d;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.video.a;
import com.kwad.components.core.widget.KsAutoCloseView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.KSFrameLayout;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f extends b {
    private com.kwad.components.core.widget.a.b bG;
    private com.kwad.sdk.core.video.videoview.a ex;
    private KsAutoCloseView je;
    private c jh;
    private boolean kM;
    private KSFrameLayout kN;
    private boolean kc;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private h kd = new h() { // from class: com.kwad.components.ad.interstitial.d.f.4
        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dw() {
            f.this.kc = false;
            f.this.kO.aK();
        }

        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dx() {
            f.this.kO.aL();
            f.this.kc = true;
        }
    };
    private com.kwad.sdk.core.h.d kO = new com.kwad.sdk.core.h.d() { // from class: com.kwad.components.ad.interstitial.d.f.5
        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aK() {
            if (!f.this.mAdTemplate.mPvReported && !f.this.jh.jm && f.this.jh.hB != null) {
                f.this.jh.hB.onAdShow();
                f.this.jh.hI.getTimerHelper().startTiming();
                com.kwad.components.ad.interstitial.monitor.b.cM();
                com.kwad.components.ad.interstitial.monitor.b.b(f.this.jh.mAdTemplate, 1);
            }
            com.kwad.components.core.t.b.ql().a(f.this.mAdTemplate, null, new com.kwad.sdk.core.report.j().cp(f.this.jh.jw));
            if (f.this.kc) {
                return;
            }
            f.this.je.setCountDownPaused(false);
        }

        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aL() {
            if (f.this.kc) {
                return;
            }
            f.this.je.setCountDownPaused(true);
        }
    };

    private static boolean c(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.autoCloseTime > 0 && !com.kwad.sdk.core.response.b.a.bv(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dI() {
        final com.kwad.components.ad.interstitial.f.f fVar = this.jh.ji;
        fVar.setAdTemplate(this.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.aV(this.mAdInfo)) {
            fVar.a(com.kwad.sdk.core.response.b.a.aM(this.mAdInfo).materialUrl, this.mAdTemplate);
            fVar.b(true, true);
            fVar.t(false);
        } else {
            fVar.t(true);
            String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
            if (TextUtils.isEmpty(url)) {
                fVar.b(false, false);
            } else {
                fVar.a(url, this.mAdTemplate);
                fVar.b(true, false);
            }
            com.kwad.sdk.core.video.videoview.a aVar = this.jh.ex;
            this.ex = aVar;
            if (aVar.getParent() != null) {
                ((ViewGroup) this.ex.getParent()).removeView(this.ex);
            }
            if (com.kwad.sdk.core.response.b.a.aU(this.mAdInfo)) {
                fVar.a(com.kwad.sdk.core.response.b.a.aN(this.mAdInfo).height / com.kwad.sdk.core.response.b.a.aN(this.mAdInfo).width, this.ex);
            }
            fVar.u(this.jh.dJ.isVideoSoundEnable());
            final int G = com.kwad.sdk.core.response.b.a.G(this.mAdInfo);
            this.jh.a(new a.c() { // from class: com.kwad.components.ad.interstitial.d.f.6
                @Override // com.kwad.components.core.video.a.c
                public final void bj() {
                    fVar.b(false, false);
                }

                @Override // com.kwad.components.core.video.a.c
                public final void bk() {
                    f.this.ex.setVisibility(8);
                    if (f.this.jh.M(f.this.getContext())) {
                        return;
                    }
                    fVar.eA();
                }

                @Override // com.kwad.components.core.video.a.c
                public final void d(long j) {
                    int i = G - ((int) (j / 1000));
                    com.kwad.components.ad.interstitial.f.f fVar2 = fVar;
                    if (i >= 0) {
                        fVar2.y(String.valueOf(i));
                    } else {
                        fVar2.ey();
                    }
                }

                @Override // com.kwad.components.core.video.a.c
                public final void onVideoPlayStart() {
                    fVar.t(true);
                }
            });
            fVar.a(this.mAdTemplate, this.mAdInfo);
            fVar.t(true);
            this.jh.js.add(new c.InterfaceC0156c() { // from class: com.kwad.components.ad.interstitial.d.f.7
                @Override // com.kwad.components.ad.interstitial.d.c.InterfaceC0156c
                public final void db() {
                    fVar.eB();
                    f.this.ex.setVisibility(0);
                }
            });
        }
        this.jh.a(getContext(), this.mAdInfo, this.mAdTemplate, fVar.getBlurBgView());
        String I = com.kwad.sdk.core.response.b.a.I(this.mAdInfo);
        if (TextUtils.isEmpty(I)) {
            I = com.kwad.sdk.core.response.b.a.P(this.mAdInfo);
        }
        KSImageLoader.loadImage(fVar.getTailFrameView(), I, this.mAdTemplate);
        if (!c(this.mAdInfo)) {
            this.je.aR(false);
            return;
        }
        this.je.aR(true);
        dJ();
    }

    private void dJ() {
        int i = this.mAdInfo.adInsertScreenInfo.autoCloseTime;
        if (com.kwad.sdk.core.response.b.a.aU(this.mAdInfo)) {
            i = Math.min(i, com.kwad.sdk.core.response.b.a.G(this.mAdInfo));
            this.jh.ji.ey();
            this.jh.ji.ez();
        }
        this.je.V(i);
        com.kwad.sdk.core.report.a.b(this.mAdTemplate, 165, (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        this.jh.a(new c.b(getContext()).k(this.kM).a(this.kN.getTouchCoords()).y(i).z(i2));
        if (!com.kwad.components.ad.interstitial.a.b.cH() || this.jh.hI == null) {
            return;
        }
        c cVar = this.jh;
        cVar.a(false, -1, cVar.ex);
        this.jh.hI.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z) {
        if (!this.jh.jm && !z && !this.jh.jk && !this.jh.jl && com.kwad.components.ad.interstitial.e.a.c(this.jh)) {
            this.jh.jl = true;
            com.kwad.components.ad.interstitial.b.b.K(getContext());
            return;
        }
        this.jh.a(z, -1, this.ex);
        this.jh.hI.dismiss();
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar != null) {
            aVar.release();
        }
        if (this.jh.jm || this.jh.hB == null) {
            return;
        }
        this.jh.hB.onAdClosed();
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        c cVar = (c) Gh();
        this.jh = cVar;
        cVar.a(this.kd);
        this.mAdTemplate = this.jh.mAdTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.jh.mAdTemplate);
        this.jh.ji.n(this.mAdTemplate);
        this.jh.a(new c.e() { // from class: com.kwad.components.ad.interstitial.d.f.2
            @Override // com.kwad.components.ad.interstitial.d.c.e
            public final void onError() {
                f.this.dI();
            }
        });
        this.jh.ji.setViewListener(new com.kwad.components.ad.interstitial.f.g() { // from class: com.kwad.components.ad.interstitial.d.f.3
            @Override // com.kwad.components.ad.interstitial.f.g
            public final void a(KSFrameLayout kSFrameLayout) {
                f.this.kN = kSFrameLayout;
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dL() {
                f.this.n(false);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dM() {
                f.this.e(3, f.this.jh.ji.eC() ? 53 : 85);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dN() {
                f.this.e(1, 39);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dO() {
                f.this.e(1, 29);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dP() {
                f.this.e(3, 85);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dQ() {
                f.this.e(3, 85);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dR() {
                f.this.e(2, 53);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dS() {
                f.this.e(2, 30);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dT() {
                f.this.e(2, 31);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dU() {
                f.this.e(2, 32);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dV() {
                f.this.e(2, 15);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dW() {
                f.this.e(2, 16);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dX() {
                f.this.e(2, 17);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void dY() {
                f.this.e(2, 35);
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void o(boolean z) {
                if (f.this.ex != null) {
                    f.this.ex.setVideoSoundEnable(z);
                }
            }

            @Override // com.kwad.components.ad.interstitial.f.g
            public final void p(boolean z) {
                f.this.kM = z;
            }
        });
        com.kwad.components.core.widget.a.b bVar = new com.kwad.components.core.widget.a.b(this.jh.ji, 100);
        this.bG = bVar;
        bVar.a(this.kO);
        this.bG.sB();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        KsAutoCloseView ksAutoCloseView = (KsAutoCloseView) findViewById(R.id.ksad_interstitial_auto_close);
        this.je = ksAutoCloseView;
        ksAutoCloseView.setViewListener(new KsAutoCloseView.a() { // from class: com.kwad.components.ad.interstitial.d.f.1
            @Override // com.kwad.components.core.widget.KsAutoCloseView.a
            public final void dK() {
                f.this.n(true);
            }

            @Override // com.kwad.components.core.widget.KsAutoCloseView.a
            public final void dL() {
                f.this.n(false);
            }
        });
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.bG.b(this.kO);
        this.jh.b(this.kd);
        this.bG.sC();
    }
}

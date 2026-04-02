package com.kwad.components.ad.reward.presenter.f;

import android.content.DialogInterface;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.ad.reward.RewardRenderResult;
import com.kwad.components.ad.reward.j.d;
import com.kwad.components.ad.reward.j.e;
import com.kwad.components.ad.reward.j.h;
import com.kwad.components.ad.reward.j.k;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.a.h;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.a.w;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.q;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.b.y;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.ax;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.h;
/* loaded from: classes.dex */
public abstract class d extends com.kwad.components.ad.reward.presenter.a implements DialogInterface.OnDismissListener, com.kwad.components.ad.reward.j.a.e, w.a {
    protected com.kwad.components.ad.reward.j.a.d wo;
    private p wp;
    private o wq;
    private com.kwad.components.ad.reward.j.i wr;
    private com.kwad.components.ad.reward.j.j ws;
    private y wt;
    private boolean wu;
    private com.kwad.components.core.webview.b.a.h wv;
    protected f ww;
    private ax.b wx = new ax.b() { // from class: com.kwad.components.ad.reward.presenter.f.d.1
        @Override // com.kwad.components.core.webview.jshandler.ax.b
        public final void P(int i) {
            z.b bVar = new z.b();
            bVar.jI = i;
            bVar.jK = d.this.qB.mRootContainer.getTouchCoords();
            com.kwad.components.core.e.d.a.a(new a.C0197a(d.this.getContext()).S(d.this.qB.mAdTemplate).b(d.this.qB.mApkDownloadHelper).al(false).a(bVar).an(true));
        }
    };
    private final h.a gJ = new h.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.5
        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeOccupied() {
            if (d.this.wq == null || com.kwad.components.ad.reward.a.b.gH()) {
                return;
            }
            m mVar = new m();
            mVar.Xg = true;
            d.this.wq.c(mVar);
        }

        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeReleased() {
        }
    };
    private final com.kwad.components.ad.reward.e.j mRewardVerifyListener = new com.kwad.components.ad.reward.e.j() { // from class: com.kwad.components.ad.reward.presenter.f.d.6
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (d.this.wr != null) {
                com.kwad.components.core.webview.b.b.h hVar = new com.kwad.components.core.webview.b.b.h();
                hVar.Xb = 1;
                d.this.wr.a(hVar);
            }
        }
    };
    private final com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.7
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (d.this.ws != null) {
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.f.d.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.components.core.webview.b.b.o oVar = new com.kwad.components.core.webview.b.b.o();
                        oVar.Xh = 1;
                        d.this.ws.a(oVar);
                        if (d.this.wv != null) {
                            d.this.wv.aN(d.this.qB.pP);
                        }
                    }
                }, 0L);
            }
        }
    };
    private final l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.f.d.8
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            d.this.hG();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            d.this.jb();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            d.this.a(j, j2);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            d.this.g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPreparing() {
            d.this.g(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        }
    };

    public d() {
        if (iT()) {
            this.ww = new f();
        }
    }

    private void c(long j, long j2) {
        long min = Math.min(com.kwad.sdk.core.response.b.a.Y(this.qB.mAdTemplate.adInfoList.get(0)), j);
        if (j2 < min - 800) {
            this.qB.pG = (int) ((((float) (min - j2)) / 1000.0f) + 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(double d) {
        this.wt.Xq = false;
        this.wt.Xm = false;
        this.wt.nQ = (int) ((d / 1000.0d) + 0.5d);
        jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hG() {
        if (this.qB.ps) {
            jb();
        } else {
            ja();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iV() {
        com.kwad.sdk.core.report.a.b(this.qB.mAdTemplate, 17, this.qB.mReportExtData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iW() {
        this.qB.G(jd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iX() {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, jd(), "endTopBar", new com.kwad.sdk.core.report.j().cg(39).c(this.qB.mRootContainer.getTouchCoords()), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iY() {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, jd(), (String) null, new com.kwad.sdk.core.report.j().cg(40).c(this.qB.mRootContainer.getTouchCoords()), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iZ() {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, jd(), (String) null, new com.kwad.sdk.core.report.j().cg(41).c(this.qB.mRootContainer.getTouchCoords()), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    private void ja() {
        this.wt.Xm = true;
        this.wt.Xq = false;
        this.wt.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate));
        jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jb() {
        this.wt.Xq = true;
        this.wt.Xm = false;
        jc();
    }

    private void jc() {
        y yVar;
        p pVar = this.wp;
        if (pVar == null || (yVar = this.wt) == null) {
            return;
        }
        pVar.a(yVar);
    }

    private String jd() {
        com.kwad.components.ad.reward.j.a.d dVar = this.wo;
        if (dVar == null) {
            return null;
        }
        return dVar.getTkTemplateId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRewardVerify() {
        this.qB.mAdOpenInteractionListener.onRewardVerify();
    }

    public void a(long j, long j2) {
        c(j, j2);
        g(j2);
    }

    public final void a(com.kwad.components.ad.reward.c.b bVar) {
        if (this.qB != null) {
            this.qB.b(bVar);
        }
    }

    public void a(o oVar) {
        this.wq = oVar;
        this.qB.oZ.a(this.gJ);
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.f.d.4
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = com.kwad.components.core.t.a.ak(d.this.getContext()).qj() || !d.this.qB.mVideoPlayConfig.isVideoSoundEnable();
                m mVar = new m();
                mVar.Xg = z;
                d.this.wq.c(mVar);
                d.this.qB.oZ.setAudioEnabled(!z, false);
            }
        });
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
        this.wp = pVar;
        this.qB.oZ.a(this.mVideoPlayStateListener);
    }

    public void a(t tVar) {
        com.kwad.components.ad.reward.presenter.e.a(this.qB, false);
    }

    public void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        k kVar = new k();
        kVar.a(new k.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.9
            @Override // com.kwad.components.ad.reward.j.k.a
            public final void d(q qVar) {
                com.kwad.components.ad.reward.d.fy().c(qVar);
            }
        });
        lVar.c(kVar);
        long j = this.qB.pI;
        lVar.c(new com.kwad.components.ad.reward.j.g(j > 0 ? ((int) j) / 1000 : 0));
        com.kwad.components.ad.reward.j.i iVar = new com.kwad.components.ad.reward.j.i();
        this.wr = iVar;
        lVar.c(iVar);
        com.kwad.components.ad.reward.j.j jVar = new com.kwad.components.ad.reward.j.j();
        this.ws = jVar;
        lVar.c(jVar);
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.qB.b(this.mPlayEndPageListener);
        lVar.c(new ac(new ac.b() { // from class: com.kwad.components.ad.reward.presenter.f.d.10
            @Override // com.kwad.components.core.webview.jshandler.ac.b
            public final void a(ac.a aVar) {
                d.this.getTKContainer().setVisibility(8);
            }
        }));
        com.kwad.components.ad.reward.j.d dVar = new com.kwad.components.ad.reward.j.d();
        dVar.a(new d.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.11
            @Override // com.kwad.components.ad.reward.j.d.a
            public final void a(final com.kwad.components.core.webview.b.b.p pVar) {
                com.kwad.components.core.e.d.a.a(new a.C0197a(d.this.getContext()).S(d.this.qB.mAdTemplate).b(d.this.qB.mApkDownloadHelper).ao(1).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.f.d.11.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        if (pVar.Xi) {
                            d.this.iX();
                        } else {
                            d.this.iY();
                        }
                    }
                }));
            }
        });
        lVar.c(dVar);
        com.kwad.components.ad.reward.j.e eVar = new com.kwad.components.ad.reward.j.e();
        eVar.a(new e.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.12
            @Override // com.kwad.components.ad.reward.j.e.a
            public final void je() {
                com.kwad.components.core.e.d.a.a(new a.C0197a(d.this.getContext()).S(d.this.qB.mAdTemplate).b(d.this.qB.mApkDownloadHelper).ao(2).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.f.d.12.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        d.this.iZ();
                    }
                }));
            }
        });
        lVar.c(eVar);
        lVar.c(new com.kwad.components.ad.reward.j.h(new h.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.13
            @Override // com.kwad.components.ad.reward.j.h.a
            public final void Q(int i) {
                if (com.kwad.components.ad.reward.j.v(d.this.qB.mAdTemplate)) {
                    if (!com.kwad.components.ad.reward.j.t(d.this.qB.mAdTemplate) || d.this.qB.pE == null) {
                        if (com.kwad.components.ad.reward.j.u(d.this.qB.mAdTemplate) && d.this.qB.pF != null && !d.this.qB.pF.jJ()) {
                            d.this.qB.pF.jI();
                        }
                    } else if (!d.this.qB.pE.jJ()) {
                        d.this.qB.pE.jI();
                    }
                }
                if (d.this.qB.gb() != RewardRenderResult.DEFAULT) {
                    d.this.qB.pv = i;
                }
                d.this.notifyRewardVerify();
            }
        }));
        lVar.c(new com.kwad.components.ad.reward.j.c() { // from class: com.kwad.components.ad.reward.presenter.f.d.14
            @Override // com.kwad.components.ad.reward.j.c
            public final void jf() {
                super.jf();
                d.this.iW();
            }
        });
        lVar.c(new com.kwad.components.ad.reward.j.f() { // from class: com.kwad.components.ad.reward.presenter.f.d.15
            @Override // com.kwad.components.ad.reward.j.f
            public final void V(boolean z) {
                super.V(z);
                com.kwad.components.ad.reward.presenter.e.w(d.this.qB);
            }
        });
        lVar.c(new com.kwad.components.ad.reward.j.b() { // from class: com.kwad.components.ad.reward.presenter.f.d.16
            @Override // com.kwad.components.ad.reward.j.b
            public final void jf() {
                super.jf();
                d.this.iV();
            }
        });
        lVar.c(new com.kwad.components.core.webview.b.a.q() { // from class: com.kwad.components.ad.reward.presenter.f.d.2
            @Override // com.kwad.components.core.webview.b.a.q, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.t.h.f(d.this.getContext(), d.this.qB.mAdTemplate);
            }
        });
        lVar.c(new com.kwad.components.ad.reward.h.b(getContext(), this.qB.mAdTemplate, PlayableSource.ACTIONBAR_CLICK));
        com.kwad.components.core.webview.b.a.h hVar = new com.kwad.components.core.webview.b.a.h();
        this.wv = hVar;
        hVar.a(new h.a() { // from class: com.kwad.components.ad.reward.presenter.f.d.3
            @Override // com.kwad.components.core.webview.b.a.h.a
            public final void a(com.kwad.components.core.webview.b.a.h hVar2) {
                hVar2.aN(d.this.qB.pP);
            }
        });
        lVar.c(this.wv);
        lVar.c(new com.kwad.components.core.webview.jshandler.z());
        lVar.c(new ax(bVar, this.qB.mApkDownloadHelper, this.wx));
        lVar.c(new w(this));
    }

    @Override // com.kwad.components.core.webview.b.a.w.a
    public final void a(TKAdLiveShopItemInfo tKAdLiveShopItemInfo) {
        this.qB.mAdTemplate.tkLiveShopItemInfo = tKAdLiveShopItemInfo;
    }

    @Override // com.kwad.components.core.webview.b.i
    public void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        this.qB.mAdOpenInteractionListener.bF();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        boolean ce = ce();
        this.wu = ce;
        if (ce) {
            this.qB.a(this);
            if (this.wo == null) {
                this.wo = new com.kwad.components.ad.reward.j.a.d(this.qB, -1L, getContext());
            }
            if (this.wt == null) {
                this.wt = new y();
            }
            this.wo.a(this.qB.getActivity(), this.qB.mAdTemplate, this);
            f fVar = this.ww;
            if (fVar != null) {
                fVar.B(this.qB);
            }
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
        this.qB.oZ.setAudioEnabled(!mVar.Xg, true);
    }

    public void b(ap apVar) {
        f fVar = this.ww;
        if (fVar != null) {
            fVar.c(apVar);
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public void b(WebCloseStatus webCloseStatus) {
    }

    public void cd() {
        f fVar = this.ww;
        if (fVar != null) {
            fVar.cd();
        }
    }

    protected abstract boolean ce();

    public void ej() {
        f fVar = this.ww;
        if (fVar != null) {
            fVar.ej();
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public com.kwad.sdk.widget.e getTouchCoordsView() {
        return this.qB.mRootContainer;
    }

    protected boolean iT() {
        return false;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        com.kwad.components.ad.reward.j.a.d dVar = this.wo;
        if (dVar == null || dVar.jv() == null) {
            return;
        }
        this.wo.jv().hd();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
        super.onUnbind();
        if (this.wu) {
            f fVar = this.ww;
            if (fVar != null) {
                fVar.C(this.qB);
            }
            this.qB.b(this);
            this.wo.jx();
            this.qB.oZ.b(this.mVideoPlayStateListener);
            this.qB.oZ.b(this.gJ);
            com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
            this.qB.c(this.mPlayEndPageListener);
        }
    }
}

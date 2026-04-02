package com.kwad.components.ad.reward.presenter;

import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class q extends com.kwad.components.ad.reward.presenter.a implements com.kwad.components.ad.reward.e.f, com.kwad.components.ad.reward.e.h, ak.b {
    private com.kwad.components.core.webview.b.e.e gm;
    private float sD;
    private boolean sS;
    private a sT;
    private p sU;
    private n sV;
    private o sW;
    private int sX;
    private boolean sY;
    private boolean sZ;
    private boolean ta;

    /* loaded from: classes.dex */
    class a extends com.kwad.components.core.video.l {
        private long tc;
        private long videoDuration;

        private a() {
        }

        /* synthetic */ a(q qVar, byte b) {
            this();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            this.tc = j2;
            this.videoDuration = j;
            if (q.this.qB.fQ()) {
                return;
            }
            q.this.a(j, j2, false);
        }
    }

    public q(AdTemplate adTemplate) {
        this(adTemplate, true, true);
    }

    public q(AdTemplate adTemplate, boolean z, boolean z2) {
        this.sX = 0;
        this.sY = false;
        this.sZ = true;
        this.ta = true;
        this.sZ = z;
        this.ta = z2;
        if (com.kwad.sdk.core.response.b.a.bv(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            o oVar = new o();
            this.sW = oVar;
            a(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(com.kwad.components.ad.reward.e.f fVar) {
        return getPriority() - fVar.getPriority();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2, boolean z) {
        p pVar;
        if (hP() && j2 >= 10000 && ((float) j2) >= ((float) j) * this.sD) {
            if (!com.kwad.components.ad.reward.a.b.gM()) {
                n nVar = this.sV;
                if (nVar != null) {
                    nVar.I(!z);
                    this.sX = 2;
                }
            } else if (this.sY || (pVar = this.sU) == null) {
            } else {
                pVar.hK();
                this.sX = 1;
                this.sY = true;
            }
        }
    }

    private com.kwad.components.core.webview.b.e.e bP() {
        if (this.gm == null) {
            this.gm = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.q.2
                @Override // com.kwad.components.core.webview.b.e.b
                public final void q(String str) {
                    q.this.hO();
                }
            };
        }
        return this.gm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hO() {
        if (this.ta) {
            p pVar = new p(this);
            this.sU = pVar;
            a((Presenter) pVar, true);
        }
        if (this.sZ) {
            n nVar = new n(this);
            this.sV = nVar;
            a((Presenter) nVar, true);
        }
    }

    private boolean hP() {
        return this.sS;
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, com.kwad.components.ad.reward.e.l lVar) {
        n nVar;
        p pVar;
        this.qB.z(true);
        int i = this.sX;
        if (i == 1 && (pVar = this.sU) != null) {
            pVar.hL();
        } else if (i != 2 || (nVar = this.sV) == null) {
        } else {
            nVar.hide();
        }
    }

    @Override // com.kwad.components.core.webview.jshandler.ak.b
    public final void a(ak.a aVar) {
        a aVar2;
        boolean isSuccess = aVar.isSuccess();
        this.sS = isSuccess;
        if (!isSuccess || (aVar2 = this.sT) == null) {
            return;
        }
        a(aVar2.videoDuration, this.sT.tc, false);
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.bv(ck)) {
            if (this.qB.po) {
                com.kwad.components.core.webview.b.d.b.si().a(bP());
            } else {
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.q.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.this.hO();
                    }
                }, 100L);
            }
        } else if (!com.kwad.sdk.core.response.b.a.by(ck)) {
            com.kwad.components.core.p.a.pC().Y(this.qB.mAdTemplate);
        }
        this.qB.b(this);
        if (this.qB.pb != null) {
            this.qB.pb.a(this);
        }
        boolean gL = com.kwad.components.ad.reward.a.b.gL();
        this.sD = com.kwad.components.ad.reward.a.b.gK();
        if (gL) {
            this.sT = new a(this, (byte) 0);
            this.qB.oZ.a(this.sT);
        }
        com.kwad.components.ad.reward.b.fr().a(this);
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final void bE() {
        RewardActionBarControl.ShowActionBarResult ip = this.qB.pc.ip();
        if (ip != null) {
            ip.equals(RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_PLAYABLE_PORTRAIT);
        }
        if (this.sW == null || this.qB.fZ()) {
            return;
        }
        if (hP()) {
            this.sW.e(PlayableSource.PLAY_FINISHED_NORMAL);
        } else {
            this.sW.hJ();
        }
    }

    public final boolean bQ() {
        boolean gc = this.qB.gc();
        if (!this.qB.fQ() || gc) {
            return false;
        }
        com.kwad.components.ad.reward.b.fr().fs();
        this.qB.z(false);
        return true;
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        this.qB.z(false);
        a aVar = this.sT;
        if (aVar == null || this.sX != 2) {
            return;
        }
        a(aVar.videoDuration, this.sT.tc, true);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final int getPriority() {
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this);
        if (this.qB.pb != null) {
            this.qB.pb.b(this);
        }
        if (this.sT != null) {
            this.qB.oZ.b(this.sT);
        }
        com.kwad.components.ad.reward.b.fr().b(this);
        com.kwad.components.core.webview.b.d.b.si().b(this.gm);
    }
}

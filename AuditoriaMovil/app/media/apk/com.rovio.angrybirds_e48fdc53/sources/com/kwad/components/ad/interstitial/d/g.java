package com.kwad.components.ad.interstitial.d;

import com.kwad.components.core.video.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class g extends b implements a.c {
    private static long kS = 1000;
    private c jh;
    private a kT;
    private int kU;
    private AdTemplate mAdTemplate;

    /* loaded from: classes.dex */
    class a implements Runnable {
        private int kV;
        private boolean kW;
        private boolean kX;

        private a() {
            this.kV = Integer.MIN_VALUE;
            this.kW = false;
            this.kX = false;
        }

        /* synthetic */ a(g gVar, byte b) {
            this();
        }

        public final void q(boolean z) {
            this.kX = true;
        }

        public final void r(boolean z) {
            this.kW = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.kX) {
                return;
            }
            if (!this.kW) {
                if (this.kV == Integer.MIN_VALUE) {
                    this.kV = g.this.kU;
                }
                if (this.kV < 0) {
                    return;
                }
                com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", g.this.toString() + ", this: " + toString() + " PlayableTimerRunnable run : " + this.kV);
                g.this.D(this.kV);
                this.kV = this.kV + (-1);
            }
            bj.a(this, null, g.kS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i) {
        if (this.jh.ji == null) {
            return;
        }
        if (i != 0) {
            this.jh.ji.b(true, i);
        } else if (this.jh.cV()) {
        } else {
            this.jh.b(getContext(), this.mAdTemplate);
            dt();
            c cVar = this.jh;
            cVar.a(true, -1, cVar.ex);
        }
    }

    private void dt() {
        if (this.jh.ex != null) {
            this.jh.ex.release();
        }
        this.jh.hI.dismiss();
        if (this.jh.jm || this.jh.hB == null) {
            return;
        }
        this.jh.hB.onAdClosed();
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", this + " onBind");
        c cVar = (c) Gh();
        this.jh = cVar;
        AdTemplate adTemplate = cVar.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        long j = ck.adInsertScreenInfo.autoCloseTime;
        this.kU = j > 0 ? (int) Math.min(com.kwad.components.ad.interstitial.a.b.b(ck), j) : com.kwad.components.ad.interstitial.a.b.b(ck);
        if (this.jh.ji != null) {
            this.jh.ji.b(true, this.kU);
        }
        if (com.kwad.sdk.core.response.b.a.aU(ck)) {
            this.kT = null;
            this.jh.a(this);
            return;
        }
        a aVar = new a(this, (byte) 0);
        this.kT = aVar;
        bj.a(aVar, null, 1000L);
    }

    @Override // com.kwad.components.core.video.a.c
    public final void bj() {
    }

    @Override // com.kwad.components.core.video.a.c
    public final void bk() {
        if (this.jh.cV()) {
            return;
        }
        this.jh.b(getContext(), this.mAdTemplate);
        dt();
    }

    @Override // com.kwad.components.ad.interstitial.d.b
    public final void cO() {
        super.cO();
        a aVar = this.kT;
        if (aVar != null) {
            aVar.r(false);
        }
    }

    @Override // com.kwad.components.ad.interstitial.d.b
    public final void cP() {
        super.cP();
        a aVar = this.kT;
        if (aVar != null) {
            aVar.r(true);
        }
    }

    @Override // com.kwad.components.core.video.a.c
    public final void d(long j) {
        D(this.kU - ((int) (j / 1000)));
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", this + " onUnbind");
        this.jh.b(this);
        a aVar = this.kT;
        if (aVar != null) {
            aVar.q(true);
            bj.b(this.kT);
            this.kT = null;
        }
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onVideoPlayStart() {
    }
}

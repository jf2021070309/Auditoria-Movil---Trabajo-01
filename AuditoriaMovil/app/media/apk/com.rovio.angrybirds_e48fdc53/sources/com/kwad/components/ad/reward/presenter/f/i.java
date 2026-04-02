package com.kwad.components.ad.reward.presenter.f;

import android.widget.FrameLayout;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.n;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class i extends d implements com.kwad.components.ad.reward.e.h {
    private FrameLayout hk;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private long rH;
    private com.kwad.components.core.webview.b.e wU;
    private com.kwad.components.ad.reward.l.b wV = new com.kwad.components.ad.reward.l.b() { // from class: com.kwad.components.ad.reward.presenter.f.i.1
        @Override // com.kwad.components.ad.reward.l.b
        public final void jj() {
            if (i.this.wU != null) {
                com.kwad.components.core.webview.b.b.i iVar = new com.kwad.components.core.webview.b.b.i();
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(i.this.qB.mAdTemplate);
                iVar.rewardTime = i.this.qB.pq ? com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.components.core.r.a.pU().pV() == 0 ? com.kwad.sdk.core.response.b.a.aE(ck) : com.kwad.sdk.core.response.b.a.aC(ck) : 0;
                i.this.wU.b(iVar);
            }
        }
    };
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.i.2
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (com.kwad.sdk.core.response.b.a.ak(com.kwad.sdk.core.response.b.d.ck(i.this.qB.mAdTemplate))) {
                i.this.hk.setVisibility(8);
            }
        }
    };

    private com.kwad.components.core.webview.b.e jh() {
        return new com.kwad.components.core.webview.b.e() { // from class: com.kwad.components.ad.reward.presenter.f.i.3
            @Override // com.kwad.components.core.webview.b.e, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.i iVar = new com.kwad.components.core.webview.b.b.i();
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(i.this.qB.mAdTemplate);
                iVar.rewardTime = i.this.qB.pq ? com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.components.core.r.a.pU().pV() == 0 ? com.kwad.sdk.core.response.b.a.aE(ck) : com.kwad.sdk.core.response.b.a.aC(ck) : 0;
                cVar.a(iVar);
            }
        };
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    public final void a(long j, long j2) {
        super.a(j, j2);
        n.a(this.qB, j2, this.rH, (com.kwad.sdk.core.response.b.a.aG(this.mAdInfo) && com.kwad.components.core.r.a.pU().pV() == 0 ? com.kwad.sdk.core.response.b.a.aE(this.mAdInfo) : com.kwad.sdk.core.response.b.a.aC(this.mAdInfo)) * (this.qB.pq ? 1000 : 0));
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        com.kwad.components.core.webview.b.e jh = jh();
        this.wU = jh;
        lVar.c(jh);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (ce() && !this.qB.oZ.jT()) {
            AdTemplate adTemplate = this.qB.mAdTemplate;
            this.mAdTemplate = adTemplate;
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
            this.mAdInfo = ck;
            this.rH = Math.min(com.kwad.sdk.core.response.b.a.H(ck), com.kwad.sdk.core.response.b.a.Y(this.mAdInfo));
            this.qB.b(this.mPlayEndPageListener);
            this.qB.oZ.a(this.wV);
            com.kwad.components.ad.reward.b.fr().a(this);
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / com.kwad.sdk.d.a.a.aJ(getContext())) + 0.5f);
        aVar.height = 44;
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        if (this.qB.pp) {
            this.hk.setVisibility(8);
        }
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        if (!this.qB.pp || com.kwad.sdk.core.response.b.a.ak(ck)) {
            return;
        }
        this.hk.setVisibility(0);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.qB.pp = false;
        this.qB.B(false);
        this.hk.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return com.kwad.components.ad.reward.j.b(this.qB) && !this.qB.oZ.jT();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.hk;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-video-top-bar", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ksad_js_top);
        this.hk = frameLayout;
        frameLayout.setVisibility(0);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (ce()) {
            this.qB.c(this.mPlayEndPageListener);
            this.qB.oZ.b(this.wV);
            com.kwad.components.ad.reward.b.fr().b(this);
        }
    }
}

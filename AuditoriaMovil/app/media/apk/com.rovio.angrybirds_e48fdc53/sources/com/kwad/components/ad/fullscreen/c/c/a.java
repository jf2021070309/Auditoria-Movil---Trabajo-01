package com.kwad.components.ad.fullscreen.c.c;

import android.widget.FrameLayout;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.h;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.presenter.f.d;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class a extends d implements h {
    private FrameLayout hk;
    private final f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.fullscreen.c.c.a.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (com.kwad.sdk.core.response.b.a.am(com.kwad.sdk.core.response.b.d.ck(a.this.qB.mAdTemplate))) {
                a.this.hk.setVisibility(8);
            }
        }
    };

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (ce()) {
            this.hk.setVisibility(0);
            this.qB.b(this.mPlayEndPageListener);
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
        if (!this.qB.pp || com.kwad.sdk.core.response.b.a.am(ck)) {
            return;
        }
        this.hk.setVisibility(0);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.qB.pp = false;
        this.hk.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    public final boolean ce() {
        return j.c(this.qB) && !this.qB.oZ.jT();
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
        this.hk = (FrameLayout) findViewById(R.id.ksad_js_top);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (ce()) {
            this.qB.c(this.mPlayEndPageListener);
            com.kwad.components.ad.reward.b.fr().b(this);
        }
    }
}

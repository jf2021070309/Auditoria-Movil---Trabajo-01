package com.kwad.components.ad.reward.presenter.f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.e.m;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.a.e;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class j extends d implements com.kwad.components.ad.reward.e.h, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private ap wL;
    private boolean wM;
    private boolean wN;
    private FrameLayout wX;
    private View wY;
    private boolean wZ = false;
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.j.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            j.this.wX.setVisibility(8);
        }
    };
    private j.a xa = new j.a() { // from class: com.kwad.components.ad.reward.presenter.f.j.2
        @Override // com.kwad.components.ad.reward.j.a
        public final void gl() {
            j.this.wN = true;
        }

        @Override // com.kwad.components.ad.reward.j.a
        public final void gm() {
            j.this.wN = true;
            j.this.ji();
        }

        @Override // com.kwad.components.ad.reward.j.a
        public final void gn() {
            j.this.wN = false;
            if (j.this.wL != null) {
                j.this.wL.rH();
            }
        }

        @Override // com.kwad.components.ad.reward.j.a
        public final void go() {
            j.this.wN = false;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void ji() {
        ap apVar = this.wL;
        if (apVar == null || !this.wN) {
            return;
        }
        if (this.wM) {
            apVar.rG();
            return;
        }
        apVar.rC();
        this.wL.rD();
        this.wM = true;
    }

    private e.b jk() {
        return new e.b() { // from class: com.kwad.components.ad.reward.presenter.f.j.3
            @Override // com.kwad.components.core.webview.b.a.e.b
            public final int jl() {
                m mVar = j.this.qB.pC;
                if (mVar != null) {
                    return com.kwad.sdk.d.a.a.b(j.this.getContext(), mVar.ca());
                }
                if (j.this.wY != null) {
                    ViewGroup.LayoutParams layoutParams = j.this.wY.getLayoutParams();
                    return layoutParams instanceof ViewGroup.MarginLayoutParams ? com.kwad.sdk.d.a.a.b(j.this.getContext(), j.this.wY.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : com.kwad.sdk.d.a.a.b(j.this.getContext(), j.this.wY.getHeight());
                }
                return 0;
            }
        };
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(RewardActionBarControl.ShowActionBarResult showActionBarResult, View view) {
        this.wY = view;
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new com.kwad.components.core.webview.b.a.e(jk()));
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.a(this.xa);
        this.qB.pc.a(this);
        this.qB.b(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().a(this);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        super.b(apVar);
        this.wL = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((com.kwad.sdk.d.a.a.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        if (this.wZ) {
            this.wX.setVisibility(0);
        }
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
        if (this.wZ) {
            this.wX.setVisibility(8);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        this.wZ = false;
        this.wX.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return true;
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void ej() {
        super.ej();
        ji();
        this.wZ = true;
        this.wX.setVisibility(0);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.wX;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-video-topfloor", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.wX = (FrameLayout) findViewById(R.id.ksad_js_topfloor);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        super.onUnbind();
        this.qB.b(this.xa);
        this.qB.pc.b(this);
        this.qB.c(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().b(this);
        this.qB.a((com.kwad.components.core.webview.b.e.a) null);
    }
}

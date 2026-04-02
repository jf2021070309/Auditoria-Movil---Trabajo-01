package com.kwad.components.ad.reward.presenter.a;

import android.widget.FrameLayout;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.j.q;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.webview.b;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.widget.e;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements i {
    private h lt;
    private FrameLayout lv;
    private AdInfo mAdInfo;
    private long tI;
    private long tJ;
    private boolean tK;
    private boolean tL;
    private j.b tM = new j.b() { // from class: com.kwad.components.ad.reward.presenter.a.a.1
        @Override // com.kwad.components.ad.reward.j.b
        public final boolean interceptPlayCardResume() {
            return a.this.lv != null && a.this.lv.getVisibility() == 0;
        }
    };
    private final l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.a.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            long a = j.a(j, a.this.mAdInfo);
            if (j2 <= a.this.tI || a - j2 <= a.this.tJ || a.this.tK) {
                return;
            }
            a.a(a.this, true);
            a.this.lt.a(a.this.qB.getActivity(), a.this.qB.mAdTemplate, a.this);
        }
    };

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.tK = true;
        return true;
    }

    private h hW() {
        return new h(-1L, getContext());
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.components.l lVar, b bVar) {
        lVar.c(new q(bVar, this.qB.mApkDownloadHelper, this.qB, -1L, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.a.a.3
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (a.this.qB.mAdOpenInteractionListener != null) {
                    a.this.qB.mAdOpenInteractionListener.bF();
                }
            }
        }, null));
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.lt == null) {
            this.lt = hW();
        }
        AdInfo ck = d.ck(this.qB.mAdTemplate);
        this.mAdInfo = ck;
        this.tI = com.kwad.sdk.core.response.b.a.aB(ck) * 1000;
        this.tJ = com.kwad.sdk.core.response.b.a.aC(this.mAdInfo) * 1000;
        this.qB.oZ.a(this.mVideoPlayStateListener);
        this.qB.a(this.tM);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        this.qB.pq = webCloseStatus != null && webCloseStatus.interactSuccess;
        if (this.qB.pq) {
            this.qB.oZ.jQ();
        }
        if (this.tL && bm.o(this.lv, 30)) {
            this.qB.oZ.resume();
        }
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        c.d("TkRewardInteractPresenter", "onTkLoadFailed: ");
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        c.d("TkRewardInteractPresenter", "onTkLoadSuccess: ");
        getContext();
        if (ai.IK()) {
            this.lv.setVisibility(0);
            com.kwad.components.ad.reward.d.a.P(this.qB.mContext);
            this.qB.oZ.pause();
            this.tL = true;
        }
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
        c.d("TkRewardInteractPresenter", "getTkTemplateId: ");
        return com.kwad.components.core.webview.b.j.b("ksad-video-interact-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final e getTouchCoordsView() {
        return this.qB.mRootContainer;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.lv = (FrameLayout) findViewById(R.id.ksad_js_interact);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.qB.b(this.tM);
        this.lt.jx();
        this.lt = null;
        this.lv.setVisibility(8);
        this.tK = false;
        this.tL = false;
    }
}

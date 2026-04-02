package com.kwad.components.ad.reward.presenter.d.a;

import android.widget.FrameLayout;
import com.kwad.components.ad.k.a;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.presenter.e;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements a.b {
    private FrameLayout cQ;
    private l sv;
    private volatile long vC = 0;
    private volatile boolean vD = false;
    private l sw = new l() { // from class: com.kwad.components.ad.reward.presenter.d.a.a.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayResume() {
            super.onLivePlayResume();
            a.this.vD = false;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            a.this.vD = true;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            a.this.vC = j2;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            a.this.vD = false;
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.d.a.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            a.this.vC = j2;
            a.this.vD = j - j2 < 800;
        }
    };
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.d.a.a.4
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (a.this.qB.pD || a.this.qB.pe == null) {
                return;
            }
            a.this.qB.pe.ap();
        }
    };
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.d.a.a.5
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            a.this.qB.mAdOpenInteractionListener.bF();
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.vC = 0L;
        this.vD = false;
        AdTemplate adTemplate = this.qB.mAdTemplate;
        com.kwad.components.ad.k.a aVar = this.qB.pe;
        this.sv = this.qB.oZ.jT() ? this.sw : this.mVideoPlayStateListener;
        if (aVar != null) {
            this.qB.py = true;
            aVar.a(this);
            aVar.a(this.cH);
            aVar.a(this.cQ, this.qB.mRootContainer, adTemplate);
            aVar.a(new a.InterfaceC0160a() { // from class: com.kwad.components.ad.reward.presenter.d.a.a.3
                @Override // com.kwad.components.ad.k.a.InterfaceC0160a
                public final void S(boolean z) {
                    a.this.qB.py = z;
                }
            });
            aVar.setActivity(this.qB.getActivity());
            aVar.aw();
            this.qB.b(this.mPlayEndPageListener);
            this.qB.oZ.a(this.sv);
        }
    }

    @Override // com.kwad.components.ad.k.a.b
    public final void iC() {
        e.u(this.qB);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cQ = (FrameLayout) findViewById(R.id.ksad_landing_page_container);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this.mPlayEndPageListener);
        this.qB.oZ.b(this.sv);
    }
}

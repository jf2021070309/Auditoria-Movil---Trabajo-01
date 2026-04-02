package com.kwad.components.ad.reward.presenter;

import com.kwad.components.core.page.DownloadLandPageActivity;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes.dex */
public final class o extends a {
    private com.kwad.components.core.playable.a pb;
    private PlayableSource sJ;
    private final com.kwad.components.ad.reward.e.h sK = new com.kwad.components.ad.reward.e.i() { // from class: com.kwad.components.ad.reward.presenter.o.1
        @Override // com.kwad.components.ad.reward.e.i, com.kwad.components.ad.reward.e.h
        public final void a(PlayableSource playableSource, com.kwad.components.ad.reward.e.l lVar) {
            o.this.sJ = playableSource;
            if (o.this.pb != null && o.this.pb.pz()) {
                o.this.pb.e(playableSource);
                if (o.this.qB != null) {
                    o.this.qB.d(playableSource);
                    o.this.qB.C(true);
                    if (o.this.qB.oZ.jT()) {
                        o.this.qB.oZ.jU().pause();
                    }
                }
                com.kwad.components.ad.reward.b.fr().b(playableSource);
                return;
            }
            if (o.this.pb != null) {
                o.this.pb.hJ();
            }
            if (lVar != null) {
                lVar.he();
                com.kwad.sdk.core.e.c.d("RewardPlayablePresenter", "onEnterPlayable outer handled");
            } else if (com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(o.this.qB.mAdTemplate))) {
                DownloadLandPageActivity.launch(o.this.getActivity(), o.this.qB.mAdTemplate, true);
            }
        }

        @Override // com.kwad.components.ad.reward.e.i, com.kwad.components.ad.reward.e.h
        public final void bT() {
            o.this.pb.hJ();
            if (o.this.qB != null) {
                o.this.qB.d((PlayableSource) null);
                if (o.this.qB.oZ.jT()) {
                    o.this.qB.oZ.jU().resume();
                }
            }
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.components.core.playable.a aVar = this.qB.pb;
        this.pb = aVar;
        aVar.a(this.qB.mAdTemplate, this.qB.mRootContainer, this.qB.mApkDownloadHelper);
        com.kwad.components.ad.reward.monitor.a.a(this.qB.pn, "playable");
        com.kwad.components.ad.reward.monitor.a.a(this.qB.pn, "playable", com.kwad.sdk.core.response.b.a.bB(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate)));
        this.pb.py();
        this.pb.a(new ak.b() { // from class: com.kwad.components.ad.reward.presenter.o.2
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar2) {
                if (aVar2.isSuccess()) {
                    return;
                }
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(o.this.qB.mAdTemplate);
                long loadTime = o.this.qB.pb.getLoadTime();
                if (loadTime == -1) {
                    return;
                }
                com.kwad.components.ad.reward.monitor.a.a(o.this.qB.pn, "playable", com.kwad.sdk.core.response.b.a.bB(ck), System.currentTimeMillis() - loadTime, 3);
            }
        });
        this.pb.a(new KsAdWebView.d() { // from class: com.kwad.components.ad.reward.presenter.o.3
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(o.this.qB.mAdTemplate);
                long loadTime = o.this.qB.pb.getLoadTime();
                if (loadTime == -1) {
                    return;
                }
                com.kwad.components.ad.reward.monitor.a.a(o.this.qB.pn, "playable", com.kwad.sdk.core.response.b.a.bB(ck), System.currentTimeMillis() - loadTime);
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                com.kwad.components.ad.reward.monitor.a.a(o.this.qB.pn, "playable", com.kwad.sdk.core.response.b.a.bB(com.kwad.sdk.core.response.b.d.ck(o.this.qB.mAdTemplate)), System.currentTimeMillis() - o.this.qB.pb.getLoadTime(), 2);
            }
        });
        com.kwad.components.ad.reward.b.fr().a(this.sK);
    }

    public final void e(PlayableSource playableSource) {
        com.kwad.components.core.playable.a aVar = this.pb;
        if (aVar != null) {
            if (playableSource != null) {
                aVar.e(playableSource);
            } else {
                aVar.e(this.sJ);
            }
        }
    }

    public final void hJ() {
        com.kwad.components.core.playable.a aVar = this.pb;
        if (aVar != null) {
            aVar.hJ();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        ((KsAdWebView) findViewById(R.id.ksad_playable_webview)).setVisibility(4);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.pb.px();
        this.pb.hJ();
        com.kwad.components.ad.reward.b.fr().b(this.sK);
    }
}

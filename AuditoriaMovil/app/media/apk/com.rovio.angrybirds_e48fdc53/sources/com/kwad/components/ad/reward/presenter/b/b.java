package com.kwad.components.ad.reward.presenter.b;

import android.text.TextUtils;
import android.view.View;
import com.kwad.components.ad.reward.m.p;
import com.kwad.components.ad.reward.m.r;
import com.kwad.components.ad.reward.model.AdLiveEndResultData;
import com.kwad.components.core.video.l;
import com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest;
import com.kwad.sdk.R;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.b.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a {
    private IAdLiveEndRequest fJ;
    private long gB;
    private p px;
    private View tQ;
    private final m<com.kwad.components.core.liveEnd.a, AdLiveEndResultData> mNetworking = new m<com.kwad.components.core.liveEnd.a, AdLiveEndResultData>() { // from class: com.kwad.components.ad.reward.presenter.b.b.1
        private static AdLiveEndResultData T(String str) {
            AdLiveEndResultData adLiveEndResultData = new AdLiveEndResultData();
            adLiveEndResultData.parseJson(new JSONObject(str));
            return adLiveEndResultData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.kwad.sdk.core.network.a
        /* renamed from: bB */
        public com.kwad.components.core.liveEnd.a createRequest() {
            return new com.kwad.components.core.liveEnd.a(b.this.fJ);
        }

        @Override // com.kwad.sdk.core.network.m
        public final boolean isPostByJson() {
            return false;
        }

        @Override // com.kwad.sdk.core.network.m
        public final /* synthetic */ AdLiveEndResultData parseData(String str) {
            return T(str);
        }
    };
    private final l sw = new l() { // from class: com.kwad.components.ad.reward.presenter.b.b.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayEnd() {
            super.onLivePlayEnd();
            b.this.hX();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayResume() {
            super.onLivePlayResume();
            b.this.hY();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            b.this.gB = j2;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            b.this.hY();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void hH() {
        j jVar = new j();
        z.a aVar = new z.a();
        jVar.cm(24);
        jVar.a(aVar);
        com.kwad.components.core.t.b.ql().a(this.qB.mAdTemplate, null, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hX() {
        if (this.fJ == null) {
            return;
        }
        this.mNetworking.request(new com.kwad.sdk.core.network.p<com.kwad.components.core.liveEnd.a, AdLiveEndResultData>() { // from class: com.kwad.components.ad.reward.presenter.b.b.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(com.kwad.components.core.liveEnd.a aVar) {
                super.onStartRequest(aVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(com.kwad.components.core.liveEnd.a aVar, int i, String str) {
                super.onError(aVar, i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(com.kwad.components.core.liveEnd.a aVar, final AdLiveEndResultData adLiveEndResultData) {
                super.onSuccess(aVar, adLiveEndResultData);
                if (adLiveEndResultData.mQLivePushEndInfo == null) {
                    return;
                }
                b.this.qB.mRootContainer.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (b.this.px == null) {
                            b.this.px = new p(b.this.qB);
                        }
                        b.this.px.h(b.this.qB.mRootContainer);
                        b.this.px.b(r.E(b.this.qB.mAdTemplate));
                        b.this.px.a(b.this.qB, adLiveEndResultData.mQLivePushEndInfo, b.this.gB);
                        b.this.qB.px = b.this.px;
                        b.this.tQ = b.this.findViewById(R.id.ksad_live_end_page_layout_root);
                        b.this.tQ.setVisibility(0);
                        b.this.hH();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hY() {
        View view = this.tQ;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        com.kwad.components.core.n.a.a.a aVar;
        super.ah();
        if (this.qB.oZ.jT()) {
            this.qB.oZ.a(this.sw);
            String aY = com.kwad.sdk.core.response.b.a.aY(d.ck(this.qB.mAdTemplate));
            if (TextUtils.isEmpty(aY) || (aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class)) == null) {
                return;
            }
            this.fJ = aVar.getAdLiveEndRequest(aY);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.mNetworking.cancel();
        if (this.qB.oZ.jT()) {
            this.qB.oZ.b(this.sw);
        }
    }
}

package com.kwad.components.ad.reward.presenter.f;

import android.widget.FrameLayout;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.core.webview.b.b;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.b.x;
import com.kwad.components.core.webview.jshandler.p;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.components.l;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class b extends d {
    private FrameLayout wk;
    private boolean wl = false;

    private void U(boolean z) {
        this.wk.setVisibility(z ? 0 : 8);
    }

    private com.kwad.components.core.webview.b.c ek() {
        return new com.kwad.components.core.webview.b.c() { // from class: com.kwad.components.ad.reward.presenter.f.b.1
            @Override // com.kwad.components.core.webview.b.c, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.c cVar2 = new com.kwad.components.core.webview.b.b.c();
                cVar2.WY = com.kwad.components.ad.reward.model.b.cL();
                cVar.a(cVar2);
            }
        };
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(final t tVar) {
        com.kwad.sdk.core.e.c.d("TKLivePresenter", "onSkipClick: " + tVar.Xl);
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.qB != null && b.this.qB.mAdOpenInteractionListener != null) {
                    b.this.qB.mAdOpenInteractionListener.onVideoSkipToEnd(tVar.Xl * 1000);
                }
                com.kwad.components.ad.reward.presenter.e.v(b.this.qB);
            }
        });
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(ek());
        lVar.c(new com.kwad.components.core.webview.b.b(new b.a() { // from class: com.kwad.components.ad.reward.presenter.f.b.2
            @Override // com.kwad.components.core.webview.b.b.a
            public final void eq() {
                com.kwad.components.ad.reward.model.b.L(b.this.qB.mContext);
            }
        }));
        lVar.c(new p() { // from class: com.kwad.components.ad.reward.presenter.f.b.3
            @Override // com.kwad.components.core.webview.jshandler.p
            public final void a(x xVar) {
                super.a(xVar);
                b.this.qB.mAdOpenInteractionListener.onVideoPlayStart();
                com.kwad.components.ad.reward.monitor.a.b(b.this.qB.pn, b.this.qB.mAdTemplate, b.this.qB.mPageEnterTime);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void b(x xVar) {
                super.b(xVar);
                b.this.qB.mAdTemplate.setmCurPlayTime(xVar.nQ);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void c(x xVar) {
                super.c(xVar);
                b.this.qB.mAdOpenInteractionListener.onVideoPlayEnd();
                b.this.qB.mAdTemplate.setmCurPlayTime(-1L);
                com.kwad.components.ad.reward.presenter.e.v(b.this.qB);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void d(x xVar) {
                super.d(xVar);
                long sa = xVar.sa();
                b.this.qB.mAdOpenInteractionListener.onVideoPlayError(xVar.errorCode, (int) sa);
                com.kwad.components.ad.reward.monitor.a.a(b.this.qB.pn, b.this.qB.mAdTemplate, b.this.qB.pJ, xVar.errorCode, sa);
            }
        });
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (this.wl) {
            return;
        }
        U(true);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((com.kwad.sdk.d.a.a.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.wl = true;
        U(false);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return true;
    }

    public final BackPressHandleResult gC() {
        return this.wo == null ? BackPressHandleResult.NOT_HANDLED : this.wo.gC();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.wk;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-live-video-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean iT() {
        return true;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.wk = (FrameLayout) findViewById(R.id.ksad_js_live_card);
    }
}

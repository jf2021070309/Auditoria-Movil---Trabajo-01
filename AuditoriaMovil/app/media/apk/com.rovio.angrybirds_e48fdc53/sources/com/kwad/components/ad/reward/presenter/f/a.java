package com.kwad.components.ad.reward.presenter.f;

import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.b.x;
import com.kwad.components.core.webview.jshandler.p;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.components.l;
/* loaded from: classes.dex */
public abstract class a extends d {
    private o wh;

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
        this.wh = oVar;
        oVar.a(new o.a() { // from class: com.kwad.components.ad.reward.presenter.f.a.1
            @Override // com.kwad.components.core.webview.b.a.o.a
            public final boolean isMuted() {
                return !a.this.qB.mVideoPlayConfig.isVideoSoundEnable() || com.kwad.components.core.t.a.ak(a.this.getContext()).qj();
            }
        });
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new p() { // from class: com.kwad.components.ad.reward.presenter.f.a.2
            @Override // com.kwad.components.core.webview.jshandler.p
            public final void a(x xVar) {
                super.a(xVar);
                a.this.qB.mAdOpenInteractionListener.onVideoPlayStart();
                com.kwad.components.ad.reward.monitor.a.b(a.this.qB.pn, a.this.qB.mAdTemplate, a.this.qB.mPageEnterTime);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void b(x xVar) {
                super.b(xVar);
                a.this.qB.mAdTemplate.setmCurPlayTime(xVar.nQ);
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void c(x xVar) {
                super.c(xVar);
                a.this.qB.mAdOpenInteractionListener.onVideoPlayEnd();
                a.this.qB.mAdTemplate.setmCurPlayTime(-1L);
                com.kwad.components.ad.reward.presenter.e.v(a.this.qB);
                if (xVar.rY()) {
                    com.kwad.components.ad.reward.j unused = a.this.qB;
                    com.kwad.components.ad.reward.j.a(a.this.qB.ph, new com.kwad.sdk.g.a<com.kwad.components.ad.reward.j.a>() { // from class: com.kwad.components.ad.reward.presenter.f.a.2.1
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.kwad.sdk.g.a
                        /* renamed from: c */
                        public void accept(com.kwad.components.ad.reward.j.a aVar) {
                            com.kwad.components.ad.reward.j unused2 = a.this.qB;
                            aVar.iR();
                        }
                    });
                }
            }

            @Override // com.kwad.components.core.webview.jshandler.p
            public final void d(x xVar) {
                super.d(xVar);
                long sa = xVar.sa();
                a.this.qB.mAdOpenInteractionListener.onVideoPlayError(xVar.errorCode, (int) sa);
                com.kwad.components.ad.reward.monitor.a.a(a.this.qB.pn, a.this.qB.mAdTemplate, a.this.qB.pJ, xVar.errorCode, sa);
            }
        });
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((com.kwad.sdk.d.a.a.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return true;
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean iT() {
        return true;
    }

    public final boolean iU() {
        if (this.ww != null) {
            return this.ww.iU();
        }
        return false;
    }
}

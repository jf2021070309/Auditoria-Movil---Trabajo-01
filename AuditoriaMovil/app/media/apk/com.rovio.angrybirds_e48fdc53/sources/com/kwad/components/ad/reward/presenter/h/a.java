package com.kwad.components.ad.reward.presenter.h;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.j.a.d;
import com.kwad.components.ad.reward.presenter.h;
import com.kwad.components.core.l.a.b;
import com.kwad.components.core.o.c;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.b.v;
import com.kwad.components.core.webview.b.g;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.widget.e;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements i {
    private FrameLayout lv;
    private AdInfo mAdInfo;
    private boolean tK;
    private boolean tL;
    private d wo;
    private boolean xr;
    private g xs;
    private long xt;
    private j.b tM = new j.b() { // from class: com.kwad.components.ad.reward.presenter.h.a.1
        @Override // com.kwad.components.ad.reward.j.b
        public final boolean interceptPlayCardResume() {
            return a.this.lv != null && a.this.lv.getVisibility() == 0;
        }
    };
    private final com.kwad.components.core.l.a.a so = new b() { // from class: com.kwad.components.ad.reward.presenter.h.a.2
        @Override // com.kwad.components.core.l.a.b, com.kwad.components.core.l.a.a
        public final void c(c cVar) {
            int i = 0;
            a.this.xr = false;
            if (a.this.xs == null) {
                return;
            }
            v vVar = new v();
            if (!com.kwad.components.core.r.a.pU().qa()) {
                if (com.kwad.components.core.r.a.pU().pY() && com.kwad.sdk.core.response.b.a.aF(a.this.mAdInfo) == 1) {
                    if (com.kwad.components.core.r.a.pU().pZ() == 1) {
                        if (ak.ak(a.this.getContext(), com.kwad.sdk.core.response.b.a.aq(a.this.mAdInfo))) {
                            i = 2;
                            vVar.Xn = 2;
                        }
                    } else if (com.kwad.components.core.r.a.pU().pZ() != 3) {
                        return;
                    } else {
                        vVar.Xn = 1;
                    }
                    com.kwad.components.core.r.a.pU().aF(i);
                    a.this.xs.b(vVar);
                    return;
                }
                return;
            }
            com.kwad.components.core.r.a.pU().aH(false);
            if (com.kwad.sdk.core.response.b.a.aF(a.this.mAdInfo) == 0 || com.kwad.components.core.r.a.pU().pW()) {
                vVar.Xn = 1;
                a.this.xs.b(vVar);
            }
            vVar.Xn = 0;
            a.this.xs.b(vVar);
        }

        @Override // com.kwad.components.core.l.a.b, com.kwad.components.core.l.a.a
        public final void d(c cVar) {
            super.d(cVar);
            a.this.xr = true;
        }
    };
    private final l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.h.a.3
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            long a = j.a(j, a.this.mAdInfo);
            long aE = com.kwad.sdk.core.response.b.a.aE(a.this.mAdInfo) * 1000;
            if (j2 <= a.this.xt || a - j2 <= aE || a.this.tK) {
                return;
            }
            if (com.kwad.sdk.core.response.b.a.aF(a.this.mAdInfo) == 1) {
                if (ak.ak(a.this.getContext(), com.kwad.sdk.core.response.b.a.aq(a.this.mAdInfo))) {
                    return;
                }
            } else if (a.this.qB.fz) {
                return;
            }
            a.b(a.this, true);
            a.this.wo.a(a.this.qB.getActivity(), a.this.qB.mAdTemplate, a.this);
        }
    };

    static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.tK = true;
        return true;
    }

    private void hG() {
        if (h.A(this.qB)) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.h.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.qB.mAdOpenInteractionListener != null) {
                        a.this.qB.mAdOpenInteractionListener.onRewardVerify();
                    }
                    a.this.qB.oZ.pause();
                    a.this.qB.fT();
                }
            }, 200L);
            return;
        }
        if (this.qB.mAdOpenInteractionListener != null) {
            this.qB.mAdOpenInteractionListener.onRewardVerify();
        }
        this.qB.oZ.pause();
        this.qB.fT();
    }

    private g jn() {
        return new g() { // from class: com.kwad.components.ad.reward.presenter.h.a.5
            @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
            }
        };
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
    public final void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        g jn = jn();
        this.xs = jn;
        lVar.c(jn);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        int i;
        this.qB.mAdOpenInteractionListener.bF();
        if (com.kwad.sdk.core.response.b.a.aG(this.mAdInfo)) {
            com.kwad.components.core.r.a.pU().aE(aVar.azk);
            if (aVar.azk == -1) {
                i = 0;
                com.kwad.components.core.r.a.pU().aH(false);
            } else {
                i = 1;
                if (!com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
                    com.kwad.components.core.r.a.pU().aH(true);
                    return;
                } else if (com.kwad.components.core.r.a.pU().pZ() == 2) {
                    com.kwad.components.core.r.a.pU().aF(3);
                    return;
                }
            }
            com.kwad.components.core.r.a.pU().aF(i);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.xr = false;
        com.kwad.sdk.core.e.c.d("TkRewardVideoTaskPresenter", "onBind: ");
        if (this.wo == null) {
            this.wo = new d(this.qB, -1L, getContext(), new DialogInterface.OnDismissListener() { // from class: com.kwad.components.ad.reward.presenter.h.a.4
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (a.this.xs == null) {
                        return;
                    }
                    v vVar = new v();
                    if (com.kwad.components.core.r.a.pU().qa()) {
                        com.kwad.components.core.r.a.pU().aH(false);
                        if (com.kwad.sdk.core.response.b.a.aF(a.this.mAdInfo) == 0 || com.kwad.components.core.r.a.pU().pW()) {
                            vVar.Xn = 1;
                        } else {
                            vVar.Xn = 0;
                        }
                        a.this.xs.b(vVar);
                    } else if (com.kwad.components.core.r.a.pU().pY() && com.kwad.sdk.core.response.b.a.aF(a.this.mAdInfo) == 1) {
                        if (com.kwad.components.core.r.a.pU().pZ() == 1) {
                            if (ak.ak(a.this.getContext(), com.kwad.sdk.core.response.b.a.aq(a.this.mAdInfo))) {
                                return;
                            }
                            vVar.Xn = 0;
                            a.this.xs.b(vVar);
                        } else if (com.kwad.components.core.r.a.pU().pZ() == 3) {
                            vVar.Xn = 1;
                            com.kwad.components.core.r.a.pU().aF(0);
                            a.this.xs.b(vVar);
                        }
                    }
                }
            });
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        this.mAdInfo = ck;
        this.xt = com.kwad.sdk.core.response.b.a.aD(ck) * 1000;
        this.qB.oZ.a(this.mVideoPlayStateListener);
        this.qB.a(this.tM);
        this.qB.Lm.add(this.so);
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
            if (com.kwad.components.core.r.a.pU().pV() == 1) {
                hG();
            }
        }
        if (this.tL && !this.xr) {
            this.qB.oZ.resume();
        }
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        com.kwad.sdk.core.e.c.d("TkRewardVideoTaskPresenter", "onTkLoadFailed: ");
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        com.kwad.sdk.core.e.c.d("TkRewardVideoTaskPresenter", "onTkLoadSuccess: ");
        getContext();
        if (ai.IK()) {
            this.lv.setVisibility(0);
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
        com.kwad.sdk.core.e.c.d("TkRewardVideoTaskPresenter", "getTkTemplateId: ");
        return com.kwad.components.core.webview.b.j.b("ksad-video-task-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final e getTouchCoordsView() {
        return this.qB.mRootContainer;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        com.kwad.sdk.core.e.c.d("TkRewardVideoTaskPresenter", "onCreate: ");
        this.lv = (FrameLayout) findViewById(R.id.ksad_js_task);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.qB.b(this.tM);
        this.qB.Lm.remove(this.so);
        this.wo.jx();
        this.wo = null;
        this.lv.setVisibility(8);
        com.kwad.components.core.r.a.pU().clear();
        this.tK = false;
        this.tL = false;
        this.xr = false;
    }
}

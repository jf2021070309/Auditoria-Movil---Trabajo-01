package com.kwad.components.ad.reward;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.ad.reward.presenter.s;
import com.kwad.components.ad.reward.presenter.t;
import com.kwad.components.ad.reward.presenter.u;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class o extends com.kwad.components.ad.reward.presenter.a implements com.kwad.components.ad.reward.e.f {
    private ViewGroup gi;
    private com.kwad.components.core.l.b gj;
    private com.kwad.components.ad.reward.presenter.q gk;
    private com.kwad.components.ad.reward.presenter.f.b gl;
    private com.kwad.components.ad.reward.presenter.e.a gn;
    private com.kwad.components.ad.reward.presenter.f.h go;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.o.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String b = com.kwad.components.core.webview.b.j.b("ksad-neo-video-card", o.this.qB.mAdTemplate);
            String b2 = com.kwad.components.core.webview.b.j.b("ksad-live-video-card", o.this.qB.mAdTemplate);
            com.kwad.sdk.core.e.c.d("RewardPresenter", "onTkLoadFailed, rewardPageTemplateId: " + b + ", templateId: " + str);
            String b3 = com.kwad.components.core.webview.b.j.b("ksad-image-video-card", o.this.qB.mAdTemplate);
            if (TextUtils.equals(b, str) || TextUtils.equals(b2, str)) {
                j.a(o.this.getContext(), o.this.qB, o.this.mPlayLayout);
                o.this.qB.a(RewardRenderResult.DEFAULT);
                o oVar = o.this;
                oVar.a(oVar.gj, o.this.mModel);
            } else if (TextUtils.equals(b3, str)) {
                o.this.qB.a(RewardRenderResult.DEFAULT);
                o oVar2 = o.this;
                oVar2.a(oVar2.gj, o.this.mModel);
            }
        }
    };
    private com.kwad.components.ad.reward.model.c mModel;
    private FrameLayout mPlayLayout;
    private j qB;
    private a qC;

    /* loaded from: classes.dex */
    public interface a {
        void onUnbind();
    }

    public o(com.kwad.components.core.l.b bVar, ViewGroup viewGroup, com.kwad.components.ad.reward.model.c cVar, j jVar) {
        this.gi = viewGroup;
        this.mModel = cVar;
        this.qB = jVar;
        this.gj = bVar;
        a(cVar);
        AdInfo bC = cVar.bC();
        boolean dF = com.kwad.sdk.core.response.b.b.dF(bC);
        boolean z = com.kwad.sdk.core.response.b.a.cw(bC) || com.kwad.sdk.core.response.b.a.aV(bC) || j.v(cVar.getAdTemplate());
        boolean cF = com.kwad.sdk.core.response.b.a.cF(bC);
        com.kwad.sdk.core.e.c.d("RewardPresenter", "notFullTk: " + z + ", mLoadStrategy: " + this.qB.pQ);
        if (cF) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            jVar.a(RewardRenderResult.LIVE_TK);
            bL();
        } else if (dF) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            jVar.a(RewardRenderResult.TK_IMAGE);
            bM();
        } else if (z || !this.qB.pQ.equals(LoadStrategy.FULL_TK)) {
            jVar.a(RewardRenderResult.DEFAULT);
            a(bVar, cVar);
        } else {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            jVar.a(RewardRenderResult.NEO_TK);
            gB();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(com.kwad.components.ad.reward.e.f fVar) {
        return getPriority() - fVar.getPriority();
    }

    private void a(com.kwad.components.ad.reward.model.c cVar) {
        AdTemplate adTemplate = cVar.getAdTemplate();
        AdInfo bC = cVar.bC();
        if (j.g(bC)) {
            a(new com.kwad.components.ad.reward.presenter.f());
        }
        if (com.kwad.sdk.core.response.b.a.aG(bC)) {
            a(new com.kwad.components.ad.reward.presenter.h.a());
        }
        if (com.kwad.sdk.core.response.b.b.cM(bC)) {
            a(new com.kwad.components.ad.reward.presenter.f.j());
        }
        com.kwad.components.ad.reward.presenter.q qVar = new com.kwad.components.ad.reward.presenter.q(adTemplate);
        this.gk = qVar;
        a((Presenter) qVar, true);
        if (com.kwad.sdk.core.response.b.b.dC(bC) && ai.IL()) {
            com.kwad.components.ad.reward.presenter.e.a aVar = new com.kwad.components.ad.reward.presenter.e.a();
            this.gn = aVar;
            a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.kwad.components.core.l.b bVar, com.kwad.components.ad.reward.model.c cVar) {
        com.kwad.components.ad.reward.model.c cVar2 = this.mModel;
        if (cVar2 == null) {
            return;
        }
        AdInfo bC = cVar2.bC();
        AdTemplate adTemplate = this.mModel.getAdTemplate();
        a((Presenter) new u(), true);
        if (com.kwad.sdk.core.response.b.a.aH(bC)) {
            a((Presenter) new com.kwad.components.ad.reward.presenter.c(), true);
        }
        a((Presenter) new com.kwad.components.ad.reward.presenter.l(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.g(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.platdetail.c(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.platdetail.a.e(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.f.e(), true);
        boolean ht = cVar.ht();
        boolean hu = cVar.hu();
        boolean z = cVar.bD() && !ai.IL();
        if (!ht && !hu && !z) {
            a((Presenter) new com.kwad.components.ad.reward.presenter.platdetail.actionbar.c(), true);
        }
        a((Presenter) new com.kwad.components.ad.reward.presenter.m(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.b(bC), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.d.b(adTemplate, true), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.c.a(), true);
        a((Presenter) new t(), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.d(adTemplate, bC, this.gi), true);
        a((Presenter) new com.kwad.components.ad.reward.presenter.k(), true);
        if (this.qB.pn && com.kwad.components.ad.reward.d.a.b(this.qB.mContext, com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            a((Presenter) new com.kwad.components.ad.reward.presenter.a.a(), true);
        }
        if (com.kwad.sdk.core.response.b.b.bS(adTemplate)) {
            a((Presenter) new s(), true);
        }
        if (com.kwad.sdk.core.response.b.a.aV(bC)) {
            a((Presenter) new com.kwad.components.ad.reward.presenter.platdetail.b(), true);
        }
        if (com.kwad.sdk.core.response.b.a.cw(bC)) {
            a((Presenter) new com.kwad.components.ad.reward.presenter.b.c(), true);
            a((Presenter) new com.kwad.components.ad.reward.presenter.b.a(), true);
            a((Presenter) new com.kwad.components.ad.reward.presenter.b.b(), true);
            a((Presenter) new com.kwad.components.ad.reward.presenter.j(), true);
        }
        a((Presenter) new com.kwad.components.ad.reward.presenter.i(), true);
    }

    private void bL() {
        com.kwad.components.ad.reward.presenter.f.b bVar = new com.kwad.components.ad.reward.presenter.f.b();
        this.gl = bVar;
        a(bVar);
    }

    private void bM() {
        com.kwad.components.ad.reward.presenter.f.c cVar = new com.kwad.components.ad.reward.presenter.f.c();
        this.go = cVar;
        a(cVar);
    }

    private void gB() {
        com.kwad.components.ad.reward.presenter.f.h hVar = new com.kwad.components.ad.reward.presenter.f.h();
        this.go = hVar;
        a(hVar);
    }

    public final void a(a aVar) {
        this.qC = aVar;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.b(this);
        com.kwad.components.ad.reward.c.a.gY().setCallerContext(this.qB);
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final void bE() {
        this.qB.D(true);
    }

    public final BackPressHandleResult gC() {
        com.kwad.components.ad.reward.presenter.q qVar = this.gk;
        if (qVar == null || !qVar.bQ()) {
            com.kwad.components.ad.reward.presenter.e.a aVar = this.gn;
            if (aVar == null || aVar.gC() != BackPressHandleResult.HANDLED) {
                com.kwad.components.ad.reward.presenter.f.b bVar = this.gl;
                if (bVar != null) {
                    return bVar.gC();
                }
                com.kwad.components.ad.reward.presenter.f.h hVar = this.go;
                return hVar != null ? hVar.gC() : BackPressHandleResult.NOT_HANDLED;
            }
            return BackPressHandleResult.HANDLED;
        }
        return BackPressHandleResult.HANDLED;
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final int getPriority() {
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.mPlayLayout = (FrameLayout) this.gi.findViewById(R.id.ksad_reward_play_layout);
        if (RewardRenderResult.DEFAULT.equals(this.qB.gb())) {
            j.a(getContext(), this.qB, this.mPlayLayout);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        this.gj = null;
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this);
        a aVar = this.qC;
        if (aVar != null) {
            aVar.onUnbind();
        }
        com.kwad.components.ad.reward.c.a.gY().reset();
    }
}

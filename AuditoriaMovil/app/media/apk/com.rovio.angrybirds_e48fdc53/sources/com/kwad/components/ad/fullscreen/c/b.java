package com.kwad.components.ad.fullscreen.c;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.RewardRenderResult;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.ad.reward.presenter.d;
import com.kwad.components.ad.reward.presenter.f.h;
import com.kwad.components.ad.reward.presenter.i;
import com.kwad.components.ad.reward.presenter.k;
import com.kwad.components.ad.reward.presenter.l;
import com.kwad.components.ad.reward.presenter.q;
import com.kwad.components.ad.reward.presenter.u;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements f {
    private com.kwad.components.ad.fullscreen.b gh;
    private ViewGroup gi;
    private com.kwad.components.core.l.b gj;
    private q gk;
    private com.kwad.components.ad.reward.presenter.f.b gl;
    private e gm;
    private com.kwad.components.ad.reward.presenter.e.a gn;
    private h go;
    private FrameLayout mPlayLayout;

    public b(com.kwad.components.core.l.b bVar, ViewGroup viewGroup, com.kwad.components.ad.fullscreen.b bVar2, j jVar) {
        this.gj = bVar;
        this.gh = bVar2;
        this.gi = viewGroup;
        this.qB = jVar;
        bJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        return getPriority() - fVar.getPriority();
    }

    private void bJ() {
        if (this.gh == null) {
            return;
        }
        bO();
        AdInfo bC = this.gh.bC();
        boolean cF = com.kwad.sdk.core.response.b.a.cF(bC);
        boolean dF = com.kwad.sdk.core.response.b.b.dF(bC);
        if (cF) {
            this.qB.a(RewardRenderResult.LIVE_TK);
            com.kwad.components.core.webview.b.d.b.si().a(bP());
            bL();
        } else if (dF) {
            com.kwad.components.core.webview.b.d.b.si().a(bP());
            this.qB.a(RewardRenderResult.TK_IMAGE);
            bM();
        } else if (!j.a(this.qB)) {
            this.qB.a(RewardRenderResult.DEFAULT);
            bK();
        } else {
            this.qB.a(RewardRenderResult.FULLSCREEN_TK);
            bN();
            com.kwad.components.core.webview.b.d.b.si().a(bP());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bK() {
        com.kwad.components.core.webview.b.d.b.si().b(this.gm);
        AdTemplate adTemplate = this.gh.getAdTemplate();
        AdInfo bC = this.gh.bC();
        boolean z = this.gh.bD() && !ai.IL();
        a(new u(), true);
        if (com.kwad.sdk.core.response.b.a.aH(bC)) {
            a(new com.kwad.components.ad.reward.presenter.c(), true);
        }
        a(new l(), true);
        a(new com.kwad.components.ad.reward.presenter.platdetail.c(), true);
        a(new com.kwad.components.ad.reward.presenter.f.e(), true);
        if (com.kwad.sdk.core.response.b.b.cM(bC)) {
            a(new com.kwad.components.ad.reward.presenter.f.j(), true);
        }
        if (!z) {
            a(new com.kwad.components.ad.reward.presenter.platdetail.actionbar.c(), true);
        }
        a(new com.kwad.components.ad.reward.presenter.c.a(), true);
        if (com.kwad.sdk.core.response.b.b.bR(adTemplate)) {
            a(new com.kwad.components.ad.fullscreen.c.a.f(), true);
        }
        if (com.kwad.sdk.core.response.b.a.aV(bC)) {
            a(new com.kwad.components.ad.reward.presenter.platdetail.b(), true);
        }
        a(new k(), true);
        if (com.kwad.sdk.core.response.b.a.cw(bC)) {
            a(new com.kwad.components.ad.reward.presenter.b.c(), true);
            a(new com.kwad.components.ad.reward.presenter.b.b(), true);
            a(new com.kwad.components.ad.reward.presenter.j(), true);
            a(new com.kwad.components.ad.reward.presenter.b.a(), true);
        }
        a(new c(), true);
        a(new i(), true);
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

    private void bN() {
        a(new com.kwad.components.ad.fullscreen.c.c.b(), true);
    }

    private void bO() {
        AdTemplate adTemplate = this.gh.getAdTemplate();
        AdInfo bC = this.gh.bC();
        a(new a(), true);
        a(new com.kwad.components.ad.reward.presenter.d.b(adTemplate, false), true);
        q qVar = new q(adTemplate, false, false);
        this.gk = qVar;
        a(qVar, true);
        a(new d(adTemplate, bC, this.gi), true);
        if (com.kwad.sdk.core.response.b.b.dC(bC) && ai.IL()) {
            com.kwad.components.ad.reward.presenter.e.a aVar = new com.kwad.components.ad.reward.presenter.e.a();
            this.gn = aVar;
            a(aVar, true);
        }
    }

    private e bP() {
        if (this.gm == null) {
            final String b = com.kwad.components.core.webview.b.j.b("ksad-fullscreen-video-card", this.gh.getAdTemplate());
            final String b2 = com.kwad.components.core.webview.b.j.b("ksad-live-video-card", this.qB.mAdTemplate);
            final String b3 = com.kwad.components.core.webview.b.j.b("ksad-image-video-card", this.qB.mAdTemplate);
            this.gm = new e() { // from class: com.kwad.components.ad.fullscreen.c.b.1
                @Override // com.kwad.components.core.webview.b.e.b
                public final void q(String str) {
                    if (b.equals(str) || b2.equals(str)) {
                        j.a(b.this.getContext(), b.this.qB, b.this.mPlayLayout);
                        b.this.bK();
                    } else if (TextUtils.equals(b3, str)) {
                        b.this.qB.a(RewardRenderResult.DEFAULT);
                        b.this.bK();
                    }
                }
            };
        }
        return this.gm;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.b(this);
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final void bE() {
        this.qB.D(true);
    }

    public final boolean bQ() {
        q qVar = this.gk;
        if (qVar == null || !qVar.bQ()) {
            com.kwad.components.ad.reward.presenter.e.a aVar = this.gn;
            if (aVar == null || aVar.gC() != BackPressHandleResult.HANDLED) {
                com.kwad.components.ad.reward.presenter.f.b bVar = this.gl;
                return bVar != null && bVar.gC() == BackPressHandleResult.HANDLED;
            }
            return true;
        }
        return true;
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
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this);
        com.kwad.components.core.webview.b.d.b.si().b(this.gm);
    }
}

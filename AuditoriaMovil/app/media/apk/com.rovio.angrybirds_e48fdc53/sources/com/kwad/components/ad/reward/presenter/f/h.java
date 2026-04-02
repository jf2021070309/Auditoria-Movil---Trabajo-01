package com.kwad.components.ad.reward.presenter.f;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.core.i.a;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.b;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h extends a implements com.kwad.components.ad.reward.e.h, a.InterfaceC0202a {
    private com.kwad.components.core.webview.b.f ly;
    private List<com.kwad.components.core.i.c> to;
    private FrameLayout wQ;
    private FrameLayout wR;
    private FrameLayout wS;
    protected FrameLayout wk;
    private boolean wl = false;
    private final com.kwad.components.core.webview.b.e.a pk = new com.kwad.components.core.webview.b.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.h.1
        @Override // com.kwad.components.core.webview.b.e.a
        public final void cl() {
            if (h.this.ly != null) {
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = h.this.qB.fz ? 1 : 0;
                h.this.ly.b(aVar);
            }
        }
    };

    private void W(boolean z) {
        com.kwad.sdk.core.e.c.d("TkRewardPagePresenter", "fullTK: " + z);
        FrameLayout frameLayout = this.wk;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(z ? 0 : 8);
        this.wQ.setVisibility(z ? 8 : 0);
        this.wR.setVisibility(z ? 8 : 0);
        this.wS.setVisibility(z ? 8 : 0);
    }

    private static List<AdTemplate> a(List<com.kwad.components.core.i.c> list, AdTemplate adTemplate) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adTemplate);
        arrayList.addAll(com.kwad.components.core.i.c.j(list));
        return arrayList;
    }

    private com.kwad.components.core.webview.b.c ek() {
        return new com.kwad.components.core.webview.b.c() { // from class: com.kwad.components.ad.reward.presenter.f.h.6
            @Override // com.kwad.components.core.webview.b.c, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.c cVar2 = new com.kwad.components.core.webview.b.b.c();
                cVar2.WY = com.kwad.components.ad.reward.model.b.cL();
                cVar.a(cVar2);
            }
        };
    }

    private com.kwad.components.core.webview.b.f el() {
        return new com.kwad.components.core.webview.b.f() { // from class: com.kwad.components.ad.reward.presenter.f.h.5
            @Override // com.kwad.components.core.webview.b.f, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = h.this.qB.fz ? 1 : 0;
                cVar.a(aVar);
            }
        };
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
        FrameLayout frameLayout;
        if (this.wl || (frameLayout = this.wk) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
        com.kwad.sdk.core.e.c.d("TkRewardPagePresenter", "onSkipClick: " + tVar.Xl);
        if (this.qB != null && this.qB.mAdOpenInteractionListener != null) {
            this.qB.mAdOpenInteractionListener.onVideoSkipToEnd(tVar.Xl * 1000);
        }
        com.kwad.components.ad.reward.presenter.e.v(this.qB);
        com.kwad.components.ad.reward.j.a(this.qB.ph, new com.kwad.sdk.g.a<com.kwad.components.ad.reward.j.a>() { // from class: com.kwad.components.ad.reward.presenter.f.h.7
            private static void c(com.kwad.components.ad.reward.j.a aVar) {
                aVar.iS();
            }

            @Override // com.kwad.sdk.g.a
            public final /* synthetic */ void accept(com.kwad.components.ad.reward.j.a aVar) {
                c(aVar);
            }
        });
    }

    @Override // com.kwad.components.ad.reward.presenter.f.a, com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new com.kwad.components.ad.reward.c.f(new com.kwad.components.ad.reward.c.d() { // from class: com.kwad.components.ad.reward.presenter.f.h.2
            @Override // com.kwad.components.ad.reward.c.d
            public final void a(com.kwad.components.ad.reward.c.b bVar2) {
                com.kwad.sdk.core.e.c.d("TkRewardPagePresenter", "onUpdateExtraReward : " + bVar2.hb());
                h.this.a(bVar2);
            }
        }));
        this.ly = el();
        this.qB.a(this.pk);
        lVar.c(this.ly);
        lVar.c(new com.kwad.components.core.webview.b.b(new b.a() { // from class: com.kwad.components.ad.reward.presenter.f.h.3
            @Override // com.kwad.components.core.webview.b.b.a
            public final void eq() {
                com.kwad.components.ad.reward.model.b.L(h.this.qB.mContext);
            }
        }));
        lVar.c(ek());
        lVar.c(new com.kwad.components.core.webview.jshandler.f(new com.kwad.components.core.webview.jshandler.j() { // from class: com.kwad.components.ad.reward.presenter.f.h.4
            @Override // com.kwad.components.core.webview.jshandler.j
            public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
                if (TextUtils.equals(str, "autoCallApp")) {
                    fVar.aM(com.kwad.components.ad.reward.j.g(com.kwad.sdk.core.response.b.d.ck(h.this.qB.mAdTemplate)) && com.kwad.sdk.core.d.a.AW() && h.this.qB.mScreenOrientation == 0);
                }
            }
        }));
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        if (aVar == null || com.kwad.sdk.core.response.b.d.b(this.qB.mAdTemplate, aVar.creativeId, aVar.adStyle)) {
            this.qB.mAdOpenInteractionListener.bF();
            return;
        }
        com.kwad.components.core.i.c a = com.kwad.components.ad.reward.j.a(this.to, aVar.creativeId);
        if (a != null) {
            this.qB.a(a);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (!this.wl) {
            W(true);
        }
        this.qB.po = true ^ this.wl;
        this.qB.a((a.InterfaceC0202a) this);
        com.kwad.components.ad.reward.b.fr().a(this);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        super.b(webCloseStatus);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        FrameLayout frameLayout;
        if (this.wl || (frameLayout = this.wk) == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void c(List<com.kwad.components.core.i.c> list) {
        if (list == null || list.size() == 0 || this.wo == null) {
            return;
        }
        this.to = list;
        List<AdTemplate> a = a(list, this.qB.mAdTemplate);
        com.kwad.sdk.core.webview.b rJ = this.wo.rJ();
        if (rJ != null) {
            rJ.setAdTemplateList(a);
        }
        com.kwad.components.ad.reward.j.l jw = this.wo.jw();
        if (jw != null) {
            jw.e(a);
        } else {
            this.wo.f(a);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        com.kwad.sdk.core.e.c.d("TkRewardPagePresenter", "onTkLoadFailed");
        this.wl = true;
        this.qB.po = false;
        W(false);
    }

    public final BackPressHandleResult gC() {
        return this.wo == null ? BackPressHandleResult.NOT_HANDLED : this.wo.gC();
    }

    @Override // com.kwad.components.core.webview.b.i
    public FrameLayout getTKContainer() {
        return this.wk;
    }

    public String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-neo-video-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onCreate() {
        super.onCreate();
        this.wk = (FrameLayout) findViewById(R.id.ksad_js_reward_card);
        this.wQ = (FrameLayout) findViewById(R.id.ksad_js_top);
        this.wR = (FrameLayout) findViewById(R.id.ksad_js_middle);
        this.wS = (FrameLayout) findViewById(R.id.ksad_js_bottom);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onError(int i, String str) {
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onRequestResult(int i) {
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.b((a.InterfaceC0202a) this);
        com.kwad.components.ad.reward.b.fr().b(this);
    }
}

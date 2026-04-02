package com.kwad.components.ad.reward.presenter.f;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.webview.b.b;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class e extends d implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private com.kwad.components.core.webview.b.f ly;
    private final com.kwad.components.core.webview.b.e.a pk = new com.kwad.components.core.webview.b.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.e.4
        @Override // com.kwad.components.core.webview.b.e.a
        public final void cl() {
            if (e.this.ly != null) {
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = e.this.qB.fz ? 1 : 0;
                e.this.ly.b(aVar);
            }
        }
    };
    private ViewGroup wD;
    private ViewGroup wE;
    private ViewGroup wF;
    private View wG;
    private ViewGroup wH;
    private FrameLayout wI;

    private void R(final int i) {
        this.qB.mRootContainer.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.f.e.3
            @Override // java.lang.Runnable
            public final void run() {
                int jg = e.this.jg();
                int S = e.this.S(i);
                if (e.this.wI != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e.this.wI.getLayoutParams();
                    layoutParams.width = -1;
                    int height = (e.this.qB.mRootContainer.getHeight() - jg) - S;
                    if (height < 0) {
                        height = 0;
                    }
                    layoutParams.topMargin = jg;
                    layoutParams.height = height;
                    e.this.wI.setLayoutParams(layoutParams);
                }
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int S(int i) {
        ViewGroup viewGroup = this.wE;
        if (viewGroup == null || viewGroup.getHeight() <= 0) {
            ViewGroup viewGroup2 = this.wH;
            return (viewGroup2 == null || viewGroup2.getHeight() <= 0) ? i > 0 ? i : com.kwad.sdk.d.a.a.a(getContext(), 120.0f) : this.wH.getHeight();
        }
        return this.wE.getHeight();
    }

    private com.kwad.components.core.webview.b.c ek() {
        return new com.kwad.components.core.webview.b.c() { // from class: com.kwad.components.ad.reward.presenter.f.e.7
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
        return new com.kwad.components.core.webview.b.f() { // from class: com.kwad.components.ad.reward.presenter.f.e.6
            @Override // com.kwad.components.core.webview.b.f, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.a aVar = new com.kwad.components.core.webview.b.b.a();
                aVar.WW = e.this.qB.fz ? 1 : 0;
                cVar.a(aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jg() {
        ViewGroup viewGroup;
        int height;
        if (this.wD.getHeight() > 0) {
            viewGroup = this.wD;
        } else if (com.kwad.sdk.core.response.b.a.aH(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate)) && (height = ((ViewGroup.MarginLayoutParams) this.wG.getLayoutParams()).topMargin + 0 + this.wG.getHeight()) > 0) {
            return height;
        } else {
            viewGroup = this.wF;
        }
        return viewGroup.getHeight();
    }

    private com.kwad.components.core.webview.b.e jh() {
        return new com.kwad.components.core.webview.b.e() { // from class: com.kwad.components.ad.reward.presenter.f.e.5
            @Override // com.kwad.components.core.webview.b.e, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                com.kwad.components.core.webview.b.b.i iVar = new com.kwad.components.core.webview.b.b.i();
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(e.this.qB.mAdTemplate);
                iVar.rewardTime = e.this.qB.pq ? com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.components.core.r.a.pU().pV() == 0 ? com.kwad.sdk.core.response.b.a.aE(ck) : com.kwad.sdk.core.response.b.a.aC(ck) : 0;
                cVar.a(iVar);
            }
        };
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(RewardActionBarControl.ShowActionBarResult showActionBarResult, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        R(layoutParams != null ? layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + layoutParams.height : layoutParams.height : 0);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        this.ly = el();
        this.qB.a(this.pk);
        lVar.c(this.ly);
        lVar.c(jh());
        lVar.c(new com.kwad.components.core.webview.b.b(new b.a() { // from class: com.kwad.components.ad.reward.presenter.f.e.1
            @Override // com.kwad.components.core.webview.b.b.a
            public final void eq() {
                com.kwad.components.ad.reward.model.b.L(e.this.qB.mContext);
            }
        }));
        lVar.c(ek());
        lVar.c(new com.kwad.components.core.webview.jshandler.f(new com.kwad.components.core.webview.jshandler.j() { // from class: com.kwad.components.ad.reward.presenter.f.e.2
            @Override // com.kwad.components.core.webview.jshandler.j
            public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
                if (TextUtils.equals(str, "autoCallApp")) {
                    fVar.aM(com.kwad.components.ad.reward.j.g(com.kwad.sdk.core.response.b.d.ck(e.this.qB.mAdTemplate)) && com.kwad.sdk.core.d.a.AW() && e.this.qB.mScreenOrientation == 0);
                }
            }
        }));
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.pc.a(this);
        this.wI.setVisibility(0);
        R(0);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.wI.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return !this.qB.oZ.jT();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.wI;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-video-middle-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.wI = (FrameLayout) findViewById(R.id.ksad_js_middle);
        this.wD = (ViewGroup) findViewById(R.id.ksad_js_top);
        this.wF = (ViewGroup) findViewById(R.id.ksad_play_detail_top_toolbar);
        this.wE = (ViewGroup) findViewById(R.id.ksad_js_bottom);
        this.wH = (ViewGroup) findViewById(R.id.ksad_play_web_card_webView);
        this.wG = findViewById(R.id.ksad_compliance_view);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.pc.b(this);
        this.qB.a((com.kwad.components.core.webview.b.e.a) null);
    }
}

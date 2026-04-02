package com.kwad.components.ad.reward.presenter.e;

import android.widget.FrameLayout;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.ad.reward.presenter.f.d;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.b.b;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class a extends d implements com.kwad.components.ad.reward.j.a {
    private KSFrameLayout wb;
    private AdMatrixInfo.PreLandingPageTKInfo wc;
    private ap wd;
    private boolean oj = false;
    private f we = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.e.a.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            c.d("TKPreFormPresenter", "handleToSkip PlayEndPageListener onPlayEndPageShow: " + a.this.qB.ps);
            if (a.this.qB.ps) {
                return;
            }
            a.this.iP();
        }
    };

    private void T(final boolean z) {
        c.d("TKPreFormPresenter", "switchPreForm: " + z);
        this.wb.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.wb.setVisibility(z ? 0 : 4);
                a.this.wb.setClickable(z);
                if (a.this.wd != null) {
                    if (z) {
                        a.this.wd.rC();
                        a.this.wd.rD();
                        return;
                    }
                    a.this.wd.rE();
                    a.this.wd.rF();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iP() {
        if (!this.oj || this.wc == null) {
            return;
        }
        c.d("TKPreFormPresenter", "handleToSkip handleToPlayEnd isPlayEndShow: " + this.wc.isPlayEndShow());
        if (this.wc.isPlayEndShow()) {
            T(true);
        }
    }

    private void iQ() {
        if (!this.oj || this.wc == null) {
            return;
        }
        c.d("TKPreFormPresenter", "handleToSkip mPreLandingPageData isSkipShow: " + this.wc.isSkipShow());
        if (this.wc.isSkipShow()) {
            T(true);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.wc = b.bT(this.qB.mAdTemplate);
        this.qB.b(this.we);
        this.qB.a((com.kwad.components.ad.reward.j.a) this);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        super.b(apVar);
        this.wd = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.oj = false;
        c.d("TKPreFormPresenter", "onTkLoadFailed");
        T(false);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    public final boolean ce() {
        return true;
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void ej() {
        super.ej();
        c.d("TKPreFormPresenter", "onTkLoadSuccess");
        this.oj = true;
    }

    public final BackPressHandleResult gC() {
        KSFrameLayout kSFrameLayout;
        return (this.wo == null || (kSFrameLayout = this.wb) == null) ? BackPressHandleResult.NOT_HANDLED : kSFrameLayout.getVisibility() == 0 ? this.wo.gC() : BackPressHandleResult.NOT_HANDLED;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.wb;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return j.b("ksad-pre-landingpage-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void iR() {
        c.d("TKPreFormPresenter", "onPlayComplete: ");
        iP();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void iS() {
        c.d("TKPreFormPresenter", "onSkipClick: ");
        iQ();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.wb = (KSFrameLayout) findViewById(R.id.ksad_pre_form_card);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.c(this.we);
        this.qB.b((com.kwad.components.ad.reward.j.a) this);
    }
}

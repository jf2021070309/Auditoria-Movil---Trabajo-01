package com.kwad.components.core.e.a;

import android.content.Context;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class g extends KSFrameLayout {
    private final d Jb;
    private a Jk;
    private final d Jm;
    private final com.kwad.components.core.widget.a.b bG;
    private final AdTemplate mAdTemplate;
    private Presenter mPresenter;
    private boolean ol;

    public g(Context context, AdTemplate adTemplate, d dVar) {
        super(context);
        this.Jm = new d() { // from class: com.kwad.components.core.e.a.g.1
            @Override // com.kwad.components.core.e.a.d
            public final void mQ() {
                g.this.ep();
            }
        };
        this.mAdTemplate = adTemplate;
        this.Jb = dVar;
        this.bG = new com.kwad.components.core.widget.a.b(this, 70);
        initMVP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ep() {
        if (this.ol) {
            return;
        }
        this.ol = true;
        this.Jb.mQ();
    }

    private void initMVP() {
        this.Jk = mX();
        Presenter onCreatePresenter = onCreatePresenter();
        this.mPresenter = onCreatePresenter;
        onCreatePresenter.F(this);
        this.mPresenter.k(this.Jk);
    }

    private a mX() {
        a aVar = new a();
        aVar.IZ = this;
        aVar.mAdTemplate = this.mAdTemplate;
        aVar.Ja = this.bG;
        aVar.Jb = this.Jm;
        return aVar;
    }

    private static Presenter onCreatePresenter() {
        Presenter presenter = new Presenter();
        presenter.a(new f());
        return presenter;
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        com.kwad.sdk.core.e.c.d("InstalledActivateView", "onViewAttached");
        this.bG.sB();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        com.kwad.sdk.core.e.c.d("InstalledActivateView", "onViewDetached");
        this.bG.release();
        this.mPresenter.destroy();
        this.Jk.release();
        ep();
    }
}

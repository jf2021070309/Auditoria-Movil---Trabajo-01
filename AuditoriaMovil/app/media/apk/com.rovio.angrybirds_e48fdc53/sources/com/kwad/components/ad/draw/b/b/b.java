package com.kwad.components.ad.draw.b.b;

import android.view.ViewGroup;
import com.kwad.components.ad.draw.b.b.a;
import com.kwad.components.ad.draw.view.playcard.DrawCardApp;
import com.kwad.components.ad.draw.view.playcard.DrawCardH5;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.draw.a.a {
    private ViewGroup ce;
    private a.InterfaceC0140a cv = new a.InterfaceC0140a() { // from class: com.kwad.components.ad.draw.b.b.b.1
        @Override // com.kwad.components.ad.draw.b.b.a.InterfaceC0140a
        public final void ao() {
            b.this.ao();
        }
    };
    private DrawCardApp cy;
    private DrawCardH5 cz;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            aq();
        } else {
            ar();
        }
    }

    private void aq() {
        this.ce.setVisibility(8);
        this.cy.a(this.mAdTemplate, new DrawCardApp.a() { // from class: com.kwad.components.ad.draw.b.b.b.2
            @Override // com.kwad.components.ad.draw.view.playcard.DrawCardApp.a
            public final void at() {
                b.this.ce.setVisibility(0);
            }

            @Override // com.kwad.components.ad.draw.view.playcard.DrawCardApp.a
            public final void au() {
                b.this.as();
            }
        });
        this.cy.setVisibility(0);
        this.cy.aM();
    }

    private void ar() {
        this.ce.setVisibility(8);
        this.cz.a(this.mAdTemplate, new DrawCardH5.a() { // from class: com.kwad.components.ad.draw.b.b.b.3
            @Override // com.kwad.components.ad.draw.view.playcard.DrawCardH5.a
            public final void at() {
                b.this.ce.setVisibility(0);
            }

            @Override // com.kwad.components.ad.draw.view.playcard.DrawCardH5.a
            public final void au() {
                b.this.as();
            }
        });
        this.cz.setVisibility(0);
        this.cz.aM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, 29, this.bE.mRootContainer.getTouchCoords());
        if (this.bE.bD != null) {
            this.bE.bD.onAdClicked();
        }
    }

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.bE.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = d.ck(adTemplate);
        this.bE.bX.a(this.cv);
        this.cy.setVisibility(8);
        this.cz.setVisibility(8);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ce = (ViewGroup) findViewById(R.id.ksad_ad_normal_container);
        this.cy = (DrawCardApp) findViewById(R.id.ksad_card_app_container);
        this.cz = (DrawCardH5) findViewById(R.id.ksad_card_h5_container);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.cy.release();
        this.cz.release();
        this.bE.bX.a((a.InterfaceC0140a) null);
    }
}

package com.kwad.components.ad.f;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwad.components.ad.f.b.g;
import com.kwad.components.ad.f.b.h;
import com.kwad.components.ad.f.b.i;
import com.kwad.components.ad.f.b.k;
import com.kwad.components.ad.f.d;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBasePvFrameLayout;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.l;
import com.kwad.sdk.widget.KSFrameLayout;
import com.kwad.sdk.widget.j;
/* loaded from: classes.dex */
public final class f extends KSFrameLayout {
    private com.kwad.components.core.widget.a.b bG;
    private j ct;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private KsNativeAd.VideoPlayListener mD;
    private DetailVideoView mDetailVideoView;
    private d.a mI;
    private Presenter mPresenter;
    private AdBasePvFrameLayout mU;
    private com.kwad.components.ad.f.a.b mZ;
    private com.kwad.components.ad.f.c.a na;
    private KsAdVideoPlayConfig nb;

    public f(Context context) {
        this(context, null);
    }

    private f(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.ct = new j() { // from class: com.kwad.components.ad.f.f.1
            @Override // com.kwad.sdk.widget.j
            public final void am() {
                l.cF(f.this.mAdTemplate);
            }
        };
        D(context);
    }

    private void D(Context context) {
        com.kwad.sdk.m.l.inflate(context, R.layout.ksad_native_video_layout, this);
        AdBasePvFrameLayout adBasePvFrameLayout = (AdBasePvFrameLayout) findViewById(R.id.ksad_root_container);
        this.mU = adBasePvFrameLayout;
        DetailVideoView detailVideoView = (DetailVideoView) adBasePvFrameLayout.findViewById(R.id.ksad_video_player);
        this.mDetailVideoView = detailVideoView;
        detailVideoView.setAd(true);
    }

    private Presenter ad() {
        Presenter presenter = new Presenter();
        presenter.a(new com.kwad.components.ad.f.b.e());
        presenter.a(new com.kwad.components.ad.f.b.c());
        presenter.a(new i());
        presenter.a(new com.kwad.components.ad.f.b.j());
        presenter.a(new com.kwad.components.ad.f.b.d());
        presenter.a(new com.kwad.components.ad.f.b.b());
        presenter.a(new k());
        presenter.a(new com.kwad.components.ad.f.b.a(this.nb));
        presenter.a(new g());
        presenter.a(com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) ? new com.kwad.components.ad.f.b.f() : new h());
        return presenter;
    }

    private com.kwad.components.ad.f.a.b eO() {
        com.kwad.components.ad.f.a.b bVar = new com.kwad.components.ad.f.a.b();
        bVar.mU = this.mU;
        bVar.mAdTemplate = this.mAdTemplate;
        bVar.mI = this.mI;
        bVar.mD = this.mD;
        bVar.mApkDownloadHelper = (this.mApkDownloadHelper == null && com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) ? new com.kwad.components.core.e.d.c(this.mAdTemplate) : this.mApkDownloadHelper;
        bVar.na = this.na;
        return bVar;
    }

    public final void a(AdTemplate adTemplate, com.kwad.components.core.e.d.c cVar, KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        this.mAdTemplate = adTemplate;
        this.mApkDownloadHelper = cVar;
        this.nb = ksAdVideoPlayConfig;
        this.mU.setVisibleListener(this.ct);
        this.bG = new com.kwad.components.core.widget.a.b(getParent() == null ? this : (View) getParent(), 30);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        if (this.na == null) {
            this.na = new com.kwad.components.ad.f.c.a(this.mAdTemplate, this.bG, this.mDetailVideoView, this.nb);
        }
        this.mZ = eO();
        Presenter ad = ad();
        this.mPresenter = ad;
        ad.F(this.mU);
        this.mPresenter.k(this.mZ);
        this.bG.sB();
        this.na.aH();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        com.kwad.components.core.widget.a.b bVar = this.bG;
        if (bVar != null) {
            bVar.release();
        }
        com.kwad.components.ad.f.c.a aVar = this.na;
        if (aVar != null) {
            aVar.aI();
        }
        com.kwad.components.ad.f.a.b bVar2 = this.mZ;
        if (bVar2 != null) {
            bVar2.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    public final void setInnerAdInteractionListener(d.a aVar) {
        this.mI = aVar;
    }

    public final void setVideoPlayListener(KsNativeAd.VideoPlayListener videoPlayListener) {
        this.mD = videoPlayListener;
    }
}

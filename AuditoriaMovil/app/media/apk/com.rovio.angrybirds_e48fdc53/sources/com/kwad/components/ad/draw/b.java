package com.kwad.components.ad.draw;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class b extends KSFrameLayout {
    private KsDrawAd.AdInteractionListener bD;
    private com.kwad.components.ad.draw.a.b bE;
    private com.kwad.components.ad.draw.c.a bF;
    private com.kwad.components.core.widget.a.b bG;
    private boolean bH;
    private ImageView bI;
    private com.kwad.sdk.core.h.b bJ;
    private View.OnClickListener bK;
    private k bL;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private DetailVideoView mDetailVideoView;
    private Presenter mPresenter;
    private AdBaseFrameLayout mRootContainer;

    public b(Context context) {
        super(context);
        this.bK = new View.OnClickListener() { // from class: com.kwad.components.ad.draw.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.kwad.components.core.e.d.a.a(new a.C0197a(b.this.bE.mRootContainer.getContext()).S(b.this.bE.mAdTemplate).b(b.this.bE.mApkDownloadHelper).al(false).ao(3).a(new a.b() { // from class: com.kwad.components.ad.draw.b.1.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                    }
                }));
                if (3 == com.kwad.sdk.core.response.b.a.bm(com.kwad.sdk.core.response.b.d.ck(b.this.bE.mAdTemplate))) {
                    b.this.Z();
                }
            }
        };
        this.bL = new l() { // from class: com.kwad.components.ad.draw.b.2
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayPaused() {
                super.onMediaPlayPaused();
                b.this.bI.setVisibility(0);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                super.onMediaPlayStart();
                b.this.bI.setVisibility(8);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                super.onMediaPlaying();
                b.this.bI.setVisibility(8);
            }
        };
        this.mContext = context;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.bF.f(!this.bH);
        if (this.bH) {
            this.bF.resume();
        } else {
            this.bF.pause();
        }
        this.bH = !this.bH;
    }

    private com.kwad.components.ad.draw.a.b ac() {
        com.kwad.components.ad.draw.a.b bVar = new com.kwad.components.ad.draw.a.b();
        bVar.bD = this.bD;
        bVar.mRootContainer = this.mRootContainer;
        bVar.mAdTemplate = this.mAdTemplate;
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            bVar.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        }
        bVar.bF = this.bF;
        bVar.bX = new com.kwad.components.ad.draw.b.b.a(this.mAdTemplate);
        if (com.kwad.sdk.core.response.b.b.bo(this.mAdTemplate)) {
            bVar.bY = new com.kwad.components.ad.k.b();
        }
        return bVar;
    }

    private Presenter ad() {
        Presenter presenter = new Presenter();
        presenter.a(new com.kwad.components.ad.draw.b.a.a());
        presenter.a(new com.kwad.components.ad.draw.b.b());
        presenter.a(new com.kwad.components.ad.draw.b.d());
        presenter.a(new com.kwad.components.ad.draw.b.c());
        presenter.a(new com.kwad.components.ad.draw.b.b.b());
        if (com.kwad.sdk.core.response.b.b.bb(this.mAdTemplate)) {
            presenter.a(new com.kwad.components.ad.draw.b.b.c());
        }
        presenter.a(new com.kwad.components.ad.draw.b.c.a());
        if (com.kwad.sdk.core.response.b.b.bo(this.mAdTemplate)) {
            presenter.a(new com.kwad.components.ad.draw.b.c.b());
        }
        if (com.kwad.sdk.core.response.b.a.aH(this.mAdInfo)) {
            presenter.a(new com.kwad.components.ad.draw.b.a());
        }
        return presenter;
    }

    private void initView() {
        com.kwad.sdk.m.l.inflate(this.mContext, R.layout.ksad_draw_layout, this);
        AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
        this.mRootContainer = adBaseFrameLayout;
        this.bI = (ImageView) adBaseFrameLayout.findViewById(R.id.ksad_video_control_button);
        DetailVideoView detailVideoView = (DetailVideoView) this.mRootContainer.findViewById(R.id.ksad_video_player);
        this.mDetailVideoView = detailVideoView;
        detailVideoView.f(true, com.kwad.sdk.core.config.d.zW());
        this.mDetailVideoView.setOnClickListener(this.bK);
        this.bI.setOnClickListener(this.bK);
    }

    public final void a(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        com.kwad.components.core.widget.a.b bVar = new com.kwad.components.core.widget.a.b(this, 70);
        this.bG = bVar;
        this.bF = new com.kwad.components.ad.draw.c.a(this.mAdTemplate, bVar, this.mDetailVideoView);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        this.bE = ac();
        Presenter ad = ad();
        this.mPresenter = ad;
        ad.F(this.mRootContainer);
        this.mPresenter.k(this.bE);
        this.bG.a(this.bJ);
        this.bG.sB();
        this.bF.aH();
        this.bF.b(this.bL);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        com.kwad.components.core.widget.a.b bVar = this.bG;
        if (bVar != null) {
            bVar.release();
        }
        com.kwad.components.ad.draw.c.a aVar = this.bF;
        if (aVar != null) {
            aVar.aI();
            this.bF.a(this.bL);
        }
        com.kwad.components.ad.draw.a.b bVar2 = this.bE;
        if (bVar2 != null) {
            bVar2.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    public final void setAdInteractionListener(KsDrawAd.AdInteractionListener adInteractionListener) {
        this.bD = adInteractionListener;
    }

    public final void setPageExitListener(com.kwad.sdk.core.h.b bVar) {
        this.bJ = bVar;
    }
}

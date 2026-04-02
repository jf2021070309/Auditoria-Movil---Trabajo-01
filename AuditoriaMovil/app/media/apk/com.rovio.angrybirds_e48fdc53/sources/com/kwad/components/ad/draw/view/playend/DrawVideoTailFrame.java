package com.kwad.components.ad.draw.view.playend;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.draw.view.DrawDownloadProgressBar;
import com.kwad.components.ad.widget.AppScoreView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.core.download.a.a;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class DrawVideoTailFrame extends FrameLayout implements View.OnClickListener {
    private KsDrawAd.AdInteractionListener bD;
    private KsAppDownloadListener cn;
    private ViewGroup dA;
    private TextView dB;
    private TextView dC;
    private AdBaseFrameLayout dr;
    private ImageView ds;
    private ViewGroup dt;
    private ImageView du;
    private TextView dv;
    private AppScoreView dw;
    private TextView dx;
    private TextView dy;
    private DrawDownloadProgressBar dz;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private c mApkDownloadHelper;
    private KsLogoView mLogoView;

    public DrawVideoTailFrame(Context context) {
        super(context);
        D(context);
    }

    public DrawVideoTailFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    public DrawVideoTailFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        D(context);
    }

    private void D(Context context) {
        l.inflate(context, R.layout.ksad_draw_video_tailframe, this);
        this.ds = (ImageView) findViewById(R.id.ksad_video_cover);
        this.dt = (ViewGroup) findViewById(R.id.ksad_app_container);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.dv = (TextView) findViewById(R.id.ksad_app_name);
        this.dw = (AppScoreView) findViewById(R.id.ksad_app_score);
        this.dx = (TextView) findViewById(R.id.ksad_app_download_count);
        this.dy = (TextView) findViewById(R.id.ksad_app_ad_desc);
        DrawDownloadProgressBar drawDownloadProgressBar = (DrawDownloadProgressBar) findViewById(R.id.ksad_app_download_btn);
        this.dz = drawDownloadProgressBar;
        drawDownloadProgressBar.setTextSize(15);
        this.dA = (ViewGroup) findViewById(R.id.ksad_h5_container);
        this.dB = (TextView) findViewById(R.id.ksad_h5_ad_desc);
        this.dC = (TextView) findViewById(R.id.ksad_h5_open_btn);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_draw_tailframe_logo);
    }

    private KsAppDownloadListener getAppDownloadListener() {
        return new a() { // from class: com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                DrawVideoTailFrame.this.dz.e(com.kwad.sdk.core.response.b.a.aw(DrawVideoTailFrame.this.mAdInfo), DrawVideoTailFrame.this.dz.getMax());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                DrawVideoTailFrame.this.dz.e(com.kwad.sdk.core.response.b.a.aQ(DrawVideoTailFrame.this.mAdTemplate), DrawVideoTailFrame.this.dz.getMax());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                DrawVideoTailFrame.this.dz.e(com.kwad.sdk.core.response.b.a.aw(DrawVideoTailFrame.this.mAdInfo), DrawVideoTailFrame.this.dz.getMax());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                DrawVideoTailFrame.this.dz.e(com.kwad.sdk.core.response.b.a.U(DrawVideoTailFrame.this.mAdInfo), DrawVideoTailFrame.this.dz.getMax());
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                super.onPaused(i);
                DrawVideoTailFrame.this.dz.e(com.kwad.sdk.core.response.b.a.Cy(), i);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                DrawDownloadProgressBar drawDownloadProgressBar = DrawVideoTailFrame.this.dz;
                drawDownloadProgressBar.e(i + "%", i);
            }
        };
    }

    public final void aP() {
        c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            KsAppDownloadListener ksAppDownloadListener = this.cn;
            if (ksAppDownloadListener != null) {
                cVar.d(ksAppDownloadListener);
                return;
            }
            KsAppDownloadListener appDownloadListener = getAppDownloadListener();
            this.cn = appDownloadListener;
            this.mApkDownloadHelper.b(appDownloadListener);
        }
    }

    public final void b(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = d.ck(adTemplate);
        this.mAdInfo = ck;
        AdInfo.AdMaterialInfo.MaterialFeature aN = com.kwad.sdk.core.response.b.a.aN(ck);
        String str = aN.coverUrl;
        this.mLogoView.ad(adTemplate);
        if (!TextUtils.isEmpty(str)) {
            int i = aN.width;
            int i2 = aN.height;
            if (i > 0 && i > i2) {
                int screenWidth = com.kwad.sdk.d.a.a.getScreenWidth(getContext());
                if (getWidth() != 0) {
                    screenWidth = getWidth();
                }
                ViewGroup.LayoutParams layoutParams = this.ds.getLayoutParams();
                layoutParams.width = screenWidth;
                layoutParams.height = (int) (screenWidth * (i2 / i));
            }
            KSImageLoader.loadImage(this.ds, str, this.mAdTemplate);
        }
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            KSImageLoader.loadAppIcon(this.du, com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo), this.mAdTemplate, 11);
            this.dv.setText(com.kwad.sdk.core.response.b.a.ao(this.mAdInfo));
            float as = com.kwad.sdk.core.response.b.a.as(this.mAdInfo);
            if (as >= 3.0f) {
                this.dw.setScore(as);
                this.dw.setVisibility(0);
            }
            this.dx.setText(com.kwad.sdk.core.response.b.a.ar(this.mAdInfo));
            this.dy.setText(com.kwad.sdk.core.response.b.a.an(this.mAdInfo));
            this.dt.setVisibility(0);
            this.dA.setVisibility(8);
        } else {
            this.dB.setText(com.kwad.sdk.core.response.b.a.an(this.mAdInfo));
            this.dC.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
            this.dt.setVisibility(8);
            this.dA.setVisibility(0);
        }
        this.dz.setOnClickListener(this);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(view == this.dz ? 1 : 2).al(view == this.dz).a(new a.b() { // from class: com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                if (DrawVideoTailFrame.this.bD != null) {
                    DrawVideoTailFrame.this.bD.onAdClicked();
                }
                com.kwad.sdk.core.report.a.a(DrawVideoTailFrame.this.mAdTemplate, 2, DrawVideoTailFrame.this.dr.getTouchCoords());
            }
        }));
    }

    public final void release() {
        KsAppDownloadListener ksAppDownloadListener;
        c cVar = this.mApkDownloadHelper;
        if (cVar == null || (ksAppDownloadListener = this.cn) == null) {
            return;
        }
        cVar.c(ksAppDownloadListener);
    }

    public void setAdBaseFrameLayout(AdBaseFrameLayout adBaseFrameLayout) {
        this.dr = adBaseFrameLayout;
    }

    public void setAdInteractionListener(KsDrawAd.AdInteractionListener adInteractionListener) {
        this.bD = adInteractionListener;
    }

    public void setApkDownloadHelper(c cVar) {
        this.mApkDownloadHelper = cVar;
    }
}

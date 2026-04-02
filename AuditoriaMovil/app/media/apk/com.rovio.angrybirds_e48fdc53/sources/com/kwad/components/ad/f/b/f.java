package com.kwad.components.ad.f.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class f extends com.kwad.components.ad.f.a.a implements View.OnClickListener {
    private ImageView du;
    private TextView dv;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private ViewGroup nm;
    private TextView nn;
    private KsAppDownloadListener no = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.ad.f.b.f.2
        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFailed() {
            f.this.nn.setText(com.kwad.sdk.core.response.b.a.aw(f.this.mAdInfo));
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFinished() {
            f.this.nn.setText(com.kwad.sdk.core.response.b.a.aQ(f.this.mAdTemplate));
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onIdle() {
            f.this.nn.setText(com.kwad.sdk.core.response.b.a.aw(f.this.mAdInfo));
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onInstalled() {
            f.this.nn.setText(com.kwad.sdk.core.response.b.a.U(f.this.mAdInfo));
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onProgressUpdate(int i) {
        }
    };

    private void F(int i) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(this.nm.getContext()).S(this.mAdTemplate).ao(i).b(this.mApkDownloadHelper).a(new a.b() { // from class: com.kwad.components.ad.f.b.f.3
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                com.kwad.sdk.core.report.a.a(f.this.mAdTemplate, 2, f.this.mZ.mU.getTouchCoords());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eR() {
        KSImageLoader.loadAppIcon(this.du, com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo), this.mAdTemplate, 12);
        this.dv.setText(com.kwad.sdk.core.response.b.a.ao(this.mAdInfo));
        this.nn.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.b(this.no);
        }
        this.nm.setOnClickListener(this);
        this.nm.setVisibility(0);
    }

    private void notifyAdClick() {
        this.mZ.mI.l(this.nm);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.mZ.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mApkDownloadHelper = this.mZ.mApkDownloadHelper;
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.f.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                try {
                    f.this.eR();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    com.kwad.components.core.d.a.b(th);
                }
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
        this.nm.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.nm) {
            F(2);
            notifyAdClick();
        } else if (view == this.nn) {
            F(1);
            notifyAdClick();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.nm = (ViewGroup) findViewById(R.id.ksad_video_complete_app_container);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.dv = (TextView) findViewById(R.id.ksad_app_name);
        this.nn = (TextView) findViewById(R.id.ksad_app_download);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this.no);
        }
    }
}

package com.kwad.components.ad.fullscreen.c.a;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private TextView gD;
    private String gE;
    private long gF;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private boolean gG = false;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.fullscreen.c.a.b.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", b.this.qB.mAdTemplate).equals(str)) {
                b.this.bV();
            }
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.fullscreen.c.a.b.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            b.this.f(j2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.gF = com.kwad.sdk.core.response.b.c.bW(adTemplate);
        String bX = com.kwad.sdk.core.response.b.c.bX(this.mAdTemplate);
        this.gE = bX;
        if (TextUtils.isEmpty(bX)) {
            return;
        }
        this.mApkDownloadHelper = this.qB.mApkDownloadHelper;
        this.qB.oZ.a(this.mVideoPlayStateListener);
    }

    private void bW() {
        if (this.gD.getVisibility() == 0) {
            return;
        }
        String bX = com.kwad.sdk.core.response.b.c.bX(this.mAdTemplate);
        if (TextUtils.isEmpty(bX)) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_element_pv").aO(this.mAdTemplate).T("ELEMENT_PLAY_DETAIL_CALL_IMPRESSION", null).report();
            return;
        }
        this.gD.setText(bX);
        this.gD.setVisibility(0);
        this.gD.setOnClickListener(this);
        bX();
    }

    private void bX() {
        com.kwad.sdk.core.report.a.b(this.mAdTemplate, 18, this.qB.mReportExtData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        if (j >= this.gF) {
            bW();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdClick() {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(40), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        boolean c = com.kwad.components.ad.reward.j.c(this.qB);
        this.gG = c;
        if (c) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.gD) {
            com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).an(40).am(1).al(false).an(this.qB.fR()).ao(1).a(new a.b() { // from class: com.kwad.components.ad.fullscreen.c.a.b.3
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    b.this.notifyAdClick();
                }
            }));
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.gD = (TextView) findViewById(R.id.ksad_detail_call_btn);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        this.gD = null;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (!TextUtils.isEmpty(this.gE)) {
            this.qB.oZ.b(this.mVideoPlayStateListener);
        }
        if (this.gG) {
            com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        }
    }
}

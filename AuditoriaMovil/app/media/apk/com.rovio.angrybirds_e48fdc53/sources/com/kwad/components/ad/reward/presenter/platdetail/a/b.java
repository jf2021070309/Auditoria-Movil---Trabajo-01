package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private TextView gD;
    private long gF;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.b.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", b.this.qB.mAdTemplate).equals(str)) {
                b.this.bV();
            }
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.b.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            b.this.f(j2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        this.mAdTemplate = this.qB.mAdTemplate;
        this.mApkDownloadHelper = this.qB.mApkDownloadHelper;
        this.gF = com.kwad.sdk.core.response.b.c.bW(this.mAdTemplate);
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
        this.gD.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.bX();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        this.qB.G("native_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        if (j >= this.gF) {
            bW();
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.gD) {
            this.qB.a(1, view.getContext(), 40, 1, this.qB.oZ.getPlayDuration());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        TextView textView = (TextView) findViewById(R.id.ksad_detail_call_btn);
        this.gD = textView;
        textView.setContentDescription("topBarCallLabel");
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.gD.setVisibility(8);
    }
}

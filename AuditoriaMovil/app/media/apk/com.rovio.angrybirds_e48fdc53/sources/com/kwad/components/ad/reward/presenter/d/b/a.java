package com.kwad.components.ad.reward.presenter.d.b;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.KSLoggerReporter;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener, c {
    private e gv = new e() { // from class: com.kwad.components.ad.reward.presenter.d.b.a.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", a.this.qB.mAdTemplate).equals(str)) {
                a.b(a.this);
            }
        }
    };
    private TextView vO;
    private TextView vP;

    static /* synthetic */ void b(a aVar) {
    }

    private void bX() {
        com.kwad.sdk.core.report.a.b(this.qB.mAdTemplate, 17, this.qB.mReportExtData);
    }

    private void iJ() {
        TextView textView;
        String bY = com.kwad.sdk.core.response.b.c.bY(this.qB.mAdTemplate);
        if (TextUtils.isEmpty(bY)) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_element_pv").aO(this.qB.mAdTemplate).T("ELEMENT_PLAY_END_CALL_IMPRESSION", null).report();
            return;
        }
        if (this.qB.mScreenOrientation == 1) {
            this.vP.setVisibility(8);
            this.vO.setText(bY);
            this.vO.setVisibility(0);
            textView = this.vO;
        } else {
            this.vO.setVisibility(8);
            this.vP.setText(bY);
            this.vP.setVisibility(0);
            textView = this.vP;
        }
        textView.setOnClickListener(this);
        bX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iK() {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, "native_id", "endTopBar", new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(39), this.qB.mReportExtData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdClick() {
        this.qB.mAdOpenInteractionListener.bF();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void iL() {
        if (this.qB.py) {
            return;
        }
        iJ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vO || view == this.vP) {
            com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.qB.mAdTemplate).b(this.qB.mApkDownloadHelper).al(false).ao(1).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.d.b.a.2
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    a.this.iK();
                    a.this.notifyAdClick();
                }
            }));
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.vO = (TextView) findViewById(R.id.ksad_end_left_call_btn);
        this.vP = (TextView) findViewById(R.id.ksad_end_right_call_btn);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.vO.setVisibility(8);
        this.vP.setVisibility(8);
    }
}

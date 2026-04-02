package com.kwad.components.ad.reward.presenter.d.b;

import android.view.View;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener, c {
    private View vR;
    private boolean vS;
    private e gv = new e() { // from class: com.kwad.components.ad.reward.presenter.d.b.b.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", b.this.qB.mAdTemplate).equals(str)) {
                b.b(b.this);
            }
        }
    };
    private final Runnable vT = new Runnable() { // from class: com.kwad.components.ad.reward.presenter.d.b.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.getActivity() == null || b.this.getActivity().isFinishing()) {
                return;
            }
            b.this.iM();
        }
    };

    static /* synthetic */ void b(b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iM() {
        com.kwad.sdk.core.e.c.d("RewardPlayEndCloseBtn", "showPageCloseBtn mPlayEndH5ShowSuccess: " + this.qB.pP + ", needHideCloseButton: " + this.vS);
        if (this.qB.pP && this.vS) {
            return;
        }
        this.vR.setVisibility(0);
        this.vR.setAlpha(0.0f);
        this.vR.animate().alpha(1.0f).setDuration(500L).start();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.vS = com.kwad.sdk.core.response.b.b.dA(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate));
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void iL() {
        if (this.qB.py) {
            return;
        }
        long j = this.qB.pI;
        if (j == 0) {
            this.vT.run();
        } else {
            bj.runOnUiThreadDelay(this.vT, j);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vR) {
            PlayableSource fY = this.qB.fY();
            if (fY == null || !(fY.equals(PlayableSource.PENDANT_CLICK_NOT_AUTO) || fY.equals(PlayableSource.PENDANT_CLICK_AUTO) || fY.equals(PlayableSource.PENDANT_AUTO) || fY.equals(PlayableSource.ACTIONBAR_CLICK))) {
                com.kwad.components.ad.reward.presenter.e.w(this.qB);
            } else {
                com.kwad.components.ad.reward.b.fr().fs();
            }
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.ksad_end_close_btn);
        this.vR = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.vR.setVisibility(8);
        bj.b(this.vT);
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
    }
}

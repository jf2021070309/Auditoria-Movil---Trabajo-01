package com.kwad.components.ad.reward.presenter;

import android.view.View;
import com.kwad.components.ad.reward.widget.KsToastView;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p extends a {
    private float sD;
    private q sF;
    private KsToastView sM;
    private Runnable sP;
    private boolean sN = false;
    private boolean sO = false;
    private boolean sQ = false;
    private boolean sG = false;
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.p.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            p.this.sM.setVisibility(8);
        }
    };

    public p(q qVar) {
        this.sF = qVar;
    }

    static /* synthetic */ boolean a(p pVar, boolean z) {
        pVar.sQ = true;
        return true;
    }

    private synchronized void hH() {
        if (this.sG) {
            return;
        }
        com.kwad.sdk.core.report.a.d(this.qB.mAdTemplate, (JSONObject) null, new com.kwad.sdk.core.report.j().ci(192).ae(this.qB.oZ.getPlayDuration()));
        this.sG = true;
    }

    private void hM() {
        this.sP = new Runnable() { // from class: com.kwad.components.ad.reward.presenter.p.3
            @Override // java.lang.Runnable
            public final void run() {
                if (p.this.sQ) {
                    return;
                }
                if (p.this.sM != null) {
                    p.this.sM.setVisibility(8);
                }
                com.kwad.components.ad.reward.b.fr().a(PlayableSource.PENDANT_AUTO);
            }
        };
    }

    private void hN() {
        bj.b(this.sP);
        this.sP = null;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.b(this.mPlayEndPageListener);
    }

    public final void hK() {
        if (this.sO) {
            return;
        }
        hH();
        this.sO = true;
        this.sM.setVisibility(0);
        this.sM.V(3);
        hM();
        bj.a(this.sP, null, 3000L);
    }

    public final void hL() {
        this.sO = false;
        this.sM.setVisibility(8);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        KsToastView ksToastView = (KsToastView) findViewById(R.id.ksad_toast_view);
        this.sM = ksToastView;
        ksToastView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.presenter.p.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.a(p.this, true);
                p.this.sM.setVisibility(8);
                com.kwad.components.ad.reward.b.fr().a(PlayableSource.PENDANT_CLICK_AUTO);
            }
        });
        this.sD = com.kwad.components.ad.reward.a.b.gK();
        this.sN = com.kwad.components.ad.reward.a.b.gL() && com.kwad.components.ad.reward.a.b.gM();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        hN();
        this.qB.c(this.mPlayEndPageListener);
    }
}

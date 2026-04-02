package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.view.View;
import android.widget.ImageView;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.h;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.presenter.f.i;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class e extends com.kwad.components.ad.reward.presenter.a implements h {
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.e.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", e.this.qB.mAdTemplate).equals(str)) {
                e.this.qB.pO = true;
                e.this.bR();
            }
        }
    };
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.e.2
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            e.this.iz();
        }
    };
    private View vx;
    private View vy;
    private ImageView vz;

    public e() {
        a(new com.kwad.components.ad.reward.presenter.platdetail.a());
        a(new com.kwad.components.ad.reward.presenter.d.a());
        a(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bR() {
        this.vx.setVisibility(0);
        this.vy.setVisibility(8);
    }

    private void iy() {
        if (!this.qB.pp) {
            this.vy.setVisibility(8);
        }
        this.vx.setVisibility(0);
        getContext();
        if (com.kwad.components.ad.reward.j.u(this.qB.mAdTemplate) && ai.IK()) {
            this.vz.setVisibility(8);
        }
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        View view;
        int i;
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            i = 8;
            this.vx.setVisibility(8);
            view = this.vy;
        } else {
            view = this.vx;
            i = 0;
        }
        view.setVisibility(i);
        this.qB.b(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().a(this);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        iy();
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
        iz();
    }

    public final void iz() {
        if (this.qB.pp) {
            this.vx.setVisibility(8);
        } else {
            this.vx.setVisibility(8);
            this.vy.setVisibility(0);
        }
        getContext();
        if (com.kwad.components.ad.reward.j.u(this.qB.mAdTemplate) && ai.IK()) {
            this.vz.setVisibility(0);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.vx = findViewById(R.id.ksad_play_detail_top_toolbar);
        this.vy = findViewById(R.id.ksad_play_end_top_toolbar);
        this.vz = (ImageView) findViewById(R.id.ksad_blur_end_cover);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        iy();
        this.qB.c(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().b(this);
        this.vy.setVisibility(8);
    }
}

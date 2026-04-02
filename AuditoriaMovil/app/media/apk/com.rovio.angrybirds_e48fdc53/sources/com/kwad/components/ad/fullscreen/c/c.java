package com.kwad.components.ad.fullscreen.c;

import android.view.View;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.h;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements h {
    private View gt;
    private View gu;
    private e gv = new e() { // from class: com.kwad.components.ad.fullscreen.c.c.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", c.this.qB.mAdTemplate).equals(str) || j.b("ksad-fullscreen-video-card", c.this.qB.mAdTemplate).equals(str)) {
                c.this.bR();
            }
        }
    };
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.fullscreen.c.c.2
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            c.this.i(false);
        }
    };

    public c() {
        a(new com.kwad.components.ad.fullscreen.c.a.e());
        a(new com.kwad.components.ad.fullscreen.c.b.a());
        a(new com.kwad.components.ad.fullscreen.c.c.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bR() {
        this.gt.setVisibility(0);
        this.gu.setVisibility(8);
    }

    private void bS() {
        if (this.qB.pp || this.qB.po) {
            return;
        }
        this.gt.setVisibility(0);
        this.gu.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        if ((this.qB.pp || this.qB.po) && !z) {
            this.gt.setVisibility(8);
            this.gu.setVisibility(8);
            return;
        }
        this.gt.setVisibility(8);
        this.gu.setVisibility(0);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        View view;
        int i;
        super.ah();
        this.qB.b(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().a(this);
        if (com.kwad.components.ad.reward.j.c(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            i = 8;
            this.gt.setVisibility(8);
            view = this.gu;
        } else {
            view = this.gt;
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
        bS();
        if (this.qB.po && this.gu.getVisibility() == 0) {
            this.gu.setVisibility(8);
        }
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
        i(true);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.gt = findViewById(R.id.ksad_play_detail_top_toolbar);
        this.gu = findViewById(R.id.ksad_play_end_top_toolbar);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.c(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.b.fr().b(this);
    }
}

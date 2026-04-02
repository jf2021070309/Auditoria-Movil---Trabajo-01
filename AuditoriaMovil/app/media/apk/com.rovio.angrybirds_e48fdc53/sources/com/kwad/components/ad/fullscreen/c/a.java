package com.kwad.components.ad.fullscreen.c;

import com.kwad.components.ad.reward.d;
import com.kwad.components.ad.reward.e.k;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.b.q;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a {
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.fullscreen.c.a.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            a.this.qB.fT();
        }
    };
    private final k gf = new k() { // from class: com.kwad.components.ad.fullscreen.c.a.2
        @Override // com.kwad.components.ad.reward.e.k
        public final void a(q qVar) {
            if (qVar == null || qVar.type != 1) {
                return;
            }
            a.this.qB.oZ.release();
            a.this.qB.fT();
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.oZ.a(this.mVideoPlayStateListener);
        d.fy().a(this.gf);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        d.fy().b(this.gf);
    }
}

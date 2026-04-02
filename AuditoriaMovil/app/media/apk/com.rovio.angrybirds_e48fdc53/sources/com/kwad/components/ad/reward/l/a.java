package com.kwad.components.ad.reward.l;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.ad.reward.j;
import com.kwad.components.core.video.h;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.j.a<h> implements j.a {
    private com.kwad.components.core.g.c ye;

    public a(AdTemplate adTemplate) {
        super(adTemplate);
        long H = com.kwad.sdk.core.response.b.a.H(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        com.kwad.components.core.g.c cVar = new com.kwad.components.core.g.c();
        this.ye = cVar;
        cVar.v(H);
    }

    public final FrameLayout Q(Context context) {
        FrameLayout imagePlayerView = this.ye.getImagePlayerView(context);
        this.ye.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
        return imagePlayerView;
    }

    @Override // com.kwad.components.ad.j.a
    public final void a(h hVar) {
        this.ye.d(hVar);
    }

    @Override // com.kwad.components.ad.j.a
    public final void b(h hVar) {
        this.ye.c(hVar);
    }

    @Override // com.kwad.components.ad.j.a
    public final long getPlayDuration() {
        return this.ye.getPlayDuration();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gl() {
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gm() {
        resume();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gn() {
        pause();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void go() {
        this.ye.destroy();
    }

    public final void jP() {
        this.ye.setURLs(com.kwad.sdk.core.response.b.a.aT(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)));
        this.ye.play();
    }

    @Override // com.kwad.components.ad.j.a
    public final void pause() {
        this.ye.pause();
    }

    @Override // com.kwad.components.ad.j.a
    public final void release() {
        super.release();
        this.ye.destroy();
    }

    @Override // com.kwad.components.ad.j.a
    public final void resume() {
        this.ye.resume();
    }

    @Override // com.kwad.components.ad.j.a
    public final void skipToEnd() {
        this.ye.skipToEnd();
    }
}

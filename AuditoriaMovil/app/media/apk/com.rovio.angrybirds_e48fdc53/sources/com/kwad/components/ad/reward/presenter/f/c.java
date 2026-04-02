package com.kwad.components.ad.reward.presenter.f;

import android.widget.FrameLayout;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class c extends h {
    @Override // com.kwad.components.ad.reward.presenter.f.h, com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-image-video-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.h, com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.wk = (FrameLayout) findViewById(R.id.ksad_js_reward_image_card);
    }
}

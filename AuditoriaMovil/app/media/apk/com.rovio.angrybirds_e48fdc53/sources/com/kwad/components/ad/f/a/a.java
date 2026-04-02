package com.kwad.components.ad.f.a;

import com.kwad.components.core.video.k;
import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public class a extends Presenter {
    public k mVideoPlayStateListener;
    public b mZ;

    @Override // com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        this.mZ = (b) Gh();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
        super.onUnbind();
        this.mZ.na.a(this.mVideoPlayStateListener);
    }
}

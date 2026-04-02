package com.kwad.components.ad.f.b;

import com.kwad.components.core.video.l;
import com.kwad.sdk.api.KsNativeAd;
/* loaded from: classes.dex */
public final class e extends com.kwad.components.ad.f.a.a {
    private boolean bH = false;
    private KsNativeAd.VideoPlayListener mD;

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mD = this.mZ.mD;
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.e.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayComplete();
                }
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayError(i, i2);
                }
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayPaused() {
                super.onMediaPlayPaused();
                if (e.this.mD != null) {
                    try {
                        e.this.mD.onVideoPlayPause();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    }
                }
                e.this.bH = true;
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayStart();
                }
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                super.onMediaPlaying();
                if (e.this.bH) {
                    e.this.bH = false;
                    if (e.this.mD != null) {
                        try {
                            e.this.mD.onVideoPlayResume();
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                }
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPrepared() {
                super.onMediaPrepared();
                if (e.this.mD != null) {
                    try {
                        e.this.mD.onVideoPlayReady();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    }
                }
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}

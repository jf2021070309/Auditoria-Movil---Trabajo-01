package com.kwad.components.ad.splashscreen.c;

import android.text.TextUtils;
import android.widget.ImageView;
import com.kwad.components.ad.splashscreen.widget.SkipView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.h;
/* loaded from: classes.dex */
public final class q extends e implements com.kwad.sdk.core.h.c {
    private SkipView DX;
    private ImageView gI;
    private AdInfo mAdInfo;
    private volatile boolean DV = false;
    private boolean DW = false;
    private boolean CX = false;
    private h.a gJ = new h.a() { // from class: com.kwad.components.ad.splashscreen.c.q.1
        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeOccupied() {
            q.this.DV = false;
            if (q.this.gI != null) {
                q.this.gI.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.q.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (q.this.CS.Ch != null) {
                            q.this.CS.Ch.setAudioEnabled(q.this.DV, false);
                        }
                        if (q.this.CS != null) {
                            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(q.this.CS.mAdTemplate);
                            boolean z = q.this.DV;
                            AdInfo.AdSplashInfo adSplashInfo = ck.adSplashInfo;
                            String str = z ? adSplashInfo.speakerIconUrl : adSplashInfo.speakerMuteIconUrl;
                            if (TextUtils.isEmpty(str)) {
                                q.this.gI.setImageDrawable(q.this.getContext().getResources().getDrawable(R.drawable.ksad_splash_sound_selector));
                            } else {
                                KSImageLoader.loadImage(q.this.gI, str, q.this.CS.mAdTemplate);
                            }
                            q.this.gI.setSelected(false);
                        }
                    }
                });
            }
        }

        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeReleased() {
        }
    };
    private com.kwad.components.core.video.k DY = new com.kwad.components.core.video.k() { // from class: com.kwad.components.ad.splashscreen.c.q.2
        private boolean Eb = false;
        private String Ec = com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CC);

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            if (this.Eb) {
                return;
            }
            q.this.CS.kI();
            this.Eb = true;
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            if (q.this.CX) {
                return;
            }
            q.this.CS.g(0, "onMediaPlayError");
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlayPaused() {
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, final long j2) {
            q.this.CS.Y(((int) j2) / 1000);
            final int min = Math.min(q.this.mAdInfo.adSplashInfo.videoDisplaySecond, ((int) j) / 1000);
            final String str = this.Ec;
            q qVar = q.this;
            if (q.a(qVar, qVar.mAdInfo)) {
                q.this.DX.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.q.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = (int) (((min * 1000) - j2) / 1000);
                        if (i <= 0) {
                            i = 1;
                        }
                        q.this.DX.af(str + i);
                    }
                });
            }
            float f = ((float) j2) / 1000.0f;
            if (min <= 0 || f + 0.5d <= min - 1 || this.Eb) {
                return;
            }
            q qVar2 = q.this;
            if (q.a(qVar2, qVar2.mAdInfo)) {
                q.this.CS.kI();
                this.Eb = true;
            }
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            if (q.this.CS.Ch != null) {
                q.this.CS.Ch.setAudioEnabled(q.this.DV, false);
            }
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            if (q.this.DW) {
                return;
            }
            q.this.CS.kH();
            if (q.this.CS.Ch != null) {
                q.this.CS.Ch.af(true);
                q.this.CS.Ch.setAudioEnabled(q.this.DV, true);
            }
            q.b(q.this, true);
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPrepared() {
        }

        @Override // com.kwad.components.core.video.h
        public final void onMediaPreparing() {
        }

        @Override // com.kwad.components.core.video.k
        public final void onVideoPlayBufferingPaused() {
        }

        @Override // com.kwad.components.core.video.k
        public final void onVideoPlayBufferingPlaying() {
        }
    };

    private static void a(SkipView skipView, AdInfo adInfo) {
        skipView.setTimerBtnVisible(com.kwad.sdk.core.response.b.a.cj(adInfo));
    }

    static /* synthetic */ boolean a(q qVar, AdInfo adInfo) {
        return r(adInfo);
    }

    static /* synthetic */ boolean b(q qVar, boolean z) {
        qVar.DW = true;
        return true;
    }

    private static boolean r(AdInfo adInfo) {
        return !com.kwad.sdk.core.response.b.a.cg(adInfo);
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        if (this.CS.Ch != null) {
            this.CS.Ch.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ah() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.splashscreen.c.q.ah():void");
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
        this.CX = true;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (this.CS.Ch != null) {
            this.CS.Ch.a(this.DY);
            this.CS.Ch.b(this.gJ);
        }
        if (this.DX.getHandler() != null) {
            this.DX.getHandler().removeCallbacksAndMessages(null);
        }
        this.CS.Cj.b(this);
    }
}

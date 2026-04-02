package com.kwad.components.ad.splashscreen.e;

import android.content.Context;
import com.kwad.components.ad.j.b;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.h.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.b.f;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.VideoPlayerStatus;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends b implements c {
    private boolean EN;
    private Context mContext;
    private KsVideoPlayConfig mVideoPlayConfig;
    private VideoPlayerStatus mVideoPlayerStatus;
    private boolean nA;
    private String yf;
    private final List<h.a> yi;
    private OfflineOnAudioConflictListener yk;

    public a(AdTemplate adTemplate, final DetailVideoView detailVideoView, KsVideoPlayConfig ksVideoPlayConfig) {
        super(adTemplate, detailVideoView);
        this.yi = new ArrayList();
        this.yk = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.ad.splashscreen.e.a.1
            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeOccupied() {
                synchronized (a.this.yi) {
                    for (h.a aVar : a.this.yi) {
                        aVar.onAudioBeOccupied();
                    }
                }
            }

            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeReleased() {
                synchronized (a.this.yi) {
                    for (h.a aVar : a.this.yi) {
                        aVar.onAudioBeReleased();
                    }
                }
            }
        };
        this.mVideoPlayConfig = ksVideoPlayConfig;
        this.mContext = detailVideoView.getContext();
        String aS = com.kwad.sdk.core.response.b.a.aS(d.ck(adTemplate));
        this.mVideoPlayerStatus = adTemplate.mVideoPlayerStatus;
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(aS);
        if (bP != null && bP.exists()) {
            this.yf = bP.getAbsolutePath();
        }
        this.GS.a(new c.e() { // from class: com.kwad.components.ad.splashscreen.e.a.2
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(com.kwad.sdk.core.video.a.c cVar) {
                boolean a = bm.a(detailVideoView, 50, true);
                com.kwad.sdk.core.e.c.d("SplashPlayModule", " onPrepared" + a);
                if (a) {
                    a.this.GS.start();
                }
            }
        });
        com.kwad.components.core.t.a.ak(this.mContext).a(this.yk);
    }

    private void aJ() {
        this.GS.a(new b.a(this.mAdTemplate).a(this.mVideoPlayerStatus).cm(this.yf).cn(f.b(d.cl(this.mAdTemplate))).b(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate)).yP(), this.mDetailVideoView);
        KsVideoPlayConfig ksVideoPlayConfig = this.mVideoPlayConfig;
        if (ksVideoPlayConfig != null) {
            setAudioEnabled(ksVideoPlayConfig.isVideoSoundEnable(), false);
        }
        this.GS.prepareAsync();
    }

    public final void a(h.a aVar) {
        this.yi.add(aVar);
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        resume();
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        pause();
    }

    public final void af(boolean z) {
        this.EN = true;
    }

    public final void b(h.a aVar) {
        this.yi.remove(aVar);
    }

    public final long getCurrentPosition() {
        return this.GS.getCurrentPosition();
    }

    public final void lF() {
        if (this.GS.qF() == null) {
            aJ();
        }
        this.GS.start();
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void release() {
        super.release();
        com.kwad.components.core.t.a.ak(this.mContext).b(this.yk);
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void resume() {
        super.resume();
        if (this.nA && this.EN) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(false);
            if (com.kwad.components.core.t.a.ak(this.mContext).qj()) {
                this.nA = false;
                setAudioEnabled(false, false);
            }
        }
    }

    @Override // com.kwad.components.ad.j.a
    public final void setAudioEnabled(boolean z, boolean z2) {
        this.nA = z;
        if (z && z2) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(true);
        }
        this.GS.setAudioEnabled(z);
    }
}

package com.kwad.components.ad.reward.l;

import android.content.Context;
import com.kwad.components.ad.reward.j;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.l;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.response.b.f;
import com.kwad.sdk.core.response.model.VideoPlayerStatus;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.j.b implements j.a {
    private boolean kX;
    private Context mContext;
    private KsVideoPlayConfig mVideoPlayConfig;
    private VideoPlayerStatus mVideoPlayerStatus;
    private boolean nA;
    private l nC;
    private j qB;
    private String yf;
    private AtomicBoolean yg;
    private boolean yh;
    private final List<h.a> yi;
    private final List<b> yj;
    private OfflineOnAudioConflictListener yk;

    public c(j jVar, DetailVideoView detailVideoView) {
        super(jVar.mAdTemplate, detailVideoView);
        this.yg = new AtomicBoolean(false);
        this.yh = false;
        this.kX = false;
        this.yi = new ArrayList();
        this.yj = new ArrayList();
        this.yk = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.ad.reward.l.c.1
            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeOccupied() {
                c.a(c.this, true);
                if (c.this.GS != null) {
                    c.this.GS.setAudioEnabled(false);
                }
                synchronized (c.this.yi) {
                    for (h.a aVar : c.this.yi) {
                        aVar.onAudioBeOccupied();
                    }
                }
            }

            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeReleased() {
                synchronized (c.this.yi) {
                    for (h.a aVar : c.this.yi) {
                        aVar.onAudioBeReleased();
                    }
                }
            }
        };
        this.qB = jVar;
        this.mContext = jVar.mContext;
        this.mVideoPlayConfig = jVar.mVideoPlayConfig;
        this.mVideoPlayerStatus = this.mAdTemplate.mVideoPlayerStatus;
        this.yf = getVideoUrl();
    }

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.yh = true;
        return true;
    }

    private void aJ() {
        if (jR()) {
            return;
        }
        this.GS.a(new b.a(this.mAdTemplate).cm(this.yf).cn(f.b(com.kwad.sdk.core.response.b.d.cl(this.mAdTemplate))).a(this.mVideoPlayerStatus).b(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate)).yP(), this.mDetailVideoView);
        KsVideoPlayConfig ksVideoPlayConfig = this.mVideoPlayConfig;
        if (ksVideoPlayConfig != null) {
            setAudioEnabled(ksVideoPlayConfig.isVideoSoundEnable(), false);
        }
        this.GS.prepareAsync();
    }

    private String getVideoUrl() {
        if (jR()) {
            return "";
        }
        String F = com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(F);
        return (bP == null || !bP.exists()) ? com.kwad.sdk.core.config.d.zy() > 0 ? com.kwad.sdk.core.videocache.c.a.bl(this.mContext).dN(F) : F : bP.getAbsolutePath();
    }

    private boolean jR() {
        return com.kwad.sdk.core.response.b.a.cw(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    private void stop() {
        pause();
        this.kX = true;
    }

    public final void a(b bVar) {
        this.yj.add(bVar);
    }

    public final void a(h.a aVar) {
        this.yi.add(aVar);
    }

    public final void b(b bVar) {
        this.yj.remove(bVar);
    }

    public final void b(h.a aVar) {
        this.yi.remove(aVar);
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final long getPlayDuration() {
        if (this.yg.get()) {
            return super.getPlayDuration();
        }
        return 0L;
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gl() {
        this.yh = false;
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gm() {
        if (this.kX) {
            return;
        }
        resume();
        if (this.nA || (com.kwad.components.ad.reward.a.b.gH() && this.yh)) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(com.kwad.components.ad.reward.a.b.gH());
            if (com.kwad.components.ad.reward.a.b.gH() && this.yh) {
                this.yh = false;
                this.nA = true;
                setAudioEnabled(true, false);
            } else if (this.qB.oY || !com.kwad.components.core.t.a.ak(this.mContext).qj()) {
            } else {
                this.nA = false;
                setAudioEnabled(false, false);
            }
        }
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gn() {
        pause();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void go() {
        this.yh = false;
        if (!this.yg.get() || this.GS == null) {
            return;
        }
        this.GS.d(this.nC);
        this.GS.release();
    }

    public final void jP() {
        if (this.yg.get()) {
            return;
        }
        this.yg.set(true);
        aJ();
        this.nC = new l() { // from class: com.kwad.components.ad.reward.l.c.2
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                super.onMediaPlayError(i, i2);
                com.kwad.components.core.p.a.pC().b(c.this.mAdTemplate, i, i2);
            }
        };
        this.GS.c(this.nC);
        this.GS.a(new c.e() { // from class: com.kwad.components.ad.reward.l.c.3
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(com.kwad.sdk.core.video.a.c cVar) {
                com.kwad.sdk.core.c.b.AT();
                if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                    c.this.GS.start();
                }
            }
        });
        com.kwad.components.core.t.a.ak(this.mContext).a(this.yk);
    }

    public final void jQ() {
        for (b bVar : this.yj) {
            bVar.jj();
        }
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void pause() {
        if (!this.yg.get() || this.GS == null || jR() || j.e(this.qB)) {
            return;
        }
        super.pause();
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void release() {
        super.release();
        com.kwad.components.core.t.a.ak(this.mContext).b(this.yk);
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void resume() {
        this.kX = false;
        if (!this.yg.get() || this.GS == null || jR() || j.e(this.qB)) {
            return;
        }
        super.resume();
    }

    @Override // com.kwad.components.ad.j.a
    public final void setAudioEnabled(boolean z, boolean z2) {
        this.nA = z;
        if (!this.yg.get() || this.GS == null) {
            return;
        }
        if (z && z2) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(true);
        }
        this.GS.setAudioEnabled(z);
    }

    @Override // com.kwad.components.ad.j.a
    @Deprecated
    public final void skipToEnd() {
        if (!this.yg.get() || this.GS == null) {
            return;
        }
        this.GS.onPlayStateChanged(9);
        stop();
    }
}

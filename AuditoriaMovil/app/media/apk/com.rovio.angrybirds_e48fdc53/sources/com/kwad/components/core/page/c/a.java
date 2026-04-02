package com.kwad.components.core.page.c;

import android.content.Context;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.b;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.b.f;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.VideoPlayerStatus;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements com.kwad.components.core.l.a.a {
    private b GS;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private DetailVideoView mDetailVideoView;
    private KsVideoPlayConfig mVideoPlayConfig;
    private VideoPlayerStatus mVideoPlayerStatus;
    private boolean nA;
    private l nC;
    private String yf;
    private boolean yh = false;
    private final List<h.a> yi = new ArrayList();
    private OfflineOnAudioConflictListener yk = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.core.page.c.a.1
        @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
        public final void onAudioBeOccupied() {
            a.a(a.this, true);
            if (a.this.GS != null) {
                a.this.GS.setAudioEnabled(false);
            }
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

    public a(final AdTemplate adTemplate, DetailVideoView detailVideoView, KsVideoPlayConfig ksVideoPlayConfig) {
        this.mVideoPlayConfig = ksVideoPlayConfig;
        this.mAdTemplate = adTemplate;
        this.mContext = detailVideoView.getContext();
        this.mVideoPlayerStatus = adTemplate.mVideoPlayerStatus;
        String F = com.kwad.sdk.core.response.b.a.F(d.ck(adTemplate));
        int zy = com.kwad.sdk.core.config.d.zy();
        if (zy < 0) {
            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(F);
            if (bP != null && bP.exists()) {
                F = bP.getAbsolutePath();
            }
            this.mDetailVideoView = detailVideoView;
            this.GS = new b(detailVideoView);
            aJ();
            l lVar = new l() { // from class: com.kwad.components.core.page.c.a.2
                @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
                public final void onMediaPlayError(int i, int i2) {
                    super.onMediaPlayError(i, i2);
                    com.kwad.components.core.p.a.pC().b(adTemplate, i, i2);
                }
            };
            this.nC = lVar;
            this.GS.c(lVar);
            this.GS.a(new c.e() { // from class: com.kwad.components.core.page.c.a.3
                @Override // com.kwad.sdk.core.video.a.c.e
                public final void a(c cVar) {
                    a.this.GS.start();
                }
            });
            com.kwad.components.core.t.a.ak(this.mContext).a(this.yk);
        } else if (zy != 0) {
            F = com.kwad.sdk.core.videocache.c.a.bl(detailVideoView.getContext()).dN(F);
        }
        this.yf = F;
        this.mDetailVideoView = detailVideoView;
        this.GS = new b(detailVideoView);
        aJ();
        l lVar2 = new l() { // from class: com.kwad.components.core.page.c.a.2
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                super.onMediaPlayError(i, i2);
                com.kwad.components.core.p.a.pC().b(adTemplate, i, i2);
            }
        };
        this.nC = lVar2;
        this.GS.c(lVar2);
        this.GS.a(new c.e() { // from class: com.kwad.components.core.page.c.a.3
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(c cVar) {
                a.this.GS.start();
            }
        });
        com.kwad.components.core.t.a.ak(this.mContext).a(this.yk);
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.yh = true;
        return true;
    }

    private void aJ() {
        this.GS.a(new b.a(this.mAdTemplate).cm(this.yf).cn(f.b(d.cl(this.mAdTemplate))).a(this.mVideoPlayerStatus).b(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate)).yP(), this.mDetailVideoView);
        KsVideoPlayConfig ksVideoPlayConfig = this.mVideoPlayConfig;
        if (ksVideoPlayConfig != null) {
            setAudioEnabled(ksVideoPlayConfig.isVideoSoundEnable(), false);
        }
        this.GS.prepareAsync();
    }

    private void pause() {
        if (this.mAdTemplate.mXiaomiAppStoreDetailViewOpen && this.mAdTemplate.mAdScene != null && this.mAdTemplate.mAdScene.getAdStyle() == 2) {
            return;
        }
        this.GS.pause();
    }

    private void resume() {
        this.GS.resume();
    }

    private void setAudioEnabled(boolean z, boolean z2) {
        this.nA = z;
        this.GS.setAudioEnabled(z);
    }

    public final void a(k kVar) {
        if (kVar == null) {
            return;
        }
        this.GS.c(kVar);
    }

    public final void b(k kVar) {
        if (kVar == null) {
            return;
        }
        this.GS.d(kVar);
    }

    @Override // com.kwad.components.core.l.a.a
    public final void c(com.kwad.components.core.o.c cVar) {
        resume();
    }

    @Override // com.kwad.components.core.l.a.a
    public final void d(com.kwad.components.core.o.c cVar) {
        pause();
    }

    @Override // com.kwad.components.core.l.a.a
    public final void gg() {
        this.yh = false;
        if (this.GS.qF() == null) {
            aJ();
        }
    }

    @Override // com.kwad.components.core.l.a.a
    public final void gh() {
        this.yh = false;
        com.kwad.components.core.video.b bVar = this.GS;
        if (bVar != null) {
            bVar.d(this.nC);
            this.GS.release();
        }
    }

    public final void release() {
        com.kwad.components.core.video.b bVar = this.GS;
        if (bVar != null) {
            bVar.clear();
            this.GS.release();
        }
        com.kwad.components.core.t.a.ak(this.mContext).b(this.yk);
    }
}

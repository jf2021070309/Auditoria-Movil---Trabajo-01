package com.kwad.components.ad.j;

import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public class b extends a<k> {
    public com.kwad.components.core.video.b GS;
    private boolean GT;
    private k GU;
    protected DetailVideoView mDetailVideoView;

    public b(AdTemplate adTemplate, DetailVideoView detailVideoView) {
        super(adTemplate);
        this.GT = false;
        this.GU = new l() { // from class: com.kwad.components.ad.j.b.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                b.this.mAdTemplate.setmCurPlayTime(-1L);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                super.onMediaPlayError(i, i2);
                if (!b.this.GT) {
                    b.this.lW();
                } else if (d.zR()) {
                    b.this.lW();
                }
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j, long j2) {
                b.this.mAdTemplate.setmCurPlayTime(j2);
            }
        };
        this.mDetailVideoView = detailVideoView;
        this.GS = new com.kwad.components.core.video.b(this.mDetailVideoView);
        lU();
    }

    private void lU() {
        this.GS.c(this.GU);
    }

    private void lV() {
        k kVar;
        com.kwad.components.core.video.b bVar = this.GS;
        if (bVar == null || (kVar = this.GU) == null) {
            return;
        }
        bVar.d(kVar);
        this.GU = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lW() {
        com.kwad.components.core.p.a.pC().g(this.mAdTemplate, 21008);
        this.GT = true;
    }

    @Override // com.kwad.components.ad.j.a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void b(k kVar) {
        com.kwad.components.core.video.b bVar;
        if (kVar == null || (bVar = this.GS) == null) {
            return;
        }
        bVar.c(kVar);
    }

    @Override // com.kwad.components.ad.j.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public final void a(k kVar) {
        if (kVar == null) {
            return;
        }
        this.GS.d(kVar);
    }

    @Override // com.kwad.components.ad.j.a
    public long getPlayDuration() {
        com.kwad.components.core.video.b bVar = this.GS;
        if (bVar != null) {
            return bVar.getPlayDuration();
        }
        return 0L;
    }

    @Override // com.kwad.components.ad.j.a
    public void pause() {
        this.GS.pause();
    }

    @Override // com.kwad.components.ad.j.a
    public void release() {
        super.release();
        this.GT = false;
        lV();
        com.kwad.components.core.video.b bVar = this.GS;
        if (bVar != null) {
            bVar.clear();
            this.GS.release();
        }
    }

    @Override // com.kwad.components.ad.j.a
    public void resume() {
        this.GS.resume();
    }
}

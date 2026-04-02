package com.kwad.components.ad.draw.c;

import android.content.Context;
import com.kwad.components.ad.j.b;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.h.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.b.f;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.utils.l;
/* loaded from: classes.dex */
public final class a extends b {
    private com.kwad.components.core.widget.a.b bG;
    private long cS;
    private com.kwad.sdk.contentalliance.a.a.a cT;
    private boolean cU;
    private final c cV;
    private Context mContext;

    public a(AdTemplate adTemplate, com.kwad.components.core.widget.a.b bVar, DetailVideoView detailVideoView) {
        super(adTemplate, detailVideoView);
        this.cV = new c() { // from class: com.kwad.components.ad.draw.c.a.2
            @Override // com.kwad.sdk.core.h.c
            public final void aK() {
                if (a.this.cT == null) {
                    a aVar = a.this;
                    aVar.cT = com.kwad.sdk.contentalliance.a.a.a.as(aVar.mAdTemplate);
                    a.this.GS.a(a.this.cT);
                }
                if (a.this.cU) {
                    return;
                }
                a.this.resume();
            }

            @Override // com.kwad.sdk.core.h.c
            public final void aL() {
                a.this.pause();
            }
        };
        this.cS = com.kwad.sdk.core.response.b.a.T(d.ck(this.mAdTemplate));
        this.bG = bVar;
        this.mContext = detailVideoView.getContext();
        aJ();
        this.GS.a(new c.e() { // from class: com.kwad.components.ad.draw.c.a.1
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(com.kwad.sdk.core.video.a.c cVar) {
                a.this.start(l.cG(a.this.mAdTemplate));
            }
        });
    }

    private void aJ() {
        this.GS.a(new b.a(this.mAdTemplate).cm(d.cm(this.mAdTemplate)).cn(f.b(d.cl(this.mAdTemplate))).a(this.mAdTemplate.mVideoPlayerStatus).b(new com.kwad.sdk.contentalliance.a.a.a(this.mAdTemplate, System.currentTimeMillis())).yP(), this.mDetailVideoView);
        this.GS.prepareAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start(long j) {
        if (this.bG.er()) {
            this.GS.a(new com.kwad.sdk.contentalliance.a.a.a(this.mAdTemplate, j));
            this.GS.start();
        }
    }

    public final void aH() {
        long cG = l.cG(this.mAdTemplate);
        if (this.GS.qF() == null) {
            aJ();
        }
        start(cG);
        this.bG.a(this.cV);
    }

    public final void aI() {
        this.cT = null;
        this.bG.b(this.cV);
        this.GS.release();
    }

    public final void f(boolean z) {
        this.cU = z;
    }

    @Override // com.kwad.components.ad.j.b, com.kwad.components.ad.j.a
    public final void resume() {
        super.resume();
        com.kwad.components.core.t.a.ak(this.mContext).aI(false);
    }
}

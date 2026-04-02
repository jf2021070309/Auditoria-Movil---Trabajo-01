package com.kwad.components.ad.reward.l;

import com.kwad.components.core.video.l;
import com.kwad.components.offline.api.core.adlive.IAdLivePlayModule;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.h;
/* loaded from: classes.dex */
public final class d {
    private int ym;
    private com.kwad.components.ad.reward.f.a yn;
    private c yo;
    private a yp;
    private com.kwad.components.ad.j.a yq;
    private int yr = 0;

    public d(int i, com.kwad.components.ad.j.a aVar) {
        this.ym = i;
        if (i == 1) {
            this.yo = (c) aVar;
        } else if (i == 2) {
            this.yn = (com.kwad.components.ad.reward.f.a) aVar;
        } else if (i == 3) {
            this.yp = (a) aVar;
        }
        this.yq = aVar;
    }

    private com.kwad.components.ad.j.a jS() {
        return this.yq;
    }

    public final void a(b bVar) {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    public final void a(l lVar) {
        jS().b(lVar);
    }

    public final void a(AdTemplate adTemplate, IAdLivePlayModule iAdLivePlayModule) {
        this.ym = 2;
        com.kwad.components.ad.reward.f.a aVar = new com.kwad.components.ad.reward.f.a(adTemplate, iAdLivePlayModule);
        this.yn = aVar;
        this.yq = aVar;
    }

    public final void a(h.a aVar) {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public final void b(b bVar) {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.b(bVar);
        }
    }

    public final void b(l lVar) {
        jS().a(lVar);
    }

    public final void b(h.a aVar) {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.b(aVar);
        }
    }

    public final long getPlayDuration() {
        return jS().getPlayDuration();
    }

    public final void jP() {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.jP();
            return;
        }
        a aVar = this.yp;
        if (aVar != null) {
            aVar.jP();
        }
    }

    public final void jQ() {
        c cVar = this.yo;
        if (cVar != null) {
            cVar.jQ();
        }
    }

    public final boolean jT() {
        return this.yn != null;
    }

    public final com.kwad.components.ad.reward.f.a jU() {
        return this.yn;
    }

    public final a jV() {
        return this.yp;
    }

    public final void pause() {
        jS().pause();
    }

    public final void release() {
        jS().release();
    }

    public final void resume() {
        int i;
        jS().resume();
        com.kwad.components.ad.reward.f.a aVar = this.yn;
        if (aVar == null || (i = this.yr) <= 0) {
            return;
        }
        aVar.setAudioEnabled(i == 2, false);
    }

    public final void setAudioEnabled(boolean z, boolean z2) {
        this.yr = z ? 2 : 1;
        jS().setAudioEnabled(z, z2);
    }

    public final void skipToEnd() {
        jS().skipToEnd();
    }
}

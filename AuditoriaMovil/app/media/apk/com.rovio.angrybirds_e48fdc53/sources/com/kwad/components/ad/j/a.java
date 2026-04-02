package com.kwad.components.ad.j;

import com.kwad.components.core.video.h;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public abstract class a<L extends h> {
    public AdTemplate mAdTemplate;

    public a(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
    }

    public abstract void a(L l);

    public abstract void b(L l);

    public long getPlayDuration() {
        return 0L;
    }

    public abstract void pause();

    public void release() {
    }

    public abstract void resume();

    public void setAudioEnabled(boolean z, boolean z2) {
    }

    public void skipToEnd() {
    }
}

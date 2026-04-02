package com.kwad.components.ad.reward.j.a;

import com.kwad.components.ad.reward.j;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.core.webview.b.c.b {
    private j xK;

    public a(j jVar) {
        this.xK = jVar;
    }

    public final void b(com.kwad.components.ad.reward.c.b bVar) {
        com.kwad.components.ad.reward.c.a.gY().a(this.mAdTemplate, bVar);
    }

    public final j jq() {
        return this.xK;
    }

    @Override // com.kwad.components.core.webview.b.c.b, com.kwad.sdk.mvp.a
    public final void release() {
        super.release();
        this.xK = null;
    }
}

package com.kwad.components.core.i;

import com.kwad.sdk.api.KsInnerAd;
/* loaded from: classes.dex */
public final class d {
    private Object KY;

    public d(Object obj) {
        this.KY = obj;
    }

    public final void c(c cVar) {
        if (this.KY == null || cVar == null || cVar.getHost() == null) {
            return;
        }
        try {
            ((KsInnerAd.KsInnerAdInteractionListener) this.KY).onAdClicked((KsInnerAd) cVar.getHost());
        } catch (Exception e) {
        }
    }

    public final void d(c cVar) {
        if (this.KY == null || cVar == null || cVar.getHost() == null) {
            return;
        }
        try {
            ((KsInnerAd.KsInnerAdInteractionListener) this.KY).onAdShow((KsInnerAd) cVar.getHost());
        } catch (Exception e) {
        }
    }

    public final void destroy() {
        this.KY = null;
    }
}

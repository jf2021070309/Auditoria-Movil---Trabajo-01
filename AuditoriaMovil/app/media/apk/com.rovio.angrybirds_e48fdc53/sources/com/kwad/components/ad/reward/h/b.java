package com.kwad.components.ad.reward.h;

import android.content.Context;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.ay;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends ay implements ay.a {
    private PlayableSource sb;

    public b(Context context, AdTemplate adTemplate, PlayableSource playableSource) {
        super(context, adTemplate);
        this.sb = playableSource;
        a(this);
    }

    @Override // com.kwad.components.core.webview.jshandler.ay.a
    public final boolean dy() {
        com.kwad.components.ad.reward.b.fr().c(this.sb, new a(this.mContext));
        return false;
    }
}

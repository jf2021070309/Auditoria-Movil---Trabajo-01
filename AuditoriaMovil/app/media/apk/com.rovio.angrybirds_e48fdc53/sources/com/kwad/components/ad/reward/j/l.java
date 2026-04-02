package com.kwad.components.ad.reward.j;

import com.kwad.components.core.webview.b.a.v;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
/* loaded from: classes.dex */
public final class l extends v {
    public final void e(List<AdTemplate> list) {
        b(new x.a(list));
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerAggregationDataListener";
    }
}

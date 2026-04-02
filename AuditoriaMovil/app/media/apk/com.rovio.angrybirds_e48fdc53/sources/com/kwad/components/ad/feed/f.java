package com.kwad.components.ad.feed;

import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class f {
    public static String c(AdTemplate adTemplate) {
        String an = com.kwad.sdk.core.response.b.a.an(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        if (com.kwad.components.core.c.b.mm()) {
            String str = adTemplate.fromCache ? "【cache】" : "";
            return str + an;
        }
        return an;
    }
}

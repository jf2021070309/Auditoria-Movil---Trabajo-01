package com.kwad.components.core.n.b.a;

import com.kwad.components.offline.api.core.network.IIdc;
/* loaded from: classes.dex */
public final class j implements IIdc {
    @Override // com.kwad.components.offline.api.core.network.IIdc
    public final String hostForAPI(String str) {
        if (str.equals("api")) {
            return com.kwad.sdk.h.wY();
        }
        return "https://" + com.kwad.sdk.core.network.idc.a.Bm().M(str, null);
    }
}

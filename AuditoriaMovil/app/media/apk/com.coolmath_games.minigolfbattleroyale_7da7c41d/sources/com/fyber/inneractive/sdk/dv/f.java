package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
/* loaded from: classes.dex */
public final class f extends com.fyber.inneractive.sdk.j.e {
    String a;

    @Override // com.fyber.inneractive.sdk.j.e
    public final InneractiveErrorCode a() {
        return a(null, null);
    }

    @Override // com.fyber.inneractive.sdk.j.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar) {
        if (this.a == null) {
            return InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        return null;
    }
}

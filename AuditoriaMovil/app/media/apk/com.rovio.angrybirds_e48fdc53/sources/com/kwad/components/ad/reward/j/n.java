package com.kwad.components.ad.reward.j;

import com.kwad.components.core.webview.b.a.v;
/* loaded from: classes.dex */
public final class n extends v {

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int status;
    }

    public final void aa(boolean z) {
        a aVar = new a();
        aVar.status = z ? 1 : 0;
        b(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerNeoStatusListener";
    }
}

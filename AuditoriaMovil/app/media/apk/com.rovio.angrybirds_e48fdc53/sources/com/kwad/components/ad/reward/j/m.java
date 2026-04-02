package com.kwad.components.ad.reward.j;

import com.kwad.components.core.webview.b.a.v;
/* loaded from: classes.dex */
public final class m extends v {

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String name = "backPressed";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerBackPressedListener";
    }

    public final void jo() {
        b(new a());
    }
}

package com.kwad.sdk.utils;

import java.util.Map;
/* loaded from: classes3.dex */
public final class af {
    private Map<String, com.kwad.sdk.core.webview.a> aIX;
    private Map<String, com.kwad.sdk.core.webview.c.c> aIY;

    public final void a(String str, com.kwad.sdk.core.webview.a aVar) {
        this.aIX.put(str, aVar);
    }

    public final void b(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.aIY.put(str, cVar);
    }

    public final com.kwad.sdk.core.webview.c.c fA(String str) {
        return this.aIY.get(str);
    }

    public final com.kwad.sdk.core.webview.a fz(String str) {
        return this.aIX.get(str);
    }

    public final void release() {
        for (com.kwad.sdk.core.webview.a aVar : this.aIX.values()) {
            aVar.nP();
        }
        this.aIX.clear();
        this.aIY.clear();
    }
}

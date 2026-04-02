package com.kwad.components.ad.g.a.a;

import com.kwad.sdk.core.webview.c.c;
/* loaded from: classes.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {
    private c nE;

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, c cVar) {
        this.nE = cVar;
    }

    public final void eY() {
        c cVar = this.nE;
        if (cVar != null) {
            cVar.a(null);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerPlayStateResetListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.nE = null;
    }
}

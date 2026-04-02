package com.kwad.components.core.webview.b.a;
/* loaded from: classes.dex */
public final class g implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.b.b.k WD;

    public g(com.kwad.components.core.webview.b.b.k kVar) {
        this.WD = kVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.b.b.k kVar = this.WD;
        if (kVar != null) {
            cVar.a(kVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getKsAdExtraData";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

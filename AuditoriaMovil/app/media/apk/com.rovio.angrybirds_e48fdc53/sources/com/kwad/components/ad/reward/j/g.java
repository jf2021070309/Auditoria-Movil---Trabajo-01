package com.kwad.components.ad.reward.j;
/* loaded from: classes.dex */
public final class g implements com.kwad.sdk.core.webview.c.a {
    private int xD;

    public g(int i) {
        this.xD = i;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.b.b.f fVar = new com.kwad.components.core.webview.b.b.f();
        fVar.Xa = this.xD;
        cVar.a(fVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getCloseDelaySeconds";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

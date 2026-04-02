package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class ao implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerDeeplinkListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }

    public final void onFailed() {
        com.kwad.sdk.core.webview.c.c cVar = this.Tx;
        if (cVar != null) {
            cVar.onError(-1, "deep link error");
        }
    }

    public final void onSuccess() {
        com.kwad.sdk.core.webview.c.c cVar = this.Tx;
        if (cVar != null) {
            cVar.a(null);
        }
    }
}

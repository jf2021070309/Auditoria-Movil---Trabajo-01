package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class at implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;
    private a Vz = new a();

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int status;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
    }

    public final void aO(int i) {
        if (this.Tx != null) {
            this.Vz.status = i;
            this.Tx.a(this.Vz);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerVideoListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }
}

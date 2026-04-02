package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class d implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;
    private int mF;
    private int mG;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int showLiveStatus;
        public int showLiveStyle;
    }

    public d(int i, int i2) {
        this.mF = i;
        this.mG = i2;
    }

    private void o(int i, int i2) {
        if (this.Tx == null) {
            return;
        }
        a aVar = new a();
        aVar.showLiveStatus = i;
        aVar.showLiveStyle = i2;
        this.Tx.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
        o(this.mF, this.mG);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getLiveInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }
}

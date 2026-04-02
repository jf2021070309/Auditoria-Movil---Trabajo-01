package com.kwad.components.core.webview.b.a;
/* loaded from: classes.dex */
public class o extends v {
    private a WL;

    /* loaded from: classes.dex */
    public interface a {
        boolean isMuted();
    }

    public final void a(a aVar) {
        this.WL = aVar;
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        super.a(str, cVar);
        if (this.WL != null) {
            com.kwad.components.core.webview.b.b.m mVar = new com.kwad.components.core.webview.b.b.m();
            mVar.Xg = this.WL.isMuted();
            cVar.a(mVar);
        }
    }

    public final void c(com.kwad.components.core.webview.b.b.m mVar) {
        super.b(mVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerMuteStateListener";
    }
}

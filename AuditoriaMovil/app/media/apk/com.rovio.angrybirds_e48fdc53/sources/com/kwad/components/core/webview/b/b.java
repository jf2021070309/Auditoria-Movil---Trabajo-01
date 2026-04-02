package com.kwad.components.core.webview.b;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    private a VO;

    /* loaded from: classes.dex */
    public interface a {
        void eq();
    }

    public b(a aVar) {
        this.VO = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        a aVar = this.VO;
        if (aVar != null) {
            aVar.eq();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "cardImpression";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

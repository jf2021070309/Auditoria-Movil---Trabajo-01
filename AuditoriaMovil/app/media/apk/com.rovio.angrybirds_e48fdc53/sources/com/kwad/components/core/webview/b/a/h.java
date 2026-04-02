package com.kwad.components.core.webview.b.a;
/* loaded from: classes.dex */
public final class h extends v {
    private a WE;

    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int WF;
    }

    public final void a(a aVar) {
        this.WE = aVar;
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        super.a(str, cVar);
        a aVar = this.WE;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void aN(boolean z) {
        int i = z ? 1 : 2;
        b bVar = new b();
        bVar.WF = i;
        b(bVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getPlayEndType";
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        super.onDestroy();
        this.WE = null;
    }
}

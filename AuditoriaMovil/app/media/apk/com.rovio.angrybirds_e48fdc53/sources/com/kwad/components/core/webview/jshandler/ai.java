package com.kwad.components.core.webview.jshandler;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ai implements com.kwad.sdk.core.webview.c.a {
    private a Vj;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.kwad.components.core.webview.a.b bVar);
    }

    public ai(a aVar) {
        this.Vj = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.a.b bVar = new com.kwad.components.core.webview.a.b();
        try {
            bVar.parseJson(new JSONObject(str));
            a aVar = this.Vj;
            if (aVar != null) {
                aVar.a(bVar);
            }
        } catch (Exception e) {
            cVar.onError(-1, "");
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "openNewPage";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Vj = null;
    }
}

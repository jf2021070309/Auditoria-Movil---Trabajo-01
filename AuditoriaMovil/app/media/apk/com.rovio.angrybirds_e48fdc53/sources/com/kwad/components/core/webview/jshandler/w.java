package com.kwad.components.core.webview.jshandler;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class w implements com.kwad.sdk.core.webview.c.a {
    protected final com.kwad.sdk.core.webview.b TO;
    protected b Uf;

    /* loaded from: classes.dex */
    public static class a implements com.kwad.sdk.core.b {
        public int height;
        public int width;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", this.width);
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", this.height);
            return jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c(a aVar);
    }

    public w(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
    }

    public final void a(b bVar) {
        this.Uf = bVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        a aVar = new a();
        b bVar = this.Uf;
        if (bVar != null) {
            bVar.c(aVar);
        } else {
            aVar.width = this.TO.MZ.getWidth();
            aVar.height = this.TO.MZ.getHeight();
        }
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getContainerLimit";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

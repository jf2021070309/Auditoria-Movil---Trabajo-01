package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class t implements com.kwad.sdk.core.webview.c.a {
    private a WN;

    /* loaded from: classes.dex */
    public interface a {
        void b(com.kwad.components.core.webview.b.b.t tVar);
    }

    public final void a(a aVar) {
        this.WN = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.WN != null) {
            com.kwad.components.core.webview.b.b.t tVar = new com.kwad.components.core.webview.b.b.t();
            try {
                try {
                    tVar.parseJson(new JSONObject(str));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } finally {
                this.WN.b(tVar);
            }
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "skipVideo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.WN = null;
    }
}

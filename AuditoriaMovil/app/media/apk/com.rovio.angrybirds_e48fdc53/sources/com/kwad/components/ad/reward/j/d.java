package com.kwad.components.ad.reward.j;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d implements com.kwad.sdk.core.webview.c.a {
    private a xy;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.kwad.components.core.webview.b.b.p pVar);
    }

    public final void a(a aVar) {
        this.xy = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.b.b.p pVar = new com.kwad.components.core.webview.b.b.p();
        try {
            pVar.parseJson(new JSONObject(str));
            a aVar = this.xy;
            if (aVar != null) {
                aVar.a(pVar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "clickCall";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xy = null;
    }
}

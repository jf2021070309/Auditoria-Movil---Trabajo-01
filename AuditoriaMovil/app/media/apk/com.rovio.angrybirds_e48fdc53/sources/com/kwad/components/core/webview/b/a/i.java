package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i implements com.kwad.sdk.core.webview.c.a {
    private a WG;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.kwad.sdk.core.webview.d.b.a aVar);
    }

    public i(a aVar) {
        this.WG = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.sdk.core.webview.d.b.a aVar = new com.kwad.sdk.core.webview.d.b.a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        a aVar2 = this.WG;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "notifyClickAd";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

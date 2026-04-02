package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j implements com.kwad.sdk.core.webview.c.a {
    public void a(com.kwad.components.core.webview.b.b.n nVar) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.b.b.n nVar = new com.kwad.components.core.webview.b.b.n();
        try {
            nVar.parseJson(new JSONObject(str));
            a(nVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "openURL";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class r implements com.kwad.sdk.core.webview.c.a {
    public void a(com.kwad.components.core.webview.b.b.r rVar) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.b.b.r rVar = new com.kwad.components.core.webview.b.b.r();
        try {
            rVar.parseJson(new JSONObject(str));
            a(rVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showTKDialog";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

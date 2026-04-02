package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s implements com.kwad.sdk.core.webview.c.a {
    private a WM;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.kwad.components.core.webview.b.b.s sVar);
    }

    public final void a(a aVar) {
        this.WM = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.WM != null) {
            com.kwad.components.core.webview.b.b.s sVar = new com.kwad.components.core.webview.b.b.s();
            try {
                sVar.parseJson(new JSONObject(str));
                this.WM.a(sVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showToast";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.WM = null;
    }
}

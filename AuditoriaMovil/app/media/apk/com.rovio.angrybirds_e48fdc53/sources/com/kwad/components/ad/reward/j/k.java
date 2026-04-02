package com.kwad.components.ad.reward.j;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k implements com.kwad.sdk.core.webview.c.a {
    private a xF;

    /* loaded from: classes.dex */
    public interface a {
        void d(com.kwad.components.core.webview.b.b.q qVar);
    }

    public final void a(a aVar) {
        this.xF = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.xF != null) {
            com.kwad.components.core.webview.b.b.q qVar = new com.kwad.components.core.webview.b.b.q();
            try {
                qVar.parseJson(new JSONObject(str));
                this.xF.d(qVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showPlayEnd";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xF = null;
    }
}

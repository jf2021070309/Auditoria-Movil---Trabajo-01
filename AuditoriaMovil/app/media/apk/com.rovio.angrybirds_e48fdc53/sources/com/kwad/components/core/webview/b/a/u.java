package com.kwad.components.core.webview.b.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u implements com.kwad.sdk.core.webview.c.a {
    private a WO;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.kwad.components.core.webview.b.b.m mVar);
    }

    public final void a(a aVar) {
        this.WO = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (this.WO != null) {
            com.kwad.components.core.webview.b.b.m mVar = new com.kwad.components.core.webview.b.b.m();
            try {
                mVar.parseJson(new JSONObject(str));
                this.WO.a(mVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "updateVideoMuteState";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.WO = null;
    }
}

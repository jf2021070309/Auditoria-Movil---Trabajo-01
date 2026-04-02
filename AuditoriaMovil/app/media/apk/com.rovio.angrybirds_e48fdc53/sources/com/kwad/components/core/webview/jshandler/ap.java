package com.kwad.components.core.webview.jshandler;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ap implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        private String Vr;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "lifeStatus", this.Vr);
            return jSONObject;
        }
    }

    private void aL(String str) {
        if (this.Tx != null) {
            a aVar = new a();
            aVar.Vr = str;
            this.Tx.a(aVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerLifecycleListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }

    public final void rC() {
        aL("showStart");
    }

    public final void rD() {
        aL("showEnd");
    }

    public final void rE() {
        aL("hideStart");
    }

    public final void rF() {
        aL("hideEnd");
    }

    public final void rG() {
        aL("pageVisiable");
    }

    public final void rH() {
        aL("pageInvisiable");
    }
}

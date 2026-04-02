package com.kwad.components.core.webview.b.b;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k extends com.kwad.sdk.core.response.a.a {
    public int Xc;
    public int Xd = -1;
    public int Xe;

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        com.kwad.sdk.utils.t.putValue(jSONObject, "insertScreenAdShowStrategy", this.Xc);
        com.kwad.sdk.utils.t.putValue(jSONObject, "isAutoShow", this.Xe);
        int i = this.Xd;
        if (i != -1) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "triggerType", i);
        }
        return jSONObject;
    }
}

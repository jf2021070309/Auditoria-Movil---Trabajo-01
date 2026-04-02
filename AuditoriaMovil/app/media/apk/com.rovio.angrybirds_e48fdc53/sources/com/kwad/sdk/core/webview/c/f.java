package com.kwad.sdk.core.webview.c;

import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f implements com.kwad.sdk.core.b {
    public final com.kwad.sdk.core.b azd;
    public final int result = 1;

    public f(com.kwad.sdk.core.b bVar) {
        this.azd = bVar;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "result", this.result);
        t.a(jSONObject, ShareConstants.WEB_DIALOG_PARAM_DATA, this.azd);
        return jSONObject;
    }
}

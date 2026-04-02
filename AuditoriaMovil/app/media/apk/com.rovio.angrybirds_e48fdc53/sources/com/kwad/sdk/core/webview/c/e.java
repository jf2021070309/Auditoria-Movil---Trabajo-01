package com.kwad.sdk.core.webview.c;

import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e implements com.kwad.sdk.core.b {
    private final String aiP;
    private final int result;

    public e(int i, String str) {
        this.result = i;
        this.aiP = str;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "result", this.result);
        t.putValue(jSONObject, "error_msg", this.aiP);
        return jSONObject;
    }
}

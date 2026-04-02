package com.kwad.sdk.core.report;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    public String aqJ;

    @Override // com.kwad.sdk.core.response.a.a
    public void afterParseJson(JSONObject jSONObject) {
        super.afterParseJson(jSONObject);
        if (jSONObject != null) {
            this.aqJ = jSONObject.optString("adTrackLog");
        }
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterToJson(JSONObject jSONObject) {
        super.afterToJson(jSONObject);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adTrackLog", this.aqJ);
    }
}

package com.kwad.sdk.core.response.model;

import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.utils.t;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class BatchReportResult extends BaseResultData implements com.kwad.sdk.core.b {
    private long interval;

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getResult() {
        return this.result;
    }

    @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(JSONObject jSONObject) {
        super.parseJson(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.interval = jSONObject.optLong(bg.aU);
    }

    @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        t.putValue(json, bg.aU, this.interval);
        return json;
    }
}

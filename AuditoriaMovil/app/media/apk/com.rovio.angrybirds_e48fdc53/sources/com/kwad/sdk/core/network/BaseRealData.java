package com.kwad.sdk.core.network;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class BaseRealData extends BaseResultData {
    protected abstract void parseData(JSONObject jSONObject);

    @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(JSONObject jSONObject) {
        super.parseJson(jSONObject);
        if (jSONObject == null) {
            return;
        }
        try {
            String responseData = com.kwad.sdk.core.a.d.getResponseData(jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA));
            if (responseData == null || responseData.isEmpty()) {
                this.result = 0;
            } else {
                parseData(new JSONObject(responseData));
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            this.result = 0;
            this.errorMsg = e.getMessage();
        }
    }
}

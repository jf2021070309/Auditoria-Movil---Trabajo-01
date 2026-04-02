package com.kwad.sdk.core.webview.request;

import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.core.a.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.utils.bc;
import com.kwad.sdk.utils.t;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class WebCardGetDataResponse extends BaseResultData implements com.kwad.sdk.core.b, Serializable {
    private static final String TAG = "WebCardGetDataResponse";
    private static final long serialVersionUID = 2407409365862659643L;
    public JSONObject data;
    public JSONArray impAdInfo;

    @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(JSONObject jSONObject) {
        super.parseJson(jSONObject);
        if (jSONObject == null) {
            return;
        }
        try {
            String optString = jSONObject.optString("impAdInfo");
            if (bc.isNullString(optString)) {
                String optString2 = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
                if (bc.isNullString(optString2)) {
                    return;
                }
                this.data = new JSONObject(d.getResponseData(optString2));
                return;
            }
            String responseData = d.getResponseData(optString);
            if (bc.isNullString(responseData)) {
                return;
            }
            this.impAdInfo = new JSONArray(responseData);
        } catch (Exception e) {
            c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.network.BaseResultData, com.kwad.sdk.core.b
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        JSONObject jSONObject = this.data;
        if (jSONObject != null) {
            t.putValue(json, ShareConstants.WEB_DIALOG_PARAM_DATA, jSONObject);
        }
        JSONArray jSONArray = this.impAdInfo;
        if (jSONArray != null) {
            t.putValue(json, "impAdInfo", jSONArray);
        }
        return json;
    }
}

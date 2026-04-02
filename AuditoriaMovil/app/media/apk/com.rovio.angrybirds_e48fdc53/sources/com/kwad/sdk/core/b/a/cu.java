package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cu implements com.kwad.sdk.core.d<AdStyleInfo.PlayEndInfo.EndTopToolBarInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayEndInfo.EndTopToolBarInfo endTopToolBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        endTopToolBarInfo.callButtonDescription = jSONObject.optString("callButtonDescription");
        if (endTopToolBarInfo.callButtonDescription == JSONObject.NULL) {
            endTopToolBarInfo.callButtonDescription = "";
        }
        endTopToolBarInfo.rewardIconUrl = jSONObject.optString("rewardIconUrl");
        if (endTopToolBarInfo.rewardIconUrl == JSONObject.NULL) {
            endTopToolBarInfo.rewardIconUrl = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayEndInfo.EndTopToolBarInfo endTopToolBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (endTopToolBarInfo.callButtonDescription != null && !endTopToolBarInfo.callButtonDescription.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "callButtonDescription", endTopToolBarInfo.callButtonDescription);
        }
        if (endTopToolBarInfo.rewardIconUrl != null && !endTopToolBarInfo.rewardIconUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardIconUrl", endTopToolBarInfo.rewardIconUrl);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayEndInfo.EndTopToolBarInfo endTopToolBarInfo, JSONObject jSONObject) {
        a2(endTopToolBarInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayEndInfo.EndTopToolBarInfo endTopToolBarInfo, JSONObject jSONObject) {
        return b2(endTopToolBarInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hf implements com.kwad.sdk.core.d<AdMatrixInfo.RewardWebTaskCloseInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.RewardWebTaskCloseInfo rewardWebTaskCloseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        rewardWebTaskCloseInfo.templateId = jSONObject.optString("templateId");
        if (rewardWebTaskCloseInfo.templateId == JSONObject.NULL) {
            rewardWebTaskCloseInfo.templateId = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.RewardWebTaskCloseInfo rewardWebTaskCloseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rewardWebTaskCloseInfo.templateId != null && !rewardWebTaskCloseInfo.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateId", rewardWebTaskCloseInfo.templateId);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.RewardWebTaskCloseInfo rewardWebTaskCloseInfo, JSONObject jSONObject) {
        a2(rewardWebTaskCloseInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.RewardWebTaskCloseInfo rewardWebTaskCloseInfo, JSONObject jSONObject) {
        return b2(rewardWebTaskCloseInfo, jSONObject);
    }
}

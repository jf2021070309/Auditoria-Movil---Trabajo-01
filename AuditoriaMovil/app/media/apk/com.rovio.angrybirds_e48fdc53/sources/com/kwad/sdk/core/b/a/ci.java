package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ci implements com.kwad.sdk.core.d<AdStyleInfo.PlayDetailInfo.DetailCommonInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayDetailInfo.DetailCommonInfo detailCommonInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        detailCommonInfo.middleEndcardShowTime = jSONObject.optInt("middleEndcardShowTime");
        detailCommonInfo.rewardFullClickSwitch = jSONObject.optInt("rewardFullClickSwitch");
        detailCommonInfo.rewardInteractionType = jSONObject.optInt("rewardInteractionType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayDetailInfo.DetailCommonInfo detailCommonInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (detailCommonInfo.middleEndcardShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "middleEndcardShowTime", detailCommonInfo.middleEndcardShowTime);
        }
        if (detailCommonInfo.rewardFullClickSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardFullClickSwitch", detailCommonInfo.rewardFullClickSwitch);
        }
        if (detailCommonInfo.rewardInteractionType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardInteractionType", detailCommonInfo.rewardInteractionType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayDetailInfo.DetailCommonInfo detailCommonInfo, JSONObject jSONObject) {
        a2(detailCommonInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayDetailInfo.DetailCommonInfo detailCommonInfo, JSONObject jSONObject) {
        return b2(detailCommonInfo, jSONObject);
    }
}

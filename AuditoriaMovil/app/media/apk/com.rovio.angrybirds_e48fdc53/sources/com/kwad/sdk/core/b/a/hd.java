package com.kwad.sdk.core.b.a;

import com.facebook.internal.AnalyticsEvents;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hd implements com.kwad.sdk.core.d<AdMatrixInfo.RewardVideoInteractInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.RewardVideoInteractInfo rewardVideoInteractInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        rewardVideoInteractInfo.templateId = jSONObject.optString("templateId");
        if (rewardVideoInteractInfo.templateId == JSONObject.NULL) {
            rewardVideoInteractInfo.templateId = "";
        }
        rewardVideoInteractInfo.showTime = jSONObject.optInt("showTime", new Integer("15").intValue());
        rewardVideoInteractInfo.duration = jSONObject.optInt("duration", new Integer("10").intValue());
        rewardVideoInteractInfo.rewardTime = jSONObject.optInt("rewardTime", new Integer("5").intValue());
        rewardVideoInteractInfo.intervalShow = jSONObject.optInt("intervalShow", new Integer("3").intValue());
        rewardVideoInteractInfo.dayMaxLimit = jSONObject.optInt("dayMaxLimit", new Integer("2").intValue());
        rewardVideoInteractInfo.style = jSONObject.optInt(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        rewardVideoInteractInfo.successfulMsg = jSONObject.optString("successfulMsg");
        if (rewardVideoInteractInfo.successfulMsg == JSONObject.NULL) {
            rewardVideoInteractInfo.successfulMsg = "";
        }
        rewardVideoInteractInfo.errorMsg = jSONObject.optString("errorMsg");
        if (rewardVideoInteractInfo.errorMsg == JSONObject.NULL) {
            rewardVideoInteractInfo.errorMsg = "";
        }
        rewardVideoInteractInfo.styleInfo = new AdMatrixInfo.StyleInfo();
        rewardVideoInteractInfo.styleInfo.parseJson(jSONObject.optJSONObject("styleInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.RewardVideoInteractInfo rewardVideoInteractInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rewardVideoInteractInfo.templateId != null && !rewardVideoInteractInfo.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateId", rewardVideoInteractInfo.templateId);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "showTime", rewardVideoInteractInfo.showTime);
        com.kwad.sdk.utils.t.putValue(jSONObject, "duration", rewardVideoInteractInfo.duration);
        com.kwad.sdk.utils.t.putValue(jSONObject, "rewardTime", rewardVideoInteractInfo.rewardTime);
        com.kwad.sdk.utils.t.putValue(jSONObject, "intervalShow", rewardVideoInteractInfo.intervalShow);
        com.kwad.sdk.utils.t.putValue(jSONObject, "dayMaxLimit", rewardVideoInteractInfo.dayMaxLimit);
        if (rewardVideoInteractInfo.style != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, rewardVideoInteractInfo.style);
        }
        if (rewardVideoInteractInfo.successfulMsg != null && !rewardVideoInteractInfo.successfulMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "successfulMsg", rewardVideoInteractInfo.successfulMsg);
        }
        if (rewardVideoInteractInfo.errorMsg != null && !rewardVideoInteractInfo.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorMsg", rewardVideoInteractInfo.errorMsg);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "styleInfo", rewardVideoInteractInfo.styleInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.RewardVideoInteractInfo rewardVideoInteractInfo, JSONObject jSONObject) {
        a2(rewardVideoInteractInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.RewardVideoInteractInfo rewardVideoInteractInfo, JSONObject jSONObject) {
        return b2(rewardVideoInteractInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ac implements com.kwad.sdk.core.d<AdInfo.AdRewardInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdRewardInfo adRewardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adRewardInfo.skipShowTime = jSONObject.optInt("skipShowTime", new Integer("30").intValue());
        adRewardInfo.rewardTime = jSONObject.optInt("rewardTime", new Integer("30").intValue());
        adRewardInfo.showLandingPage = jSONObject.optInt("showLandingPage");
        adRewardInfo.rewardVideoEndCardSwitch = jSONObject.optBoolean("rewardVideoEndCardSwitch");
        adRewardInfo.recommendAggregateSwitch = jSONObject.optBoolean("recommendAggregateSwitch");
        adRewardInfo.callBackStrategyInfo = new AdInfo.CallBackStrategyInfo();
        adRewardInfo.callBackStrategyInfo.parseJson(jSONObject.optJSONObject("callBackStrategyInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdRewardInfo adRewardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "skipShowTime", adRewardInfo.skipShowTime);
        com.kwad.sdk.utils.t.putValue(jSONObject, "rewardTime", adRewardInfo.rewardTime);
        if (adRewardInfo.showLandingPage != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLandingPage", adRewardInfo.showLandingPage);
        }
        if (adRewardInfo.rewardVideoEndCardSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardVideoEndCardSwitch", adRewardInfo.rewardVideoEndCardSwitch);
        }
        if (adRewardInfo.recommendAggregateSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "recommendAggregateSwitch", adRewardInfo.recommendAggregateSwitch);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "callBackStrategyInfo", adRewardInfo.callBackStrategyInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdRewardInfo adRewardInfo, JSONObject jSONObject) {
        a2(adRewardInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdRewardInfo adRewardInfo, JSONObject jSONObject) {
        return b2(adRewardInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ae implements com.kwad.sdk.core.d<AdInfo.AdSplashInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdSplashInfo adSplashInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adSplashInfo.logoPosition = jSONObject.optInt("logoPosition", new Integer("1").intValue());
        adSplashInfo.mute = jSONObject.optInt("mute", new Integer("1").intValue());
        adSplashInfo.skipType = jSONObject.optInt("skipType");
        adSplashInfo.skipTips = jSONObject.optString("skipTips");
        if (adSplashInfo.skipTips == JSONObject.NULL) {
            adSplashInfo.skipTips = "";
        }
        adSplashInfo.speakerMuteIconUrl = jSONObject.optString("speakerMuteIconUrl");
        if (adSplashInfo.speakerMuteIconUrl == JSONObject.NULL) {
            adSplashInfo.speakerMuteIconUrl = "";
        }
        adSplashInfo.speakerIconUrl = jSONObject.optString("speakerIconUrl");
        if (adSplashInfo.speakerIconUrl == JSONObject.NULL) {
            adSplashInfo.speakerIconUrl = "";
        }
        adSplashInfo.imageDisplaySecond = jSONObject.optInt("imageDisplaySecond", new Integer("5").intValue());
        adSplashInfo.videoDisplaySecond = jSONObject.optInt("videoDisplaySecond", new Integer("5").intValue());
        adSplashInfo.countdownShow = jSONObject.optInt("countdownShow");
        adSplashInfo.fullScreenClickSwitch = jSONObject.optInt("fullScreenClickSwitch");
        adSplashInfo.skipButtonPosition = jSONObject.optInt("skipButtonPosition");
        adSplashInfo.splashShowClickButtonSwitch = jSONObject.optInt("splashShowClickButtonSwitch", new Integer("1").intValue());
        adSplashInfo.skipSecond = jSONObject.optInt("skipSecond");
        adSplashInfo.impressionStatisticalChangeSwitch = jSONObject.optBoolean("impressionStatisticalChangeSwitch");
        adSplashInfo.impressionLimitSize = jSONObject.optDouble("impressionLimitSize");
        adSplashInfo.cutRuleInfo = new AdInfo.CutRuleInfo();
        adSplashInfo.cutRuleInfo.parseJson(jSONObject.optJSONObject("cutRuleInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdSplashInfo adSplashInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "logoPosition", adSplashInfo.logoPosition);
        com.kwad.sdk.utils.t.putValue(jSONObject, "mute", adSplashInfo.mute);
        if (adSplashInfo.skipType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipType", adSplashInfo.skipType);
        }
        if (adSplashInfo.skipTips != null && !adSplashInfo.skipTips.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipTips", adSplashInfo.skipTips);
        }
        if (adSplashInfo.speakerMuteIconUrl != null && !adSplashInfo.speakerMuteIconUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speakerMuteIconUrl", adSplashInfo.speakerMuteIconUrl);
        }
        if (adSplashInfo.speakerIconUrl != null && !adSplashInfo.speakerIconUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speakerIconUrl", adSplashInfo.speakerIconUrl);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "imageDisplaySecond", adSplashInfo.imageDisplaySecond);
        com.kwad.sdk.utils.t.putValue(jSONObject, "videoDisplaySecond", adSplashInfo.videoDisplaySecond);
        if (adSplashInfo.countdownShow != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "countdownShow", adSplashInfo.countdownShow);
        }
        if (adSplashInfo.fullScreenClickSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fullScreenClickSwitch", adSplashInfo.fullScreenClickSwitch);
        }
        if (adSplashInfo.skipButtonPosition != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipButtonPosition", adSplashInfo.skipButtonPosition);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "splashShowClickButtonSwitch", adSplashInfo.splashShowClickButtonSwitch);
        if (adSplashInfo.skipSecond != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipSecond", adSplashInfo.skipSecond);
        }
        if (adSplashInfo.impressionStatisticalChangeSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "impressionStatisticalChangeSwitch", adSplashInfo.impressionStatisticalChangeSwitch);
        }
        if (adSplashInfo.impressionLimitSize != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "impressionLimitSize", adSplashInfo.impressionLimitSize);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "cutRuleInfo", adSplashInfo.cutRuleInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdSplashInfo adSplashInfo, JSONObject jSONObject) {
        a2(adSplashInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdSplashInfo adSplashInfo, JSONObject jSONObject) {
        return b2(adSplashInfo, jSONObject);
    }
}

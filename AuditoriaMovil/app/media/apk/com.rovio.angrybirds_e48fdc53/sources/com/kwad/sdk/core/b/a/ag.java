package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ag implements com.kwad.sdk.core.d<AdInfo.AdStyleConfInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdStyleConfInfo adStyleConfInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adStyleConfInfo.fullScreenSkipShowTime = jSONObject.optInt("fullScreenSkipShowTime", new Integer("5").intValue());
        adStyleConfInfo.rewardSkipConfirmSwitch = jSONObject.optInt("rewardSkipConfirmSwitch", new Integer("1").intValue());
        adStyleConfInfo.closeDelaySeconds = jSONObject.optLong("closeDelaySeconds");
        adStyleConfInfo.playableCloseSeconds = jSONObject.optLong("playableCloseSeconds");
        adStyleConfInfo.rewardVideoInteractSwitch = jSONObject.optBoolean("rewardVideoInteractSwitch");
        adStyleConfInfo.adShowVideoH5Info = new AdInfo.AdShowVideoH5Info();
        adStyleConfInfo.adShowVideoH5Info.parseJson(jSONObject.optJSONObject("adShowVideoH5Info"));
        adStyleConfInfo.adPushSwitch = jSONObject.optBoolean("adPushSwitch");
        adStyleConfInfo.adPushShowAfterTime = jSONObject.optInt("adPushShowAfterTime");
        adStyleConfInfo.adPushIntervalTime = jSONObject.optInt("adPushIntervalTime", new Integer("900").intValue());
        adStyleConfInfo.nativeAdInfo = new AdInfo.NativeAdInfo();
        adStyleConfInfo.nativeAdInfo.parseJson(jSONObject.optJSONObject("nativeAdInfo"));
        adStyleConfInfo.useNativeForOuterLiveAd = jSONObject.optBoolean("useNativeForOuterLiveAd");
        adStyleConfInfo.adPushDownloadJumpType = jSONObject.optInt("adPushDownloadJumpType");
        adStyleConfInfo.actionBarType = jSONObject.optInt("actionBarType");
        adStyleConfInfo.endCardType = jSONObject.optInt("endCardType");
        adStyleConfInfo.confirmCardType = jSONObject.optInt("confirmCardType");
        adStyleConfInfo.innerAdType = jSONObject.optInt("innerAdType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdStyleConfInfo adStyleConfInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "fullScreenSkipShowTime", adStyleConfInfo.fullScreenSkipShowTime);
        com.kwad.sdk.utils.t.putValue(jSONObject, "rewardSkipConfirmSwitch", adStyleConfInfo.rewardSkipConfirmSwitch);
        if (adStyleConfInfo.closeDelaySeconds != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeDelaySeconds", adStyleConfInfo.closeDelaySeconds);
        }
        if (adStyleConfInfo.playableCloseSeconds != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playableCloseSeconds", adStyleConfInfo.playableCloseSeconds);
        }
        if (adStyleConfInfo.rewardVideoInteractSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardVideoInteractSwitch", adStyleConfInfo.rewardVideoInteractSwitch);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adShowVideoH5Info", adStyleConfInfo.adShowVideoH5Info);
        if (adStyleConfInfo.adPushSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adPushSwitch", adStyleConfInfo.adPushSwitch);
        }
        if (adStyleConfInfo.adPushShowAfterTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adPushShowAfterTime", adStyleConfInfo.adPushShowAfterTime);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "adPushIntervalTime", adStyleConfInfo.adPushIntervalTime);
        com.kwad.sdk.utils.t.a(jSONObject, "nativeAdInfo", adStyleConfInfo.nativeAdInfo);
        if (adStyleConfInfo.useNativeForOuterLiveAd) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "useNativeForOuterLiveAd", adStyleConfInfo.useNativeForOuterLiveAd);
        }
        if (adStyleConfInfo.adPushDownloadJumpType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adPushDownloadJumpType", adStyleConfInfo.adPushDownloadJumpType);
        }
        if (adStyleConfInfo.actionBarType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "actionBarType", adStyleConfInfo.actionBarType);
        }
        if (adStyleConfInfo.endCardType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "endCardType", adStyleConfInfo.endCardType);
        }
        if (adStyleConfInfo.confirmCardType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "confirmCardType", adStyleConfInfo.confirmCardType);
        }
        if (adStyleConfInfo.innerAdType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "innerAdType", adStyleConfInfo.innerAdType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdStyleConfInfo adStyleConfInfo, JSONObject jSONObject) {
        a2(adStyleConfInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdStyleConfInfo adStyleConfInfo, JSONObject jSONObject) {
        return b2(adStyleConfInfo, jSONObject);
    }
}

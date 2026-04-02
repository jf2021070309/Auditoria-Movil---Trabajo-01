package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.api.reward.RewardItem;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.sdk.core.response.model.ABParams;
import com.kwad.sdk.core.response.model.AdInfo;
import com.qq.e.comm.constants.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i implements com.kwad.sdk.core.d<AdInfo.AdBaseInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdBaseInfo adBaseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adBaseInfo.creativeId = jSONObject.optLong("creativeId");
        adBaseInfo.adSourceType = jSONObject.optInt("adSourceType");
        adBaseInfo.liveStreamId = jSONObject.optString("liveStreamId");
        if (adBaseInfo.liveStreamId == JSONObject.NULL) {
            adBaseInfo.liveStreamId = "";
        }
        adBaseInfo.universeLiveType = jSONObject.optInt("universeLiveType");
        adBaseInfo.viewCount = jSONObject.optLong("viewCount");
        adBaseInfo.sdkExtraData = jSONObject.optString("sdkExtraData");
        if (adBaseInfo.sdkExtraData == JSONObject.NULL) {
            adBaseInfo.sdkExtraData = "";
        }
        adBaseInfo.adDescription = jSONObject.optString("adDescription");
        if (adBaseInfo.adDescription == JSONObject.NULL) {
            adBaseInfo.adDescription = "";
        }
        adBaseInfo.installAppLabel = jSONObject.optString("installAppLabel");
        if (adBaseInfo.installAppLabel == JSONObject.NULL) {
            adBaseInfo.installAppLabel = "";
        }
        adBaseInfo.openAppLabel = jSONObject.optString("openAppLabel");
        if (adBaseInfo.openAppLabel == JSONObject.NULL) {
            adBaseInfo.openAppLabel = "";
        }
        adBaseInfo.adMarkIcon = jSONObject.optString("adMarkIcon");
        if (adBaseInfo.adMarkIcon == JSONObject.NULL) {
            adBaseInfo.adMarkIcon = "";
        }
        adBaseInfo.adGrayMarkIcon = jSONObject.optString("adGrayMarkIcon");
        if (adBaseInfo.adGrayMarkIcon == JSONObject.NULL) {
            adBaseInfo.adGrayMarkIcon = "";
        }
        adBaseInfo.adSourceDescription = jSONObject.optString("adSourceDescription");
        if (adBaseInfo.adSourceDescription == JSONObject.NULL) {
            adBaseInfo.adSourceDescription = "";
        }
        adBaseInfo.adOperationType = jSONObject.optInt("adOperationType");
        adBaseInfo.adActionDescription = jSONObject.optString("adActionDescription");
        if (adBaseInfo.adActionDescription == JSONObject.NULL) {
            adBaseInfo.adActionDescription = "";
        }
        adBaseInfo.adActionBarColor = jSONObject.optString("adActionBarColor");
        if (adBaseInfo.adActionBarColor == JSONObject.NULL) {
            adBaseInfo.adActionBarColor = "";
        }
        adBaseInfo.adShowDuration = jSONObject.optInt("adShowDuration");
        adBaseInfo.appName = jSONObject.optString("appName");
        if (adBaseInfo.appName == JSONObject.NULL) {
            adBaseInfo.appName = "";
        }
        adBaseInfo.appIconUrl = jSONObject.optString("appIconUrl");
        if (adBaseInfo.appIconUrl == JSONObject.NULL) {
            adBaseInfo.appIconUrl = "";
        }
        adBaseInfo.appPackageName = jSONObject.optString("appPackageName");
        if (adBaseInfo.appPackageName == JSONObject.NULL) {
            adBaseInfo.appPackageName = "";
        }
        adBaseInfo.appScore = jSONObject.optInt("appScore");
        adBaseInfo.appDownloadCountDesc = jSONObject.optString("appDownloadCountDesc");
        if (adBaseInfo.appDownloadCountDesc == JSONObject.NULL) {
            adBaseInfo.appDownloadCountDesc = "";
        }
        adBaseInfo.appCategory = jSONObject.optString("appCategory");
        if (adBaseInfo.appCategory == JSONObject.NULL) {
            adBaseInfo.appCategory = "";
        }
        adBaseInfo.appVersion = jSONObject.optString("appVersion");
        if (adBaseInfo.appVersion == JSONObject.NULL) {
            adBaseInfo.appVersion = "";
        }
        adBaseInfo.corporationName = jSONObject.optString("corporationName");
        if (adBaseInfo.corporationName == JSONObject.NULL) {
            adBaseInfo.corporationName = "";
        }
        adBaseInfo.packageSize = jSONObject.optLong("packageSize");
        adBaseInfo.appImageUrl = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("appImageUrl");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                adBaseInfo.appImageUrl.add((String) optJSONArray.opt(i));
            }
        }
        adBaseInfo.appImageSize = new AdInfo.MaterialSize();
        adBaseInfo.appImageSize.parseJson(jSONObject.optJSONObject("appImageSize"));
        adBaseInfo.appDescription = jSONObject.optString("appDescription");
        if (adBaseInfo.appDescription == JSONObject.NULL) {
            adBaseInfo.appDescription = "";
        }
        adBaseInfo.enableSkipAd = jSONObject.optInt("enableSkipAd");
        adBaseInfo.adCacheSwitch = jSONObject.optInt("adCacheSwitch", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        adBaseInfo.adCacheSecond = jSONObject.optLong("adCacheSecond", new Long("1800").longValue());
        adBaseInfo.adCacheStrategy = jSONObject.optInt("adCacheStrategy", new Integer("1").intValue());
        adBaseInfo.adCacheSize = jSONObject.optInt("adCacheSize", new Integer("1").intValue());
        adBaseInfo.skipSecond = jSONObject.optInt("skipSecond");
        adBaseInfo.ecpm = jSONObject.optInt(RewardItem.KEY_ECPM);
        adBaseInfo.videoPlayedNS = jSONObject.optString("videoPlayedNS");
        if (adBaseInfo.videoPlayedNS == JSONObject.NULL) {
            adBaseInfo.videoPlayedNS = "";
        }
        adBaseInfo.productName = jSONObject.optString("productName");
        if (adBaseInfo.productName == JSONObject.NULL) {
            adBaseInfo.productName = "";
        }
        adBaseInfo.mABParams = new ABParams();
        try {
            adBaseInfo.mABParams.parseJson(new JSONObject(jSONObject.optString("expParam")));
        } catch (Exception e) {
        }
        adBaseInfo.showUrl = jSONObject.optString("showUrl");
        if (adBaseInfo.showUrl == JSONObject.NULL) {
            adBaseInfo.showUrl = "";
        }
        adBaseInfo.clickUrl = jSONObject.optString(Constants.KEYS.EXPOSED_CLICK_URL_KEY);
        if (adBaseInfo.clickUrl == JSONObject.NULL) {
            adBaseInfo.clickUrl = "";
        }
        adBaseInfo.convUrl = jSONObject.optString("convUrl");
        if (adBaseInfo.convUrl == JSONObject.NULL) {
            adBaseInfo.convUrl = "";
        }
        adBaseInfo.adAttributeType = jSONObject.optInt("adAttributeType");
        adBaseInfo.apiExpParam = new AdInfo.H5Config();
        adBaseInfo.apiExpParam.parseJson(jSONObject.optJSONObject("apiExpParam"));
        adBaseInfo.taskType = jSONObject.optInt("taskType");
        adBaseInfo.campaignType = jSONObject.optInt("campaignType");
        adBaseInfo.itemType = jSONObject.optInt("itemType");
        adBaseInfo.industryFirstLevelId = jSONObject.optInt("industryFirstLevelId");
        adBaseInfo.extraClickReward = jSONObject.optBoolean("extraClickReward");
        adBaseInfo.enableClientProofreadTime = jSONObject.optBoolean("enableClientProofreadTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdBaseInfo adBaseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adBaseInfo.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", adBaseInfo.creativeId);
        }
        if (adBaseInfo.adSourceType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adSourceType", adBaseInfo.adSourceType);
        }
        if (adBaseInfo.liveStreamId != null && !adBaseInfo.liveStreamId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "liveStreamId", adBaseInfo.liveStreamId);
        }
        if (adBaseInfo.universeLiveType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "universeLiveType", adBaseInfo.universeLiveType);
        }
        if (adBaseInfo.viewCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "viewCount", adBaseInfo.viewCount);
        }
        if (adBaseInfo.sdkExtraData != null && !adBaseInfo.sdkExtraData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkExtraData", adBaseInfo.sdkExtraData);
        }
        if (adBaseInfo.adDescription != null && !adBaseInfo.adDescription.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adDescription", adBaseInfo.adDescription);
        }
        if (adBaseInfo.installAppLabel != null && !adBaseInfo.installAppLabel.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installAppLabel", adBaseInfo.installAppLabel);
        }
        if (adBaseInfo.openAppLabel != null && !adBaseInfo.openAppLabel.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "openAppLabel", adBaseInfo.openAppLabel);
        }
        if (adBaseInfo.adMarkIcon != null && !adBaseInfo.adMarkIcon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adMarkIcon", adBaseInfo.adMarkIcon);
        }
        if (adBaseInfo.adGrayMarkIcon != null && !adBaseInfo.adGrayMarkIcon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adGrayMarkIcon", adBaseInfo.adGrayMarkIcon);
        }
        if (adBaseInfo.adSourceDescription != null && !adBaseInfo.adSourceDescription.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adSourceDescription", adBaseInfo.adSourceDescription);
        }
        if (adBaseInfo.adOperationType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adOperationType", adBaseInfo.adOperationType);
        }
        if (adBaseInfo.adActionDescription != null && !adBaseInfo.adActionDescription.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adActionDescription", adBaseInfo.adActionDescription);
        }
        if (adBaseInfo.adActionBarColor != null && !adBaseInfo.adActionBarColor.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adActionBarColor", adBaseInfo.adActionBarColor);
        }
        if (adBaseInfo.adShowDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adShowDuration", adBaseInfo.adShowDuration);
        }
        if (adBaseInfo.appName != null && !adBaseInfo.appName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appName", adBaseInfo.appName);
        }
        if (adBaseInfo.appIconUrl != null && !adBaseInfo.appIconUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appIconUrl", adBaseInfo.appIconUrl);
        }
        if (adBaseInfo.appPackageName != null && !adBaseInfo.appPackageName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appPackageName", adBaseInfo.appPackageName);
        }
        if (adBaseInfo.appScore != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appScore", adBaseInfo.appScore);
        }
        if (adBaseInfo.appDownloadCountDesc != null && !adBaseInfo.appDownloadCountDesc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appDownloadCountDesc", adBaseInfo.appDownloadCountDesc);
        }
        if (adBaseInfo.appCategory != null && !adBaseInfo.appCategory.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appCategory", adBaseInfo.appCategory);
        }
        if (adBaseInfo.appVersion != null && !adBaseInfo.appVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appVersion", adBaseInfo.appVersion);
        }
        if (adBaseInfo.corporationName != null && !adBaseInfo.corporationName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "corporationName", adBaseInfo.corporationName);
        }
        if (adBaseInfo.packageSize != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "packageSize", adBaseInfo.packageSize);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appImageUrl", adBaseInfo.appImageUrl);
        com.kwad.sdk.utils.t.a(jSONObject, "appImageSize", adBaseInfo.appImageSize);
        if (adBaseInfo.appDescription != null && !adBaseInfo.appDescription.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appDescription", adBaseInfo.appDescription);
        }
        if (adBaseInfo.enableSkipAd != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enableSkipAd", adBaseInfo.enableSkipAd);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "adCacheSwitch", adBaseInfo.adCacheSwitch);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adCacheSecond", adBaseInfo.adCacheSecond);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adCacheStrategy", adBaseInfo.adCacheStrategy);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adCacheSize", adBaseInfo.adCacheSize);
        if (adBaseInfo.skipSecond != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipSecond", adBaseInfo.skipSecond);
        }
        if (adBaseInfo.ecpm != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, RewardItem.KEY_ECPM, adBaseInfo.ecpm);
        }
        if (adBaseInfo.videoPlayedNS != null && !adBaseInfo.videoPlayedNS.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoPlayedNS", adBaseInfo.videoPlayedNS);
        }
        if (adBaseInfo.productName != null && !adBaseInfo.productName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "productName", adBaseInfo.productName);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "expParam", adBaseInfo.mABParams.toJson().toString());
        if (adBaseInfo.showUrl != null && !adBaseInfo.showUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showUrl", adBaseInfo.showUrl);
        }
        if (adBaseInfo.clickUrl != null && !adBaseInfo.clickUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, Constants.KEYS.EXPOSED_CLICK_URL_KEY, adBaseInfo.clickUrl);
        }
        if (adBaseInfo.convUrl != null && !adBaseInfo.convUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "convUrl", adBaseInfo.convUrl);
        }
        if (adBaseInfo.adAttributeType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAttributeType", adBaseInfo.adAttributeType);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "apiExpParam", adBaseInfo.apiExpParam);
        if (adBaseInfo.taskType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "taskType", adBaseInfo.taskType);
        }
        if (adBaseInfo.campaignType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "campaignType", adBaseInfo.campaignType);
        }
        if (adBaseInfo.itemType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemType", adBaseInfo.itemType);
        }
        if (adBaseInfo.industryFirstLevelId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "industryFirstLevelId", adBaseInfo.industryFirstLevelId);
        }
        if (adBaseInfo.extraClickReward) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "extraClickReward", adBaseInfo.extraClickReward);
        }
        if (adBaseInfo.enableClientProofreadTime) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enableClientProofreadTime", adBaseInfo.enableClientProofreadTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdBaseInfo adBaseInfo, JSONObject jSONObject) {
        a2(adBaseInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdBaseInfo adBaseInfo, JSONObject jSONObject) {
        return b2(adBaseInfo, jSONObject);
    }
}

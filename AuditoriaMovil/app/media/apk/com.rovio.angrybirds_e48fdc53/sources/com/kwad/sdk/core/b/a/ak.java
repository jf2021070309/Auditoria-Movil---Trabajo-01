package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.report.AdTrackLog;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ak implements com.kwad.sdk.core.d<AdTrackLog> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdTrackLog adTrackLog, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adTrackLog.templateId = jSONObject.optString("template_id");
        if (adTrackLog.templateId == JSONObject.NULL) {
            adTrackLog.templateId = "";
        }
        adTrackLog.sceneId = jSONObject.optString("scene_id");
        if (adTrackLog.sceneId == JSONObject.NULL) {
            adTrackLog.sceneId = "";
        }
        adTrackLog.preLandingPageSwitch = jSONObject.optInt("pre_landing_page_switch");
        adTrackLog.preLandingPageShowType = jSONObject.optInt("pre_landing_page_show_type");
        adTrackLog.adLiveSwitch = jSONObject.optInt("ad_live_switch");
        adTrackLog.adTkLiveSwitch = jSONObject.optInt("ad_tk_live_switch");
        adTrackLog.adLiveComponentReady = jSONObject.optInt("ad_live_component_ready");
        adTrackLog.serverCheckSwitch = jSONObject.optInt("server_check_switch");
        adTrackLog.rewardAdvanceSwitch = jSONObject.optInt("reward_advance_switch");
        adTrackLog.isPlugin = jSONObject.optInt("is_plugin");
        adTrackLog.apiSdkVersion = jSONObject.optString("api_sdk_version");
        if (adTrackLog.apiSdkVersion == JSONObject.NULL) {
            adTrackLog.apiSdkVersion = "";
        }
        adTrackLog.rewardDetailStatusBarHeight = jSONObject.optInt("reward_detail_status_bar_height");
        adTrackLog.rewardDetailCallPositionY = jSONObject.optInt("reward_detail_call_position_y");
        adTrackLog.screenOrientation = jSONObject.optInt("screen_orientation");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdTrackLog adTrackLog, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adTrackLog.templateId != null && !adTrackLog.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_id", adTrackLog.templateId);
        }
        if (adTrackLog.sceneId != null && !adTrackLog.sceneId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "scene_id", adTrackLog.sceneId);
        }
        if (adTrackLog.preLandingPageSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pre_landing_page_switch", adTrackLog.preLandingPageSwitch);
        }
        if (adTrackLog.preLandingPageShowType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pre_landing_page_show_type", adTrackLog.preLandingPageShowType);
        }
        if (adTrackLog.adLiveSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ad_live_switch", adTrackLog.adLiveSwitch);
        }
        if (adTrackLog.adTkLiveSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ad_tk_live_switch", adTrackLog.adTkLiveSwitch);
        }
        if (adTrackLog.adLiveComponentReady != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ad_live_component_ready", adTrackLog.adLiveComponentReady);
        }
        if (adTrackLog.serverCheckSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "server_check_switch", adTrackLog.serverCheckSwitch);
        }
        if (adTrackLog.rewardAdvanceSwitch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reward_advance_switch", adTrackLog.rewardAdvanceSwitch);
        }
        if (adTrackLog.isPlugin != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_plugin", adTrackLog.isPlugin);
        }
        if (adTrackLog.apiSdkVersion != null && !adTrackLog.apiSdkVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "api_sdk_version", adTrackLog.apiSdkVersion);
        }
        if (adTrackLog.rewardDetailStatusBarHeight != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reward_detail_status_bar_height", adTrackLog.rewardDetailStatusBarHeight);
        }
        if (adTrackLog.rewardDetailCallPositionY != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reward_detail_call_position_y", adTrackLog.rewardDetailCallPositionY);
        }
        if (adTrackLog.screenOrientation != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screen_orientation", adTrackLog.screenOrientation);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdTrackLog adTrackLog, JSONObject jSONObject) {
        a2(adTrackLog, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdTrackLog adTrackLog, JSONObject jSONObject) {
        return b2(adTrackLog, jSONObject);
    }
}

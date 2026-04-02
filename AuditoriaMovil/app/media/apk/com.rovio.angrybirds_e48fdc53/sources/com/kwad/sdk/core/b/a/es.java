package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.interstitial.monitor.InterstitialMonitorInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class es implements com.kwad.sdk.core.d<InterstitialMonitorInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(InterstitialMonitorInfo interstitialMonitorInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        interstitialMonitorInfo.status = jSONObject.optInt("status");
        interstitialMonitorInfo.type = jSONObject.optInt("type");
        interstitialMonitorInfo.loadDataTime = jSONObject.optLong("load_data_duration_ms");
        interstitialMonitorInfo.renderDuration = jSONObject.optLong("render_duration_ms");
        interstitialMonitorInfo.renderType = jSONObject.optInt("render_type");
        interstitialMonitorInfo.expectedRenderType = jSONObject.optInt("expected_render_type");
        interstitialMonitorInfo.materialType = jSONObject.optInt("material_type");
        interstitialMonitorInfo.downloadDuration = jSONObject.optLong("download_duration_ms");
        interstitialMonitorInfo.downloadType = jSONObject.optInt("download_type");
        interstitialMonitorInfo.downloadSize = jSONObject.optLong("download_size");
        interstitialMonitorInfo.errorCode = jSONObject.optInt("error_code");
        interstitialMonitorInfo.errorMsg = jSONObject.optString("error_msg");
        if (interstitialMonitorInfo.errorMsg == JSONObject.NULL) {
            interstitialMonitorInfo.errorMsg = "";
        }
        interstitialMonitorInfo.creativeId = jSONObject.optLong("creative_id");
        interstitialMonitorInfo.videoUrl = jSONObject.optString("video_url");
        if (interstitialMonitorInfo.videoUrl == JSONObject.NULL) {
            interstitialMonitorInfo.videoUrl = "";
        }
        interstitialMonitorInfo.videoDuration = jSONObject.optLong("video_duration_ms");
        interstitialMonitorInfo.posId = jSONObject.optLong("pos_Id");
        interstitialMonitorInfo.playStartedDuration = jSONObject.optLong("play_started_duration_ms");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(InterstitialMonitorInfo interstitialMonitorInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (interstitialMonitorInfo.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", interstitialMonitorInfo.status);
        }
        if (interstitialMonitorInfo.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", interstitialMonitorInfo.type);
        }
        if (interstitialMonitorInfo.loadDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_data_duration_ms", interstitialMonitorInfo.loadDataTime);
        }
        if (interstitialMonitorInfo.renderDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "render_duration_ms", interstitialMonitorInfo.renderDuration);
        }
        if (interstitialMonitorInfo.renderType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "render_type", interstitialMonitorInfo.renderType);
        }
        if (interstitialMonitorInfo.expectedRenderType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "expected_render_type", interstitialMonitorInfo.expectedRenderType);
        }
        if (interstitialMonitorInfo.materialType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "material_type", interstitialMonitorInfo.materialType);
        }
        if (interstitialMonitorInfo.downloadDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_duration_ms", interstitialMonitorInfo.downloadDuration);
        }
        if (interstitialMonitorInfo.downloadType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_type", interstitialMonitorInfo.downloadType);
        }
        if (interstitialMonitorInfo.downloadSize != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_size", interstitialMonitorInfo.downloadSize);
        }
        if (interstitialMonitorInfo.errorCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_code", interstitialMonitorInfo.errorCode);
        }
        if (interstitialMonitorInfo.errorMsg != null && !interstitialMonitorInfo.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_msg", interstitialMonitorInfo.errorMsg);
        }
        if (interstitialMonitorInfo.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creative_id", interstitialMonitorInfo.creativeId);
        }
        if (interstitialMonitorInfo.videoUrl != null && !interstitialMonitorInfo.videoUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "video_url", interstitialMonitorInfo.videoUrl);
        }
        if (interstitialMonitorInfo.videoDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "video_duration_ms", interstitialMonitorInfo.videoDuration);
        }
        if (interstitialMonitorInfo.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pos_Id", interstitialMonitorInfo.posId);
        }
        if (interstitialMonitorInfo.playStartedDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "play_started_duration_ms", interstitialMonitorInfo.playStartedDuration);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(InterstitialMonitorInfo interstitialMonitorInfo, JSONObject jSONObject) {
        a2(interstitialMonitorInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(InterstitialMonitorInfo interstitialMonitorInfo, JSONObject jSONObject) {
        return b2(interstitialMonitorInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.core.response.model.PhotoInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jg implements com.kwad.sdk.core.d<PhotoInfo.VideoInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(PhotoInfo.VideoInfo videoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        videoInfo.videoUrl = jSONObject.optString("videoUrl");
        if (videoInfo.videoUrl == JSONObject.NULL) {
            videoInfo.videoUrl = "";
        }
        videoInfo.manifest = jSONObject.optString("manifest");
        if (videoInfo.manifest == JSONObject.NULL) {
            videoInfo.manifest = "";
        }
        videoInfo.firstFrame = jSONObject.optString("firstFrame");
        if (videoInfo.firstFrame == JSONObject.NULL) {
            videoInfo.firstFrame = "";
        }
        videoInfo.duration = jSONObject.optLong("duration");
        videoInfo.size = jSONObject.optInt("size");
        videoInfo.width = jSONObject.optInt("width");
        videoInfo.height = jSONObject.optInt("height");
        videoInfo.leftRatio = jSONObject.optDouble("leftRatio");
        videoInfo.topRatio = jSONObject.optDouble("topRatio");
        videoInfo.widthRatio = jSONObject.optDouble("widthRatio", new Double("1.0f").doubleValue());
        videoInfo.heightRatio = jSONObject.optDouble("heightRatio", new Double("1.0f").doubleValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(PhotoInfo.VideoInfo videoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (videoInfo.videoUrl != null && !videoInfo.videoUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoUrl", videoInfo.videoUrl);
        }
        if (videoInfo.manifest != null && !videoInfo.manifest.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "manifest", videoInfo.manifest);
        }
        if (videoInfo.firstFrame != null && !videoInfo.firstFrame.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "firstFrame", videoInfo.firstFrame);
        }
        if (videoInfo.duration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "duration", videoInfo.duration);
        }
        if (videoInfo.size != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "size", videoInfo.size);
        }
        if (videoInfo.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", videoInfo.width);
        }
        if (videoInfo.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", videoInfo.height);
        }
        if (videoInfo.leftRatio != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "leftRatio", videoInfo.leftRatio);
        }
        if (videoInfo.topRatio != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "topRatio", videoInfo.topRatio);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "widthRatio", videoInfo.widthRatio);
        com.kwad.sdk.utils.t.putValue(jSONObject, "heightRatio", videoInfo.heightRatio);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(PhotoInfo.VideoInfo videoInfo, JSONObject jSONObject) {
        a2(videoInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(PhotoInfo.VideoInfo videoInfo, JSONObject jSONObject) {
        return b2(videoInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fi implements com.kwad.sdk.core.d<AdInfo.AdMaterialInfo.MaterialFeature> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdMaterialInfo.MaterialFeature materialFeature, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        materialFeature.featureType = jSONObject.optInt("featureType");
        materialFeature.materialUrl = jSONObject.optString("materialUrl");
        if (materialFeature.materialUrl == JSONObject.NULL) {
            materialFeature.materialUrl = "";
        }
        materialFeature.photoId = jSONObject.optLong("photoId");
        materialFeature.coverUrl = jSONObject.optString("coverUrl");
        if (materialFeature.coverUrl == JSONObject.NULL) {
            materialFeature.coverUrl = "";
        }
        materialFeature.videoDuration = jSONObject.optInt("videoDuration");
        materialFeature.firstFrame = jSONObject.optString("firstFrame");
        if (materialFeature.firstFrame == JSONObject.NULL) {
            materialFeature.firstFrame = "";
        }
        materialFeature.blurBackgroundUrl = jSONObject.optString("blurBackgroundUrl");
        if (materialFeature.blurBackgroundUrl == JSONObject.NULL) {
            materialFeature.blurBackgroundUrl = "";
        }
        materialFeature.webpCoverUrl = jSONObject.optString("webpCoverUrl");
        if (materialFeature.webpCoverUrl == JSONObject.NULL) {
            materialFeature.webpCoverUrl = "";
        }
        materialFeature.videoWidth = jSONObject.optInt("videoWidth");
        materialFeature.videoHeight = jSONObject.optInt("videoHeight");
        materialFeature.likeCount = jSONObject.optLong("likeCount");
        materialFeature.commentCount = jSONObject.optLong("commentCount");
        materialFeature.source = jSONObject.optInt(ShareConstants.FEED_SOURCE_PARAM);
        materialFeature.ruleId = jSONObject.optString("ruleId");
        if (materialFeature.ruleId == JSONObject.NULL) {
            materialFeature.ruleId = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdMaterialInfo.MaterialFeature materialFeature, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (materialFeature.featureType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "featureType", materialFeature.featureType);
        }
        if (materialFeature.materialUrl != null && !materialFeature.materialUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "materialUrl", materialFeature.materialUrl);
        }
        if (materialFeature.photoId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoId", materialFeature.photoId);
        }
        if (materialFeature.coverUrl != null && !materialFeature.coverUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "coverUrl", materialFeature.coverUrl);
        }
        if (materialFeature.videoDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoDuration", materialFeature.videoDuration);
        }
        if (materialFeature.firstFrame != null && !materialFeature.firstFrame.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "firstFrame", materialFeature.firstFrame);
        }
        if (materialFeature.blurBackgroundUrl != null && !materialFeature.blurBackgroundUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blurBackgroundUrl", materialFeature.blurBackgroundUrl);
        }
        if (materialFeature.webpCoverUrl != null && !materialFeature.webpCoverUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "webpCoverUrl", materialFeature.webpCoverUrl);
        }
        if (materialFeature.videoWidth != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoWidth", materialFeature.videoWidth);
        }
        if (materialFeature.videoHeight != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoHeight", materialFeature.videoHeight);
        }
        if (materialFeature.likeCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "likeCount", materialFeature.likeCount);
        }
        if (materialFeature.commentCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "commentCount", materialFeature.commentCount);
        }
        if (materialFeature.source != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.FEED_SOURCE_PARAM, materialFeature.source);
        }
        if (materialFeature.ruleId != null && !materialFeature.ruleId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ruleId", materialFeature.ruleId);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdMaterialInfo.MaterialFeature materialFeature, JSONObject jSONObject) {
        a2(materialFeature, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdMaterialInfo.MaterialFeature materialFeature, JSONObject jSONObject) {
        return b2(materialFeature, jSONObject);
    }
}

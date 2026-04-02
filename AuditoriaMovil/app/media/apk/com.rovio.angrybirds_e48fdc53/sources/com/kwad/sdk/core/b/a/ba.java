package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.PhotoInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ba implements com.kwad.sdk.core.d<PhotoInfo.BaseInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(PhotoInfo.BaseInfo baseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        baseInfo.photoId = jSONObject.optLong("photoId");
        baseInfo.sdkExtraData = jSONObject.optString("sdkExtraData");
        if (baseInfo.sdkExtraData == JSONObject.NULL) {
            baseInfo.sdkExtraData = "";
        }
        baseInfo.title = jSONObject.optString("title");
        if (baseInfo.title == JSONObject.NULL) {
            baseInfo.title = "";
        }
        baseInfo.shareUrl = jSONObject.optString("shareUrl");
        if (baseInfo.shareUrl == JSONObject.NULL) {
            baseInfo.shareUrl = "";
        }
        baseInfo.waterMarkPosition = jSONObject.optInt("waterMarkPosition", new Integer("1").intValue());
        baseInfo.recoExt = jSONObject.optString("recoExt");
        if (baseInfo.recoExt == JSONObject.NULL) {
            baseInfo.recoExt = "";
        }
        baseInfo.likeCount = jSONObject.optLong("likeCount");
        baseInfo.commentCount = jSONObject.optLong("commentCount");
        baseInfo.viewCount = jSONObject.optLong("viewCount");
        baseInfo.createTime = jSONObject.optLong("createTime");
        baseInfo.videoDesc = jSONObject.optString("videoDesc");
        if (baseInfo.videoDesc == JSONObject.NULL) {
            baseInfo.videoDesc = "";
        }
        baseInfo.playTimes = jSONObject.optLong("playTimes");
        baseInfo.videoUrlCacheTime = jSONObject.optLong("videoUrlCacheTime");
        baseInfo.contentSourceType = jSONObject.optInt("contentSourceType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(PhotoInfo.BaseInfo baseInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (baseInfo.photoId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoId", baseInfo.photoId);
        }
        if (baseInfo.sdkExtraData != null && !baseInfo.sdkExtraData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkExtraData", baseInfo.sdkExtraData);
        }
        if (baseInfo.title != null && !baseInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", baseInfo.title);
        }
        if (baseInfo.shareUrl != null && !baseInfo.shareUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "shareUrl", baseInfo.shareUrl);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "waterMarkPosition", baseInfo.waterMarkPosition);
        if (baseInfo.recoExt != null && !baseInfo.recoExt.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "recoExt", baseInfo.recoExt);
        }
        if (baseInfo.likeCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "likeCount", baseInfo.likeCount);
        }
        if (baseInfo.commentCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "commentCount", baseInfo.commentCount);
        }
        if (baseInfo.viewCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "viewCount", baseInfo.viewCount);
        }
        if (baseInfo.createTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "createTime", baseInfo.createTime);
        }
        if (baseInfo.videoDesc != null && !baseInfo.videoDesc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoDesc", baseInfo.videoDesc);
        }
        if (baseInfo.playTimes != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playTimes", baseInfo.playTimes);
        }
        if (baseInfo.videoUrlCacheTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "videoUrlCacheTime", baseInfo.videoUrlCacheTime);
        }
        if (baseInfo.contentSourceType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "contentSourceType", baseInfo.contentSourceType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(PhotoInfo.BaseInfo baseInfo, JSONObject jSONObject) {
        a2(baseInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(PhotoInfo.BaseInfo baseInfo, JSONObject jSONObject) {
        return b2(baseInfo, jSONObject);
    }
}

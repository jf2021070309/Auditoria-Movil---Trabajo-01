package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.PhotoInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gk implements com.kwad.sdk.core.d<PhotoInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(PhotoInfo photoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        photoInfo.mOriginJString = jSONObject.optString("mOriginJString");
        if (photoInfo.mOriginJString == JSONObject.NULL) {
            photoInfo.mOriginJString = "";
        }
        photoInfo.baseInfo = new PhotoInfo.BaseInfo();
        photoInfo.baseInfo.parseJson(jSONObject.optJSONObject("baseInfo"));
        photoInfo.videoInfo = new PhotoInfo.VideoInfo();
        photoInfo.videoInfo.parseJson(jSONObject.optJSONObject("videoInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(PhotoInfo photoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (photoInfo.mOriginJString != null && !photoInfo.mOriginJString.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mOriginJString", photoInfo.mOriginJString);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "baseInfo", photoInfo.baseInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "videoInfo", photoInfo.videoInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(PhotoInfo photoInfo, JSONObject jSONObject) {
        a2(photoInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(PhotoInfo photoInfo, JSONObject jSONObject) {
        return b2(photoInfo, jSONObject);
    }
}

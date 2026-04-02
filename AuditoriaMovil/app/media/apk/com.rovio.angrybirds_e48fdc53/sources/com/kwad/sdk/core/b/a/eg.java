package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.core.imageloader.ImageLoaderInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eg implements com.kwad.sdk.core.d<ImageLoaderInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ImageLoaderInfo imageLoaderInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        imageLoaderInfo.totalCount = jSONObject.optInt("total_count");
        imageLoaderInfo.failedCount = jSONObject.optInt("failed_count");
        imageLoaderInfo.successCount = jSONObject.optInt("success_count");
        imageLoaderInfo.duration = jSONObject.optDouble("duration");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ImageLoaderInfo imageLoaderInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (imageLoaderInfo.totalCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "total_count", imageLoaderInfo.totalCount);
        }
        if (imageLoaderInfo.failedCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "failed_count", imageLoaderInfo.failedCount);
        }
        if (imageLoaderInfo.successCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "success_count", imageLoaderInfo.successCount);
        }
        if (imageLoaderInfo.duration != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "duration", imageLoaderInfo.duration);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ImageLoaderInfo imageLoaderInfo, JSONObject jSONObject) {
        a2(imageLoaderInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ImageLoaderInfo imageLoaderInfo, JSONObject jSONObject) {
        return b2(imageLoaderInfo, jSONObject);
    }
}

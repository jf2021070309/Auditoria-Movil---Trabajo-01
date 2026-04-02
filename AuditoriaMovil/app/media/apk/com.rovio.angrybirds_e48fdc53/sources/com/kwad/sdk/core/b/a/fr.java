package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.request.model.StatusInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fr implements com.kwad.sdk.core.d<StatusInfo.NativeAdRequestInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(StatusInfo.NativeAdRequestInfo nativeAdRequestInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        nativeAdRequestInfo.nativeAdStyleControl = new StatusInfo.NativeAdStyleControl();
        nativeAdRequestInfo.nativeAdStyleControl.parseJson(jSONObject.optJSONObject("nativeAdStyleControl"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(StatusInfo.NativeAdRequestInfo nativeAdRequestInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "nativeAdStyleControl", nativeAdRequestInfo.nativeAdStyleControl);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(StatusInfo.NativeAdRequestInfo nativeAdRequestInfo, JSONObject jSONObject) {
        a2(nativeAdRequestInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(StatusInfo.NativeAdRequestInfo nativeAdRequestInfo, JSONObject jSONObject) {
        return b2(nativeAdRequestInfo, jSONObject);
    }
}

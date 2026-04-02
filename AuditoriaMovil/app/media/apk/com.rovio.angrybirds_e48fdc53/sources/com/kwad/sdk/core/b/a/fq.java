package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fq implements com.kwad.sdk.core.d<AdInfo.NativeAdInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.NativeAdInfo nativeAdInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        nativeAdInfo.shakeInfo = new AdInfo.NativeAdShakeInfo();
        nativeAdInfo.shakeInfo.parseJson(jSONObject.optJSONObject("shakeInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.NativeAdInfo nativeAdInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "shakeInfo", nativeAdInfo.shakeInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.NativeAdInfo nativeAdInfo, JSONObject jSONObject) {
        a2(nativeAdInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.NativeAdInfo nativeAdInfo, JSONObject jSONObject) {
        return b2(nativeAdInfo, jSONObject);
    }
}

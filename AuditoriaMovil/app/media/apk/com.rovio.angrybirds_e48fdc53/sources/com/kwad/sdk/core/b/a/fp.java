package com.kwad.sdk.core.b.a;

import com.kwad.sdk.internal.api.NativeAdExtraDataImpl;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fp implements com.kwad.sdk.core.d<NativeAdExtraDataImpl> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(NativeAdExtraDataImpl nativeAdExtraDataImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        nativeAdExtraDataImpl.enableShake = jSONObject.optBoolean("enableShake");
        nativeAdExtraDataImpl.showLiveStatus = jSONObject.optInt("showLiveStatus");
        nativeAdExtraDataImpl.showLiveStyle = jSONObject.optInt("showLiveStyle");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(NativeAdExtraDataImpl nativeAdExtraDataImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (nativeAdExtraDataImpl.enableShake) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enableShake", nativeAdExtraDataImpl.enableShake);
        }
        if (nativeAdExtraDataImpl.showLiveStatus != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLiveStatus", nativeAdExtraDataImpl.showLiveStatus);
        }
        if (nativeAdExtraDataImpl.showLiveStyle != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLiveStyle", nativeAdExtraDataImpl.showLiveStyle);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(NativeAdExtraDataImpl nativeAdExtraDataImpl, JSONObject jSONObject) {
        a2(nativeAdExtraDataImpl, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(NativeAdExtraDataImpl nativeAdExtraDataImpl, JSONObject jSONObject) {
        return b2(nativeAdExtraDataImpl, jSONObject);
    }
}

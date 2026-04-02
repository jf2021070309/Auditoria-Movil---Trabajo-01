package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dw implements com.kwad.sdk.core.d<AdInfo.H5Config> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.H5Config h5Config, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        h5Config.apiMisTouch = jSONObject.optInt("apiMisTouch");
        h5Config.apiAdTag = jSONObject.optInt("apiAdTag");
        h5Config.apiBreathLamp = jSONObject.optInt("apiBreathLamp");
        h5Config.tagTip = jSONObject.optString("tagTip");
        if (h5Config.tagTip == JSONObject.NULL) {
            h5Config.tagTip = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.H5Config h5Config, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (h5Config.apiMisTouch != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apiMisTouch", h5Config.apiMisTouch);
        }
        if (h5Config.apiAdTag != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apiAdTag", h5Config.apiAdTag);
        }
        if (h5Config.apiBreathLamp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apiBreathLamp", h5Config.apiBreathLamp);
        }
        if (h5Config.tagTip != null && !h5Config.tagTip.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tagTip", h5Config.tagTip);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.H5Config h5Config, JSONObject jSONObject) {
        a2(h5Config, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.H5Config h5Config, JSONObject jSONObject) {
        return b2(h5Config, jSONObject);
    }
}

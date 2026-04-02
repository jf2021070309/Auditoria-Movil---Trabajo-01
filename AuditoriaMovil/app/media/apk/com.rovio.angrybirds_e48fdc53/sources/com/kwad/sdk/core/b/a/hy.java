package com.kwad.sdk.core.b.a;

import com.kwad.sdk.internal.api.SplashExtraDataImpl;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hy implements com.kwad.sdk.core.d<SplashExtraDataImpl> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SplashExtraDataImpl splashExtraDataImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashExtraDataImpl.disableShake = jSONObject.optBoolean("disableShake");
        splashExtraDataImpl.disableRotate = jSONObject.optBoolean("disableRotate");
        splashExtraDataImpl.disableSlide = jSONObject.optBoolean("disableSlide");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SplashExtraDataImpl splashExtraDataImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashExtraDataImpl.disableShake) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableShake", splashExtraDataImpl.disableShake);
        }
        if (splashExtraDataImpl.disableRotate) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableRotate", splashExtraDataImpl.disableRotate);
        }
        if (splashExtraDataImpl.disableSlide) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableSlide", splashExtraDataImpl.disableSlide);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SplashExtraDataImpl splashExtraDataImpl, JSONObject jSONObject) {
        a2(splashExtraDataImpl, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SplashExtraDataImpl splashExtraDataImpl, JSONObject jSONObject) {
        return b2(splashExtraDataImpl, jSONObject);
    }
}

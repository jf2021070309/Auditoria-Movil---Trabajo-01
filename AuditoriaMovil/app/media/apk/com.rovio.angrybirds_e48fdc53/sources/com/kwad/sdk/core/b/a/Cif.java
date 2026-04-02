package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.request.model.StatusInfo;
import org.json.JSONObject;
/* renamed from: com.kwad.sdk.core.b.a.if  reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements com.kwad.sdk.core.d<StatusInfo.SplashStyleControl> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(StatusInfo.SplashStyleControl splashStyleControl, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashStyleControl.disableShake = jSONObject.optBoolean("disableShake");
        splashStyleControl.disableRotate = jSONObject.optBoolean("disableRotate");
        splashStyleControl.disableSlide = jSONObject.optBoolean("disableSlide");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(StatusInfo.SplashStyleControl splashStyleControl, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashStyleControl.disableShake) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableShake", splashStyleControl.disableShake);
        }
        if (splashStyleControl.disableRotate) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableRotate", splashStyleControl.disableRotate);
        }
        if (splashStyleControl.disableSlide) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableSlide", splashStyleControl.disableSlide);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(StatusInfo.SplashStyleControl splashStyleControl, JSONObject jSONObject) {
        a2(splashStyleControl, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(StatusInfo.SplashStyleControl splashStyleControl, JSONObject jSONObject) {
        return b2(splashStyleControl, jSONObject);
    }
}

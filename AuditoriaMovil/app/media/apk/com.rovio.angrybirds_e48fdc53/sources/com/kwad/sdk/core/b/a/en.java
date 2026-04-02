package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class en implements com.kwad.sdk.core.d<AdMatrixInfo.InstalledActivateInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.InstalledActivateInfo installedActivateInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        installedActivateInfo.cardSwitch = jSONObject.optBoolean("cardSwitch");
        installedActivateInfo.showTime = jSONObject.optLong("showTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.InstalledActivateInfo installedActivateInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (installedActivateInfo.cardSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardSwitch", installedActivateInfo.cardSwitch);
        }
        if (installedActivateInfo.showTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showTime", installedActivateInfo.showTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.InstalledActivateInfo installedActivateInfo, JSONObject jSONObject) {
        a2(installedActivateInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.InstalledActivateInfo installedActivateInfo, JSONObject jSONObject) {
        return b2(installedActivateInfo, jSONObject);
    }
}

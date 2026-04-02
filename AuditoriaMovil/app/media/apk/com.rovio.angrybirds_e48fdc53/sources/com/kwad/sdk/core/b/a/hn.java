package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hn implements com.kwad.sdk.core.d<AdMatrixInfo.ShakeInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.ShakeInfo shakeInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        shakeInfo.title = jSONObject.optString("title");
        if (shakeInfo.title == JSONObject.NULL) {
            shakeInfo.title = "";
        }
        shakeInfo.subtitle = jSONObject.optString(MessengerShareContentUtility.SUBTITLE);
        if (shakeInfo.subtitle == JSONObject.NULL) {
            shakeInfo.subtitle = "";
        }
        shakeInfo.acceleration = jSONObject.optInt("acceleration");
        shakeInfo.clickDisabled = jSONObject.optBoolean("clickDisabled");
        shakeInfo.componentIndex = jSONObject.optInt("componentIndex");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.ShakeInfo shakeInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (shakeInfo.title != null && !shakeInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", shakeInfo.title);
        }
        if (shakeInfo.subtitle != null && !shakeInfo.subtitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.SUBTITLE, shakeInfo.subtitle);
        }
        if (shakeInfo.acceleration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "acceleration", shakeInfo.acceleration);
        }
        if (shakeInfo.clickDisabled) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickDisabled", shakeInfo.clickDisabled);
        }
        if (shakeInfo.componentIndex != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "componentIndex", shakeInfo.componentIndex);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.ShakeInfo shakeInfo, JSONObject jSONObject) {
        a2(shakeInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.ShakeInfo shakeInfo, JSONObject jSONObject) {
        return b2(shakeInfo, jSONObject);
    }
}

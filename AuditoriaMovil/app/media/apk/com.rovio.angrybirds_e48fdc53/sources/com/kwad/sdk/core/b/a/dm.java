package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dm implements com.kwad.sdk.core.d<AdMatrixInfo.FullScreenInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.FullScreenInfo fullScreenInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fullScreenInfo.interactionInfo = new AdMatrixInfo.AdInteractionInfo();
        fullScreenInfo.interactionInfo.parseJson(jSONObject.optJSONObject("interactionInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.FullScreenInfo fullScreenInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "interactionInfo", fullScreenInfo.interactionInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.FullScreenInfo fullScreenInfo, JSONObject jSONObject) {
        a2(fullScreenInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.FullScreenInfo fullScreenInfo, JSONObject jSONObject) {
        return b2(fullScreenInfo, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.y;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gp implements com.kwad.sdk.core.d<y.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(y.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.playableExtraData = jSONObject.optString("playableExtraData");
        if (aVar.playableExtraData == JSONObject.NULL) {
            aVar.playableExtraData = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(y.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.playableExtraData != null && !aVar.playableExtraData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playableExtraData", aVar.playableExtraData);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(y.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(y.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

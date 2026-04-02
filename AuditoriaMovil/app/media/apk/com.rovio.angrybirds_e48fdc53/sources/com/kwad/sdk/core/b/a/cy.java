package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.reward.c.e;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cy implements com.kwad.sdk.core.d<e.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(e.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.rB = jSONObject.optString("dialogEvent");
        if (aVar.rB == JSONObject.NULL) {
            aVar.rB = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(e.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.rB != null && !aVar.rB.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "dialogEvent", aVar.rB);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(e.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(e.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

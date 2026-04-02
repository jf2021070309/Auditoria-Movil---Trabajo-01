package com.kwad.sdk.core.b.a;

import com.kwad.sdk.ranger.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.d<d.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(d.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aGT = jSONObject.optString("originalActStr");
        if (aVar.aGT == JSONObject.NULL) {
            aVar.aGT = "";
        }
        aVar.aGU = jSONObject.optString("targetField");
        if (aVar.aGU == JSONObject.NULL) {
            aVar.aGU = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(d.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.aGT != null && !aVar.aGT.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "originalActStr", aVar.aGT);
        }
        if (aVar.aGU != null && !aVar.aGU.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "targetField", aVar.aGU);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(d.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(d.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

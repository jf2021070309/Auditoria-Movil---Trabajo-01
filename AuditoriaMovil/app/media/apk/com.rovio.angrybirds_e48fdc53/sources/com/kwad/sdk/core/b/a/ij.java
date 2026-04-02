package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ij implements com.kwad.sdk.core.d<com.kwad.sdk.ranger.b.a.c> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.ranger.b.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.name = jSONObject.optString("name");
        if (cVar.name == JSONObject.NULL) {
            cVar.name = "";
        }
        cVar.aHA = jSONObject.optString("detect_info");
        if (cVar.aHA == JSONObject.NULL) {
            cVar.aHA = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.ranger.b.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cVar.name != null && !cVar.name.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "name", cVar.name);
        }
        if (cVar.aHA != null && !cVar.aHA.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "detect_info", cVar.aHA);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.ranger.b.a.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.ranger.b.a.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }
}

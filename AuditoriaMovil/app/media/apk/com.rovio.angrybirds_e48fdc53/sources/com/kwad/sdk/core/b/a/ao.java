package com.kwad.sdk.core.b.a;

import com.kwad.sdk.ranger.a.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ao implements com.kwad.sdk.core.d<com.kwad.sdk.ranger.a.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.ranger.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aHj = jSONObject.optString("nodeClassName");
        if (aVar.aHj == JSONObject.NULL) {
            aVar.aHj = "";
        }
        aVar.aHk = jSONObject.optString("childFieldName");
        if (aVar.aHk == JSONObject.NULL) {
            aVar.aHk = "";
        }
        aVar.aHl = jSONObject.optBoolean("childFieldIsStatic");
        aVar.aHm = jSONObject.optString("reportKey");
        if (aVar.aHm == JSONObject.NULL) {
            aVar.aHm = "";
        }
        aVar.aHn = new a.b();
        aVar.aHn.parseJson(jSONObject.optJSONObject("childMethod"));
        aVar.aHo = new com.kwad.sdk.ranger.a.a();
        aVar.aHo.parseJson(jSONObject.optJSONObject("deepNode"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.ranger.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.aHj != null && !aVar.aHj.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "nodeClassName", aVar.aHj);
        }
        if (aVar.aHk != null && !aVar.aHk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "childFieldName", aVar.aHk);
        }
        if (aVar.aHl) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "childFieldIsStatic", aVar.aHl);
        }
        if (aVar.aHm != null && !aVar.aHm.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reportKey", aVar.aHm);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "childMethod", aVar.aHn);
        com.kwad.sdk.utils.t.a(jSONObject, "deepNode", aVar.aHo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.ranger.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.ranger.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

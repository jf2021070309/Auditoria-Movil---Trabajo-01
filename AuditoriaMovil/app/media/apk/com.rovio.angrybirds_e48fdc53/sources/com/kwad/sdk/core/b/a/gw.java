package com.kwad.sdk.core.b.a;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gw implements com.kwad.sdk.core.d<com.kwad.sdk.ranger.b.a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.ranger.b.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.avx = jSONObject.optInt("func_ratio_count");
        bVar.aHz = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("func_values");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.kwad.sdk.ranger.b.a.a aVar = new com.kwad.sdk.ranger.b.a.a();
                aVar.parseJson(optJSONArray.optJSONObject(i));
                bVar.aHz.add(aVar);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.ranger.b.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.avx != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "func_ratio_count", bVar.avx);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "func_values", bVar.aHz);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.ranger.b.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.ranger.b.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

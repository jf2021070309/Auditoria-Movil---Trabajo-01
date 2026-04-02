package com.kwad.sdk.core.b.a;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gc implements com.kwad.sdk.core.d<com.kwad.sdk.h.a.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.h.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.sceneId = jSONObject.optString("sceneId");
        if (aVar.sceneId == JSONObject.NULL) {
            aVar.sceneId = "";
        }
        aVar.aCi = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("packages");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.kwad.sdk.h.a.b bVar = new com.kwad.sdk.h.a.b();
                bVar.parseJson(optJSONArray.optJSONObject(i));
                aVar.aCi.add(bVar);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.h.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.sceneId != null && !aVar.sceneId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sceneId", aVar.sceneId);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "packages", aVar.aCi);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.h.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.h.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

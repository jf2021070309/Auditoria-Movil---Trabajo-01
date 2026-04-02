package com.kwad.sdk.core.b.a;

import com.kwad.sdk.ranger.a.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iq implements com.kwad.sdk.core.d<a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.name = jSONObject.optString("name");
        if (bVar.name == JSONObject.NULL) {
            bVar.name = "";
        }
        bVar.aHw = jSONObject.optBoolean("isStatic");
        bVar.aHx = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("paramList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                a.C0271a c0271a = new a.C0271a();
                c0271a.parseJson(optJSONArray.optJSONObject(i));
                bVar.aHx.add(c0271a);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.name != null && !bVar.name.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "name", bVar.name);
        }
        if (bVar.aHw) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isStatic", bVar.aHw);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "paramList", bVar.aHx);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

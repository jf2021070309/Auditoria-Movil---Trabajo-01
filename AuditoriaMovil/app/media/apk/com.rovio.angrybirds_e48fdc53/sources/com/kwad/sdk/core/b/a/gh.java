package com.kwad.sdk.core.b.a;

import com.kwad.sdk.ranger.a.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gh implements com.kwad.sdk.core.d<a.C0271a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0271a c0271a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0271a.aHp = jSONObject.optString("typeStr");
        if (c0271a.aHp == JSONObject.NULL) {
            c0271a.aHp = "";
        }
        c0271a.aHq = jSONObject.optString("valueStr");
        if (c0271a.aHq == JSONObject.NULL) {
            c0271a.aHq = "";
        }
        c0271a.aHr = jSONObject.optString("listValueType");
        if (c0271a.aHr == JSONObject.NULL) {
            c0271a.aHr = "";
        }
        c0271a.aHs = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("valueStrList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                c0271a.aHs.add((String) optJSONArray.opt(i));
            }
        }
        c0271a.fieldName = jSONObject.optString("fieldName");
        if (c0271a.fieldName == JSONObject.NULL) {
            c0271a.fieldName = "";
        }
        c0271a.className = jSONObject.optString("className");
        if (c0271a.className == JSONObject.NULL) {
            c0271a.className = "";
        }
        c0271a.aHt = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("childParamList");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                a.C0271a c0271a2 = new a.C0271a();
                c0271a2.parseJson(optJSONArray2.optJSONObject(i2));
                c0271a.aHt.add(c0271a2);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0271a c0271a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0271a.aHp != null && !c0271a.aHp.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "typeStr", c0271a.aHp);
        }
        if (c0271a.aHq != null && !c0271a.aHq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "valueStr", c0271a.aHq);
        }
        if (c0271a.aHr != null && !c0271a.aHr.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "listValueType", c0271a.aHr);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "valueStrList", c0271a.aHs);
        if (c0271a.fieldName != null && !c0271a.fieldName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fieldName", c0271a.fieldName);
        }
        if (c0271a.className != null && !c0271a.className.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "className", c0271a.className);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "childParamList", c0271a.aHt);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0271a c0271a, JSONObject jSONObject) {
        a2(c0271a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0271a c0271a, JSONObject jSONObject) {
        return b2(c0271a, jSONObject);
    }
}

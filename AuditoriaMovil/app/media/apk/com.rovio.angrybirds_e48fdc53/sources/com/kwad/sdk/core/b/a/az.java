package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.reward.j.m;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class az implements com.kwad.sdk.core.d<m.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(m.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.name = jSONObject.optString("name");
        if (aVar.name == JSONObject.NULL) {
            aVar.name = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(m.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.name != null && !aVar.name.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "name", aVar.name);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(m.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(m.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

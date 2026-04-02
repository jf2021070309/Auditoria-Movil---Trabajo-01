package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p implements com.kwad.sdk.core.d<com.kwad.components.core.k.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.k.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Lk = jSONObject.optInt("currentActiveCount");
        aVar.Ll = jSONObject.optLong("lastForceActiveTimestamp");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.k.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Lk != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentActiveCount", aVar.Lk);
        }
        if (aVar.Ll != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastForceActiveTimestamp", aVar.Ll);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.k.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.k.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

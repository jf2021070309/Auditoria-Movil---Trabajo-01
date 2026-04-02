package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fb implements com.kwad.sdk.core.d<com.kwad.sdk.utils.b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aLK = jSONObject.optInt("put_count");
        aVar.aLL = jSONObject.optInt("get_failed_count");
        aVar.aLM = jSONObject.optInt("get_success_count");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.aLK != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "put_count", aVar.aLK);
        }
        if (aVar.aLL != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "get_failed_count", aVar.aLL);
        }
        if (aVar.aLM != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "get_success_count", aVar.aLM);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

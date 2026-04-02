package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ix implements com.kwad.sdk.core.d<com.kwad.sdk.core.threads.d> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        dVar.avz = jSONObject.optInt("rate_reciprocal");
        dVar.avF = jSONObject.optInt("threshold");
        dVar.interval = jSONObject.optLong(com.umeng.analytics.pro.bg.aU);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dVar.avz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rate_reciprocal", dVar.avz);
        }
        if (dVar.avF != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "threshold", dVar.avF);
        }
        if (dVar.interval != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.umeng.analytics.pro.bg.aU, dVar.interval);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        a2(dVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        return b2(dVar, jSONObject);
    }
}

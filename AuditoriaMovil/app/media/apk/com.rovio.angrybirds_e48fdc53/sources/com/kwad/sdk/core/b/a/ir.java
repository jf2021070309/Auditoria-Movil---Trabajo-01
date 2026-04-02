package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ir implements com.kwad.sdk.core.d<com.kwad.sdk.core.request.model.f> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fVar.adStyle = jSONObject.optInt("adStyle");
        fVar.taskType = jSONObject.optInt("taskType");
        fVar.count = jSONObject.optInt("count");
        fVar.auE = jSONObject.optLong("lastModifiedTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (fVar.adStyle != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", fVar.adStyle);
        }
        if (fVar.taskType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "taskType", fVar.taskType);
        }
        if (fVar.count != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "count", fVar.count);
        }
        if (fVar.auE != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastModifiedTime", fVar.auE);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        a2(fVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        return b2(fVar, jSONObject);
    }
}

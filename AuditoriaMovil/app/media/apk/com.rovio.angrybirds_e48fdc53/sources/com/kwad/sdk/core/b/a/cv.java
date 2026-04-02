package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cv implements com.kwad.sdk.core.d<com.kwad.sdk.core.report.m> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.report.m mVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        mVar.arh = jSONObject.optString("log");
        if (mVar.arh == JSONObject.NULL) {
            mVar.arh = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.report.m mVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (mVar.arh != null && !mVar.arh.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "log", mVar.arh);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.report.m mVar, JSONObject jSONObject) {
        a2(mVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.report.m mVar, JSONObject jSONObject) {
        return b2(mVar, jSONObject);
    }
}

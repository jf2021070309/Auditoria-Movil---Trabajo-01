package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hq implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.r> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.r rVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        rVar.templateId = jSONObject.optString("templateId");
        if (rVar.templateId == JSONObject.NULL) {
            rVar.templateId = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.r rVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rVar.templateId != null && !rVar.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateId", rVar.templateId);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.r rVar, JSONObject jSONObject) {
        a2(rVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.r rVar, JSONObject jSONObject) {
        return b2(rVar, jSONObject);
    }
}

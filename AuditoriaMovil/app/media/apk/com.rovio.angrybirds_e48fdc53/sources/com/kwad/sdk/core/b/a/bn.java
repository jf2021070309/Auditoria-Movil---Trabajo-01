package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bn implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.f> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fVar.Xa = jSONObject.optInt("closeDelaySeconds");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (fVar.Xa != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeDelaySeconds", fVar.Xa);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.f fVar, JSONObject jSONObject) {
        a2(fVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.f fVar, JSONObject jSONObject) {
        return b2(fVar, jSONObject);
    }
}

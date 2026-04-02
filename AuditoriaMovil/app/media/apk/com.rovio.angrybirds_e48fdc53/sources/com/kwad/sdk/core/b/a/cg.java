package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cg implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.h> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.h hVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        hVar.Xb = jSONObject.optInt("hasDeepReward");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.h hVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (hVar.Xb != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "hasDeepReward", hVar.Xb);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.h hVar, JSONObject jSONObject) {
        a2(hVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.h hVar, JSONObject jSONObject) {
        return b2(hVar, jSONObject);
    }
}

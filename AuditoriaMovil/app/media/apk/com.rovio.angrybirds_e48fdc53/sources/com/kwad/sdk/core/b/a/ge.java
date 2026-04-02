package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ge implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.o> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.o oVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        oVar.Xh = jSONObject.optInt("scene");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.o oVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (oVar.Xh != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "scene", oVar.Xh);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.o oVar, JSONObject jSONObject) {
        a2(oVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.o oVar, JSONObject jSONObject) {
        return b2(oVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ic implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.u> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.u uVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        uVar.nQ = jSONObject.optInt("currentTime");
        uVar.Xm = jSONObject.optBoolean("finished");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.u uVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (uVar.nQ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentTime", uVar.nQ);
        }
        if (uVar.Xm) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "finished", uVar.Xm);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.u uVar, JSONObject jSONObject) {
        a2(uVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.u uVar, JSONObject jSONObject) {
        return b2(uVar, jSONObject);
    }
}

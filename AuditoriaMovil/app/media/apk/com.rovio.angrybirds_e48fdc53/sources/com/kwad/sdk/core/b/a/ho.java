package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ho implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.q> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.q qVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        qVar.Xj = jSONObject.optBoolean("userForce");
        qVar.type = jSONObject.optInt("type");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.q qVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (qVar.Xj) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userForce", qVar.Xj);
        }
        if (qVar.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", qVar.type);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.q qVar, JSONObject jSONObject) {
        a2(qVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.q qVar, JSONObject jSONObject) {
        return b2(qVar, jSONObject);
    }
}

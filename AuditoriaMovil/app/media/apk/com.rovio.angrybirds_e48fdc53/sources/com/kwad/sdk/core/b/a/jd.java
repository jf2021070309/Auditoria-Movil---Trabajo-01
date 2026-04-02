package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jd implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.v> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.v vVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        vVar.Xn = jSONObject.optInt("rewardTaskState");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.v vVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (vVar.Xn != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardTaskState", vVar.Xn);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.v vVar, JSONObject jSONObject) {
        a2(vVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.v vVar, JSONObject jSONObject) {
        return b2(vVar, jSONObject);
    }
}

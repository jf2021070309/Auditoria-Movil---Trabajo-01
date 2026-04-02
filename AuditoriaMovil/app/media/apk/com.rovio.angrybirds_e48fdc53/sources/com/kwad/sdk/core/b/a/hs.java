package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hs implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.t> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.t tVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        tVar.Xk = jSONObject.optBoolean("needPromopt");
        tVar.JR = jSONObject.optBoolean("needReport");
        tVar.showTime = jSONObject.optInt("showTime");
        tVar.Xl = jSONObject.optLong("playDuration");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.t tVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (tVar.Xk) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "needPromopt", tVar.Xk);
        }
        if (tVar.JR) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "needReport", tVar.JR);
        }
        if (tVar.showTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showTime", tVar.showTime);
        }
        if (tVar.Xl != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playDuration", tVar.Xl);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.t tVar, JSONObject jSONObject) {
        a2(tVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.t tVar, JSONObject jSONObject) {
        return b2(tVar, jSONObject);
    }
}

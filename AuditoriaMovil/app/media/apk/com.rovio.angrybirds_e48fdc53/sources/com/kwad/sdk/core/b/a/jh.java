package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jh implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.x> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.x xVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        xVar.Xp = jSONObject.optString("status");
        if (xVar.Xp == JSONObject.NULL) {
            xVar.Xp = "";
        }
        xVar.errorCode = jSONObject.optInt("errorCode");
        xVar.errorReason = jSONObject.optString("errorReason");
        if (xVar.errorReason == JSONObject.NULL) {
            xVar.errorReason = "";
        }
        xVar.nQ = jSONObject.optInt("currentTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.x xVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (xVar.Xp != null && !xVar.Xp.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", xVar.Xp);
        }
        if (xVar.errorCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorCode", xVar.errorCode);
        }
        if (xVar.errorReason != null && !xVar.errorReason.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorReason", xVar.errorReason);
        }
        if (xVar.nQ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentTime", xVar.nQ);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.x xVar, JSONObject jSONObject) {
        a2(xVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.x xVar, JSONObject jSONObject) {
        return b2(xVar, jSONObject);
    }
}

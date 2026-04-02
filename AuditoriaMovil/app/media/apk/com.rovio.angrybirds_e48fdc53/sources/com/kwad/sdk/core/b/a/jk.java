package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jk implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.y> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.y yVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        yVar.nQ = jSONObject.optInt("currentTime");
        yVar.Xq = jSONObject.optBoolean("failed");
        yVar.Xm = jSONObject.optBoolean("finished");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.y yVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (yVar.nQ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentTime", yVar.nQ);
        }
        if (yVar.Xq) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "failed", yVar.Xq);
        }
        if (yVar.Xm) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "finished", yVar.Xm);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.y yVar, JSONObject jSONObject) {
        a2(yVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.y yVar, JSONObject jSONObject) {
        return b2(yVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gb implements com.kwad.sdk.core.d<com.kwad.components.core.webview.a.c> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.Tu = jSONObject.optString("originalID");
        if (cVar.Tu == JSONObject.NULL) {
            cVar.Tu = "";
        }
        cVar.Tv = jSONObject.optString("path");
        if (cVar.Tv == JSONObject.NULL) {
            cVar.Tv = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cVar.Tu != null && !cVar.Tu.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "originalID", cVar.Tu);
        }
        if (cVar.Tv != null && !cVar.Tv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "path", cVar.Tv);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }
}

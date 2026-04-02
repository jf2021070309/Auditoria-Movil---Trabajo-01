package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fc implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.l> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.l lVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        lVar.Xf = jSONObject.optString("landingPageUrl");
        if (lVar.Xf == JSONObject.NULL) {
            lVar.Xf = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.l lVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (lVar.Xf != null && !lVar.Xf.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "landingPageUrl", lVar.Xf);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.l lVar, JSONObject jSONObject) {
        a2(lVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.l lVar, JSONObject jSONObject) {
        return b2(lVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ea implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.b.a.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.ayP = jSONObject.optString("Access-Control-Allow-Origin");
        if (aVar.ayP == JSONObject.NULL) {
            aVar.ayP = "";
        }
        aVar.ayQ = jSONObject.optString("Timing-Allow-Origin");
        if (aVar.ayQ == JSONObject.NULL) {
            aVar.ayQ = "";
        }
        aVar.ayR = jSONObject.optString("content-type");
        if (aVar.ayR == JSONObject.NULL) {
            aVar.ayR = "";
        }
        aVar.ayS = jSONObject.optString("Date");
        if (aVar.ayS == JSONObject.NULL) {
            aVar.ayS = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.ayP != null && !aVar.ayP.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Access-Control-Allow-Origin", aVar.ayP);
        }
        if (aVar.ayQ != null && !aVar.ayQ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Timing-Allow-Origin", aVar.ayQ);
        }
        if (aVar.ayR != null && !aVar.ayR.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "content-type", aVar.ayR);
        }
        if (aVar.ayS != null && !aVar.ayS.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Date", aVar.ayS);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

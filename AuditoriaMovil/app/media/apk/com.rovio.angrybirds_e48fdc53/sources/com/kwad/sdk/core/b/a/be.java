package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class be implements com.kwad.sdk.core.d<com.kwad.sdk.crash.online.monitor.block.c> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.online.monitor.block.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.aAT = jSONObject.optString("printerName");
        if (cVar.aAT == JSONObject.NULL) {
            cVar.aAT = "";
        }
        cVar.errorMsg = jSONObject.optString("errorMsg");
        if (cVar.errorMsg == JSONObject.NULL) {
            cVar.errorMsg = "";
        }
        cVar.aAU = jSONObject.optBoolean("isDisable");
        cVar.aAV = jSONObject.optBoolean("hasMatrix");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.online.monitor.block.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cVar.aAT != null && !cVar.aAT.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "printerName", cVar.aAT);
        }
        if (cVar.errorMsg != null && !cVar.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorMsg", cVar.errorMsg);
        }
        if (cVar.aAU) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isDisable", cVar.aAU);
        }
        if (cVar.aAV) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "hasMatrix", cVar.aAV);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.online.monitor.block.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.online.monitor.block.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }
}

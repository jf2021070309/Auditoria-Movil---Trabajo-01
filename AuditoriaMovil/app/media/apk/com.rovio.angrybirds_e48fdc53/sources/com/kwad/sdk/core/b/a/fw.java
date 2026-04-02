package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fw implements com.kwad.sdk.core.d<com.kwad.sdk.core.network.j> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.network.j jVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        jVar.url = jSONObject.optString("url");
        if (jVar.url == JSONObject.NULL) {
            jVar.url = "";
        }
        jVar.host = jSONObject.optString("host");
        if (jVar.host == JSONObject.NULL) {
            jVar.host = "";
        }
        jVar.httpCode = jSONObject.optInt("http_code");
        jVar.errorMsg = jSONObject.optString("error_msg");
        if (jVar.errorMsg == JSONObject.NULL) {
            jVar.errorMsg = "";
        }
        jVar.apn = jSONObject.optString("req_type");
        if (jVar.apn == JSONObject.NULL) {
            jVar.apn = "";
        }
        jVar.apo = jSONObject.optInt("use_ip");
        jVar.app = jSONObject.optString("ok_http_version");
        if (jVar.app == JSONObject.NULL) {
            jVar.app = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.network.j jVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jVar.url != null && !jVar.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", jVar.url);
        }
        if (jVar.host != null && !jVar.host.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "host", jVar.host);
        }
        if (jVar.httpCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "http_code", jVar.httpCode);
        }
        if (jVar.errorMsg != null && !jVar.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_msg", jVar.errorMsg);
        }
        if (jVar.apn != null && !jVar.apn.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "req_type", jVar.apn);
        }
        if (jVar.apo != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "use_ip", jVar.apo);
        }
        if (jVar.app != null && !jVar.app.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ok_http_version", jVar.app);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.network.j jVar, JSONObject jSONObject) {
        a2(jVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.network.j jVar, JSONObject jSONObject) {
        return b2(jVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class da implements com.kwad.sdk.core.d<com.kwad.sdk.crash.online.monitor.a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.appId = jSONObject.optString("appId");
        if (bVar.appId == JSONObject.NULL) {
            bVar.appId = "";
        }
        bVar.aBk = jSONObject.optString("pluginListenerName");
        if (bVar.aBk == JSONObject.NULL) {
            bVar.aBk = "";
        }
        bVar.aBl = jSONObject.optString("reportMethodName");
        if (bVar.aBl == JSONObject.NULL) {
            bVar.aBl = "";
        }
        bVar.aBm = jSONObject.optString("otherProxyClassName");
        if (bVar.aBm == JSONObject.NULL) {
            bVar.aBm = "";
        }
        bVar.aBn = jSONObject.optString("otherFieldName");
        if (bVar.aBn == JSONObject.NULL) {
            bVar.aBn = "";
        }
        bVar.aBo = jSONObject.optString("otherLevelFieldName");
        if (bVar.aBo == JSONObject.NULL) {
            bVar.aBo = "";
        }
        bVar.aBp = jSONObject.optString("blockTag");
        if (bVar.aBp == JSONObject.NULL) {
            bVar.aBp = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.appId != null && !bVar.appId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", bVar.appId);
        }
        if (bVar.aBk != null && !bVar.aBk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pluginListenerName", bVar.aBk);
        }
        if (bVar.aBl != null && !bVar.aBl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reportMethodName", bVar.aBl);
        }
        if (bVar.aBm != null && !bVar.aBm.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherProxyClassName", bVar.aBm);
        }
        if (bVar.aBn != null && !bVar.aBn.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherFieldName", bVar.aBn);
        }
        if (bVar.aBo != null && !bVar.aBo.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherLevelFieldName", bVar.aBo);
        }
        if (bVar.aBp != null && !bVar.aBp.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockTag", bVar.aBp);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

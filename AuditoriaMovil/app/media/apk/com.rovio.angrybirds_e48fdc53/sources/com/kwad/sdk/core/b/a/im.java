package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.m;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class im implements com.kwad.sdk.core.d<m.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(m.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.key = jSONObject.optString("key");
        if (aVar.key == JSONObject.NULL) {
            aVar.key = "";
        }
        aVar.value = jSONObject.optString("value");
        if (aVar.value == JSONObject.NULL) {
            aVar.value = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(m.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.key != null && !aVar.key.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "key", aVar.key);
        }
        if (aVar.value != null && !aVar.value.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "value", aVar.value);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(m.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(m.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

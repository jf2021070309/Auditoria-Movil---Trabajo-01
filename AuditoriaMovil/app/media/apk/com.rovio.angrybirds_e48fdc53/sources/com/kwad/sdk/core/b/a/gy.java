package com.kwad.sdk.core.b.a;

import com.facebook.internal.NativeProtocol;
import com.kwad.sdk.core.webview.d.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gy implements com.kwad.sdk.core.d<b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.url = jSONObject.optString("url");
        if (aVar.url == JSONObject.NULL) {
            aVar.url = "";
        }
        aVar.method = jSONObject.optString("method");
        if (aVar.method == JSONObject.NULL) {
            aVar.method = "";
        }
        aVar.params = jSONObject.optString(NativeProtocol.WEB_DIALOG_PARAMS);
        if (aVar.params == JSONObject.NULL) {
            aVar.params = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.url != null && !aVar.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", aVar.url);
        }
        if (aVar.method != null && !aVar.method.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "method", aVar.method);
        }
        if (aVar.params != null && !aVar.params.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS, aVar.params);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

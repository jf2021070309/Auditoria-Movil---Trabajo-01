package com.kwad.sdk.core.b.a;

import com.facebook.internal.NativeProtocol;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fz implements com.kwad.sdk.core.d<com.kwad.components.core.webview.a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.url = jSONObject.optString("url");
        if (bVar.url == JSONObject.NULL) {
            bVar.url = "";
        }
        bVar.title = jSONObject.optString("title");
        if (bVar.title == JSONObject.NULL) {
            bVar.title = "";
        }
        bVar.params = jSONObject.optString(NativeProtocol.WEB_DIALOG_PARAMS);
        if (bVar.params == JSONObject.NULL) {
            bVar.params = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.url != null && !bVar.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", bVar.url);
        }
        if (bVar.title != null && !bVar.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", bVar.title);
        }
        if (bVar.params != null && !bVar.params.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS, bVar.params);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

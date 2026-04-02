package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ew implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.j> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.j jVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        jVar.data = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
        if (jVar.data == JSONObject.NULL) {
            jVar.data = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.j jVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jVar.data != null && !jVar.data.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.WEB_DIALOG_PARAM_DATA, jVar.data);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.j jVar, JSONObject jSONObject) {
        a2(jVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.j jVar, JSONObject jSONObject) {
        return b2(jVar, jSONObject);
    }
}

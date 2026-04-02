package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hr implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.s> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.s sVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        sVar.message = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (sVar.message == JSONObject.NULL) {
            sVar.message = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.s sVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (sVar.message != null && !sVar.message.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, sVar.message);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.s sVar, JSONObject jSONObject) {
        a2(sVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.s sVar, JSONObject jSONObject) {
        return b2(sVar, jSONObject);
    }
}

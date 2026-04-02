package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bq implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.g> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.g gVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        gVar.US = jSONObject.optString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
        if (gVar.US == JSONObject.NULL) {
            gVar.US = "";
        }
        gVar.UR = jSONObject.optInt("actionType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.g gVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (gVar.US != null && !gVar.US.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, gVar.US);
        }
        if (gVar.UR != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "actionType", gVar.UR);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.g gVar, JSONObject jSONObject) {
        a2(gVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.g gVar, JSONObject jSONObject) {
        return b2(gVar, jSONObject);
    }
}

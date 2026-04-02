package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fg implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.d.b.c> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.azm = jSONObject.optInt("convertType");
        cVar.US = jSONObject.optString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
        if (cVar.US == JSONObject.NULL) {
            cVar.US = "";
        }
        cVar.azn = new com.kwad.sdk.core.webview.d.b.b();
        cVar.azn.parseJson(jSONObject.optJSONObject("clickInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cVar.azm != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "convertType", cVar.azm);
        }
        if (cVar.US != null && !cVar.US.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, cVar.US);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "clickInfo", cVar.azn);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }
}

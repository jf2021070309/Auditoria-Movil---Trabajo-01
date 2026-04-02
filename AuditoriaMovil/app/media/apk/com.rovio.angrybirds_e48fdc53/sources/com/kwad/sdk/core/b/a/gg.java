package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.ak;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gg implements com.kwad.sdk.core.d<ak.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ak.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.status = jSONObject.optInt("status");
        aVar.errorMsg = jSONObject.optString("errorMsg");
        if (aVar.errorMsg == JSONObject.NULL) {
            aVar.errorMsg = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ak.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", aVar.status);
        }
        if (aVar.errorMsg != null && !aVar.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorMsg", aVar.errorMsg);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ak.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ak.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.ah;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eu implements com.kwad.sdk.core.d<ah.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ah.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Vb = jSONObject.optString("adTemplate");
        if (aVar.Vb == JSONObject.NULL) {
            aVar.Vb = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ah.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Vb != null && !aVar.Vb.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adTemplate", aVar.Vb);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ah.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ah.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

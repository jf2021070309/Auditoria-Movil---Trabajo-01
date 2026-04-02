package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.af;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cc implements com.kwad.sdk.core.d<af.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(af.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Va = jSONObject.optBoolean("clickActionButton");
        aVar.Vb = jSONObject.optString("adTemplate");
        if (aVar.Vb == JSONObject.NULL) {
            aVar.Vb = "";
        }
        aVar.Vc = jSONObject.optInt("area");
        aVar.Vd = new com.kwad.sdk.core.webview.d.b.c();
        aVar.Vd.parseJson(jSONObject.optJSONObject("logParam"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(af.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Va) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickActionButton", aVar.Va);
        }
        if (aVar.Vb != null && !aVar.Vb.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adTemplate", aVar.Vb);
        }
        if (aVar.Vc != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "area", aVar.Vc);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "logParam", aVar.Vd);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(af.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(af.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

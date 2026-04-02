package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.f;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ds implements com.kwad.sdk.core.d<f.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(f.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Tz = jSONObject.optString("target");
        if (aVar.Tz == JSONObject.NULL) {
            aVar.Tz = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(f.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Tz != null && !aVar.Tz.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "target", aVar.Tz);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(f.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(f.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

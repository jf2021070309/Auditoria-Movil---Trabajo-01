package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.al;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ap implements com.kwad.sdk.core.d<al.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(al.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.id = jSONObject.optInt("id");
        aVar.status = jSONObject.optInt("status");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(al.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.id != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "id", aVar.id);
        }
        if (aVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", aVar.status);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(al.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(al.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

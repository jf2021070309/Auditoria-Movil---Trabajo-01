package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.av;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dz implements com.kwad.sdk.core.d<av.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(av.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.visibility = jSONObject.optInt("visibility");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(av.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.visibility != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "visibility", aVar.visibility);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(av.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(av.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

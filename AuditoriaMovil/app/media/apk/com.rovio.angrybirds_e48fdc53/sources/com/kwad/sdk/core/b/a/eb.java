package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.ac;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eb implements com.kwad.sdk.core.d<ac.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ac.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.type = jSONObject.optInt("type");
        aVar.UM = jSONObject.optInt("playDuration");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ac.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", aVar.type);
        }
        if (aVar.UM != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playDuration", aVar.UM);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ac.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ac.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

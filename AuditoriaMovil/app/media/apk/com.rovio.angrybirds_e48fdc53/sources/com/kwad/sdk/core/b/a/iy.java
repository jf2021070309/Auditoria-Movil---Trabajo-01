package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.g.a.a.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iy implements com.kwad.sdk.core.d<b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.nN = jSONObject.optInt("timerName");
        aVar.nO = jSONObject.optInt("time");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.nN != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "timerName", aVar.nN);
        }
        if (aVar.nO != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "time", aVar.nO);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

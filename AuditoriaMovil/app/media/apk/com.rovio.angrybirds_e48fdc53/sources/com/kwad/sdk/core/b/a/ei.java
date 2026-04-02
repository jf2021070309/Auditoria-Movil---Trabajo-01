package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.config.item.j;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ei implements com.kwad.sdk.core.d<j.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(j.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.amL = jSONObject.optInt("horizontalShowDuration", new Integer("180000").intValue());
        aVar.amM = jSONObject.optInt("verticalShowDuration", new Integer("90000").intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(j.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "horizontalShowDuration", aVar.amL);
        com.kwad.sdk.utils.t.putValue(jSONObject, "verticalShowDuration", aVar.amM);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(j.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(j.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

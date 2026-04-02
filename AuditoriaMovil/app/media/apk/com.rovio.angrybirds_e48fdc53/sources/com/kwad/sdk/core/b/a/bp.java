package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.reward.j.f;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bp implements com.kwad.sdk.core.d<f.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(f.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.xC = jSONObject.optBoolean("forceClose");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(f.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.xC) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "forceClose", aVar.xC);
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

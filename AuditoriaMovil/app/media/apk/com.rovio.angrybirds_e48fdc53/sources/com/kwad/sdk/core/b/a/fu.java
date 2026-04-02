package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.reward.j.n;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fu implements com.kwad.sdk.core.d<n.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(n.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.status = jSONObject.optInt("status");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(n.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", aVar.status);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(n.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(n.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

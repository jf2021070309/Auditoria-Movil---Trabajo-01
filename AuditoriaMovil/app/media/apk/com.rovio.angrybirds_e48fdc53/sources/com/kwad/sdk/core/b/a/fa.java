package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fa implements com.kwad.sdk.core.d<com.kwad.components.ad.reward.c.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.ad.reward.c.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.rz = jSONObject.optInt("extraRewardType", new Integer("2").intValue());
        bVar.rA = jSONObject.optInt("extraRewardStatus");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.ad.reward.c.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "extraRewardType", bVar.rz);
        if (bVar.rA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "extraRewardStatus", bVar.rA);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.ad.reward.c.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.ad.reward.c.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

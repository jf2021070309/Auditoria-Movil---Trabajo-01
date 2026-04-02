package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class er implements com.kwad.sdk.core.d<com.kwad.components.ad.interstitial.b.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.ad.interstitial.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.gd = jSONObject.optLong("lastShowTimestamp");
        bVar.iX = jSONObject.optInt("currentDailyAdShowCount");
        bVar.iY = jSONObject.optInt("currentDailyRetainShowCount");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.ad.interstitial.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.gd != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastShowTimestamp", bVar.gd);
        }
        if (bVar.iX != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentDailyAdShowCount", bVar.iX);
        }
        if (bVar.iY != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentDailyRetainShowCount", bVar.iY);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.ad.interstitial.b.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.ad.interstitial.b.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

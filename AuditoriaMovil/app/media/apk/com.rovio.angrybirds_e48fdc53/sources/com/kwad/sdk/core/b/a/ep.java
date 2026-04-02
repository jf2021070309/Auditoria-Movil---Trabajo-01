package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ep implements com.kwad.sdk.core.d<com.kwad.components.ad.interstitial.c.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.ad.interstitial.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.iZ = jSONObject.optLong("lastShowCardTimeStamp");
        aVar.ja = jSONObject.optInt("cardShowCount");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.ad.interstitial.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.iZ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastShowCardTimeStamp", aVar.iZ);
        }
        if (aVar.ja != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardShowCount", aVar.ja);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.ad.interstitial.c.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.ad.interstitial.c.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

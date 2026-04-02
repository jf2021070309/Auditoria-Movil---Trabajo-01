package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ff implements com.kwad.sdk.core.d<com.kwad.components.ad.fullscreen.b.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.ad.fullscreen.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.gd = jSONObject.optLong("lastShowTimestamp");
        bVar.ge = jSONObject.optInt("currentDailyCount");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.ad.fullscreen.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.gd != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastShowTimestamp", bVar.gd);
        }
        if (bVar.ge != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentDailyCount", bVar.ge);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.ad.fullscreen.b.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.ad.fullscreen.b.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}

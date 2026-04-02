package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gs implements com.kwad.sdk.core.d<com.kwad.sdk.core.response.model.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.posId = jSONObject.optLong("posId");
        aVar.auI = jSONObject.optInt("adPhotoCountForMedia");
        aVar.auJ = jSONObject.optBoolean("enablePreload");
        aVar.auK = jSONObject.optLong("increaseAdLoadTime", new Long("10000").longValue());
        aVar.auL = jSONObject.optInt("adLoadStrategy");
        aVar.auM = jSONObject.optInt("drawAdForcedWatchTimes", new Integer("3").intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", aVar.posId);
        }
        if (aVar.auI != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adPhotoCountForMedia", aVar.auI);
        }
        if (aVar.auJ) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enablePreload", aVar.auJ);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "increaseAdLoadTime", aVar.auK);
        if (aVar.auL != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adLoadStrategy", aVar.auL);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "drawAdForcedWatchTimes", aVar.auM);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.config.item.h;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ef implements com.kwad.sdk.core.d<h.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(h.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.amJ = jSONObject.optString("imei");
        if (aVar.amJ == JSONObject.NULL) {
            aVar.amJ = "";
        }
        aVar.amK = jSONObject.optString("oaid");
        if (aVar.amK == JSONObject.NULL) {
            aVar.amK = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(h.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.amJ != null && !aVar.amJ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei", aVar.amJ);
        }
        if (aVar.amK != null && !aVar.amK.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "oaid", aVar.amK);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(h.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(h.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.report.z;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bj implements com.kwad.sdk.core.d<z.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(z.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.templateId = jSONObject.optString("template_id");
        if (aVar.templateId == JSONObject.NULL) {
            aVar.templateId = "";
        }
        aVar.asR = jSONObject.optString("template_show_type");
        if (aVar.asR == JSONObject.NULL) {
            aVar.asR = "";
        }
        aVar.asS = jSONObject.optInt("award_task_name");
        aVar.asT = jSONObject.optInt("jumps_liveroom_type");
        aVar.asU = jSONObject.optInt("universe_feature_freg");
        aVar.asW = jSONObject.optInt("is_special_preload");
        aVar.asX = jSONObject.optInt("card_type");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(z.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.templateId != null && !aVar.templateId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_id", aVar.templateId);
        }
        if (aVar.asR != null && !aVar.asR.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_show_type", aVar.asR);
        }
        if (aVar.asS != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "award_task_name", aVar.asS);
        }
        if (aVar.asT != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jumps_liveroom_type", aVar.asT);
        }
        if (aVar.asU != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "universe_feature_freg", aVar.asU);
        }
        if (aVar.asW != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_special_preload", aVar.asW);
        }
        if (aVar.asX != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "card_type", aVar.asX);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(z.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(z.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

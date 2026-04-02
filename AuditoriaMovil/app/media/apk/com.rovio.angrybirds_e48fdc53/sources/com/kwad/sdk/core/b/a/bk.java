package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.report.r;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bk implements com.kwad.sdk.core.d<r.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(r.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.asF = jSONObject.optInt("posIdWidth");
        aVar.asG = jSONObject.optInt("posIdHeight");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(r.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.asF != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posIdWidth", aVar.asF);
        }
        if (aVar.asG != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posIdHeight", aVar.asG);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(r.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(r.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

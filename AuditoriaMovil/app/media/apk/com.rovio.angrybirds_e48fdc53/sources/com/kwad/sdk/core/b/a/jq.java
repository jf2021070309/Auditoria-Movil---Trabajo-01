package com.kwad.sdk.core.b.a;

import com.kwad.sdk.m.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jq implements com.kwad.sdk.core.d<k.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(k.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aMT = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("c_cns");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                aVar.aMT.add((String) optJSONArray.opt(i));
            }
        }
        aVar.aMU = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("s_cns");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                k.a.C0270a c0270a = new k.a.C0270a();
                c0270a.parseJson(optJSONArray2.optJSONObject(i2));
                aVar.aMU.add(c0270a);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(k.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "c_cns", aVar.aMT);
        com.kwad.sdk.utils.t.putValue(jSONObject, "s_cns", aVar.aMU);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(k.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(k.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

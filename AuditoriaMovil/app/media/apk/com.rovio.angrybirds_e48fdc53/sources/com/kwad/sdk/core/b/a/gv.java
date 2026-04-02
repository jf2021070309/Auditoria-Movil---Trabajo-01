package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.ranger.d;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gv implements com.kwad.sdk.core.d<com.kwad.sdk.ranger.d> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.ranger.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        dVar.aGN = jSONObject.optLong("funcSwitch");
        dVar.aGO = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("urlList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                dVar.aGO.add((String) optJSONArray.opt(i));
            }
        }
        dVar.aGP = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("actConfigList");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                d.a aVar = new d.a();
                aVar.parseJson(optJSONArray2.optJSONObject(i2));
                dVar.aGP.add(aVar);
            }
        }
        dVar.aGQ = jSONObject.optLong("byteCount");
        dVar.aGR = jSONObject.optDouble("sampleRate");
        dVar.aGS = new ArrayList();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("anchorNodeList");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                com.kwad.sdk.ranger.a.a aVar2 = new com.kwad.sdk.ranger.a.a();
                aVar2.parseJson(optJSONArray3.optJSONObject(i3));
                dVar.aGS.add(aVar2);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.ranger.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dVar.aGN != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "funcSwitch", dVar.aGN);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "urlList", dVar.aGO);
        com.kwad.sdk.utils.t.putValue(jSONObject, "actConfigList", dVar.aGP);
        if (dVar.aGQ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "byteCount", dVar.aGQ);
        }
        if (dVar.aGR != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sampleRate", dVar.aGR);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "anchorNodeList", dVar.aGS);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.ranger.d dVar, JSONObject jSONObject) {
        a2(dVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.ranger.d dVar, JSONObject jSONObject) {
        return b2(dVar, jSONObject);
    }
}

package com.kwad.sdk.core.b.a;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bc implements com.kwad.sdk.core.d<com.kwad.sdk.crash.online.monitor.a.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aBb = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("systemFilterList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                aVar.aBb.add((String) optJSONArray.opt(i));
            }
        }
        aVar.aBc = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sdkFilterList");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                aVar.aBc.add((String) optJSONArray2.opt(i2));
            }
        }
        aVar.aBd = new ArrayList();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("matrixPrinterNameList");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                aVar.aBd.add((String) optJSONArray3.opt(i3));
            }
        }
        aVar.aBe = new ArrayList();
        JSONArray optJSONArray4 = jSONObject.optJSONArray("commonPrinterNameList");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                aVar.aBe.add((String) optJSONArray4.opt(i4));
            }
        }
        aVar.aBf = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("featureConfigList");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                com.kwad.sdk.crash.online.monitor.a.b bVar = new com.kwad.sdk.crash.online.monitor.a.b();
                bVar.parseJson(optJSONArray5.optJSONObject(i5));
                aVar.aBf.add(bVar);
            }
        }
        aVar.aBh = jSONObject.optInt("afterFilterSystemCheckNum", new Integer("5").intValue());
        aVar.aBi = jSONObject.optInt("batchNum", new Integer("10").intValue());
        aVar.aqX = jSONObject.optDouble("ratio", new Double("0.01").doubleValue());
        aVar.aBj = jSONObject.optInt("monitorSwitch");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "systemFilterList", aVar.aBb);
        com.kwad.sdk.utils.t.putValue(jSONObject, "sdkFilterList", aVar.aBc);
        com.kwad.sdk.utils.t.putValue(jSONObject, "matrixPrinterNameList", aVar.aBd);
        com.kwad.sdk.utils.t.putValue(jSONObject, "commonPrinterNameList", aVar.aBe);
        com.kwad.sdk.utils.t.putValue(jSONObject, "featureConfigList", aVar.aBf);
        com.kwad.sdk.utils.t.putValue(jSONObject, "afterFilterSystemCheckNum", aVar.aBh);
        com.kwad.sdk.utils.t.putValue(jSONObject, "batchNum", aVar.aBi);
        com.kwad.sdk.utils.t.putValue(jSONObject, "ratio", aVar.aqX);
        if (aVar.aBj != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "monitorSwitch", aVar.aBj);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}

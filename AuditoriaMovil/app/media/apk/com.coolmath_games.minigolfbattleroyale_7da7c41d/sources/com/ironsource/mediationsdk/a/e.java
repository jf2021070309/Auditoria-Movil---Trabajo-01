package com.ironsource.mediationsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class e extends a {
    private final String d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    private final String e = "super.dwh.mediation_events";
    private final String f = "table";
    private final String g = "data";

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i) {
        this.b = i;
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String a(ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<com.ironsource.mediationsdk.adunit.a.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a = a(it.next());
                    if (a != null) {
                        jSONArray.put(a);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String c() {
        return "ironbeast";
    }
}

package com.ironsource.mediationsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class f extends a {
    private final String d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i) {
        this.b = i;
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String a(ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
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
        return a(jSONArray);
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String c() {
        return "outcome";
    }
}

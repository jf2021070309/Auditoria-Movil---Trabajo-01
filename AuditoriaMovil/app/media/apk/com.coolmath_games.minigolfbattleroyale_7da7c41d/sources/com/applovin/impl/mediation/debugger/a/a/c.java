package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final String a;
    private final boolean b;
    private final List<b> c;
    private final List<b> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.a.b.b> map, k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getBoolean(jSONObject, "default", false).booleanValue();
        this.c = a("bidders", jSONObject, map, kVar);
        this.d = a("waterfall", jSONObject, map, kVar);
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.a.b.b> map, k kVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                String string = JsonUtils.getString(jSONObject2, "adapter_class", "");
                com.applovin.impl.mediation.debugger.a.b.b bVar = map.get(string);
                if (bVar == null) {
                    r z = kVar.z();
                    z.e("AdUnitWaterfall", "Failed to retrieve network info for adapter class: " + string);
                } else {
                    arrayList.add(new b(jSONObject2, bVar, kVar));
                }
            }
        }
        return arrayList;
    }

    public List<b> a() {
        return this.c;
    }

    public List<b> b() {
        return this.d;
    }

    public boolean c() {
        return this.b;
    }
}

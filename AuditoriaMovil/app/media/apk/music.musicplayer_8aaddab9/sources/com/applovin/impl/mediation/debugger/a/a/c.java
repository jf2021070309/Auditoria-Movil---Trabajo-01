package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3486b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f3487c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f3488d;

    public c(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.a.b.b> map, m mVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.f3486b = JsonUtils.getBoolean(jSONObject, "default", Boolean.FALSE).booleanValue();
        this.f3487c = a("bidders", jSONObject, map, mVar);
        this.f3488d = a("waterfall", jSONObject, map, mVar);
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.a.b.b> map, m mVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                String string = JsonUtils.getString(jSONObject2, "adapter_class", "");
                com.applovin.impl.mediation.debugger.a.b.b bVar = map.get(string);
                if (bVar == null) {
                    v B = mVar.B();
                    B.e("AdUnitWaterfall", "Failed to retrieve network info for adapter class: " + string);
                } else {
                    arrayList.add(new b(jSONObject2, bVar, mVar));
                }
            }
        }
        return arrayList;
    }

    public List<b> a() {
        return this.f3487c;
    }

    public List<b> b() {
        return this.f3488d;
    }

    public boolean c() {
        return this.f3486b;
    }
}

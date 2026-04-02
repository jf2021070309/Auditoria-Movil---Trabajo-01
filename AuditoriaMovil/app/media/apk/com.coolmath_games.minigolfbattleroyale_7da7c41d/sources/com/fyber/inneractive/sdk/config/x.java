package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.ae;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x implements ae.a {
    Integer a = 50;
    public Integer b = 50;
    public Set<Vendor> c = null;

    @Override // com.fyber.inneractive.sdk.util.ae.a
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ae.a(jSONObject, "pausePct", this.a);
        ae.a(jSONObject, "playPct", this.b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        ae.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}

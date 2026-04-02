package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private final com.applovin.impl.mediation.debugger.a.b.b a;
    private final String b;
    private final String c;
    private final d d;
    private final List<d> e;

    public b(JSONObject jSONObject, com.applovin.impl.mediation.debugger.a.b.b bVar, k kVar) {
        this.a = bVar;
        this.b = JsonUtils.getString(jSONObject, "name", "");
        this.c = JsonUtils.getString(jSONObject, "display_name", "");
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.d = new d(jSONObject2, kVar);
        } else {
            this.d = null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.e = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.e.add(new d(jSONObject3, kVar));
            }
        }
    }

    public com.applovin.impl.mediation.debugger.a.b.b a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public d d() {
        return this.d;
    }

    public boolean e() {
        return this.d != null;
    }

    public List<d> f() {
        return this.e;
    }
}

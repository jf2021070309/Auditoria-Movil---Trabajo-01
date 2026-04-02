package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private final com.applovin.impl.mediation.debugger.a.b.b a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3482b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3483c;

    /* renamed from: d  reason: collision with root package name */
    private final d f3484d;

    /* renamed from: e  reason: collision with root package name */
    private final List<d> f3485e;

    public b(JSONObject jSONObject, com.applovin.impl.mediation.debugger.a.b.b bVar, m mVar) {
        this.a = bVar;
        this.f3482b = JsonUtils.getString(jSONObject, "name", "");
        this.f3483c = JsonUtils.getString(jSONObject, "display_name", "");
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f3484d = new d(jSONObject2, mVar);
        } else {
            this.f3484d = null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f3485e = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f3485e.add(new d(jSONObject3, mVar));
            }
        }
    }

    public com.applovin.impl.mediation.debugger.a.b.b a() {
        return this.a;
    }

    public String b() {
        return this.f3482b;
    }

    public String c() {
        return this.f3483c;
    }

    public d d() {
        return this.f3484d;
    }

    public boolean e() {
        return this.f3484d != null;
    }

    public List<d> f() {
        return this.f3485e;
    }
}

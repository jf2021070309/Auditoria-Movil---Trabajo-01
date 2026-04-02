package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    private final String a;
    private final String b;

    public d(JSONObject jSONObject, k kVar) {
        this.a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

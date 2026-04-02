package com.applovin.impl.mediation.debugger.a.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3489b;

    public d(JSONObject jSONObject, m mVar) {
        this.a = JsonUtils.getString(jSONObject, FacebookAdapter.KEY_ID, "");
        this.f3489b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f3489b;
    }
}

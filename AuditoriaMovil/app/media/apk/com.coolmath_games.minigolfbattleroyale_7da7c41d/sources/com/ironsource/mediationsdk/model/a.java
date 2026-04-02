package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {
    public NetworkSettings a;
    public JSONObject b;
    public boolean c;
    public int d;
    public int e;
    public IronSource.AD_UNIT f;

    public a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.a = networkSettings;
        this.b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.d = optInt;
        this.c = optInt == 2;
        this.e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f = ad_unit;
    }
}

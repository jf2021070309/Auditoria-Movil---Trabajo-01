package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class y {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f4392b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4393c = new Object();

    public y(m mVar) {
        this.a = mVar;
        this.f4392b = JsonUtils.jsonObjectFromJsonString((String) mVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<String>) "{}"), new JSONObject());
    }

    public Integer a(String str) {
        Integer valueOf;
        synchronized (this.f4393c) {
            if (this.f4392b.has(str)) {
                JsonUtils.putInt(this.f4392b, str, JsonUtils.getInt(this.f4392b, str, 0) + 1);
            } else {
                JsonUtils.putInt(this.f4392b, str, 1);
            }
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.u, (com.applovin.impl.sdk.c.d<String>) this.f4392b.toString());
            valueOf = Integer.valueOf(JsonUtils.getInt(this.f4392b, str, 0));
        }
        return valueOf;
    }
}

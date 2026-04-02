package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class u {
    private final k a;
    private final JSONObject b;
    private final Object c = new Object();

    public u(k kVar) {
        this.a = kVar;
        this.b = JsonUtils.jsonObjectFromJsonString((String) kVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.s, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON), new JSONObject());
    }

    public Integer a(String str) {
        Integer valueOf;
        synchronized (this.c) {
            if (this.b.has(str)) {
                JsonUtils.putInt(this.b, str, JsonUtils.getInt(this.b, str, 0) + 1);
            } else {
                JsonUtils.putInt(this.b, str, 1);
            }
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.s, (com.applovin.impl.sdk.c.d<String>) this.b.toString());
            valueOf = Integer.valueOf(JsonUtils.getInt(this.b, str, 0));
        }
        return valueOf;
    }
}

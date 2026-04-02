package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class w extends y {
    public w(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject i2 = i();
        JsonUtils.putString(i2, "result", cVar.b());
        Map<String, String> a = cVar.a();
        if (a != null) {
            JsonUtils.putJSONObject(i2, "params", new JSONObject(a));
        }
        return i2;
    }

    public abstract com.applovin.impl.sdk.b.c b();

    public abstract void b(JSONObject jSONObject);

    public abstract void c();

    @Override // com.applovin.impl.sdk.e.y
    public int h() {
        return ((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.by)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c b2 = b();
        if (b2 == null) {
            d("Pending reward not found");
            c();
            return;
        }
        a("Reporting pending reward: " + b2 + "...");
        a(a(b2), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.w.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                w.this.a(i2);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                w.this.b(jSONObject);
            }
        });
    }
}

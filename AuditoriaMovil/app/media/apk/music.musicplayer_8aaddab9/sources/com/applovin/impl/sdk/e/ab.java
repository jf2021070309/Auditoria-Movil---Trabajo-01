package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class ab extends y {
    public ab(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c c2 = c(jSONObject);
        if (c2 == null) {
            return;
        }
        a(c2);
        a("Pending reward handled: " + c2);
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        String str;
        try {
            JSONObject a = com.applovin.impl.sdk.utils.h.a(jSONObject);
            com.applovin.impl.sdk.utils.h.d(a, this.f4020b);
            com.applovin.impl.sdk.utils.h.c(jSONObject, this.f4020b);
            com.applovin.impl.sdk.utils.h.e(jSONObject, this.f4020b);
            Map<String, String> stringMap = JsonUtils.toStringMap((JSONObject) a.get("params"));
            try {
                str = a.getString("result");
            } catch (Throwable unused) {
                str = "network_timeout";
            }
            return com.applovin.impl.sdk.b.c.a(str, stringMap);
        } catch (JSONException e2) {
            a("Unable to parse API response", e2);
            return null;
        }
    }

    public abstract void a(com.applovin.impl.sdk.b.c cVar);

    public abstract boolean b();

    @Override // com.applovin.impl.sdk.e.y
    public int h() {
        return ((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.bx)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                if (ab.this.b()) {
                    ab abVar = ab.this;
                    abVar.d("Reward validation failed with error code " + i2 + " but task was cancelled already");
                    return;
                }
                ab abVar2 = ab.this;
                abVar2.d("Reward validation failed with code " + i2 + " and error: " + str);
                ab.this.a(i2);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                if (!ab.this.b()) {
                    ab abVar = ab.this;
                    abVar.a("Reward validation succeeded with code " + i2 + " and response: " + jSONObject);
                    ab.this.b(jSONObject);
                    return;
                }
                ab abVar2 = ab.this;
                abVar2.d("Reward validation succeeded with code " + i2 + " but task was cancelled already");
                ab abVar3 = ab.this;
                abVar3.d("Response: " + jSONObject);
            }
        });
    }
}

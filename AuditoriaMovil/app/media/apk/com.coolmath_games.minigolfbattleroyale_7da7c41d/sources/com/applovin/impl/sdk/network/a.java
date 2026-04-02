package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.t;
import com.applovin.impl.sdk.k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final String a;
    private final c<JSONObject> c;

    public a(String str, c<JSONObject> cVar, k kVar) {
        super("CommunicatorRequestTask:" + str, kVar);
        this.a = str;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.Q().a(new t<JSONObject>(this.c, this.b, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                this.b.af().a(a.this.a, a.this.c.a(), i, jSONObject, str, false);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                this.b.af().a(a.this.a, a.this.c.a(), i, jSONObject, null, true);
            }
        });
    }
}

package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final String a;

    /* renamed from: c  reason: collision with root package name */
    private final c<JSONObject> f4181c;

    public a(String str, c<JSONObject> cVar, m mVar) {
        super(e.a.d.a.a.k("CommunicatorRequestTask:", str), mVar);
        this.a = str;
        this.f4181c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4020b.S().a(new u<JSONObject>(this.f4181c, this.f4020b, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                this.f4020b.ag().a(a.this.a, a.this.f4181c.a(), i2, jSONObject, str, false);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                this.f4020b.ag().a(a.this.a, a.this.f4181c.a(), i2, jSONObject, null, true);
            }
        });
    }
}

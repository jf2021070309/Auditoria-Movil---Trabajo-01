package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g extends e {
    public g(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    public boolean a() {
        return b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    @Override // com.applovin.impl.mediation.a.e
    public String toString() {
        return "SignalProviderSpec{adObject=" + I() + '}';
    }
}

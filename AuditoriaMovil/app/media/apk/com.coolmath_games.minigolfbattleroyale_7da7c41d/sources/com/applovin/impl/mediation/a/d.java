package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends a {
    private d(d dVar, com.applovin.impl.mediation.g gVar) {
        super(dVar.I(), dVar.H(), gVar, dVar.b);
    }

    public d(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, null, kVar);
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new d(this, gVar);
    }
}

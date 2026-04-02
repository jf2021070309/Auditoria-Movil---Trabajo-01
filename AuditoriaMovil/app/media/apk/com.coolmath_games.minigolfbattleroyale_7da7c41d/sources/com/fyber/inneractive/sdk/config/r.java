package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.ae;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class r implements ae.a {
    UnitDisplayType a;

    @Override // com.fyber.inneractive.sdk.util.ae.a
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ae.a(jSONObject, "unitDisplayType", this.a);
        return jSONObject;
    }
}

package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.ae;
import com.vungle.warren.ui.JavascriptBridge;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n implements o, ae.a {
    Integer a = null;
    public UnitDisplayType b;
    Boolean c;
    Integer d;

    public final void a(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // com.fyber.inneractive.sdk.config.o
    public final UnitDisplayType a() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.config.o
    public final Integer b() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.util.ae.a
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ae.a(jSONObject, "refresh", this.a);
        ae.a(jSONObject, "unitDisplayType", this.b);
        ae.a(jSONObject, JavascriptBridge.MraidHandler.CLOSE_ACTION, this.c);
        ae.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}

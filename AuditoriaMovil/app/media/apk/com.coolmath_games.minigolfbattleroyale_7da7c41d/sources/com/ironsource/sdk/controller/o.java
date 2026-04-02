package com.ironsource.sdk.controller;

import com.ironsource.sdk.controller.w;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class o {
    private w.d.a a;

    public o(w.d.a aVar) {
        this.a = aVar;
    }

    public final void a(n nVar, JSONObject jSONObject) {
        this.a.a(true, nVar.c, jSONObject);
    }

    public final void b(n nVar, JSONObject jSONObject) {
        this.a.a(false, nVar.d, jSONObject);
    }
}

package com.fyber.inneractive.sdk.config.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q extends p {
    String a;
    final Map<String, b> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        a(new o(jSONObject));
    }

    public final String toString() {
        return String.format("feature: id=%s, params=%s, exp=%s", this.a, this.c, this.b);
    }
}

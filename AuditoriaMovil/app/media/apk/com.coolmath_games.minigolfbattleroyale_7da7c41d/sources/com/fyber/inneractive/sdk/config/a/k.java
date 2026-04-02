package com.fyber.inneractive.sdk.config.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k extends p {
    String a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        a(new o(jSONObject));
    }

    public final String toString() {
        return String.format("variant: id=%s, perc=%d, params=%s", this.a, Integer.valueOf(this.b), this.c);
    }

    public final boolean a(String str) {
        return (this.c == null || this.c.a() == null || !this.c.a().containsKey(str)) ? false : true;
    }
}

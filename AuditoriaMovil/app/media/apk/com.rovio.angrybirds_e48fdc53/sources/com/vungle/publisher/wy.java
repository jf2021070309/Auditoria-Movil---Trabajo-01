package com.vungle.publisher;

import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wy {
    final String a;
    final String b;
    final String c;

    public wy(String str, JSONObject jSONObject) {
        this.a = jSONObject.getString("extension");
        this.b = jSONObject.getString("url");
        this.c = str;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}

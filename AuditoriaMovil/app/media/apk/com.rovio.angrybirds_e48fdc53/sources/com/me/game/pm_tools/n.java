package com.me.game.pm_tools;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public class n extends h {
    public int b = u.f().a(40.0f);
    public int c = u.f().a(40.0f);

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", this.b);
            jSONObject.put("y", this.c);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}

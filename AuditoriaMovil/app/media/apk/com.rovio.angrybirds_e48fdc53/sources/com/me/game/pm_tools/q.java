package com.me.game.pm_tools;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public class q extends g<n, s> {
    private static volatile q g;

    public static q s() {
        synchronized (q.class) {
            if (g == null) {
                g = new q();
            }
        }
        return g;
    }

    @Override // com.me.game.pm_tools.g
    public String o() {
        return "fw_location.inf";
    }

    @Override // com.me.game.pm_tools.g
    /* renamed from: r */
    public n m(String str) {
        n nVar = new n();
        try {
            JSONObject jSONObject = new JSONObject(str);
            nVar.b = jSONObject.getInt("x");
            nVar.c = jSONObject.getInt("y");
        } catch (Exception unused) {
        }
        return nVar;
    }

    public int t() {
        return ((n) this.e).b;
    }

    public int u() {
        return ((n) this.e).c;
    }

    public void v(int i, int i2) {
        Bean bean = this.e;
        ((n) bean).b = i;
        ((n) bean).c = i2;
        q();
    }
}

package com.applovin.impl.mediation.debugger.ui.testmode;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private final k a;
    private boolean b;
    private boolean c;
    private String d;

    public b(k kVar) {
        this.a = kVar;
        this.d = (String) kVar.b((d<d<String>>) d.A, (d<String>) null);
        kVar.b(d.A);
        if (StringUtils.isValidString(this.d)) {
            this.c = true;
        }
        this.b = ((Boolean) kVar.b((d<d<Boolean>>) d.B, (d<Boolean>) false)).booleanValue();
        kVar.b(d.B);
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(JSONObject jSONObject) {
        if (this.b) {
            return;
        }
        this.b = JsonUtils.containsCaseInsensitiveString(this.a.T().j().b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.a.T().f() || this.a.T().k();
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean a() {
        return this.b;
    }

    public void b(String str) {
        this.a.a((d<d<String>>) d.A, (d<String>) str);
    }

    public boolean b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public void d() {
        this.a.a((d<d<Boolean>>) d.B, (d<Boolean>) true);
    }
}

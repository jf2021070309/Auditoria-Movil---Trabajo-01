package com.applovin.impl.mediation.debugger.a.b;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final String d;

    public c(JSONObject jSONObject, k kVar) {
        this.a = com.applovin.impl.sdk.utils.c.a(kVar.J()).a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 == null) {
            this.b = false;
            this.d = "";
            this.c = g.a();
            return;
        }
        this.b = true;
        this.d = JsonUtils.getString(jSONObject2, "description", "");
        if (g.a()) {
            this.c = true;
            return;
        }
        List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!g.a((String) it.next())) {
                    break;
                }
            }
        }
        this.c = z;
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public String c() {
        return this.a ? this.d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}

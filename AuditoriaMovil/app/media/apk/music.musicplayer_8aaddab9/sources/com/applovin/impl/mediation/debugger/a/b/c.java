package com.applovin.impl.mediation.debugger.a.b;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3518b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3519c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3520d;

    public c(JSONObject jSONObject, m mVar) {
        this.a = com.applovin.impl.sdk.utils.d.a(mVar.L()).a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 == null) {
            this.f3518b = false;
            this.f3520d = "";
            this.f3519c = h.a();
            return;
        }
        this.f3518b = true;
        this.f3520d = JsonUtils.getString(jSONObject2, "description", "");
        if (h.a()) {
            this.f3519c = true;
            return;
        }
        List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!h.a((String) it.next())) {
                    break;
                }
            }
        }
        this.f3519c = z;
    }

    public boolean a() {
        return this.f3518b;
    }

    public boolean b() {
        boolean z = this.f3519c;
        return z && (this.a || z);
    }

    public String c() {
        return this.a ? this.f3520d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}

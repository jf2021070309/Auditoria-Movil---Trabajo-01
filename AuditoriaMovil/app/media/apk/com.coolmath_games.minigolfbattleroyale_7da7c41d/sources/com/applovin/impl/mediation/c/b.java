package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.g;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends g {
    private static final String[] a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};
    private static final String[] b = {"ads", "settings", "signal_providers"};

    public static String a(k kVar) {
        return g.a((String) kVar.a(com.applovin.impl.sdk.c.a.c), "1.0/mediate", kVar);
    }

    public static void a(JSONObject jSONObject, k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, a);
            kVar.a((d<d<String>>) d.w, (d<String>) shallowCopy.toString());
        }
    }

    public static String b(k kVar) {
        return g.a((String) kVar.a(com.applovin.impl.sdk.c.a.d), "1.0/mediate", kVar);
    }

    public static void b(JSONObject jSONObject, k kVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            kVar.b(d.x);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, b);
        kVar.a((d<d<String>>) d.x, (d<String>) shallowCopy.toString());
    }

    public static String c(k kVar) {
        return g.a((String) kVar.a(com.applovin.impl.sdk.c.a.c), "1.0/mediate_debug", kVar);
    }

    public static String d(k kVar) {
        return g.a((String) kVar.a(com.applovin.impl.sdk.c.a.d), "1.0/mediate_debug", kVar);
    }
}

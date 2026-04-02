package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.h;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends h {
    private static final String[] a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f3446b = {"ads", "settings", "signal_providers"};

    public static String a(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f3916c), "1.0/mediate", mVar);
    }

    public static void a(JSONObject jSONObject, m mVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, a);
            mVar.a((d<d<String>>) d.y, (d<String>) shallowCopy.toString());
        }
    }

    public static String b(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f3917d), "1.0/mediate", mVar);
    }

    public static void b(JSONObject jSONObject, m mVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            mVar.b(d.z);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f3446b);
        mVar.a((d<d<String>>) d.z, (d<String>) shallowCopy.toString());
    }

    public static String c(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f3916c), "1.0/mediate_debug", mVar);
    }

    public static String d(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f3917d), "1.0/mediate_debug", mVar);
    }
}

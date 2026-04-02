package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class e {
    private static e a;
    private JSONObject b = new JSONObject();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (a == null) {
                a = new e();
            }
            eVar = a;
        }
        return eVar;
    }

    public final synchronized String a(String str) {
        return this.b.optString(str);
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.b.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public final synchronized JSONObject b() {
        return this.b;
    }
}

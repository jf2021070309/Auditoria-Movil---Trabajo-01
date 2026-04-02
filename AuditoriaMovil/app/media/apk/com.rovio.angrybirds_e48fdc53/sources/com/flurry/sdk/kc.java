package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class kc {
    private static final String a = kc.class.getSimpleName();
    private static final HashMap<String, Map<String, String>> b = new HashMap<>();
    private static kc c;

    public static synchronized kc a() {
        kc kcVar;
        synchronized (kc.class) {
            if (c == null) {
                c = new kc();
            }
            kcVar = c;
        }
        return kcVar;
    }

    public final synchronized void a(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.size() >= 10) {
            ko.e(a, "MaxOriginParams exceeded: " + map.size());
        } else {
            map.put("flurryOriginVersion", str2);
            synchronized (b) {
                if (b.size() >= 10 && !b.containsKey(str)) {
                    ko.e(a, "MaxOrigins exceeded: " + b.size());
                } else {
                    b.put(str, map);
                }
            }
        }
    }

    public final synchronized HashMap<String, Map<String, String>> b() {
        HashMap<String, Map<String, String>> hashMap;
        synchronized (b) {
            hashMap = new HashMap<>(b);
        }
        return hashMap;
    }
}

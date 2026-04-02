package com.facebook.ads.internal.m;

import android.text.TextUtils;
import com.facebook.ads.internal.q.a.j;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a {
    private final String a;
    private final double b = System.currentTimeMillis() / 1000.0d;
    private final double c;
    private final String d;
    private final Map<String, String> e;
    private final e f;
    private final f g;
    private final boolean h;

    /* renamed from: com.facebook.ads.internal.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0113a {
        private String a;
        private double b;
        private String c;
        private Map<String, String> d;
        private e e;
        private f f;
        private boolean g;

        public C0113a a(double d) {
            this.b = d;
            return this;
        }

        public C0113a a(e eVar) {
            this.e = eVar;
            return this;
        }

        public C0113a a(f fVar) {
            this.f = fVar;
            return this;
        }

        public C0113a a(String str) {
            this.a = str;
            return this;
        }

        public C0113a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public C0113a a(boolean z) {
            this.g = z;
            return this;
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public C0113a b(String str) {
            this.c = str;
            return this;
        }
    }

    public a(String str, double d, String str2, Map<String, String> map, e eVar, f fVar, boolean z) {
        this.a = str;
        this.c = d;
        this.d = str2;
        this.f = eVar;
        this.g = fVar;
        this.h = z;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (f()) {
            hashMap.put("analog", j.a(com.facebook.ads.internal.g.a.a()));
        }
        this.e = a(hashMap);
    }

    private static Map<String, String> a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public String a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Map<String, String> e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return this.f == e.IMMEDIATE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return !TextUtils.isEmpty(this.a);
    }

    public e h() {
        return this.f;
    }

    public f i() {
        return this.g;
    }
}

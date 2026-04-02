package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c<T> {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f4189b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f4190c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f4191d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f4192e;

    /* renamed from: f  reason: collision with root package name */
    private String f4193f;

    /* renamed from: g  reason: collision with root package name */
    private final T f4194g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4195h;

    /* renamed from: i  reason: collision with root package name */
    private int f4196i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4197j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4198k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f4199l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f4200m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f4201n;
    private final boolean o;
    private final boolean p;

    /* loaded from: classes.dex */
    public static class a<T> {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f4202b;

        /* renamed from: c  reason: collision with root package name */
        public String f4203c;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f4205e;

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f4206f;

        /* renamed from: g  reason: collision with root package name */
        public T f4207g;

        /* renamed from: i  reason: collision with root package name */
        public int f4209i;

        /* renamed from: j  reason: collision with root package name */
        public int f4210j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4211k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4212l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4213m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f4214n;
        public boolean o;

        /* renamed from: h  reason: collision with root package name */
        public int f4208h = 1;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f4204d = new HashMap();

        public a(m mVar) {
            this.f4209i = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cR)).intValue();
            this.f4210j = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue();
            this.f4212l = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cP)).booleanValue();
            this.f4213m = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.et)).booleanValue();
            this.f4214n = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ey)).booleanValue();
        }

        public a<T> a(int i2) {
            this.f4208h = i2;
            return this;
        }

        public a<T> a(T t) {
            this.f4207g = t;
            return this;
        }

        public a<T> a(String str) {
            this.f4202b = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f4204d = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f4206f = jSONObject;
            return this;
        }

        public a<T> a(boolean z) {
            this.f4211k = z;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }

        public a<T> b(int i2) {
            this.f4209i = i2;
            return this;
        }

        public a<T> b(String str) {
            this.a = str;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.f4205e = map;
            return this;
        }

        public a<T> b(boolean z) {
            this.f4212l = z;
            return this;
        }

        public a<T> c(int i2) {
            this.f4210j = i2;
            return this;
        }

        public a<T> c(String str) {
            this.f4203c = str;
            return this;
        }

        public a<T> c(boolean z) {
            this.f4213m = z;
            return this;
        }

        public a<T> d(boolean z) {
            this.f4214n = z;
            return this;
        }

        public a<T> e(boolean z) {
            this.o = z;
            return this;
        }
    }

    public c(a<T> aVar) {
        this.a = aVar.f4202b;
        this.f4189b = aVar.a;
        this.f4190c = aVar.f4204d;
        this.f4191d = aVar.f4205e;
        this.f4192e = aVar.f4206f;
        this.f4193f = aVar.f4203c;
        this.f4194g = aVar.f4207g;
        int i2 = aVar.f4208h;
        this.f4195h = i2;
        this.f4196i = i2;
        this.f4197j = aVar.f4209i;
        this.f4198k = aVar.f4210j;
        this.f4199l = aVar.f4211k;
        this.f4200m = aVar.f4212l;
        this.f4201n = aVar.f4213m;
        this.o = aVar.f4214n;
        this.p = aVar.o;
    }

    public static <T> a<T> a(m mVar) {
        return new a<>(mVar);
    }

    public String a() {
        return this.a;
    }

    public void a(int i2) {
        this.f4196i = i2;
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.f4189b;
    }

    public void b(String str) {
        this.f4189b = str;
    }

    public Map<String, String> c() {
        return this.f4190c;
    }

    public Map<String, String> d() {
        return this.f4191d;
    }

    public JSONObject e() {
        return this.f4192e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.a;
            if (str == null ? cVar.a == null : str.equals(cVar.a)) {
                Map<String, String> map = this.f4190c;
                if (map == null ? cVar.f4190c == null : map.equals(cVar.f4190c)) {
                    Map<String, String> map2 = this.f4191d;
                    if (map2 == null ? cVar.f4191d == null : map2.equals(cVar.f4191d)) {
                        String str2 = this.f4193f;
                        if (str2 == null ? cVar.f4193f == null : str2.equals(cVar.f4193f)) {
                            String str3 = this.f4189b;
                            if (str3 == null ? cVar.f4189b == null : str3.equals(cVar.f4189b)) {
                                JSONObject jSONObject = this.f4192e;
                                if (jSONObject == null ? cVar.f4192e == null : jSONObject.equals(cVar.f4192e)) {
                                    T t = this.f4194g;
                                    if (t == null ? cVar.f4194g == null : t.equals(cVar.f4194g)) {
                                        return this.f4195h == cVar.f4195h && this.f4196i == cVar.f4196i && this.f4197j == cVar.f4197j && this.f4198k == cVar.f4198k && this.f4199l == cVar.f4199l && this.f4200m == cVar.f4200m && this.f4201n == cVar.f4201n && this.o == cVar.o && this.p == cVar.p;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.f4193f;
    }

    public T g() {
        return this.f4194g;
    }

    public int h() {
        return this.f4196i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4193f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4189b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f4194g;
        int hashCode5 = ((((((((((((((((((hashCode4 + (t != null ? t.hashCode() : 0)) * 31) + this.f4195h) * 31) + this.f4196i) * 31) + this.f4197j) * 31) + this.f4198k) * 31) + (this.f4199l ? 1 : 0)) * 31) + (this.f4200m ? 1 : 0)) * 31) + (this.f4201n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0);
        Map<String, String> map = this.f4190c;
        if (map != null) {
            hashCode5 = (hashCode5 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f4191d;
        if (map2 != null) {
            hashCode5 = (hashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f4192e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (hashCode5 * 31) + new String(charArray).hashCode();
        }
        return hashCode5;
    }

    public int i() {
        return this.f4195h - this.f4196i;
    }

    public int j() {
        return this.f4197j;
    }

    public int k() {
        return this.f4198k;
    }

    public boolean l() {
        return this.f4199l;
    }

    public boolean m() {
        return this.f4200m;
    }

    public boolean n() {
        return this.f4201n;
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.p;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("HttpRequest {endpoint=");
        y.append(this.a);
        y.append(", backupEndpoint=");
        y.append(this.f4193f);
        y.append(", httpMethod=");
        y.append(this.f4189b);
        y.append(", httpHeaders=");
        y.append(this.f4191d);
        y.append(", body=");
        y.append(this.f4192e);
        y.append(", emptyResponse=");
        y.append(this.f4194g);
        y.append(", initialRetryAttempts=");
        y.append(this.f4195h);
        y.append(", retryAttemptsLeft=");
        y.append(this.f4196i);
        y.append(", timeoutMillis=");
        y.append(this.f4197j);
        y.append(", retryDelayMillis=");
        y.append(this.f4198k);
        y.append(", exponentialRetries=");
        y.append(this.f4199l);
        y.append(", retryOnAllErrors=");
        y.append(this.f4200m);
        y.append(", encodingEnabled=");
        y.append(this.f4201n);
        y.append(", gzipBodyEncoding=");
        y.append(this.o);
        y.append(", trackConnectionSpeed=");
        y.append(this.p);
        y.append('}');
        return y.toString();
    }
}

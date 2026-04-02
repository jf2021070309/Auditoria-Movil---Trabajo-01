package j;

import j.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class z {
    public final s a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9602b;

    /* renamed from: c  reason: collision with root package name */
    public final r f9603c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final c0 f9604d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f9605e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile c f9606f;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable
        public s a;

        /* renamed from: b  reason: collision with root package name */
        public String f9607b;

        /* renamed from: c  reason: collision with root package name */
        public r.a f9608c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public c0 f9609d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f9610e;

        public a() {
            this.f9610e = Collections.emptyMap();
            this.f9607b = "GET";
            this.f9608c = new r.a();
        }

        public a(z zVar) {
            this.f9610e = Collections.emptyMap();
            this.a = zVar.a;
            this.f9607b = zVar.f9602b;
            this.f9609d = zVar.f9604d;
            this.f9610e = zVar.f9605e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(zVar.f9605e);
            this.f9608c = zVar.f9603c.e();
        }

        public z a() {
            if (this.a != null) {
                return new z(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            r.a aVar = this.f9608c;
            Objects.requireNonNull(aVar);
            r.a(str);
            r.b(str2, str);
            aVar.c(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a c(String str, @Nullable c0 c0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (c0Var == null || e.j.d.w.g0(str)) {
                    if (c0Var == null) {
                        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                            throw new IllegalArgumentException(e.a.d.a.a.l("method ", str, " must have a request body."));
                        }
                    }
                    this.f9607b = str;
                    this.f9609d = c0Var;
                    return this;
                }
                throw new IllegalArgumentException(e.a.d.a.a.l("method ", str, " must not have a request body."));
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        public <T> a d(Class<? super T> cls, @Nullable T t) {
            Objects.requireNonNull(cls, "type == null");
            if (t == null) {
                this.f9610e.remove(cls);
            } else {
                if (this.f9610e.isEmpty()) {
                    this.f9610e = new LinkedHashMap();
                }
                this.f9610e.put(cls, cls.cast(t));
            }
            return this;
        }

        public a e(s sVar) {
            Objects.requireNonNull(sVar, "url == null");
            this.a = sVar;
            return this;
        }
    }

    public z(a aVar) {
        this.a = aVar.a;
        this.f9602b = aVar.f9607b;
        this.f9603c = new r(aVar.f9608c);
        this.f9604d = aVar.f9609d;
        Map<Class<?>, Object> map = aVar.f9610e;
        byte[] bArr = j.i0.c.a;
        this.f9605e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public c a() {
        c cVar = this.f9606f;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.f9603c);
        this.f9606f = a2;
        return a2;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Request{method=");
        y.append(this.f9602b);
        y.append(", url=");
        y.append(this.a);
        y.append(", tags=");
        y.append(this.f9605e);
        y.append('}');
        return y.toString();
    }
}

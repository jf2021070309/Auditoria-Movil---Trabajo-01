package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class c extends a0.a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7369b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7370c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7371d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7372e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7373f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7374g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7375h;

    /* loaded from: classes2.dex */
    public static final class b extends a0.a.AbstractC0151a {
        public Integer a;

        /* renamed from: b  reason: collision with root package name */
        public String f7376b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f7377c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f7378d;

        /* renamed from: e  reason: collision with root package name */
        public Long f7379e;

        /* renamed from: f  reason: collision with root package name */
        public Long f7380f;

        /* renamed from: g  reason: collision with root package name */
        public Long f7381g;

        /* renamed from: h  reason: collision with root package name */
        public String f7382h;

        public a0.a a() {
            String str = this.a == null ? " pid" : "";
            if (this.f7376b == null) {
                str = e.a.d.a.a.k(str, " processName");
            }
            if (this.f7377c == null) {
                str = e.a.d.a.a.k(str, " reasonCode");
            }
            if (this.f7378d == null) {
                str = e.a.d.a.a.k(str, " importance");
            }
            if (this.f7379e == null) {
                str = e.a.d.a.a.k(str, " pss");
            }
            if (this.f7380f == null) {
                str = e.a.d.a.a.k(str, " rss");
            }
            if (this.f7381g == null) {
                str = e.a.d.a.a.k(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.a.intValue(), this.f7376b, this.f7377c.intValue(), this.f7378d.intValue(), this.f7379e.longValue(), this.f7380f.longValue(), this.f7381g.longValue(), this.f7382h, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public c(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2, a aVar) {
        this.a = i2;
        this.f7369b = str;
        this.f7370c = i3;
        this.f7371d = i4;
        this.f7372e = j2;
        this.f7373f = j3;
        this.f7374g = j4;
        this.f7375h = str2;
    }

    @Override // e.d.d.m.j.l.a0.a
    public int a() {
        return this.f7371d;
    }

    @Override // e.d.d.m.j.l.a0.a
    public int b() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.a
    public String c() {
        return this.f7369b;
    }

    @Override // e.d.d.m.j.l.a0.a
    public long d() {
        return this.f7372e;
    }

    @Override // e.d.d.m.j.l.a0.a
    public int e() {
        return this.f7370c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.a) {
            a0.a aVar = (a0.a) obj;
            if (this.a == aVar.b() && this.f7369b.equals(aVar.c()) && this.f7370c == aVar.e() && this.f7371d == aVar.a() && this.f7372e == aVar.d() && this.f7373f == aVar.f() && this.f7374g == aVar.g()) {
                String str = this.f7375h;
                if (str == null) {
                    if (aVar.h() == null) {
                        return true;
                    }
                } else if (str.equals(aVar.h())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.a
    public long f() {
        return this.f7373f;
    }

    @Override // e.d.d.m.j.l.a0.a
    public long g() {
        return this.f7374g;
    }

    @Override // e.d.d.m.j.l.a0.a
    public String h() {
        return this.f7375h;
    }

    public int hashCode() {
        long j2 = this.f7372e;
        long j3 = this.f7373f;
        long j4 = this.f7374g;
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.f7369b.hashCode()) * 1000003) ^ this.f7370c) * 1000003) ^ this.f7371d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.f7375h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ApplicationExitInfo{pid=");
        y.append(this.a);
        y.append(", processName=");
        y.append(this.f7369b);
        y.append(", reasonCode=");
        y.append(this.f7370c);
        y.append(", importance=");
        y.append(this.f7371d);
        y.append(", pss=");
        y.append(this.f7372e);
        y.append(", rss=");
        y.append(this.f7373f);
        y.append(", timestamp=");
        y.append(this.f7374g);
        y.append(", traceFile=");
        return e.a.d.a.a.r(y, this.f7375h, "}");
    }
}

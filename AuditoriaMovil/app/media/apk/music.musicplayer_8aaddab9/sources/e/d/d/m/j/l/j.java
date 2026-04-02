package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class j extends a0.e.c {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7412b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7413c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7414d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7415e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7416f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7417g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7418h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7419i;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.c.a {
        public Integer a;

        /* renamed from: b  reason: collision with root package name */
        public String f7420b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f7421c;

        /* renamed from: d  reason: collision with root package name */
        public Long f7422d;

        /* renamed from: e  reason: collision with root package name */
        public Long f7423e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f7424f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f7425g;

        /* renamed from: h  reason: collision with root package name */
        public String f7426h;

        /* renamed from: i  reason: collision with root package name */
        public String f7427i;

        public a0.e.c a() {
            String str = this.a == null ? " arch" : "";
            if (this.f7420b == null) {
                str = e.a.d.a.a.k(str, " model");
            }
            if (this.f7421c == null) {
                str = e.a.d.a.a.k(str, " cores");
            }
            if (this.f7422d == null) {
                str = e.a.d.a.a.k(str, " ram");
            }
            if (this.f7423e == null) {
                str = e.a.d.a.a.k(str, " diskSpace");
            }
            if (this.f7424f == null) {
                str = e.a.d.a.a.k(str, " simulator");
            }
            if (this.f7425g == null) {
                str = e.a.d.a.a.k(str, " state");
            }
            if (this.f7426h == null) {
                str = e.a.d.a.a.k(str, " manufacturer");
            }
            if (this.f7427i == null) {
                str = e.a.d.a.a.k(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.a.intValue(), this.f7420b, this.f7421c.intValue(), this.f7422d.longValue(), this.f7423e.longValue(), this.f7424f.booleanValue(), this.f7425g.intValue(), this.f7426h, this.f7427i, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public j(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3, a aVar) {
        this.a = i2;
        this.f7412b = str;
        this.f7413c = i3;
        this.f7414d = j2;
        this.f7415e = j3;
        this.f7416f = z;
        this.f7417g = i4;
        this.f7418h = str2;
        this.f7419i = str3;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public int a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public int b() {
        return this.f7413c;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public long c() {
        return this.f7415e;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public String d() {
        return this.f7418h;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public String e() {
        return this.f7412b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.c) {
            a0.e.c cVar = (a0.e.c) obj;
            return this.a == cVar.a() && this.f7412b.equals(cVar.e()) && this.f7413c == cVar.b() && this.f7414d == cVar.g() && this.f7415e == cVar.c() && this.f7416f == cVar.i() && this.f7417g == cVar.h() && this.f7418h.equals(cVar.d()) && this.f7419i.equals(cVar.f());
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public String f() {
        return this.f7419i;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public long g() {
        return this.f7414d;
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public int h() {
        return this.f7417g;
    }

    public int hashCode() {
        long j2 = this.f7414d;
        long j3 = this.f7415e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.f7412b.hashCode()) * 1000003) ^ this.f7413c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f7416f ? 1231 : 1237)) * 1000003) ^ this.f7417g) * 1000003) ^ this.f7418h.hashCode()) * 1000003) ^ this.f7419i.hashCode();
    }

    @Override // e.d.d.m.j.l.a0.e.c
    public boolean i() {
        return this.f7416f;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Device{arch=");
        y.append(this.a);
        y.append(", model=");
        y.append(this.f7412b);
        y.append(", cores=");
        y.append(this.f7413c);
        y.append(", ram=");
        y.append(this.f7414d);
        y.append(", diskSpace=");
        y.append(this.f7415e);
        y.append(", simulator=");
        y.append(this.f7416f);
        y.append(", state=");
        y.append(this.f7417g);
        y.append(", manufacturer=");
        y.append(this.f7418h);
        y.append(", modelClass=");
        return e.a.d.a.a.r(y, this.f7419i, "}");
    }
}

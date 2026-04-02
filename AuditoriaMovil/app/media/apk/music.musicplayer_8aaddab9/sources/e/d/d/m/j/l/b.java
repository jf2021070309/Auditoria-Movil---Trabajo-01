package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f7354b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7355c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7356d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7357e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7358f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7359g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f7360h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.d f7361i;

    /* renamed from: e.d.d.m.j.l.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0161b extends a0.b {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f7362b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f7363c;

        /* renamed from: d  reason: collision with root package name */
        public String f7364d;

        /* renamed from: e  reason: collision with root package name */
        public String f7365e;

        /* renamed from: f  reason: collision with root package name */
        public String f7366f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e f7367g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f7368h;

        public C0161b() {
        }

        public C0161b(a0 a0Var, a aVar) {
            b bVar = (b) a0Var;
            this.a = bVar.f7354b;
            this.f7362b = bVar.f7355c;
            this.f7363c = Integer.valueOf(bVar.f7356d);
            this.f7364d = bVar.f7357e;
            this.f7365e = bVar.f7358f;
            this.f7366f = bVar.f7359g;
            this.f7367g = bVar.f7360h;
            this.f7368h = bVar.f7361i;
        }

        @Override // e.d.d.m.j.l.a0.b
        public a0 a() {
            String str = this.a == null ? " sdkVersion" : "";
            if (this.f7362b == null) {
                str = e.a.d.a.a.k(str, " gmpAppId");
            }
            if (this.f7363c == null) {
                str = e.a.d.a.a.k(str, " platform");
            }
            if (this.f7364d == null) {
                str = e.a.d.a.a.k(str, " installationUuid");
            }
            if (this.f7365e == null) {
                str = e.a.d.a.a.k(str, " buildVersion");
            }
            if (this.f7366f == null) {
                str = e.a.d.a.a.k(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f7362b, this.f7363c.intValue(), this.f7364d, this.f7365e, this.f7366f, this.f7367g, this.f7368h, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public b(String str, String str2, int i2, String str3, String str4, String str5, a0.e eVar, a0.d dVar, a aVar) {
        this.f7354b = str;
        this.f7355c = str2;
        this.f7356d = i2;
        this.f7357e = str3;
        this.f7358f = str4;
        this.f7359g = str5;
        this.f7360h = eVar;
        this.f7361i = dVar;
    }

    @Override // e.d.d.m.j.l.a0
    public String a() {
        return this.f7358f;
    }

    @Override // e.d.d.m.j.l.a0
    public String b() {
        return this.f7359g;
    }

    @Override // e.d.d.m.j.l.a0
    public String c() {
        return this.f7355c;
    }

    @Override // e.d.d.m.j.l.a0
    public String d() {
        return this.f7357e;
    }

    @Override // e.d.d.m.j.l.a0
    public a0.d e() {
        return this.f7361i;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f7354b.equals(a0Var.g()) && this.f7355c.equals(a0Var.c()) && this.f7356d == a0Var.f() && this.f7357e.equals(a0Var.d()) && this.f7358f.equals(a0Var.a()) && this.f7359g.equals(a0Var.b()) && ((eVar = this.f7360h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
                a0.d dVar = this.f7361i;
                if (dVar == null) {
                    if (a0Var.e() == null) {
                        return true;
                    }
                } else if (dVar.equals(a0Var.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0
    public int f() {
        return this.f7356d;
    }

    @Override // e.d.d.m.j.l.a0
    public String g() {
        return this.f7354b;
    }

    @Override // e.d.d.m.j.l.a0
    public a0.e h() {
        return this.f7360h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f7354b.hashCode() ^ 1000003) * 1000003) ^ this.f7355c.hashCode()) * 1000003) ^ this.f7356d) * 1000003) ^ this.f7357e.hashCode()) * 1000003) ^ this.f7358f.hashCode()) * 1000003) ^ this.f7359g.hashCode()) * 1000003;
        a0.e eVar = this.f7360h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f7361i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // e.d.d.m.j.l.a0
    public a0.b i() {
        return new C0161b(this, null);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CrashlyticsReport{sdkVersion=");
        y.append(this.f7354b);
        y.append(", gmpAppId=");
        y.append(this.f7355c);
        y.append(", platform=");
        y.append(this.f7356d);
        y.append(", installationUuid=");
        y.append(this.f7357e);
        y.append(", buildVersion=");
        y.append(this.f7358f);
        y.append(", displayVersion=");
        y.append(this.f7359g);
        y.append(", session=");
        y.append(this.f7360h);
        y.append(", ndkPayload=");
        y.append(this.f7361i);
        y.append("}");
        return y.toString();
    }
}

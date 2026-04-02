package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class l extends a0.e.d.a {
    public final a0.e.d.a.b a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<a0.c> f7436b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.c> f7437c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f7438d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7439e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.a.AbstractC0153a {
        public a0.e.d.a.b a;

        /* renamed from: b  reason: collision with root package name */
        public b0<a0.c> f7440b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.c> f7441c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f7442d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f7443e;

        public b() {
        }

        public b(a0.e.d.a aVar, a aVar2) {
            l lVar = (l) aVar;
            this.a = lVar.a;
            this.f7440b = lVar.f7436b;
            this.f7441c = lVar.f7437c;
            this.f7442d = lVar.f7438d;
            this.f7443e = Integer.valueOf(lVar.f7439e);
        }

        public a0.e.d.a a() {
            String str = this.a == null ? " execution" : "";
            if (this.f7443e == null) {
                str = e.a.d.a.a.k(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.a, this.f7440b, this.f7441c, this.f7442d, this.f7443e.intValue(), null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i2, a aVar) {
        this.a = bVar;
        this.f7436b = b0Var;
        this.f7437c = b0Var2;
        this.f7438d = bool;
        this.f7439e = i2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public Boolean a() {
        return this.f7438d;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public b0<a0.c> b() {
        return this.f7436b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public a0.e.d.a.b c() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public b0<a0.c> d() {
        return this.f7437c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public int e() {
        return this.f7439e;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a) {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            return this.a.equals(aVar.c()) && ((b0Var = this.f7436b) != null ? b0Var.equals(aVar.b()) : aVar.b() == null) && ((b0Var2 = this.f7437c) != null ? b0Var2.equals(aVar.d()) : aVar.d() == null) && ((bool = this.f7438d) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f7439e == aVar.e();
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a
    public a0.e.d.a.AbstractC0153a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f7436b;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f7437c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f7438d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f7439e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Application{execution=");
        y.append(this.a);
        y.append(", customAttributes=");
        y.append(this.f7436b);
        y.append(", internalKeys=");
        y.append(this.f7437c);
        y.append(", background=");
        y.append(this.f7438d);
        y.append(", uiOrientation=");
        return e.a.d.a.a.p(y, this.f7439e, "}");
    }
}

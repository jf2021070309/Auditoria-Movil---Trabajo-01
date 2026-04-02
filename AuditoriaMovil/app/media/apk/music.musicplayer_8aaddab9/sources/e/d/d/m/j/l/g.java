package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class g extends a0.e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7386b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7387c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f7388d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7389e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f7390f;

    /* renamed from: g  reason: collision with root package name */
    public final a0.e.f f7391g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.AbstractC0160e f7392h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.e.c f7393i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f7394j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7395k;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.b {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f7396b;

        /* renamed from: c  reason: collision with root package name */
        public Long f7397c;

        /* renamed from: d  reason: collision with root package name */
        public Long f7398d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f7399e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f7400f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e.f f7401g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.AbstractC0160e f7402h;

        /* renamed from: i  reason: collision with root package name */
        public a0.e.c f7403i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f7404j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f7405k;

        public b() {
        }

        public b(a0.e eVar, a aVar) {
            g gVar = (g) eVar;
            this.a = gVar.a;
            this.f7396b = gVar.f7386b;
            this.f7397c = Long.valueOf(gVar.f7387c);
            this.f7398d = gVar.f7388d;
            this.f7399e = Boolean.valueOf(gVar.f7389e);
            this.f7400f = gVar.f7390f;
            this.f7401g = gVar.f7391g;
            this.f7402h = gVar.f7392h;
            this.f7403i = gVar.f7393i;
            this.f7404j = gVar.f7394j;
            this.f7405k = Integer.valueOf(gVar.f7395k);
        }

        @Override // e.d.d.m.j.l.a0.e.b
        public a0.e a() {
            String str = this.a == null ? " generator" : "";
            if (this.f7396b == null) {
                str = e.a.d.a.a.k(str, " identifier");
            }
            if (this.f7397c == null) {
                str = e.a.d.a.a.k(str, " startedAt");
            }
            if (this.f7399e == null) {
                str = e.a.d.a.a.k(str, " crashed");
            }
            if (this.f7400f == null) {
                str = e.a.d.a.a.k(str, " app");
            }
            if (this.f7405k == null) {
                str = e.a.d.a.a.k(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.f7396b, this.f7397c.longValue(), this.f7398d, this.f7399e.booleanValue(), this.f7400f, this.f7401g, this.f7402h, this.f7403i, this.f7404j, this.f7405k.intValue(), null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        public a0.e.b b(boolean z) {
            this.f7399e = Boolean.valueOf(z);
            return this;
        }
    }

    public g(String str, String str2, long j2, Long l2, boolean z, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0160e abstractC0160e, a0.e.c cVar, b0 b0Var, int i2, a aVar2) {
        this.a = str;
        this.f7386b = str2;
        this.f7387c = j2;
        this.f7388d = l2;
        this.f7389e = z;
        this.f7390f = aVar;
        this.f7391g = fVar;
        this.f7392h = abstractC0160e;
        this.f7393i = cVar;
        this.f7394j = b0Var;
        this.f7395k = i2;
    }

    @Override // e.d.d.m.j.l.a0.e
    public a0.e.a a() {
        return this.f7390f;
    }

    @Override // e.d.d.m.j.l.a0.e
    public a0.e.c b() {
        return this.f7393i;
    }

    @Override // e.d.d.m.j.l.a0.e
    public Long c() {
        return this.f7388d;
    }

    @Override // e.d.d.m.j.l.a0.e
    public b0<a0.e.d> d() {
        return this.f7394j;
    }

    @Override // e.d.d.m.j.l.a0.e
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        Long l2;
        a0.e.f fVar;
        a0.e.AbstractC0160e abstractC0160e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e) {
            a0.e eVar = (a0.e) obj;
            return this.a.equals(eVar.e()) && this.f7386b.equals(eVar.g()) && this.f7387c == eVar.i() && ((l2 = this.f7388d) != null ? l2.equals(eVar.c()) : eVar.c() == null) && this.f7389e == eVar.k() && this.f7390f.equals(eVar.a()) && ((fVar = this.f7391g) != null ? fVar.equals(eVar.j()) : eVar.j() == null) && ((abstractC0160e = this.f7392h) != null ? abstractC0160e.equals(eVar.h()) : eVar.h() == null) && ((cVar = this.f7393i) != null ? cVar.equals(eVar.b()) : eVar.b() == null) && ((b0Var = this.f7394j) != null ? b0Var.equals(eVar.d()) : eVar.d() == null) && this.f7395k == eVar.f();
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e
    public int f() {
        return this.f7395k;
    }

    @Override // e.d.d.m.j.l.a0.e
    public String g() {
        return this.f7386b;
    }

    @Override // e.d.d.m.j.l.a0.e
    public a0.e.AbstractC0160e h() {
        return this.f7392h;
    }

    public int hashCode() {
        long j2 = this.f7387c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7386b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f7388d;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f7389e ? 1231 : 1237)) * 1000003) ^ this.f7390f.hashCode()) * 1000003;
        a0.e.f fVar = this.f7391g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0160e abstractC0160e = this.f7392h;
        int hashCode4 = (hashCode3 ^ (abstractC0160e == null ? 0 : abstractC0160e.hashCode())) * 1000003;
        a0.e.c cVar = this.f7393i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f7394j;
        return ((hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f7395k;
    }

    @Override // e.d.d.m.j.l.a0.e
    public long i() {
        return this.f7387c;
    }

    @Override // e.d.d.m.j.l.a0.e
    public a0.e.f j() {
        return this.f7391g;
    }

    @Override // e.d.d.m.j.l.a0.e
    public boolean k() {
        return this.f7389e;
    }

    @Override // e.d.d.m.j.l.a0.e
    public a0.e.b l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Session{generator=");
        y.append(this.a);
        y.append(", identifier=");
        y.append(this.f7386b);
        y.append(", startedAt=");
        y.append(this.f7387c);
        y.append(", endedAt=");
        y.append(this.f7388d);
        y.append(", crashed=");
        y.append(this.f7389e);
        y.append(", app=");
        y.append(this.f7390f);
        y.append(", user=");
        y.append(this.f7391g);
        y.append(", os=");
        y.append(this.f7392h);
        y.append(", device=");
        y.append(this.f7393i);
        y.append(", events=");
        y.append(this.f7394j);
        y.append(", generatorType=");
        return e.a.d.a.a.p(y, this.f7395k, "}");
    }
}

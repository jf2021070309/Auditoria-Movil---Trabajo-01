package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class r extends a0.e.d.a.b.AbstractC0156d.AbstractC0157a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7459b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7460c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7461d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7462e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0156d.AbstractC0157a.AbstractC0158a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public String f7463b;

        /* renamed from: c  reason: collision with root package name */
        public String f7464c;

        /* renamed from: d  reason: collision with root package name */
        public Long f7465d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f7466e;

        public a0.e.d.a.b.AbstractC0156d.AbstractC0157a a() {
            String str = this.a == null ? " pc" : "";
            if (this.f7463b == null) {
                str = e.a.d.a.a.k(str, " symbol");
            }
            if (this.f7465d == null) {
                str = e.a.d.a.a.k(str, " offset");
            }
            if (this.f7466e == null) {
                str = e.a.d.a.a.k(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.f7463b, this.f7464c, this.f7465d.longValue(), this.f7466e.intValue(), null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public r(long j2, String str, String str2, long j3, int i2, a aVar) {
        this.a = j2;
        this.f7459b = str;
        this.f7460c = str2;
        this.f7461d = j3;
        this.f7462e = i2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d.AbstractC0157a
    public String a() {
        return this.f7460c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d.AbstractC0157a
    public int b() {
        return this.f7462e;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d.AbstractC0157a
    public long c() {
        return this.f7461d;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d.AbstractC0157a
    public long d() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d.AbstractC0157a
    public String e() {
        return this.f7459b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0156d.AbstractC0157a) {
            a0.e.d.a.b.AbstractC0156d.AbstractC0157a abstractC0157a = (a0.e.d.a.b.AbstractC0156d.AbstractC0157a) obj;
            return this.a == abstractC0157a.d() && this.f7459b.equals(abstractC0157a.e()) && ((str = this.f7460c) != null ? str.equals(abstractC0157a.a()) : abstractC0157a.a() == null) && this.f7461d == abstractC0157a.c() && this.f7462e == abstractC0157a.b();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f7459b.hashCode()) * 1000003;
        String str = this.f7460c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f7461d;
        return this.f7462e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Frame{pc=");
        y.append(this.a);
        y.append(", symbol=");
        y.append(this.f7459b);
        y.append(", file=");
        y.append(this.f7460c);
        y.append(", offset=");
        y.append(this.f7461d);
        y.append(", importance=");
        return e.a.d.a.a.p(y, this.f7462e, "}");
    }
}

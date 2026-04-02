package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class s extends a0.e.d.c {
    public final Double a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7467b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7468c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7469d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7470e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7471f;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.c.a {
        public Double a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f7472b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f7473c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f7474d;

        /* renamed from: e  reason: collision with root package name */
        public Long f7475e;

        /* renamed from: f  reason: collision with root package name */
        public Long f7476f;

        public a0.e.d.c a() {
            String str = this.f7472b == null ? " batteryVelocity" : "";
            if (this.f7473c == null) {
                str = e.a.d.a.a.k(str, " proximityOn");
            }
            if (this.f7474d == null) {
                str = e.a.d.a.a.k(str, " orientation");
            }
            if (this.f7475e == null) {
                str = e.a.d.a.a.k(str, " ramUsed");
            }
            if (this.f7476f == null) {
                str = e.a.d.a.a.k(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.a, this.f7472b.intValue(), this.f7473c.booleanValue(), this.f7474d.intValue(), this.f7475e.longValue(), this.f7476f.longValue(), null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
    }

    public s(Double d2, int i2, boolean z, int i3, long j2, long j3, a aVar) {
        this.a = d2;
        this.f7467b = i2;
        this.f7468c = z;
        this.f7469d = i3;
        this.f7470e = j2;
        this.f7471f = j3;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public Double a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public int b() {
        return this.f7467b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public long c() {
        return this.f7471f;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public int d() {
        return this.f7469d;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public long e() {
        return this.f7470e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.c) {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            Double d2 = this.a;
            if (d2 != null ? d2.equals(cVar.a()) : cVar.a() == null) {
                if (this.f7467b == cVar.b() && this.f7468c == cVar.f() && this.f7469d == cVar.d() && this.f7470e == cVar.e() && this.f7471f == cVar.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e.d.c
    public boolean f() {
        return this.f7468c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f7467b) * 1000003;
        int i2 = this.f7468c ? 1231 : 1237;
        long j2 = this.f7470e;
        long j3 = this.f7471f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.f7469d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Device{batteryLevel=");
        y.append(this.a);
        y.append(", batteryVelocity=");
        y.append(this.f7467b);
        y.append(", proximityOn=");
        y.append(this.f7468c);
        y.append(", orientation=");
        y.append(this.f7469d);
        y.append(", ramUsed=");
        y.append(this.f7470e);
        y.append(", diskUsed=");
        return e.a.d.a.a.q(y, this.f7471f, "}");
    }
}

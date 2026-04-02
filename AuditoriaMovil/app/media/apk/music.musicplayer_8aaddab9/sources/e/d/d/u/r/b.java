package e.d.d.u.r;

import e.d.d.u.r.f;
/* loaded from: classes2.dex */
public final class b extends f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7613b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f7614c;

    /* renamed from: e.d.d.u.r.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0166b extends f.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Long f7615b;

        /* renamed from: c  reason: collision with root package name */
        public f.b f7616c;

        @Override // e.d.d.u.r.f.a
        public f a() {
            String str = this.f7615b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.f7615b.longValue(), this.f7616c, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.d.u.r.f.a
        public f.a b(long j2) {
            this.f7615b = Long.valueOf(j2);
            return this;
        }
    }

    public b(String str, long j2, f.b bVar, a aVar) {
        this.a = str;
        this.f7613b = j2;
        this.f7614c = bVar;
    }

    @Override // e.d.d.u.r.f
    public f.b b() {
        return this.f7614c;
    }

    @Override // e.d.d.u.r.f
    public String c() {
        return this.a;
    }

    @Override // e.d.d.u.r.f
    public long d() {
        return this.f7613b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f7613b == fVar.d()) {
                    f.b bVar = this.f7614c;
                    if (bVar == null) {
                        if (fVar.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(fVar.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f7613b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.f7614c;
        return i2 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("TokenResult{token=");
        y.append(this.a);
        y.append(", tokenExpirationTimestamp=");
        y.append(this.f7613b);
        y.append(", responseCode=");
        y.append(this.f7614c);
        y.append("}");
        return y.toString();
    }
}

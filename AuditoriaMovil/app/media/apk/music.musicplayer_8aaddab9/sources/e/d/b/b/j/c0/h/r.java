package e.d.b.b.j.c0.h;

import e.d.b.b.j.c0.h.t;
import java.util.Set;
/* loaded from: classes.dex */
public final class r extends t.a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6178b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<t.b> f6179c;

    /* loaded from: classes.dex */
    public static final class b extends t.a.AbstractC0135a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Long f6180b;

        /* renamed from: c  reason: collision with root package name */
        public Set<t.b> f6181c;

        @Override // e.d.b.b.j.c0.h.t.a.AbstractC0135a
        public t.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.f6180b == null) {
                str = e.a.d.a.a.k(str, " maxAllowedDelay");
            }
            if (this.f6181c == null) {
                str = e.a.d.a.a.k(str, " flags");
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.f6180b.longValue(), this.f6181c, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.b.b.j.c0.h.t.a.AbstractC0135a
        public t.a.AbstractC0135a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // e.d.b.b.j.c0.h.t.a.AbstractC0135a
        public t.a.AbstractC0135a c(long j2) {
            this.f6180b = Long.valueOf(j2);
            return this;
        }
    }

    public r(long j2, long j3, Set set, a aVar) {
        this.a = j2;
        this.f6178b = j3;
        this.f6179c = set;
    }

    @Override // e.d.b.b.j.c0.h.t.a
    public long b() {
        return this.a;
    }

    @Override // e.d.b.b.j.c0.h.t.a
    public Set<t.b> c() {
        return this.f6179c;
    }

    @Override // e.d.b.b.j.c0.h.t.a
    public long d() {
        return this.f6178b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.a) {
            t.a aVar = (t.a) obj;
            return this.a == aVar.b() && this.f6178b == aVar.d() && this.f6179c.equals(aVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f6178b;
        return this.f6179c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ConfigValue{delta=");
        y.append(this.a);
        y.append(", maxAllowedDelay=");
        y.append(this.f6178b);
        y.append(", flags=");
        y.append(this.f6179c);
        y.append("}");
        return y.toString();
    }
}

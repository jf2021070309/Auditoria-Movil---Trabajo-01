package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class k extends a0.e.d {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7428b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.e.d.a f7429c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.c f7430d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.AbstractC0159d f7431e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.b {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public String f7432b;

        /* renamed from: c  reason: collision with root package name */
        public a0.e.d.a f7433c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.c f7434d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.AbstractC0159d f7435e;

        public b() {
        }

        public b(a0.e.d dVar, a aVar) {
            k kVar = (k) dVar;
            this.a = Long.valueOf(kVar.a);
            this.f7432b = kVar.f7428b;
            this.f7433c = kVar.f7429c;
            this.f7434d = kVar.f7430d;
            this.f7435e = kVar.f7431e;
        }

        @Override // e.d.d.m.j.l.a0.e.d.b
        public a0.e.d a() {
            String str = this.a == null ? " timestamp" : "";
            if (this.f7432b == null) {
                str = e.a.d.a.a.k(str, " type");
            }
            if (this.f7433c == null) {
                str = e.a.d.a.a.k(str, " app");
            }
            if (this.f7434d == null) {
                str = e.a.d.a.a.k(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.a.longValue(), this.f7432b, this.f7433c, this.f7434d, this.f7435e, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.d.m.j.l.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            this.f7433c = aVar;
            return this;
        }

        public a0.e.d.b c(a0.e.d.c cVar) {
            this.f7434d = cVar;
            return this;
        }

        public a0.e.d.b d(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public a0.e.d.b e(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f7432b = str;
            return this;
        }
    }

    public k(long j2, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0159d abstractC0159d, a aVar2) {
        this.a = j2;
        this.f7428b = str;
        this.f7429c = aVar;
        this.f7430d = cVar;
        this.f7431e = abstractC0159d;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public a0.e.d.a a() {
        return this.f7429c;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public a0.e.d.c b() {
        return this.f7430d;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public a0.e.d.AbstractC0159d c() {
        return this.f7431e;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public long d() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public String e() {
        return this.f7428b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d) {
            a0.e.d dVar = (a0.e.d) obj;
            if (this.a == dVar.d() && this.f7428b.equals(dVar.e()) && this.f7429c.equals(dVar.a()) && this.f7430d.equals(dVar.b())) {
                a0.e.d.AbstractC0159d abstractC0159d = this.f7431e;
                if (abstractC0159d == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (abstractC0159d.equals(dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e.d
    public a0.e.d.b f() {
        return new b(this, null);
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f7428b.hashCode()) * 1000003) ^ this.f7429c.hashCode()) * 1000003) ^ this.f7430d.hashCode()) * 1000003;
        a0.e.d.AbstractC0159d abstractC0159d = this.f7431e;
        return (abstractC0159d == null ? 0 : abstractC0159d.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Event{timestamp=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f7428b);
        y.append(", app=");
        y.append(this.f7429c);
        y.append(", device=");
        y.append(this.f7430d);
        y.append(", log=");
        y.append(this.f7431e);
        y.append("}");
        return y.toString();
    }
}

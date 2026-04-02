package e.d.b.b.j;

import e.d.b.b.j.n;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i extends n {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f6254b;

    /* renamed from: c  reason: collision with root package name */
    public final m f6255c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6256d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6257e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f6258f;

    /* loaded from: classes.dex */
    public static final class b extends n.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f6259b;

        /* renamed from: c  reason: collision with root package name */
        public m f6260c;

        /* renamed from: d  reason: collision with root package name */
        public Long f6261d;

        /* renamed from: e  reason: collision with root package name */
        public Long f6262e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f6263f;

        @Override // e.d.b.b.j.n.a
        public n b() {
            String str = this.a == null ? " transportName" : "";
            if (this.f6260c == null) {
                str = e.a.d.a.a.k(str, " encodedPayload");
            }
            if (this.f6261d == null) {
                str = e.a.d.a.a.k(str, " eventMillis");
            }
            if (this.f6262e == null) {
                str = e.a.d.a.a.k(str, " uptimeMillis");
            }
            if (this.f6263f == null) {
                str = e.a.d.a.a.k(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.f6259b, this.f6260c, this.f6261d.longValue(), this.f6262e.longValue(), this.f6263f, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.b.b.j.n.a
        public Map<String, String> c() {
            Map<String, String> map = this.f6263f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // e.d.b.b.j.n.a
        public n.a d(m mVar) {
            Objects.requireNonNull(mVar, "Null encodedPayload");
            this.f6260c = mVar;
            return this;
        }

        @Override // e.d.b.b.j.n.a
        public n.a e(long j2) {
            this.f6261d = Long.valueOf(j2);
            return this;
        }

        @Override // e.d.b.b.j.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // e.d.b.b.j.n.a
        public n.a g(long j2) {
            this.f6262e = Long.valueOf(j2);
            return this;
        }
    }

    public i(String str, Integer num, m mVar, long j2, long j3, Map map, a aVar) {
        this.a = str;
        this.f6254b = num;
        this.f6255c = mVar;
        this.f6256d = j2;
        this.f6257e = j3;
        this.f6258f = map;
    }

    @Override // e.d.b.b.j.n
    public Map<String, String> c() {
        return this.f6258f;
    }

    @Override // e.d.b.b.j.n
    public Integer d() {
        return this.f6254b;
    }

    @Override // e.d.b.b.j.n
    public m e() {
        return this.f6255c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.a.equals(nVar.h()) && ((num = this.f6254b) != null ? num.equals(nVar.d()) : nVar.d() == null) && this.f6255c.equals(nVar.e()) && this.f6256d == nVar.f() && this.f6257e == nVar.i() && this.f6258f.equals(nVar.c());
        }
        return false;
    }

    @Override // e.d.b.b.j.n
    public long f() {
        return this.f6256d;
    }

    @Override // e.d.b.b.j.n
    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f6254b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f6256d;
        long j3 = this.f6257e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f6255c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f6258f.hashCode();
    }

    @Override // e.d.b.b.j.n
    public long i() {
        return this.f6257e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("EventInternal{transportName=");
        y.append(this.a);
        y.append(", code=");
        y.append(this.f6254b);
        y.append(", encodedPayload=");
        y.append(this.f6255c);
        y.append(", eventMillis=");
        y.append(this.f6256d);
        y.append(", uptimeMillis=");
        y.append(this.f6257e);
        y.append(", autoMetadata=");
        y.append(this.f6258f);
        y.append("}");
        return y.toString();
    }
}

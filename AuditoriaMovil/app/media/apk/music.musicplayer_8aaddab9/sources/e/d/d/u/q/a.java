package e.d.d.u.q;

import e.d.d.u.q.c;
import e.d.d.u.q.d;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f7593b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f7594c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7595d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7596e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7597f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7598g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7599h;

    /* loaded from: classes2.dex */
    public static final class b extends d.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f7600b;

        /* renamed from: c  reason: collision with root package name */
        public String f7601c;

        /* renamed from: d  reason: collision with root package name */
        public String f7602d;

        /* renamed from: e  reason: collision with root package name */
        public Long f7603e;

        /* renamed from: f  reason: collision with root package name */
        public Long f7604f;

        /* renamed from: g  reason: collision with root package name */
        public String f7605g;

        public b() {
        }

        public b(d dVar, C0164a c0164a) {
            a aVar = (a) dVar;
            this.a = aVar.f7593b;
            this.f7600b = aVar.f7594c;
            this.f7601c = aVar.f7595d;
            this.f7602d = aVar.f7596e;
            this.f7603e = Long.valueOf(aVar.f7597f);
            this.f7604f = Long.valueOf(aVar.f7598g);
            this.f7605g = aVar.f7599h;
        }

        @Override // e.d.d.u.q.d.a
        public d a() {
            String str = this.f7600b == null ? " registrationStatus" : "";
            if (this.f7603e == null) {
                str = e.a.d.a.a.k(str, " expiresInSecs");
            }
            if (this.f7604f == null) {
                str = e.a.d.a.a.k(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f7600b, this.f7601c, this.f7602d, this.f7603e.longValue(), this.f7604f.longValue(), this.f7605g, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.d.u.q.d.a
        public d.a b(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f7600b = aVar;
            return this;
        }

        public d.a c(long j2) {
            this.f7603e = Long.valueOf(j2);
            return this;
        }

        public d.a d(long j2) {
            this.f7604f = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4, C0164a c0164a) {
        this.f7593b = str;
        this.f7594c = aVar;
        this.f7595d = str2;
        this.f7596e = str3;
        this.f7597f = j2;
        this.f7598g = j3;
        this.f7599h = str4;
    }

    @Override // e.d.d.u.q.d
    public String a() {
        return this.f7595d;
    }

    @Override // e.d.d.u.q.d
    public long b() {
        return this.f7597f;
    }

    @Override // e.d.d.u.q.d
    public String c() {
        return this.f7593b;
    }

    @Override // e.d.d.u.q.d
    public String d() {
        return this.f7599h;
    }

    @Override // e.d.d.u.q.d
    public String e() {
        return this.f7596e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f7593b;
            if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                if (this.f7594c.equals(dVar.f()) && ((str = this.f7595d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f7596e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f7597f == dVar.b() && this.f7598g == dVar.g()) {
                    String str4 = this.f7599h;
                    if (str4 == null) {
                        if (dVar.d() == null) {
                            return true;
                        }
                    } else if (str4.equals(dVar.d())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.u.q.d
    public c.a f() {
        return this.f7594c;
    }

    @Override // e.d.d.u.q.d
    public long g() {
        return this.f7598g;
    }

    public int hashCode() {
        String str = this.f7593b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f7594c.hashCode()) * 1000003;
        String str2 = this.f7595d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7596e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f7597f;
        long j3 = this.f7598g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f7599h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // e.d.d.u.q.d
    public d.a k() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PersistedInstallationEntry{firebaseInstallationId=");
        y.append(this.f7593b);
        y.append(", registrationStatus=");
        y.append(this.f7594c);
        y.append(", authToken=");
        y.append(this.f7595d);
        y.append(", refreshToken=");
        y.append(this.f7596e);
        y.append(", expiresInSecs=");
        y.append(this.f7597f);
        y.append(", tokenCreationEpochInSecs=");
        y.append(this.f7598g);
        y.append(", fisError=");
        return e.a.d.a.a.r(y, this.f7599h, "}");
    }
}

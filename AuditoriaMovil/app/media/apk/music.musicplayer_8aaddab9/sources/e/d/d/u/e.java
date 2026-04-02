package e.d.d.u;
/* loaded from: classes2.dex */
public final class e extends l {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7572b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7573c;

    public e(String str, long j2, long j3, a aVar) {
        this.a = str;
        this.f7572b = j2;
        this.f7573c = j3;
    }

    @Override // e.d.d.u.l
    public String a() {
        return this.a;
    }

    @Override // e.d.d.u.l
    public long b() {
        return this.f7573c;
    }

    @Override // e.d.d.u.l
    public long c() {
        return this.f7572b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.a.equals(lVar.a()) && this.f7572b == lVar.c() && this.f7573c == lVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f7572b;
        long j3 = this.f7573c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("InstallationTokenResult{token=");
        y.append(this.a);
        y.append(", tokenExpirationTimestamp=");
        y.append(this.f7572b);
        y.append(", tokenCreationTimestamp=");
        return e.a.d.a.a.q(y, this.f7573c, "}");
    }
}

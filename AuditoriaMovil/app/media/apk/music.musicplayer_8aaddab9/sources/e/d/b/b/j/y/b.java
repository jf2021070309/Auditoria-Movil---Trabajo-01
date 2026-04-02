package e.d.b.b.j.y;

import e.d.b.b.j.y.g;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b extends g {
    public final g.a a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6296b;

    public b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.f6296b = j2;
    }

    @Override // e.d.b.b.j.y.g
    public long b() {
        return this.f6296b;
    }

    @Override // e.d.b.b.j.y.g
    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.a.equals(gVar.c()) && this.f6296b == gVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f6296b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("BackendResponse{status=");
        y.append(this.a);
        y.append(", nextRequestWaitMillis=");
        return e.a.d.a.a.q(y, this.f6296b, "}");
    }
}

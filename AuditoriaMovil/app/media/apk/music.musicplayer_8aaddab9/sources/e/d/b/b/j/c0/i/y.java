package e.d.b.b.j.c0.i;

import java.util.Objects;
/* loaded from: classes.dex */
public final class y extends g0 {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.b.j.r f6242b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.j.n f6243c;

    public y(long j2, e.d.b.b.j.r rVar, e.d.b.b.j.n nVar) {
        this.a = j2;
        Objects.requireNonNull(rVar, "Null transportContext");
        this.f6242b = rVar;
        Objects.requireNonNull(nVar, "Null event");
        this.f6243c = nVar;
    }

    @Override // e.d.b.b.j.c0.i.g0
    public e.d.b.b.j.n a() {
        return this.f6243c;
    }

    @Override // e.d.b.b.j.c0.i.g0
    public long b() {
        return this.a;
    }

    @Override // e.d.b.b.j.c0.i.g0
    public e.d.b.b.j.r c() {
        return this.f6242b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return this.a == g0Var.b() && this.f6242b.equals(g0Var.c()) && this.f6243c.equals(g0Var.a());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        return this.f6243c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f6242b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PersistedEvent{id=");
        y.append(this.a);
        y.append(", transportContext=");
        y.append(this.f6242b);
        y.append(", event=");
        y.append(this.f6243c);
        y.append("}");
        return y.toString();
    }
}

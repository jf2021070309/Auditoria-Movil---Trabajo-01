package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class p extends a0.e.d.a.b.c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7455b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7456c;

    public p(String str, String str2, long j2, a aVar) {
        this.a = str;
        this.f7455b = str2;
        this.f7456c = j2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.c
    public long a() {
        return this.f7456c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.c
    public String b() {
        return this.f7455b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.c
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.c) {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            return this.a.equals(cVar.c()) && this.f7455b.equals(cVar.b()) && this.f7456c == cVar.a();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f7456c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7455b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Signal{name=");
        y.append(this.a);
        y.append(", code=");
        y.append(this.f7455b);
        y.append(", address=");
        return e.a.d.a.a.q(y, this.f7456c, "}");
    }
}

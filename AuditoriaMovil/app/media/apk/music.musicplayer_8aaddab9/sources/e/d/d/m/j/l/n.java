package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class n extends a0.e.d.a.b.AbstractC0154a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7448b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7449c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7450d;

    public n(long j2, long j3, String str, String str2, a aVar) {
        this.a = j2;
        this.f7448b = j3;
        this.f7449c = str;
        this.f7450d = str2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0154a
    public long a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0154a
    public String b() {
        return this.f7449c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0154a
    public long c() {
        return this.f7448b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0154a
    public String d() {
        return this.f7450d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0154a) {
            a0.e.d.a.b.AbstractC0154a abstractC0154a = (a0.e.d.a.b.AbstractC0154a) obj;
            if (this.a == abstractC0154a.a() && this.f7448b == abstractC0154a.c() && this.f7449c.equals(abstractC0154a.b())) {
                String str = this.f7450d;
                if (str == null) {
                    if (abstractC0154a.d() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC0154a.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f7448b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f7449c.hashCode()) * 1000003;
        String str = this.f7450d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("BinaryImage{baseAddress=");
        y.append(this.a);
        y.append(", size=");
        y.append(this.f7448b);
        y.append(", name=");
        y.append(this.f7449c);
        y.append(", uuid=");
        return e.a.d.a.a.r(y, this.f7450d, "}");
    }
}

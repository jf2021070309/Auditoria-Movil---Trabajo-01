package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class o extends a0.e.d.a.b.AbstractC0155b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7451b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> f7452c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.AbstractC0155b f7453d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7454e;

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.AbstractC0155b abstractC0155b, int i2, a aVar) {
        this.a = str;
        this.f7451b = str2;
        this.f7452c = b0Var;
        this.f7453d = abstractC0155b;
        this.f7454e = i2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0155b
    public a0.e.d.a.b.AbstractC0155b a() {
        return this.f7453d;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0155b
    public b0<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> b() {
        return this.f7452c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0155b
    public int c() {
        return this.f7454e;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0155b
    public String d() {
        return this.f7451b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0155b
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.AbstractC0155b abstractC0155b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0155b) {
            a0.e.d.a.b.AbstractC0155b abstractC0155b2 = (a0.e.d.a.b.AbstractC0155b) obj;
            return this.a.equals(abstractC0155b2.e()) && ((str = this.f7451b) != null ? str.equals(abstractC0155b2.d()) : abstractC0155b2.d() == null) && this.f7452c.equals(abstractC0155b2.b()) && ((abstractC0155b = this.f7453d) != null ? abstractC0155b.equals(abstractC0155b2.a()) : abstractC0155b2.a() == null) && this.f7454e == abstractC0155b2.c();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7451b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7452c.hashCode()) * 1000003;
        a0.e.d.a.b.AbstractC0155b abstractC0155b = this.f7453d;
        return ((hashCode2 ^ (abstractC0155b != null ? abstractC0155b.hashCode() : 0)) * 1000003) ^ this.f7454e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Exception{type=");
        y.append(this.a);
        y.append(", reason=");
        y.append(this.f7451b);
        y.append(", frames=");
        y.append(this.f7452c);
        y.append(", causedBy=");
        y.append(this.f7453d);
        y.append(", overflowCount=");
        return e.a.d.a.a.p(y, this.f7454e, "}");
    }
}

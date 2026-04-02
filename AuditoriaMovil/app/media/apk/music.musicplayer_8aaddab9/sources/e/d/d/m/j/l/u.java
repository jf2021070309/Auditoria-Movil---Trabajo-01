package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class u extends a0.e.AbstractC0160e {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7477b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7478c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7479d;

    public u(int i2, String str, String str2, boolean z, a aVar) {
        this.a = i2;
        this.f7477b = str;
        this.f7478c = str2;
        this.f7479d = z;
    }

    @Override // e.d.d.m.j.l.a0.e.AbstractC0160e
    public String a() {
        return this.f7478c;
    }

    @Override // e.d.d.m.j.l.a0.e.AbstractC0160e
    public int b() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.AbstractC0160e
    public String c() {
        return this.f7477b;
    }

    @Override // e.d.d.m.j.l.a0.e.AbstractC0160e
    public boolean d() {
        return this.f7479d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.AbstractC0160e) {
            a0.e.AbstractC0160e abstractC0160e = (a0.e.AbstractC0160e) obj;
            return this.a == abstractC0160e.b() && this.f7477b.equals(abstractC0160e.c()) && this.f7478c.equals(abstractC0160e.a()) && this.f7479d == abstractC0160e.d();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.f7477b.hashCode()) * 1000003) ^ this.f7478c.hashCode()) * 1000003) ^ (this.f7479d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("OperatingSystem{platform=");
        y.append(this.a);
        y.append(", version=");
        y.append(this.f7477b);
        y.append(", buildVersion=");
        y.append(this.f7478c);
        y.append(", jailbroken=");
        y.append(this.f7479d);
        y.append("}");
        return y.toString();
    }
}

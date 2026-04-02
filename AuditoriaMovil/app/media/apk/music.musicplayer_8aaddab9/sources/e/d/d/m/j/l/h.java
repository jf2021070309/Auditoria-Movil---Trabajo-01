package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class h extends a0.e.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7406b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7407c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.a.AbstractC0152a f7408d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f7409e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7410f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7411g;

    public h(String str, String str2, String str3, a0.e.a.AbstractC0152a abstractC0152a, String str4, String str5, String str6, a aVar) {
        this.a = str;
        this.f7406b = str2;
        this.f7407c = str3;
        this.f7409e = str4;
        this.f7410f = str5;
        this.f7411g = str6;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String a() {
        return this.f7410f;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String b() {
        return this.f7411g;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String c() {
        return this.f7407c;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String d() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String e() {
        return this.f7409e;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.AbstractC0152a abstractC0152a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a) {
            a0.e.a aVar = (a0.e.a) obj;
            if (this.a.equals(aVar.d()) && this.f7406b.equals(aVar.g()) && ((str = this.f7407c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((abstractC0152a = this.f7408d) != null ? abstractC0152a.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f7409e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f7410f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
                String str4 = this.f7411g;
                if (str4 == null) {
                    if (aVar.b() == null) {
                        return true;
                    }
                } else if (str4.equals(aVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public a0.e.a.AbstractC0152a f() {
        return this.f7408d;
    }

    @Override // e.d.d.m.j.l.a0.e.a
    public String g() {
        return this.f7406b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7406b.hashCode()) * 1000003;
        String str = this.f7407c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.AbstractC0152a abstractC0152a = this.f7408d;
        int hashCode3 = (hashCode2 ^ (abstractC0152a == null ? 0 : abstractC0152a.hashCode())) * 1000003;
        String str2 = this.f7409e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7410f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f7411g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Application{identifier=");
        y.append(this.a);
        y.append(", version=");
        y.append(this.f7406b);
        y.append(", displayVersion=");
        y.append(this.f7407c);
        y.append(", organization=");
        y.append(this.f7408d);
        y.append(", installationUuid=");
        y.append(this.f7409e);
        y.append(", developmentPlatform=");
        y.append(this.f7410f);
        y.append(", developmentPlatformVersion=");
        return e.a.d.a.a.r(y, this.f7411g, "}");
    }
}

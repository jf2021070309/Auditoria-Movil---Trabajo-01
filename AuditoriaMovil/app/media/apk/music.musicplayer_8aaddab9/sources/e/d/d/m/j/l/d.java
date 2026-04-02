package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class d extends a0.c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7383b;

    public d(String str, String str2, a aVar) {
        this.a = str;
        this.f7383b = str2;
    }

    @Override // e.d.d.m.j.l.a0.c
    public String a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.c
    public String b() {
        return this.f7383b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.c) {
            a0.c cVar = (a0.c) obj;
            return this.a.equals(cVar.a()) && this.f7383b.equals(cVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7383b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CustomAttribute{key=");
        y.append(this.a);
        y.append(", value=");
        return e.a.d.a.a.r(y, this.f7383b, "}");
    }
}

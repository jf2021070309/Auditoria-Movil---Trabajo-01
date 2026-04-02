package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class v extends a0.e.f {
    public final String a;

    public v(String str, a aVar) {
        this.a = str;
    }

    @Override // e.d.d.m.j.l.a0.e.f
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return e.a.d.a.a.r(e.a.d.a.a.y("User{identifier="), this.a, "}");
    }
}

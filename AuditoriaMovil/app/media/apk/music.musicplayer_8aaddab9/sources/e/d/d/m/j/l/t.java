package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class t extends a0.e.d.AbstractC0159d {
    public final String a;

    public t(String str, a aVar) {
        this.a = str;
    }

    @Override // e.d.d.m.j.l.a0.e.d.AbstractC0159d
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0159d) {
            return this.a.equals(((a0.e.d.AbstractC0159d) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return e.a.d.a.a.r(e.a.d.a.a.y("Log{content="), this.a, "}");
    }
}

package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class e extends a0.d {
    public final b0<a0.d.a> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7384b;

    public e(b0 b0Var, String str, a aVar) {
        this.a = b0Var;
        this.f7384b = str;
    }

    @Override // e.d.d.m.j.l.a0.d
    public b0<a0.d.a> a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.a0.d
    public String b() {
        return this.f7384b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d) {
            a0.d dVar = (a0.d) obj;
            if (this.a.equals(dVar.a())) {
                String str = this.f7384b;
                if (str == null) {
                    if (dVar.b() == null) {
                        return true;
                    }
                } else if (str.equals(dVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7384b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("FilesPayload{files=");
        y.append(this.a);
        y.append(", orgId=");
        return e.a.d.a.a.r(y, this.f7384b, "}");
    }
}

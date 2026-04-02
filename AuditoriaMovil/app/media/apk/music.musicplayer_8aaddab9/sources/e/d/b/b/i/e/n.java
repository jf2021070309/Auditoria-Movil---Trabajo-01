package e.d.b.b.i.e;

import e.d.b.b.i.e.t;
/* loaded from: classes.dex */
public final class n extends t {
    public final t.b a;

    /* renamed from: b  reason: collision with root package name */
    public final t.a f6119b;

    public n(t.b bVar, t.a aVar, a aVar2) {
        this.a = bVar;
        this.f6119b = aVar;
    }

    @Override // e.d.b.b.i.e.t
    public t.a a() {
        return this.f6119b;
    }

    @Override // e.d.b.b.i.e.t
    public t.b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            t.b bVar = this.a;
            if (bVar != null ? bVar.equals(tVar.b()) : tVar.b() == null) {
                t.a aVar = this.f6119b;
                if (aVar == null) {
                    if (tVar.a() == null) {
                        return true;
                    }
                } else if (aVar.equals(tVar.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        t.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        t.a aVar = this.f6119b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("NetworkConnectionInfo{networkType=");
        y.append(this.a);
        y.append(", mobileSubtype=");
        y.append(this.f6119b);
        y.append("}");
        return y.toString();
    }
}

package e.d.b.b.i.e;

import e.d.b.b.i.e.p;
/* loaded from: classes.dex */
public final class j extends p {
    public final p.a a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.b.i.e.a f6100b;

    public j(p.a aVar, e.d.b.b.i.e.a aVar2, a aVar3) {
        this.a = aVar;
        this.f6100b = aVar2;
    }

    @Override // e.d.b.b.i.e.p
    public e.d.b.b.i.e.a a() {
        return this.f6100b;
    }

    @Override // e.d.b.b.i.e.p
    public p.a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            p.a aVar = this.a;
            if (aVar != null ? aVar.equals(pVar.b()) : pVar.b() == null) {
                e.d.b.b.i.e.a aVar2 = this.f6100b;
                if (aVar2 == null) {
                    if (pVar.a() == null) {
                        return true;
                    }
                } else if (aVar2.equals(pVar.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        p.a aVar = this.a;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        e.d.b.b.i.e.a aVar2 = this.f6100b;
        return hashCode ^ (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ClientInfo{clientType=");
        y.append(this.a);
        y.append(", androidClientInfo=");
        y.append(this.f6100b);
        y.append("}");
        return y.toString();
    }
}

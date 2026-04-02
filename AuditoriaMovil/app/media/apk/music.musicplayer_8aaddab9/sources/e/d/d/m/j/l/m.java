package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class m extends a0.e.d.a.b {
    public final b0<a0.e.d.a.b.AbstractC0156d> a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.e.d.a.b.AbstractC0155b f7444b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f7445c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.c f7446d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0154a> f7447e;

    public m(b0 b0Var, a0.e.d.a.b.AbstractC0155b abstractC0155b, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2, a aVar2) {
        this.a = b0Var;
        this.f7444b = abstractC0155b;
        this.f7445c = aVar;
        this.f7446d = cVar;
        this.f7447e = b0Var2;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b
    public a0.a a() {
        return this.f7445c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0154a> b() {
        return this.f7447e;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0155b c() {
        return this.f7444b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.f7446d;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0156d> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b) {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            b0<a0.e.d.a.b.AbstractC0156d> b0Var = this.a;
            if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
                a0.e.d.a.b.AbstractC0155b abstractC0155b = this.f7444b;
                if (abstractC0155b != null ? abstractC0155b.equals(bVar.c()) : bVar.c() == null) {
                    a0.a aVar = this.f7445c;
                    if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                        if (this.f7446d.equals(bVar.d()) && this.f7447e.equals(bVar.b())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0156d> b0Var = this.a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.AbstractC0155b abstractC0155b = this.f7444b;
        int hashCode2 = (hashCode ^ (abstractC0155b == null ? 0 : abstractC0155b.hashCode())) * 1000003;
        a0.a aVar = this.f7445c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f7446d.hashCode()) * 1000003) ^ this.f7447e.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Execution{threads=");
        y.append(this.a);
        y.append(", exception=");
        y.append(this.f7444b);
        y.append(", appExitInfo=");
        y.append(this.f7445c);
        y.append(", signal=");
        y.append(this.f7446d);
        y.append(", binaries=");
        y.append(this.f7447e);
        y.append("}");
        return y.toString();
    }
}

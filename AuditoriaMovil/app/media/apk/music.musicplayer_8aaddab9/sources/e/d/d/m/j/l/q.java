package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
/* loaded from: classes2.dex */
public final class q extends a0.e.d.a.b.AbstractC0156d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7457b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> f7458c;

    public q(String str, int i2, b0 b0Var, a aVar) {
        this.a = str;
        this.f7457b = i2;
        this.f7458c = b0Var;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d
    public b0<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> a() {
        return this.f7458c;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d
    public int b() {
        return this.f7457b;
    }

    @Override // e.d.d.m.j.l.a0.e.d.a.b.AbstractC0156d
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0156d) {
            a0.e.d.a.b.AbstractC0156d abstractC0156d = (a0.e.d.a.b.AbstractC0156d) obj;
            return this.a.equals(abstractC0156d.c()) && this.f7457b == abstractC0156d.b() && this.f7458c.equals(abstractC0156d.a());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7457b) * 1000003) ^ this.f7458c.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Thread{name=");
        y.append(this.a);
        y.append(", importance=");
        y.append(this.f7457b);
        y.append(", frames=");
        y.append(this.f7458c);
        y.append("}");
        return y.toString();
    }
}

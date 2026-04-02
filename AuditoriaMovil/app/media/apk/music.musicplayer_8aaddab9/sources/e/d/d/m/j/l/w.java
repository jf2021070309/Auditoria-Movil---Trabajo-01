package e.d.d.m.j.l;

import e.d.d.m.j.l.c0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class w extends c0 {
    public final c0.a a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.c f7480b;

    /* renamed from: c  reason: collision with root package name */
    public final c0.b f7481c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f7480b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f7481c = bVar;
    }

    @Override // e.d.d.m.j.l.c0
    public c0.a a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.c0
    public c0.b b() {
        return this.f7481c;
    }

    @Override // e.d.d.m.j.l.c0
    public c0.c c() {
        return this.f7480b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.a.equals(c0Var.a()) && this.f7480b.equals(c0Var.c()) && this.f7481c.equals(c0Var.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7480b.hashCode()) * 1000003) ^ this.f7481c.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("StaticSessionData{appData=");
        y.append(this.a);
        y.append(", osData=");
        y.append(this.f7480b);
        y.append(", deviceData=");
        y.append(this.f7481c);
        y.append("}");
        return y.toString();
    }
}

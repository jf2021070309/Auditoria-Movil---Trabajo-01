package e.d.b.b.j.c0.h;

import e.d.b.b.j.c0.h.t;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class q extends t {
    public final e.d.b.b.j.e0.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<e.d.b.b.d, t.a> f6177b;

    public q(e.d.b.b.j.e0.a aVar, Map<e.d.b.b.d, t.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f6177b = map;
    }

    @Override // e.d.b.b.j.c0.h.t
    public e.d.b.b.j.e0.a a() {
        return this.a;
    }

    @Override // e.d.b.b.j.c0.h.t
    public Map<e.d.b.b.d, t.a> c() {
        return this.f6177b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.a.equals(tVar.a()) && this.f6177b.equals(tVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f6177b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("SchedulerConfig{clock=");
        y.append(this.a);
        y.append(", values=");
        y.append(this.f6177b);
        y.append("}");
        return y.toString();
    }
}

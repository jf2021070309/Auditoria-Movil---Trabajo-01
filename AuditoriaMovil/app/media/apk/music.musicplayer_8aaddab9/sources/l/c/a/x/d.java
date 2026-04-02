package l.c.a.x;

import java.io.Serializable;
import l.c.a.q;
/* loaded from: classes2.dex */
public final class d implements Comparable<d>, Serializable {
    public final l.c.a.f a;

    /* renamed from: b  reason: collision with root package name */
    public final q f9830b;

    /* renamed from: c  reason: collision with root package name */
    public final q f9831c;

    public d(long j2, q qVar, q qVar2) {
        this.a = l.c.a.f.c0(j2, 0, qVar);
        this.f9830b = qVar;
        this.f9831c = qVar2;
    }

    public d(l.c.a.f fVar, q qVar, q qVar2) {
        this.a = fVar;
        this.f9830b = qVar;
        this.f9831c = qVar2;
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public l.c.a.f a() {
        return this.a.g0(this.f9831c.f9708g - this.f9830b.f9708g);
    }

    public boolean b() {
        return this.f9831c.f9708g > this.f9830b.f9708g;
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        return this.a.G(this.f9830b).compareTo(dVar2.a.G(dVar2.f9830b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.f9830b.equals(dVar.f9830b) && this.f9831c.equals(dVar.f9831c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.f9830b.f9708g) ^ Integer.rotateLeft(this.f9831c.f9708g, 16);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Transition[");
        y.append(b() ? "Gap" : "Overlap");
        y.append(" at ");
        y.append(this.a);
        y.append(this.f9830b);
        y.append(" to ");
        y.append(this.f9831c);
        y.append(']');
        return y.toString();
    }
}

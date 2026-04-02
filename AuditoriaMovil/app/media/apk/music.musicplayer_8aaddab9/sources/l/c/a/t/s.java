package l.c.a.t;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class s extends a<s> implements Serializable {
    public final l.c.a.e a;

    public s(l.c.a.e eVar) {
        e.j.d.w.k0(eVar, "date");
        this.a = eVar;
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public b B(long j2, l.c.a.w.l lVar) {
        return (s) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public long G() {
        return this.a.G();
    }

    @Override // l.c.a.t.b
    public b I(l.c.a.w.f fVar) {
        return (s) r.f9753c.f(fVar.adjustInto(this));
    }

    @Override // l.c.a.t.a
    public a<s> M(long j2, l.c.a.w.l lVar) {
        return (s) super.h(j2, lVar);
    }

    @Override // l.c.a.t.a
    public a<s> P(long j2) {
        return b0(this.a.n0(j2));
    }

    @Override // l.c.a.t.a
    public a<s> Q(long j2) {
        return b0(this.a.o0(j2));
    }

    @Override // l.c.a.t.a
    public a<s> T(long j2) {
        return b0(this.a.q0(j2));
    }

    public final long W() {
        return ((a0() * 12) + this.a.f9678d) - 1;
    }

    public final int a0() {
        return this.a.f9677c - 1911;
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (s) r.f9753c.f(fVar.adjustInto(this));
    }

    public final s b0(l.c.a.e eVar) {
        return eVar.equals(this.a) ? this : new s(eVar);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: c0 */
    public s a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            if (getLong(aVar) == j2) {
                return this;
            }
            switch (aVar.ordinal()) {
                case 24:
                    r.f9753c.K(aVar).b(j2, aVar);
                    return b0(this.a.o0(j2 - W()));
                case 25:
                case 26:
                case 27:
                    int a = r.f9753c.K(aVar).a(j2, aVar);
                    switch (aVar.ordinal()) {
                        case 25:
                            return b0(this.a.v0(a0() >= 1 ? a + 1911 : (1 - a) + 1911));
                        case 26:
                            return b0(this.a.v0(a + 1911));
                        case 27:
                            return b0(this.a.v0((1 - a0()) + 1911));
                    }
            }
            return b0(this.a.a(iVar, j2));
        }
        return (s) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.t.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.a.equals(((s) obj).a);
        }
        return false;
    }

    @Override // l.c.a.t.b, l.c.a.v.b, l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return (s) super.f(j2, lVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            switch (((l.c.a.w.a) iVar).ordinal()) {
                case 24:
                    return W();
                case 25:
                    int a0 = a0();
                    if (a0 < 1) {
                        a0 = 1 - a0;
                    }
                    return a0;
                case 26:
                    return a0();
                case 27:
                    return a0() < 1 ? 0 : 1;
                default:
                    return this.a.getLong(iVar);
            }
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d h(long j2, l.c.a.w.l lVar) {
        return (s) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public int hashCode() {
        r rVar = r.f9753c;
        return (-1990173233) ^ this.a.hashCode();
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            if (isSupported(iVar)) {
                l.c.a.w.a aVar = (l.c.a.w.a) iVar;
                int ordinal = aVar.ordinal();
                if (ordinal == 18 || ordinal == 19 || ordinal == 21) {
                    return this.a.range(iVar);
                }
                if (ordinal != 25) {
                    return r.f9753c.K(aVar);
                }
                l.c.a.w.n range = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.f(1L, a0() <= 0 ? (-range.a) + 1 + 1911 : range.f9817d - 1911);
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public final c<s> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }

    @Override // l.c.a.t.b
    public h v() {
        return r.f9753c;
    }

    @Override // l.c.a.t.b
    public i y() {
        return (t) super.y();
    }

    @Override // l.c.a.t.b
    public b z(long j2, l.c.a.w.l lVar) {
        return (s) super.f(j2, lVar);
    }
}

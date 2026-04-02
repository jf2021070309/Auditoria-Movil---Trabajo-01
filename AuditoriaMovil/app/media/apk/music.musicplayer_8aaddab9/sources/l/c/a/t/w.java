package l.c.a.t;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class w extends a<w> implements Serializable {
    public final l.c.a.e a;

    public w(l.c.a.e eVar) {
        e.j.d.w.k0(eVar, "date");
        this.a = eVar;
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public b B(long j2, l.c.a.w.l lVar) {
        return (w) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public long G() {
        return this.a.G();
    }

    @Override // l.c.a.t.b
    public b I(l.c.a.w.f fVar) {
        return (w) v.f9755c.f(fVar.adjustInto(this));
    }

    @Override // l.c.a.t.a
    public a<w> M(long j2, l.c.a.w.l lVar) {
        return (w) super.h(j2, lVar);
    }

    @Override // l.c.a.t.a
    public a<w> P(long j2) {
        return b0(this.a.n0(j2));
    }

    @Override // l.c.a.t.a
    public a<w> Q(long j2) {
        return b0(this.a.o0(j2));
    }

    @Override // l.c.a.t.a
    public a<w> T(long j2) {
        return b0(this.a.q0(j2));
    }

    public final long W() {
        return ((a0() * 12) + this.a.f9678d) - 1;
    }

    public final int a0() {
        return this.a.f9677c + 543;
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (w) v.f9755c.f(fVar.adjustInto(this));
    }

    public final w b0(l.c.a.e eVar) {
        return eVar.equals(this.a) ? this : new w(eVar);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: c0 */
    public w a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            if (getLong(aVar) == j2) {
                return this;
            }
            switch (aVar.ordinal()) {
                case 24:
                    v.f9755c.K(aVar).b(j2, aVar);
                    return b0(this.a.o0(j2 - W()));
                case 25:
                case 26:
                case 27:
                    int a = v.f9755c.K(aVar).a(j2, aVar);
                    switch (aVar.ordinal()) {
                        case 25:
                            l.c.a.e eVar = this.a;
                            if (a0() < 1) {
                                a = 1 - a;
                            }
                            return b0(eVar.v0(a - 543));
                        case 26:
                            return b0(this.a.v0(a - 543));
                        case 27:
                            return b0(this.a.v0((1 - a0()) - 543));
                    }
            }
            return b0(this.a.a(iVar, j2));
        }
        return (w) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.t.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    @Override // l.c.a.t.b, l.c.a.v.b, l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return (w) super.f(j2, lVar);
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
        return (w) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public int hashCode() {
        v vVar = v.f9755c;
        return 146118545 ^ this.a.hashCode();
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
                    return v.f9755c.K(aVar);
                }
                l.c.a.w.n range = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.f(1L, a0() <= 0 ? (-(range.a + 543)) + 1 : 543 + range.f9817d);
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public final c<w> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }

    @Override // l.c.a.t.b
    public h v() {
        return v.f9755c;
    }

    @Override // l.c.a.t.b
    public i y() {
        return (x) super.y();
    }

    @Override // l.c.a.t.b
    public b z(long j2, l.c.a.w.l lVar) {
        return (w) super.f(j2, lVar);
    }
}

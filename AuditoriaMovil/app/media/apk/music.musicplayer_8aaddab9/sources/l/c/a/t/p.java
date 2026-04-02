package l.c.a.t;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class p extends a<p> implements Serializable {
    public static final l.c.a.e a = l.c.a.e.j0(1873, 1, 1);

    /* renamed from: b  reason: collision with root package name */
    public final l.c.a.e f9742b;

    /* renamed from: c  reason: collision with root package name */
    public transient q f9743c;

    /* renamed from: d  reason: collision with root package name */
    public transient int f9744d;

    public p(l.c.a.e eVar) {
        if (eVar.d0(a)) {
            throw new l.c.a.a("Minimum supported date is January 1st Meiji 6");
        }
        q u = q.u(eVar);
        this.f9743c = u;
        this.f9744d = eVar.f9677c - (u.f9751h.f9677c - 1);
        this.f9742b = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        q u = q.u(this.f9742b);
        this.f9743c = u;
        this.f9744d = this.f9742b.f9677c - (u.f9751h.f9677c - 1);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public b B(long j2, l.c.a.w.l lVar) {
        return (p) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public long G() {
        return this.f9742b.G();
    }

    @Override // l.c.a.t.b
    public b I(l.c.a.w.f fVar) {
        return (p) o.f9738d.f(fVar.adjustInto(this));
    }

    @Override // l.c.a.t.a
    public a<p> M(long j2, l.c.a.w.l lVar) {
        return (p) super.h(j2, lVar);
    }

    @Override // l.c.a.t.a
    public a<p> P(long j2) {
        return b0(this.f9742b.n0(j2));
    }

    @Override // l.c.a.t.a
    public a<p> Q(long j2) {
        return b0(this.f9742b.o0(j2));
    }

    @Override // l.c.a.t.a
    public a<p> T(long j2) {
        return b0(this.f9742b.q0(j2));
    }

    public final l.c.a.w.n W(int i2) {
        Calendar calendar = Calendar.getInstance(o.f9737c);
        calendar.set(0, this.f9743c.f9750g + 2);
        int i3 = this.f9744d;
        l.c.a.e eVar = this.f9742b;
        calendar.set(i3, eVar.f9678d - 1, eVar.f9679e);
        return l.c.a.w.n.f(calendar.getActualMinimum(i2), calendar.getActualMaximum(i2));
    }

    public final long a0() {
        return this.f9744d == 1 ? (this.f9742b.b0() - this.f9743c.f9751h.b0()) + 1 : this.f9742b.b0();
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (p) o.f9738d.f(fVar.adjustInto(this));
    }

    public final p b0(l.c.a.e eVar) {
        return eVar.equals(this.f9742b) ? this : new p(eVar);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: c0 */
    public p a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            if (getLong(aVar) == j2) {
                return this;
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 19 || ordinal == 25 || ordinal == 27) {
                int a2 = o.f9738d.K(aVar).a(j2, aVar);
                int ordinal2 = aVar.ordinal();
                if (ordinal2 == 19) {
                    return b0(this.f9742b.n0(a2 - a0()));
                }
                if (ordinal2 == 25) {
                    return d0(this.f9743c, a2);
                }
                if (ordinal2 == 27) {
                    return d0(q.v(a2), this.f9744d);
                }
            }
            return b0(this.f9742b.a(iVar, j2));
        }
        return (p) iVar.adjustInto(this, j2);
    }

    public final p d0(q qVar, int i2) {
        Objects.requireNonNull(o.f9738d);
        if (qVar instanceof q) {
            l.c.a.w.n.f(1L, (qVar.t().f9677c - qVar.f9751h.f9677c) + 1).b(i2, l.c.a.w.a.YEAR_OF_ERA);
            return b0(this.f9742b.v0((qVar.f9751h.f9677c + i2) - 1));
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // l.c.a.t.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f9742b.equals(((p) obj).f9742b);
        }
        return false;
    }

    @Override // l.c.a.t.b, l.c.a.v.b, l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return (p) super.f(j2, lVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal != 16 && ordinal != 17) {
                if (ordinal == 19) {
                    return a0();
                }
                if (ordinal == 25) {
                    return this.f9744d;
                }
                if (ordinal == 27) {
                    return this.f9743c.f9750g;
                }
                if (ordinal != 21 && ordinal != 22) {
                    return this.f9742b.getLong(iVar);
                }
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d h(long j2, l.c.a.w.l lVar) {
        return (p) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public int hashCode() {
        Objects.requireNonNull(o.f9738d);
        return (-688086063) ^ this.f9742b.hashCode();
    }

    @Override // l.c.a.t.b, l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == l.c.a.w.a.ALIGNED_WEEK_OF_MONTH || iVar == l.c.a.w.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(iVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            if (isSupported(iVar)) {
                l.c.a.w.a aVar = (l.c.a.w.a) iVar;
                int ordinal = aVar.ordinal();
                return ordinal != 19 ? ordinal != 25 ? o.f9738d.K(aVar) : W(1) : W(6);
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public final c<p> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }

    @Override // l.c.a.t.b
    public h v() {
        return o.f9738d;
    }

    @Override // l.c.a.t.b
    public i y() {
        return this.f9743c;
    }

    @Override // l.c.a.t.b
    public b z(long j2, l.c.a.w.l lVar) {
        return (p) super.f(j2, lVar);
    }
}

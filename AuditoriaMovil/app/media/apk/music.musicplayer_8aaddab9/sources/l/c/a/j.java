package l.c.a;

import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;
import l.c.a.x.f;
/* loaded from: classes2.dex */
public final class j extends l.c.a.v.b implements l.c.a.w.d, l.c.a.w.f, Comparable<j>, Serializable {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final f f9691b;

    /* renamed from: c  reason: collision with root package name */
    public final q f9692c;

    static {
        f fVar = f.a;
        q qVar = q.f9707f;
        Objects.requireNonNull(fVar);
        w.k0(fVar, "dateTime");
        w.k0(qVar, "offset");
        f fVar2 = f.f9680b;
        q qVar2 = q.f9706e;
        Objects.requireNonNull(fVar2);
        w.k0(fVar2, "dateTime");
        w.k0(qVar2, "offset");
    }

    public j(f fVar, q qVar) {
        w.k0(fVar, "dateTime");
        this.f9691b = fVar;
        w.k0(qVar, "offset");
        this.f9692c = qVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j t(l.c.a.w.e eVar) {
        if (eVar instanceof j) {
            return (j) eVar;
        }
        try {
            q B = q.B(eVar);
            try {
                return new j(f.T(eVar), B);
            } catch (a unused) {
                return v(d.v(eVar), B);
            }
        } catch (a unused2) {
            throw new a("Unable to obtain OffsetDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static j v(d dVar, p pVar) {
        w.k0(dVar, "instant");
        w.k0(pVar, "zone");
        q qVar = ((f.a) pVar.v()).a;
        return new j(f.c0(dVar.f9674b, dVar.f9675c, qVar), qVar);
    }

    private Object writeReplace() {
        return new m((byte) 69, this);
    }

    public final j B(f fVar, q qVar) {
        return (this.f9691b == fVar && this.f9692c.equals(qVar)) ? this : new j(fVar, qVar);
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            int ordinal = aVar.ordinal();
            return ordinal != 28 ? ordinal != 29 ? B(this.f9691b.a(iVar, j2), this.f9692c) : B(this.f9691b, q.K(aVar.checkValidIntValue(j2))) : v(d.B(j2, u()), this.f9692c);
        }
        return (j) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.EPOCH_DAY, this.f9691b.f9681c.G()).a(l.c.a.w.a.NANO_OF_DAY, this.f9691b.f9682d.Q()).a(l.c.a.w.a.OFFSET_SECONDS, this.f9692c.f9708g);
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return ((fVar instanceof e) || (fVar instanceof g) || (fVar instanceof f)) ? B(this.f9691b.b(fVar), this.f9692c) : fVar instanceof d ? v((d) fVar, this.f9692c) : fVar instanceof q ? B(this.f9691b, (q) fVar) : fVar instanceof j ? (j) fVar : (j) fVar.adjustInto(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(j jVar) {
        j jVar2 = jVar;
        if (this.f9692c.equals(jVar2.f9692c)) {
            return this.f9691b.compareTo(jVar2.f9691b);
        }
        int u = w.u(z(), jVar2.z());
        if (u == 0) {
            f fVar = this.f9691b;
            int i2 = fVar.f9682d.f9688g;
            f fVar2 = jVar2.f9691b;
            int i3 = i2 - fVar2.f9682d.f9688g;
            return i3 == 0 ? fVar.compareTo(fVar2) : i3;
        }
        return u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f9691b.equals(jVar.f9691b) && this.f9692c.equals(jVar.f9692c);
        }
        return false;
    }

    @Override // l.c.a.v.b, l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? h(Long.MAX_VALUE, lVar).h(1L, lVar) : h(-j2, lVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal != 28) {
                return ordinal != 29 ? this.f9691b.get(iVar) : this.f9692c.f9708g;
            }
            throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            return ordinal != 28 ? ordinal != 29 ? this.f9691b.getLong(iVar) : this.f9692c.f9708g : z();
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        return this.f9691b.hashCode() ^ this.f9692c.f9708g;
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        j t = t(dVar);
        if (lVar instanceof l.c.a.w.b) {
            q qVar = this.f9692c;
            if (!qVar.equals(t.f9692c)) {
                t = new j(t.f9691b.g0(qVar.f9708g - t.f9692c.f9708g), qVar);
            }
            return this.f9691b.i(t.f9691b, lVar);
        }
        return lVar.between(this, t);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return (iVar instanceof l.c.a.w.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9809b) {
            return (R) l.c.a.t.m.f9736c;
        }
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.NANOS;
        }
        if (kVar == l.c.a.w.j.f9812e || kVar == l.c.a.w.j.f9811d) {
            return (R) this.f9692c;
        }
        if (kVar == l.c.a.w.j.f9813f) {
            return (R) this.f9691b.f9681c;
        }
        if (kVar == l.c.a.w.j.f9814g) {
            return (R) this.f9691b.f9682d;
        }
        if (kVar == l.c.a.w.j.a) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? (iVar == l.c.a.w.a.INSTANT_SECONDS || iVar == l.c.a.w.a.OFFSET_SECONDS) ? iVar.range() : this.f9691b.range(iVar) : iVar.rangeRefinedBy(this);
    }

    public String toString() {
        return this.f9691b.toString() + this.f9692c.f9709h;
    }

    public int u() {
        return this.f9691b.f9682d.f9688g;
    }

    @Override // l.c.a.w.d
    /* renamed from: y */
    public j h(long j2, l.c.a.w.l lVar) {
        return lVar instanceof l.c.a.w.b ? B(this.f9691b.z(j2, lVar), this.f9692c) : (j) lVar.addTo(this, j2);
    }

    public long z() {
        return this.f9691b.B(this.f9692c);
    }
}

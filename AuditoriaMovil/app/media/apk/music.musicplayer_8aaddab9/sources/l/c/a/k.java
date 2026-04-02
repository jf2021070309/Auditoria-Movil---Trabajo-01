package l.c.a;

import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class k extends l.c.a.v.c implements l.c.a.w.d, l.c.a.w.f, Comparable<k>, Serializable {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final g f9693b;

    /* renamed from: c  reason: collision with root package name */
    public final q f9694c;

    static {
        g gVar = g.a;
        q qVar = q.f9707f;
        Objects.requireNonNull(gVar);
        w.k0(gVar, "time");
        w.k0(qVar, "offset");
        g gVar2 = g.f9683b;
        q qVar2 = q.f9706e;
        Objects.requireNonNull(gVar2);
        w.k0(gVar2, "time");
        w.k0(qVar2, "offset");
    }

    public k(g gVar, q qVar) {
        w.k0(gVar, "time");
        this.f9693b = gVar;
        w.k0(qVar, "offset");
        this.f9694c = qVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static k t(l.c.a.w.e eVar) {
        if (eVar instanceof k) {
            return (k) eVar;
        }
        try {
            return new k(g.v(eVar), q.B(eVar));
        } catch (a unused) {
            throw new a("Unable to obtain OffsetTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new m((byte) 66, this);
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d a(l.c.a.w.i iVar, long j2) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.OFFSET_SECONDS ? y(this.f9693b, q.K(((l.c.a.w.a) iVar).checkValidIntValue(j2))) : y(this.f9693b.a(iVar, j2), this.f9694c) : (k) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.NANO_OF_DAY, this.f9693b.Q()).a(l.c.a.w.a.OFFSET_SECONDS, this.f9694c.f9708g);
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return fVar instanceof g ? y((g) fVar, this.f9694c) : fVar instanceof q ? y(this.f9693b, (q) fVar) : fVar instanceof k ? (k) fVar : (k) fVar.adjustInto(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(k kVar) {
        int u;
        k kVar2 = kVar;
        if (!this.f9694c.equals(kVar2.f9694c) && (u = w.u(v(), kVar2.v())) != 0) {
            return u;
        }
        return this.f9693b.compareTo(kVar2.f9693b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f9693b.equals(kVar.f9693b) && this.f9694c.equals(kVar.f9694c);
        }
        return false;
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? h(Long.MAX_VALUE, lVar).h(1L, lVar) : h(-j2, lVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.OFFSET_SECONDS ? this.f9694c.f9708g : this.f9693b.getLong(iVar) : iVar.getFrom(this);
    }

    public int hashCode() {
        return this.f9693b.hashCode() ^ this.f9694c.f9708g;
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        k t = t(dVar);
        if (lVar instanceof l.c.a.w.b) {
            long v = t.v() - v();
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return v;
                case 1:
                    return v / 1000;
                case 2:
                    return v / 1000000;
                case 3:
                    return v / 1000000000;
                case 4:
                    return v / 60000000000L;
                case 5:
                    return v / 3600000000000L;
                case 6:
                    return v / 43200000000000L;
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, t);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() || iVar == l.c.a.w.a.OFFSET_SECONDS : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.NANOS;
        }
        if (kVar == l.c.a.w.j.f9812e || kVar == l.c.a.w.j.f9811d) {
            return (R) this.f9694c;
        }
        if (kVar == l.c.a.w.j.f9814g) {
            return (R) this.f9693b;
        }
        if (kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.a) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.OFFSET_SECONDS ? iVar.range() : this.f9693b.range(iVar) : iVar.rangeRefinedBy(this);
    }

    public String toString() {
        return this.f9693b.toString() + this.f9694c.f9709h;
    }

    @Override // l.c.a.w.d
    /* renamed from: u */
    public k h(long j2, l.c.a.w.l lVar) {
        return lVar instanceof l.c.a.w.b ? y(this.f9693b.h(j2, lVar), this.f9694c) : (k) lVar.addTo(this, j2);
    }

    public final long v() {
        return this.f9693b.Q() - (this.f9694c.f9708g * 1000000000);
    }

    public final k y(g gVar, q qVar) {
        return (this.f9693b == gVar && this.f9694c.equals(qVar)) ? this : new k(gVar, qVar);
    }
}

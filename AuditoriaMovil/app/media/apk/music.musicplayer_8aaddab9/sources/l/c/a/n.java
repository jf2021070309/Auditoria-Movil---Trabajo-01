package l.c.a;

import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class n extends l.c.a.v.c implements l.c.a.w.d, l.c.a.w.f, Comparable<n>, Serializable {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f9700b;

    static {
        new l.c.a.u.b().i(l.c.a.w.a.YEAR, 4, 10, l.c.a.u.j.EXCEEDS_PAD).l();
    }

    public n(int i2) {
        this.f9700b = i2;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static n t(l.c.a.w.e eVar) {
        if (eVar instanceof n) {
            return (n) eVar;
        }
        try {
            if (!l.c.a.t.m.f9736c.equals(l.c.a.t.h.u(eVar))) {
                eVar = e.T(eVar);
            }
            return u(eVar.get(l.c.a.w.a.YEAR));
        } catch (a unused) {
            throw new a("Unable to obtain Year from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static n u(int i2) {
        l.c.a.w.a.YEAR.checkValidValue(i2);
        return new n(i2);
    }

    private Object writeReplace() {
        return new m((byte) 67, this);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        if (l.c.a.t.h.u(dVar).equals(l.c.a.t.m.f9736c)) {
            return dVar.a(l.c.a.w.a.YEAR, this.f9700b);
        }
        throw new a("Adjustment only supported on ISO date-time");
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (n) fVar.adjustInto(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(n nVar) {
        return this.f9700b - nVar.f9700b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f9700b == ((n) obj).f9700b;
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
        if (iVar instanceof l.c.a.w.a) {
            switch (((l.c.a.w.a) iVar).ordinal()) {
                case 25:
                    int i2 = this.f9700b;
                    if (i2 < 1) {
                        i2 = 1 - i2;
                    }
                    return i2;
                case 26:
                    return this.f9700b;
                case 27:
                    return this.f9700b < 1 ? 0 : 1;
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        return this.f9700b;
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        n t = t(dVar);
        if (lVar instanceof l.c.a.w.b) {
            long j2 = t.f9700b - this.f9700b;
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 10:
                    return j2;
                case 11:
                    return j2 / 10;
                case 12:
                    return j2 / 100;
                case 13:
                    return j2 / 1000;
                case 14:
                    l.c.a.w.a aVar = l.c.a.w.a.ERA;
                    return t.getLong(aVar) - getLong(aVar);
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, t);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.YEAR || iVar == l.c.a.w.a.YEAR_OF_ERA || iVar == l.c.a.w.a.ERA : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9809b) {
            return (R) l.c.a.t.m.f9736c;
        }
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.YEARS;
        }
        if (kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.YEAR_OF_ERA) {
            return l.c.a.w.n.f(1L, this.f9700b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(iVar);
    }

    public String toString() {
        return Integer.toString(this.f9700b);
    }

    @Override // l.c.a.w.d
    /* renamed from: v */
    public n h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 10:
                    return y(j2);
                case 11:
                    return y(w.p0(j2, 10));
                case 12:
                    return y(w.p0(j2, 100));
                case 13:
                    return y(w.p0(j2, 1000));
                case 14:
                    l.c.a.w.a aVar = l.c.a.w.a.ERA;
                    return a(aVar, w.n0(getLong(aVar), j2));
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return (n) lVar.addTo(this, j2);
    }

    public n y(long j2) {
        return j2 == 0 ? this : u(l.c.a.w.a.YEAR.checkValidIntValue(this.f9700b + j2));
    }

    @Override // l.c.a.w.d
    /* renamed from: z */
    public n a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            switch (aVar.ordinal()) {
                case 25:
                    if (this.f9700b < 1) {
                        j2 = 1 - j2;
                    }
                    return u((int) j2);
                case 26:
                    return u((int) j2);
                case 27:
                    return getLong(l.c.a.w.a.ERA) == j2 ? this : u(1 - this.f9700b);
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
        }
        return (n) iVar.adjustInto(this, j2);
    }
}

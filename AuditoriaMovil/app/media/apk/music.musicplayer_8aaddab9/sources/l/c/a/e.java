package l.c.a;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class e extends l.c.a.t.b implements l.c.a.w.d, l.c.a.w.f, Serializable {
    public static final e a = j0(-999999999, 1, 1);

    /* renamed from: b  reason: collision with root package name */
    public static final e f9676b = j0(999999999, 12, 31);

    /* renamed from: c  reason: collision with root package name */
    public final int f9677c;

    /* renamed from: d  reason: collision with root package name */
    public final short f9678d;

    /* renamed from: e  reason: collision with root package name */
    public final short f9679e;

    public e(int i2, int i3, int i4) {
        this.f9677c = i2;
        this.f9678d = (short) i3;
        this.f9679e = (short) i4;
    }

    public static e P(int i2, h hVar, int i3) {
        if (i3 <= 28 || i3 <= hVar.length(l.c.a.t.m.f9736c.K(i2))) {
            return new e(i2, hVar.getValue(), i3);
        }
        if (i3 == 29) {
            throw new a(e.a.d.a.a.f("Invalid date 'February 29' as '", i2, "' is not a leap year"));
        }
        StringBuilder y = e.a.d.a.a.y("Invalid date '");
        y.append(hVar.name());
        y.append(" ");
        y.append(i3);
        y.append("'");
        throw new a(y.toString());
    }

    public static e T(l.c.a.w.e eVar) {
        e eVar2 = (e) eVar.query(l.c.a.w.j.f9813f);
        if (eVar2 != null) {
            return eVar2;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static e j0(int i2, int i3, int i4) {
        l.c.a.w.a.YEAR.checkValidValue(i2);
        l.c.a.w.a.MONTH_OF_YEAR.checkValidValue(i3);
        l.c.a.w.a.DAY_OF_MONTH.checkValidValue(i4);
        return P(i2, h.of(i3), i4);
    }

    public static e k0(int i2, h hVar, int i3) {
        l.c.a.w.a.YEAR.checkValidValue(i2);
        w.k0(hVar, "month");
        l.c.a.w.a.DAY_OF_MONTH.checkValidValue(i3);
        return P(i2, hVar, i3);
    }

    public static e l0(long j2) {
        long j3;
        l.c.a.w.a.EPOCH_DAY.checkValidValue(j2);
        long j4 = (j2 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        return new e(l.c.a.w.a.YEAR.checkValidIntValue(j6 + j3 + (i3 / 10)), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static e r0(int i2, int i3, int i4) {
        if (i3 == 2) {
            i4 = Math.min(i4, l.c.a.t.m.f9736c.K((long) i2) ? 29 : 28);
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i4 = Math.min(i4, 30);
        }
        return j0(i2, i3, i4);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 3, this);
    }

    @Override // l.c.a.t.b
    public long G() {
        long j2;
        long j3 = this.f9677c;
        long j4 = this.f9678d;
        long j5 = (365 * j3) + 0;
        if (j3 >= 0) {
            j2 = ((j3 + 399) / 400) + (((3 + j3) / 4) - ((99 + j3) / 100)) + j5;
        } else {
            j2 = j5 - ((j3 / (-400)) + ((j3 / (-4)) - (j3 / (-100))));
        }
        long j6 = (((367 * j4) - 362) / 12) + j2 + (this.f9679e - 1);
        if (j4 > 2) {
            j6--;
            if (!e0()) {
                j6--;
            }
        }
        return j6 - 719528;
    }

    public int M(e eVar) {
        int i2 = this.f9677c - eVar.f9677c;
        if (i2 == 0) {
            int i3 = this.f9678d - eVar.f9678d;
            return i3 == 0 ? this.f9679e - eVar.f9679e : i3;
        }
        return i2;
    }

    public long Q(e eVar) {
        return eVar.G() - G();
    }

    public final int W(l.c.a.w.i iVar) {
        switch (((l.c.a.w.a) iVar).ordinal()) {
            case 15:
                return a0().getValue();
            case 16:
                return ((this.f9679e - 1) % 7) + 1;
            case 17:
                return ((b0() - 1) % 7) + 1;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return this.f9679e;
            case 19:
                return b0();
            case 20:
                throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((this.f9679e - 1) / 7) + 1;
            case 22:
                return ((b0() - 1) / 7) + 1;
            case ConnectionResult.API_DISABLED /* 23 */:
                return this.f9678d;
            case 24:
                throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
            case 25:
                int i2 = this.f9677c;
                return i2 >= 1 ? i2 : 1 - i2;
            case 26:
                return this.f9677c;
            case 27:
                return this.f9677c >= 1 ? 1 : 0;
            default:
                throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
    }

    public b a0() {
        return b.of(w.H(G() + 3, 7) + 1);
    }

    @Override // l.c.a.t.b, l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return super.adjustInto(dVar);
    }

    public int b0() {
        return (h.of(this.f9678d).firstDayOfYear(e0()) + this.f9679e) - 1;
    }

    public final long c0() {
        return (this.f9677c * 12) + (this.f9678d - 1);
    }

    public boolean d0(l.c.a.t.b bVar) {
        return bVar instanceof e ? M((e) bVar) < 0 : G() < bVar.G();
    }

    public boolean e0() {
        return l.c.a.t.m.f9736c.K(this.f9677c);
    }

    @Override // l.c.a.t.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && M((e) obj) == 0;
    }

    public int f0() {
        short s = this.f9678d;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : e0() ? 29 : 28;
    }

    @Override // l.c.a.t.b
    /* renamed from: g0 */
    public e z(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? h(Long.MAX_VALUE, lVar).h(1L, lVar) : h(-j2, lVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? W(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.EPOCH_DAY ? G() : iVar == l.c.a.w.a.PROLEPTIC_MONTH ? c0() : W(iVar) : iVar.getFrom(this);
    }

    public e h0(long j2) {
        return j2 == Long.MIN_VALUE ? n0(Long.MAX_VALUE).n0(1L) : n0(-j2);
    }

    @Override // l.c.a.t.b
    public int hashCode() {
        int i2 = this.f9677c;
        return (((i2 << 11) + (this.f9678d << 6)) + this.f9679e) ^ (i2 & (-2048));
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        e T = T(dVar);
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 7:
                    return Q(T);
                case 8:
                    return Q(T) / 7;
                case 9:
                    return i0(T);
                case 10:
                    return i0(T) / 12;
                case 11:
                    return i0(T) / 120;
                case 12:
                    return i0(T) / 1200;
                case 13:
                    return i0(T) / 12000;
                case 14:
                    l.c.a.w.a aVar = l.c.a.w.a.ERA;
                    return T.getLong(aVar) - getLong(aVar);
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, T);
    }

    public final long i0(e eVar) {
        return (((eVar.c0() * 32) + eVar.f9679e) - ((c0() * 32) + this.f9679e)) / 32;
    }

    @Override // l.c.a.t.b, l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return super.isSupported(iVar);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: m0 */
    public e h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 7:
                    return n0(j2);
                case 8:
                    return p0(j2);
                case 9:
                    return o0(j2);
                case 10:
                    return q0(j2);
                case 11:
                    return q0(w.p0(j2, 10));
                case 12:
                    return q0(w.p0(j2, 100));
                case 13:
                    return q0(w.p0(j2, 1000));
                case 14:
                    l.c.a.w.a aVar = l.c.a.w.a.ERA;
                    return a(aVar, w.n0(getLong(aVar), j2));
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return (e) lVar.addTo(this, j2);
    }

    public e n0(long j2) {
        return j2 == 0 ? this : l0(w.n0(G(), j2));
    }

    public e o0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f9677c * 12) + (this.f9678d - 1) + j2;
        return r0(l.c.a.w.a.YEAR.checkValidIntValue(w.G(j3, 12L)), w.H(j3, 12) + 1, this.f9679e);
    }

    public e p0(long j2) {
        return n0(w.p0(j2, 7));
    }

    public e q0(long j2) {
        return j2 == 0 ? this : r0(l.c.a.w.a.YEAR.checkValidIntValue(this.f9677c + j2), this.f9678d, this.f9679e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.c.a.t.b, l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return kVar == l.c.a.w.j.f9813f ? this : (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            if (aVar.isDateBased()) {
                int ordinal = aVar.ordinal();
                if (ordinal != 18) {
                    if (ordinal == 19) {
                        return l.c.a.w.n.f(1L, e0() ? 366 : 365);
                    } else if (ordinal == 21) {
                        return l.c.a.w.n.f(1L, (h.of(this.f9678d) != h.FEBRUARY || e0()) ? 5L : 4L);
                    } else if (ordinal != 25) {
                        return iVar.range();
                    } else {
                        return l.c.a.w.n.f(1L, this.f9677c <= 0 ? 1000000000L : 999999999L);
                    }
                }
                return l.c.a.w.n.f(1L, f0());
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: s0 */
    public e b(l.c.a.w.f fVar) {
        return fVar instanceof e ? (e) fVar : (e) fVar.adjustInto(this);
    }

    @Override // l.c.a.t.b
    public l.c.a.t.c t(g gVar) {
        return f.b0(this, gVar);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: t0 */
    public e a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            switch (aVar.ordinal()) {
                case 15:
                    return n0(j2 - a0().getValue());
                case 16:
                    return n0(j2 - getLong(l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 17:
                    return n0(j2 - getLong(l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    int i2 = (int) j2;
                    return this.f9679e == i2 ? this : j0(this.f9677c, this.f9678d, i2);
                case 19:
                    return u0((int) j2);
                case 20:
                    return l0(j2);
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    return p0(j2 - getLong(l.c.a.w.a.ALIGNED_WEEK_OF_MONTH));
                case 22:
                    return p0(j2 - getLong(l.c.a.w.a.ALIGNED_WEEK_OF_YEAR));
                case ConnectionResult.API_DISABLED /* 23 */:
                    int i3 = (int) j2;
                    if (this.f9678d == i3) {
                        return this;
                    }
                    l.c.a.w.a.MONTH_OF_YEAR.checkValidValue(i3);
                    return r0(this.f9677c, i3, this.f9679e);
                case 24:
                    return o0(j2 - getLong(l.c.a.w.a.PROLEPTIC_MONTH));
                case 25:
                    if (this.f9677c < 1) {
                        j2 = 1 - j2;
                    }
                    return v0((int) j2);
                case 26:
                    return v0((int) j2);
                case 27:
                    return getLong(l.c.a.w.a.ERA) == j2 ? this : v0(1 - this.f9677c);
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
        }
        return (e) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.t.b
    public String toString() {
        int i2 = this.f9677c;
        short s = this.f9678d;
        short s2 = this.f9679e;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // l.c.a.t.b, java.lang.Comparable
    /* renamed from: u */
    public int compareTo(l.c.a.t.b bVar) {
        return bVar instanceof e ? M((e) bVar) : super.compareTo(bVar);
    }

    public e u0(int i2) {
        if (b0() == i2) {
            return this;
        }
        int i3 = this.f9677c;
        long j2 = i3;
        l.c.a.w.a.YEAR.checkValidValue(j2);
        l.c.a.w.a.DAY_OF_YEAR.checkValidValue(i2);
        boolean K = l.c.a.t.m.f9736c.K(j2);
        if (i2 != 366 || K) {
            h of = h.of(((i2 - 1) / 31) + 1);
            if (i2 > (of.length(K) + of.firstDayOfYear(K)) - 1) {
                of = of.plus(1L);
            }
            return P(i3, of, (i2 - of.firstDayOfYear(K)) + 1);
        }
        throw new a(e.a.d.a.a.f("Invalid date 'DayOfYear 366' as '", i3, "' is not a leap year"));
    }

    @Override // l.c.a.t.b
    public l.c.a.t.h v() {
        return l.c.a.t.m.f9736c;
    }

    public e v0(int i2) {
        if (this.f9677c == i2) {
            return this;
        }
        l.c.a.w.a.YEAR.checkValidValue(i2);
        return r0(i2, this.f9678d, this.f9679e);
    }

    @Override // l.c.a.t.b
    public l.c.a.t.i y() {
        return super.y();
    }
}

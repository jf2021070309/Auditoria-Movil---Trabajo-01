package l.c.a;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.ConnectionResult;
import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class o extends l.c.a.v.c implements l.c.a.w.d, l.c.a.w.f, Comparable<o>, Serializable {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f9701b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9702c;

    static {
        l.c.a.u.b i2 = new l.c.a.u.b().i(l.c.a.w.a.YEAR, 4, 10, l.c.a.u.j.EXCEEDS_PAD);
        i2.c(CoreConstants.DASH_CHAR);
        i2.h(l.c.a.w.a.MONTH_OF_YEAR, 2);
        i2.l();
    }

    public o(int i2, int i3) {
        this.f9701b = i2;
        this.f9702c = i3;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static o t(l.c.a.w.e eVar) {
        if (eVar instanceof o) {
            return (o) eVar;
        }
        try {
            if (!l.c.a.t.m.f9736c.equals(l.c.a.t.h.u(eVar))) {
                eVar = e.T(eVar);
            }
            l.c.a.w.a aVar = l.c.a.w.a.YEAR;
            int i2 = eVar.get(aVar);
            l.c.a.w.a aVar2 = l.c.a.w.a.MONTH_OF_YEAR;
            int i3 = eVar.get(aVar2);
            aVar.checkValidValue(i2);
            aVar2.checkValidValue(i3);
            return new o(i2, i3);
        } catch (a unused) {
            throw new a("Unable to obtain YearMonth from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new m((byte) 68, this);
    }

    public final o B(int i2, int i3) {
        return (this.f9701b == i2 && this.f9702c == i3) ? this : new o(i2, i3);
    }

    @Override // l.c.a.w.d
    /* renamed from: G */
    public o a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            switch (aVar.ordinal()) {
                case ConnectionResult.API_DISABLED /* 23 */:
                    int i2 = (int) j2;
                    l.c.a.w.a.MONTH_OF_YEAR.checkValidValue(i2);
                    return B(this.f9701b, i2);
                case 24:
                    return y(j2 - getLong(l.c.a.w.a.PROLEPTIC_MONTH));
                case 25:
                    if (this.f9701b < 1) {
                        j2 = 1 - j2;
                    }
                    return I((int) j2);
                case 26:
                    return I((int) j2);
                case 27:
                    return getLong(l.c.a.w.a.ERA) == j2 ? this : I(1 - this.f9701b);
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
        }
        return (o) iVar.adjustInto(this, j2);
    }

    public o I(int i2) {
        l.c.a.w.a.YEAR.checkValidValue(i2);
        return B(i2, this.f9702c);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        if (l.c.a.t.h.u(dVar).equals(l.c.a.t.m.f9736c)) {
            return dVar.a(l.c.a.w.a.PROLEPTIC_MONTH, u());
        }
        throw new a("Adjustment only supported on ISO date-time");
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (o) fVar.adjustInto(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(o oVar) {
        o oVar2 = oVar;
        int i2 = this.f9701b - oVar2.f9701b;
        return i2 == 0 ? this.f9702c - oVar2.f9702c : i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f9701b == oVar.f9701b && this.f9702c == oVar.f9702c;
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
        int i2;
        if (iVar instanceof l.c.a.w.a) {
            switch (((l.c.a.w.a) iVar).ordinal()) {
                case ConnectionResult.API_DISABLED /* 23 */:
                    i2 = this.f9702c;
                    break;
                case 24:
                    return u();
                case 25:
                    int i3 = this.f9701b;
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                case 26:
                    i2 = this.f9701b;
                    break;
                case 27:
                    return this.f9701b < 1 ? 0 : 1;
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
            return i2;
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        return this.f9701b ^ (this.f9702c << 27);
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        o t = t(dVar);
        if (lVar instanceof l.c.a.w.b) {
            long u = t.u() - u();
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 9:
                    return u;
                case 10:
                    return u / 12;
                case 11:
                    return u / 120;
                case 12:
                    return u / 1200;
                case 13:
                    return u / 12000;
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
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.YEAR || iVar == l.c.a.w.a.MONTH_OF_YEAR || iVar == l.c.a.w.a.PROLEPTIC_MONTH || iVar == l.c.a.w.a.YEAR_OF_ERA || iVar == l.c.a.w.a.ERA : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9809b) {
            return (R) l.c.a.t.m.f9736c;
        }
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.MONTHS;
        }
        if (kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.YEAR_OF_ERA) {
            return l.c.a.w.n.f(1L, this.f9701b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(iVar);
    }

    public String toString() {
        int abs = Math.abs(this.f9701b);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i2 = this.f9701b;
            if (i2 < 0) {
                sb.append(i2 - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i2 + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f9701b);
        }
        sb.append(this.f9702c < 10 ? "-0" : "-");
        sb.append(this.f9702c);
        return sb.toString();
    }

    public final long u() {
        return (this.f9701b * 12) + (this.f9702c - 1);
    }

    @Override // l.c.a.w.d
    /* renamed from: v */
    public o h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 9:
                    return y(j2);
                case 10:
                    return z(j2);
                case 11:
                    return z(w.p0(j2, 10));
                case 12:
                    return z(w.p0(j2, 100));
                case 13:
                    return z(w.p0(j2, 1000));
                case 14:
                    l.c.a.w.a aVar = l.c.a.w.a.ERA;
                    return a(aVar, w.n0(getLong(aVar), j2));
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return (o) lVar.addTo(this, j2);
    }

    public o y(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f9701b * 12) + (this.f9702c - 1) + j2;
        return B(l.c.a.w.a.YEAR.checkValidIntValue(w.G(j3, 12L)), w.H(j3, 12) + 1);
    }

    public o z(long j2) {
        return j2 == 0 ? this : B(l.c.a.w.a.YEAR.checkValidIntValue(this.f9701b + j2), this.f9702c);
    }
}

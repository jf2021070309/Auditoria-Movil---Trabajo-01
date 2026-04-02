package l.c.a;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Locale;
/* loaded from: classes2.dex */
public enum h implements l.c.a.w.e, l.c.a.w.f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    public static final l.c.a.w.k<h> FROM = new l.c.a.w.k<h>() { // from class: l.c.a.h.a
        @Override // l.c.a.w.k
        public h a(l.c.a.w.e eVar) {
            return h.from(eVar);
        }
    };
    private static final h[] ENUMS = values();

    public static h from(l.c.a.w.e eVar) {
        if (eVar instanceof h) {
            return (h) eVar;
        }
        try {
            if (!l.c.a.t.m.f9736c.equals(l.c.a.t.h.u(eVar))) {
                eVar = e.T(eVar);
            }
            return of(eVar.get(l.c.a.w.a.MONTH_OF_YEAR));
        } catch (l.c.a.a e2) {
            throw new l.c.a.a("Unable to obtain Month from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    public static h of(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new l.c.a.a(e.a.d.a.a.e("Invalid value for MonthOfYear: ", i2));
        }
        return ENUMS[i2 - 1];
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        if (l.c.a.t.h.u(dVar).equals(l.c.a.t.m.f9736c)) {
            return dVar.a(l.c.a.w.a.MONTH_OF_YEAR, getValue());
        }
        throw new l.c.a.a("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + 121;
            case 5:
                return (z ? 1 : 0) + SyslogConstants.LOG_LOCAL3;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public h firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar == l.c.a.w.a.MONTH_OF_YEAR ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(l.c.a.u.l lVar, Locale locale) {
        l.c.a.u.b bVar = new l.c.a.u.b();
        bVar.f(l.c.a.w.a.MONTH_OF_YEAR, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.MONTH_OF_YEAR : iVar != null && iVar.isSupportedBy(this);
    }

    public int length(boolean z) {
        int ordinal = ordinal();
        return ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    public int maxLength() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 28;
    }

    public h minus(long j2) {
        return plus(-(j2 % 12));
    }

    public h plus(long j2) {
        return ENUMS[((((int) (j2 % 12)) + 12) + ordinal()) % 12];
    }

    @Override // l.c.a.w.e
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
        return kVar.a(this);
    }

    @Override // l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.MONTH_OF_YEAR) {
            return iVar.range();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }
}

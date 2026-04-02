package l.c.a;

import java.util.Locale;
/* loaded from: classes2.dex */
public enum b implements l.c.a.w.e, l.c.a.w.f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public static final l.c.a.w.k<b> FROM = new l.c.a.w.k<b>() { // from class: l.c.a.b.a
        @Override // l.c.a.w.k
        public b a(l.c.a.w.e eVar) {
            return b.from(eVar);
        }
    };
    private static final b[] ENUMS = values();

    public static b from(l.c.a.w.e eVar) {
        if (eVar instanceof b) {
            return (b) eVar;
        }
        try {
            return of(eVar.get(l.c.a.w.a.DAY_OF_WEEK));
        } catch (l.c.a.a e2) {
            throw new l.c.a.a("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    public static b of(int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new l.c.a.a(e.a.d.a.a.e("Invalid value for DayOfWeek: ", i2));
        }
        return ENUMS[i2 - 1];
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.DAY_OF_WEEK, getValue());
    }

    @Override // l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar == l.c.a.w.a.DAY_OF_WEEK ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(l.c.a.u.l lVar, Locale locale) {
        l.c.a.u.b bVar = new l.c.a.u.b();
        bVar.f(l.c.a.w.a.DAY_OF_WEEK, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.DAY_OF_WEEK) {
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
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.DAY_OF_WEEK : iVar != null && iVar.isSupportedBy(this);
    }

    public b minus(long j2) {
        return plus(-(j2 % 7));
    }

    public b plus(long j2) {
        return ENUMS[((((int) (j2 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.DAYS;
        }
        if (kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.DAY_OF_WEEK) {
            return iVar.range();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }
}

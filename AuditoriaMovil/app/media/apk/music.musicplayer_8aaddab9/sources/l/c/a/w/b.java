package l.c.a.w;
/* loaded from: classes2.dex */
public enum b implements l {
    NANOS("Nanos", l.c.a.c.b(1)),
    MICROS("Micros", l.c.a.c.b(1000)),
    MILLIS("Millis", l.c.a.c.b(1000000)),
    SECONDS("Seconds", l.c.a.c.f(1)),
    MINUTES("Minutes", l.c.a.c.f(60)),
    HOURS("Hours", l.c.a.c.f(3600)),
    HALF_DAYS("HalfDays", l.c.a.c.f(43200)),
    DAYS("Days", l.c.a.c.f(86400)),
    WEEKS("Weeks", l.c.a.c.f(604800)),
    MONTHS("Months", l.c.a.c.f(2629746)),
    YEARS("Years", l.c.a.c.f(31556952)),
    DECADES("Decades", l.c.a.c.f(315569520)),
    CENTURIES("Centuries", l.c.a.c.f(3155695200L)),
    MILLENNIA("Millennia", l.c.a.c.f(31556952000L)),
    ERAS("Eras", l.c.a.c.f(31556952000000000L)),
    FOREVER("Forever", l.c.a.c.h(Long.MAX_VALUE, 999999999));
    
    private final l.c.a.c duration;
    private final String name;

    b(String str, l.c.a.c cVar) {
        this.name = str;
        this.duration = cVar;
    }

    @Override // l.c.a.w.l
    public <R extends d> R addTo(R r, long j2) {
        return (R) r.h(j2, this);
    }

    @Override // l.c.a.w.l
    public long between(d dVar, d dVar2) {
        return dVar.i(dVar2, this);
    }

    public l.c.a.c getDuration() {
        return this.duration;
    }

    @Override // l.c.a.w.l
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isSupportedBy(d dVar) {
        if (this == FOREVER) {
            return false;
        }
        if (dVar instanceof l.c.a.t.b) {
            return isDateBased();
        }
        if ((dVar instanceof l.c.a.t.c) || (dVar instanceof l.c.a.t.f)) {
            return true;
        }
        try {
            dVar.h(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                dVar.h(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}

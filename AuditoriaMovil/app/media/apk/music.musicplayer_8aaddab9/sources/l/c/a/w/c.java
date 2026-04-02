package l.c.a.w;

import e.j.d.w;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public final class c {
    public static final i a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f9804b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f9805c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f9806d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f9807e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static abstract class b implements i {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final b QUARTER_OF_YEAR;
        public static final b WEEK_BASED_YEAR;
        public static final b WEEK_OF_WEEK_BASED_YEAR;

        /* loaded from: classes2.dex */
        public enum a extends b {
            public a(String str, int i2) {
                super(str, i2);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public <R extends l.c.a.w.d> R adjustInto(R r, long j2) {
                long from = getFrom(r);
                range().b(j2, this);
                l.c.a.w.a aVar = l.c.a.w.a.DAY_OF_YEAR;
                return (R) r.a(aVar, (j2 - from) + r.getLong(aVar));
            }

            @Override // l.c.a.w.c.b
            public l getBaseUnit() {
                return l.c.a.w.b.DAYS;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return eVar.get(l.c.a.w.a.DAY_OF_YEAR) - b.QUARTER_DAYS[((eVar.get(l.c.a.w.a.MONTH_OF_YEAR) - 1) / 3) + (l.c.a.t.m.f9736c.K(eVar.getLong(l.c.a.w.a.YEAR)) ? 4 : 0)];
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            @Override // l.c.a.w.c.b
            public l getRangeUnit() {
                return c.f9807e;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(l.c.a.w.a.DAY_OF_YEAR) && eVar.isSupported(l.c.a.w.a.MONTH_OF_YEAR) && eVar.isSupported(l.c.a.w.a.YEAR) && b.isIso(eVar);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n range() {
                return n.h(1L, 90L, 92L);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n rangeRefinedBy(e eVar) {
                if (eVar.isSupported(this)) {
                    long j2 = eVar.getLong(b.QUARTER_OF_YEAR);
                    if (j2 == 1) {
                        return l.c.a.t.m.f9736c.K(eVar.getLong(l.c.a.w.a.YEAR)) ? n.f(1L, 91L) : n.f(1L, 90L);
                    }
                    return j2 == 2 ? n.f(1L, 91L) : (j2 == 3 || j2 == 4) ? n.f(1L, 92L) : range();
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
                if (r2 == 2) goto L19;
             */
            @Override // l.c.a.w.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public l.c.a.w.e resolve(java.util.Map<l.c.a.w.i, java.lang.Long> r13, l.c.a.w.e r14, l.c.a.u.i r15) {
                /*
                    r12 = this;
                    l.c.a.w.a r14 = l.c.a.w.a.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    l.c.a.w.c$b r1 = l.c.a.w.c.b.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L9e
                    if (r2 != 0) goto L16
                    goto L9e
                L16:
                    long r3 = r0.longValue()
                    int r0 = r14.checkValidIntValue(r3)
                    l.c.a.w.c$b r3 = l.c.a.w.c.b.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    l.c.a.u.i r5 = l.c.a.u.i.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L4f
                    long r10 = r2.longValue()
                    l.c.a.e r15 = l.c.a.e.j0(r0, r9, r9)
                    long r9 = e.j.d.w.r0(r10, r7)
                    long r5 = e.j.d.w.p0(r9, r6)
                    l.c.a.e r15 = r15.o0(r5)
                    long r2 = e.j.d.w.r0(r3, r7)
                    l.c.a.e r15 = r15.n0(r2)
                    goto L94
                L4f:
                    l.c.a.w.n r5 = r1.range()
                    long r10 = r2.longValue()
                    int r2 = r5.a(r10, r1)
                    l.c.a.u.i r5 = l.c.a.u.i.STRICT
                    if (r15 != r5) goto L80
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L72
                    l.c.a.t.m r15 = l.c.a.t.m.f9736c
                    long r10 = (long) r0
                    boolean r15 = r15.K(r10)
                    if (r15 == 0) goto L6f
                    goto L75
                L6f:
                    r15 = 90
                    goto L77
                L72:
                    r10 = 2
                    if (r2 != r10) goto L77
                L75:
                    r15 = 91
                L77:
                    long r10 = (long) r15
                    l.c.a.w.n r15 = l.c.a.w.n.f(r7, r10)
                    r15.b(r3, r12)
                    goto L87
                L80:
                    l.c.a.w.n r15 = r12.range()
                    r15.b(r3, r12)
                L87:
                    int r2 = r2 - r9
                    int r2 = r2 * 3
                    int r2 = r2 + r9
                    l.c.a.e r15 = l.c.a.e.j0(r0, r2, r9)
                    long r3 = r3 - r7
                    l.c.a.e r15 = r15.n0(r3)
                L94:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L9e:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: l.c.a.w.c.b.a.resolve(java.util.Map, l.c.a.w.e, l.c.a.u.i):l.c.a.w.e");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* renamed from: l.c.a.w.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum C0215b extends b {
            public C0215b(String str, int i2) {
                super(str, i2);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public <R extends l.c.a.w.d> R adjustInto(R r, long j2) {
                long from = getFrom(r);
                range().b(j2, this);
                l.c.a.w.a aVar = l.c.a.w.a.MONTH_OF_YEAR;
                return (R) r.a(aVar, ((j2 - from) * 3) + r.getLong(aVar));
            }

            @Override // l.c.a.w.c.b
            public l getBaseUnit() {
                return c.f9807e;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return (eVar.getLong(l.c.a.w.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new m("Unsupported field: QuarterOfYear");
            }

            @Override // l.c.a.w.c.b
            public l getRangeUnit() {
                return l.c.a.w.b.YEARS;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(l.c.a.w.a.MONTH_OF_YEAR) && b.isIso(eVar);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n range() {
                return n.f(1L, 4L);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n rangeRefinedBy(e eVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* renamed from: l.c.a.w.c$b$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum C0216c extends b {
            public C0216c(String str, int i2) {
                super(str, i2);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public <R extends l.c.a.w.d> R adjustInto(R r, long j2) {
                range().b(j2, this);
                return (R) r.h(w.r0(j2, getFrom(r)), l.c.a.w.b.WEEKS);
            }

            @Override // l.c.a.w.c.b
            public l getBaseUnit() {
                return l.c.a.w.b.WEEKS;
            }

            @Override // l.c.a.w.c.b
            public String getDisplayName(Locale locale) {
                w.k0(locale, "locale");
                return "Week";
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeek(l.c.a.e.T(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // l.c.a.w.c.b
            public l getRangeUnit() {
                return c.f9806d;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(l.c.a.w.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n range() {
                return n.h(1L, 52L, 53L);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n rangeRefinedBy(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekRange(l.c.a.e.T(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // l.c.a.w.c.b
            public e resolve(Map<i, Long> map, e eVar, l.c.a.u.i iVar) {
                i iVar2;
                l.c.a.e a;
                i iVar3 = b.WEEK_BASED_YEAR;
                Long l2 = map.get(iVar3);
                l.c.a.w.a aVar = l.c.a.w.a.DAY_OF_WEEK;
                Long l3 = map.get(aVar);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int a2 = iVar3.range().a(l2.longValue(), iVar3);
                long longValue = map.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (iVar == l.c.a.u.i.LENIENT) {
                    long longValue2 = l3.longValue();
                    long j2 = 0;
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j2 = j3 / 7;
                        longValue2 = (j3 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j2 = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    iVar2 = iVar3;
                    a = l.c.a.e.j0(a2, 1, 4).p0(longValue - 1).p0(j2).a(aVar, longValue2);
                } else {
                    iVar2 = iVar3;
                    int checkValidIntValue = aVar.checkValidIntValue(l3.longValue());
                    if (iVar == l.c.a.u.i.STRICT) {
                        b.getWeekRange(l.c.a.e.j0(a2, 1, 4)).b(longValue, this);
                    } else {
                        range().b(longValue, this);
                    }
                    a = l.c.a.e.j0(a2, 1, 4).p0(longValue - 1).a(aVar, checkValidIntValue);
                }
                map.remove(this);
                map.remove(iVar2);
                map.remove(aVar);
                return a;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* loaded from: classes2.dex */
        public enum d extends b {
            public d(String str, int i2) {
                super(str, i2);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public <R extends l.c.a.w.d> R adjustInto(R r, long j2) {
                if (isSupportedBy(r)) {
                    int a = range().a(j2, b.WEEK_BASED_YEAR);
                    l.c.a.e T = l.c.a.e.T(r);
                    l.c.a.w.a aVar = l.c.a.w.a.DAY_OF_WEEK;
                    int i2 = T.get(aVar);
                    int week = b.getWeek(T);
                    if (week == 53 && b.getWeekRange(a) == 52) {
                        week = 52;
                    }
                    l.c.a.e j0 = l.c.a.e.j0(a, 1, 4);
                    return (R) r.b(j0.n0(((week - 1) * 7) + (i2 - j0.get(aVar))));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // l.c.a.w.c.b
            public l getBaseUnit() {
                return c.f9806d;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekBasedYear(l.c.a.e.T(eVar));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // l.c.a.w.c.b
            public l getRangeUnit() {
                return l.c.a.w.b.FOREVER;
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(l.c.a.w.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n range() {
                return l.c.a.w.a.YEAR.range();
            }

            @Override // l.c.a.w.c.b, l.c.a.w.i
            public n rangeRefinedBy(e eVar) {
                return l.c.a.w.a.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            DAY_OF_QUARTER = aVar;
            C0215b c0215b = new C0215b("QUARTER_OF_YEAR", 1);
            QUARTER_OF_YEAR = c0215b;
            C0216c c0216c = new C0216c("WEEK_OF_WEEK_BASED_YEAR", 2);
            WEEK_OF_WEEK_BASED_YEAR = c0216c;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            WEEK_BASED_YEAR = dVar;
            $VALUES = new b[]{aVar, c0215b, c0216c, dVar};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b(String str, int i2) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(l.c.a.e eVar) {
            int ordinal = eVar.a0().ordinal();
            int b0 = eVar.b0() - 1;
            int i2 = (3 - ordinal) + b0;
            int i3 = (i2 - ((i2 / 7) * 7)) - 3;
            if (i3 < -3) {
                i3 += 7;
            }
            if (b0 < i3) {
                return (int) getWeekRange(eVar.u0(180).q0(-1L)).f9817d;
            }
            int i4 = ((b0 - i3) / 7) + 1;
            if (i4 == 53) {
                if (!(i3 == -3 || (i3 == -2 && eVar.e0()))) {
                    return 1;
                }
            }
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(l.c.a.e eVar) {
            int i2 = eVar.f9677c;
            int b0 = eVar.b0();
            if (b0 <= 3) {
                return b0 - eVar.a0().ordinal() < -2 ? i2 - 1 : i2;
            } else if (b0 >= 363) {
                return ((b0 - 363) - (eVar.e0() ? 1 : 0)) - eVar.a0().ordinal() >= 0 ? i2 + 1 : i2;
            } else {
                return i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i2) {
            l.c.a.e j0 = l.c.a.e.j0(i2, 1, 1);
            if (j0.a0() != l.c.a.b.THURSDAY) {
                return (j0.a0() == l.c.a.b.WEDNESDAY && j0.e0()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static n getWeekRange(l.c.a.e eVar) {
            return n.f(1L, getWeekRange(getWeekBasedYear(eVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(e eVar) {
            return l.c.a.t.h.u(eVar).equals(l.c.a.t.m.f9736c);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // l.c.a.w.i
        public abstract /* synthetic */ <R extends l.c.a.w.d> R adjustInto(R r, long j2);

        public abstract /* synthetic */ l getBaseUnit();

        public String getDisplayName(Locale locale) {
            w.k0(locale, "locale");
            return toString();
        }

        @Override // l.c.a.w.i
        public abstract /* synthetic */ long getFrom(e eVar);

        public abstract /* synthetic */ l getRangeUnit();

        @Override // l.c.a.w.i
        public boolean isDateBased() {
            return true;
        }

        @Override // l.c.a.w.i
        public abstract /* synthetic */ boolean isSupportedBy(e eVar);

        @Override // l.c.a.w.i
        public boolean isTimeBased() {
            return false;
        }

        @Override // l.c.a.w.i
        public abstract /* synthetic */ n range();

        @Override // l.c.a.w.i
        public abstract /* synthetic */ n rangeRefinedBy(e eVar);

        public e resolve(Map<i, Long> map, e eVar, l.c.a.u.i iVar) {
            return null;
        }
    }

    /* renamed from: l.c.a.w.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0217c implements l {
        WEEK_BASED_YEARS("WeekBasedYears", l.c.a.c.f(31556952)),
        QUARTER_YEARS("QuarterYears", l.c.a.c.f(7889238));
        
        private final l.c.a.c duration;
        private final String name;

        EnumC0217c(String str, l.c.a.c cVar) {
            this.name = str;
            this.duration = cVar;
        }

        @Override // l.c.a.w.l
        public <R extends d> R addTo(R r, long j2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                i iVar = c.f9805c;
                return (R) r.a(iVar, w.n0(r.get(iVar), j2));
            } else if (ordinal == 1) {
                return (R) r.h(j2 / 256, l.c.a.w.b.YEARS).h((j2 % 256) * 3, l.c.a.w.b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // l.c.a.w.l
        public long between(d dVar, d dVar2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                i iVar = c.f9805c;
                return w.r0(dVar2.getLong(iVar), dVar.getLong(iVar));
            } else if (ordinal == 1) {
                return dVar.i(dVar2, l.c.a.w.b.MONTHS) / 3;
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public l.c.a.c getDuration() {
            return this.duration;
        }

        @Override // l.c.a.w.l
        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isSupportedBy(d dVar) {
            return dVar.isSupported(l.c.a.w.a.EPOCH_DAY);
        }

        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    static {
        b bVar = b.DAY_OF_QUARTER;
        a = b.QUARTER_OF_YEAR;
        f9804b = b.WEEK_OF_WEEK_BASED_YEAR;
        f9805c = b.WEEK_BASED_YEAR;
        f9806d = EnumC0217c.WEEK_BASED_YEARS;
        f9807e = EnumC0217c.QUARTER_YEARS;
    }
}

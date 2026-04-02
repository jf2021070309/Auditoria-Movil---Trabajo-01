package l.c.a.t;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public final class o extends h implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale f9737c = new Locale("ja", "JP", "JP");

    /* renamed from: d  reason: collision with root package name */
    public static final o f9738d = new o();

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, String[]> f9739e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, String[]> f9740f;

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String[]> f9741g;

    static {
        HashMap hashMap = new HashMap();
        f9739e = hashMap;
        HashMap hashMap2 = new HashMap();
        f9740f = hashMap2;
        HashMap hashMap3 = new HashMap();
        f9741g = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private Object readResolve() {
        return f9738d;
    }

    @Override // l.c.a.t.h
    public f<p> G(l.c.a.d dVar, l.c.a.p pVar) {
        return g.a0(this, dVar, pVar);
    }

    @Override // l.c.a.t.h
    public f<p> I(l.c.a.w.e eVar) {
        return super.I(eVar);
    }

    public l.c.a.w.n K(l.c.a.w.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 15 && ordinal != 18 && ordinal != 20 && ordinal != 24) {
            switch (ordinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    Calendar calendar = Calendar.getInstance(f9737c);
                    int ordinal2 = aVar.ordinal();
                    int i2 = 0;
                    if (ordinal2 == 19) {
                        q[] y = q.y();
                        int i3 = 366;
                        while (i2 < y.length) {
                            i3 = Math.min(i3, ((y[i2].f9751h.e0() ? 366 : 365) - y[i2].f9751h.b0()) + 1);
                            i2++;
                        }
                        return l.c.a.w.n.h(1L, i3, 366L);
                    } else if (ordinal2 != 23) {
                        switch (ordinal2) {
                            case 25:
                                q[] y2 = q.y();
                                int i4 = (y2[y2.length - 1].t().f9677c - y2[y2.length - 1].f9751h.f9677c) + 1;
                                int i5 = Integer.MAX_VALUE;
                                while (i2 < y2.length) {
                                    i5 = Math.min(i5, (y2[i2].t().f9677c - y2[i2].f9751h.f9677c) + 1);
                                    i2++;
                                }
                                return l.c.a.w.n.i(1L, 6L, i5, i4);
                            case 26:
                                q[] y3 = q.y();
                                return l.c.a.w.n.f(p.a.f9677c, y3[y3.length - 1].t().f9677c);
                            case 27:
                                q[] y4 = q.y();
                                return l.c.a.w.n.f(y4[0].f9750g, y4[y4.length - 1].f9750g);
                            default:
                                throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                        }
                    } else {
                        return l.c.a.w.n.i(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    }
            }
        }
        return aVar.range();
    }

    @Override // l.c.a.t.h
    public b b(l.c.a.w.e eVar) {
        return eVar instanceof p ? (p) eVar : new p(l.c.a.e.T(eVar));
    }

    @Override // l.c.a.t.h
    public i t(int i2) {
        return q.v(i2);
    }

    @Override // l.c.a.t.h
    public String v() {
        return "japanese";
    }

    @Override // l.c.a.t.h
    public String y() {
        return "Japanese";
    }

    @Override // l.c.a.t.h
    public c<p> z(l.c.a.w.e eVar) {
        return super.z(eVar);
    }
}

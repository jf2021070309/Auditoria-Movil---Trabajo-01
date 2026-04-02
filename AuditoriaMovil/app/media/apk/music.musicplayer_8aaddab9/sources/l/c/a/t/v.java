package l.c.a.t;

import java.io.Serializable;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class v extends h implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final v f9755c = new v();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String[]> f9756d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String[]> f9757e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, String[]> f9758f;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f9756d = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f9757e = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f9758f = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private Object readResolve() {
        return f9755c;
    }

    @Override // l.c.a.t.h
    public f<w> G(l.c.a.d dVar, l.c.a.p pVar) {
        return g.a0(this, dVar, pVar);
    }

    @Override // l.c.a.t.h
    public f<w> I(l.c.a.w.e eVar) {
        return super.I(eVar);
    }

    public l.c.a.w.n K(l.c.a.w.a aVar) {
        switch (aVar.ordinal()) {
            case 24:
                l.c.a.w.n range = l.c.a.w.a.PROLEPTIC_MONTH.range();
                return l.c.a.w.n.f(range.a + 6516, range.f9817d + 6516);
            case 25:
                l.c.a.w.n range2 = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.h(1L, (-(range2.a + 543)) + 1, range2.f9817d + 543);
            case 26:
                l.c.a.w.n range3 = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.f(range3.a + 543, range3.f9817d + 543);
            default:
                return aVar.range();
        }
    }

    @Override // l.c.a.t.h
    public b b(l.c.a.w.e eVar) {
        return eVar instanceof w ? (w) eVar : new w(l.c.a.e.T(eVar));
    }

    @Override // l.c.a.t.h
    public i t(int i2) {
        return x.of(i2);
    }

    @Override // l.c.a.t.h
    public String v() {
        return "buddhist";
    }

    @Override // l.c.a.t.h
    public String y() {
        return "ThaiBuddhist";
    }

    @Override // l.c.a.t.h
    public c<w> z(l.c.a.w.e eVar) {
        return super.z(eVar);
    }
}

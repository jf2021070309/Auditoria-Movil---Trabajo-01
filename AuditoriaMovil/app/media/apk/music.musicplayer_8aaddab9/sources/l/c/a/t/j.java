package l.c.a.t;

import java.io.Serializable;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class j extends h implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final j f9719c = new j();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String[]> f9720d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String[]> f9721e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, String[]> f9722f;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f9720d = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f9721e = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f9722f = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private Object readResolve() {
        return f9719c;
    }

    @Override // l.c.a.t.h
    public f<k> G(l.c.a.d dVar, l.c.a.p pVar) {
        return g.a0(this, dVar, pVar);
    }

    @Override // l.c.a.t.h
    public f<k> I(l.c.a.w.e eVar) {
        return super.I(eVar);
    }

    @Override // l.c.a.t.h
    public b b(l.c.a.w.e eVar) {
        return eVar instanceof k ? (k) eVar : new k(eVar.getLong(l.c.a.w.a.EPOCH_DAY));
    }

    @Override // l.c.a.t.h
    public i t(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return l.AH;
            }
            throw new l.c.a.a("invalid Hijrah era");
        }
        return l.BEFORE_AH;
    }

    @Override // l.c.a.t.h
    public String v() {
        return "islamic-umalqura";
    }

    @Override // l.c.a.t.h
    public String y() {
        return "Hijrah-umalqura";
    }

    @Override // l.c.a.t.h
    public c<k> z(l.c.a.w.e eVar) {
        return super.z(eVar);
    }
}

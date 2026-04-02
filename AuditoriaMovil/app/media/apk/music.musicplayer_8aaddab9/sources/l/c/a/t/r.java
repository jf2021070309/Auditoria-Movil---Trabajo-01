package l.c.a.t;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class r extends h implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final r f9753c = new r();

    private Object readResolve() {
        return f9753c;
    }

    @Override // l.c.a.t.h
    public f<s> G(l.c.a.d dVar, l.c.a.p pVar) {
        return g.a0(this, dVar, pVar);
    }

    @Override // l.c.a.t.h
    public f<s> I(l.c.a.w.e eVar) {
        return super.I(eVar);
    }

    public l.c.a.w.n K(l.c.a.w.a aVar) {
        switch (aVar.ordinal()) {
            case 24:
                l.c.a.w.n range = l.c.a.w.a.PROLEPTIC_MONTH.range();
                return l.c.a.w.n.f(range.a - 22932, range.f9817d - 22932);
            case 25:
                l.c.a.w.n range2 = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.h(1L, range2.f9817d - 1911, (-range2.a) + 1 + 1911);
            case 26:
                l.c.a.w.n range3 = l.c.a.w.a.YEAR.range();
                return l.c.a.w.n.f(range3.a - 1911, range3.f9817d - 1911);
            default:
                return aVar.range();
        }
    }

    @Override // l.c.a.t.h
    public b b(l.c.a.w.e eVar) {
        return eVar instanceof s ? (s) eVar : new s(l.c.a.e.T(eVar));
    }

    @Override // l.c.a.t.h
    public i t(int i2) {
        return t.of(i2);
    }

    @Override // l.c.a.t.h
    public String v() {
        return "roc";
    }

    @Override // l.c.a.t.h
    public String y() {
        return "Minguo";
    }

    @Override // l.c.a.t.h
    public c<s> z(l.c.a.w.e eVar) {
        return super.z(eVar);
    }
}

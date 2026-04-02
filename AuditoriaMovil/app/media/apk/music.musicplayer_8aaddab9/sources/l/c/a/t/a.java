package l.c.a.t;

import java.io.Serializable;
import l.c.a.t.b;
/* loaded from: classes2.dex */
public abstract class a<D extends b> extends b implements l.c.a.w.d, l.c.a.w.f, Serializable {
    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: M */
    public a<D> h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 7:
                    return P(j2);
                case 8:
                    return P(e.j.d.w.p0(j2, 7));
                case 9:
                    return Q(j2);
                case 10:
                    return T(j2);
                case 11:
                    return T(e.j.d.w.p0(j2, 10));
                case 12:
                    return T(e.j.d.w.p0(j2, 100));
                case 13:
                    return T(e.j.d.w.p0(j2, 1000));
                default:
                    throw new l.c.a.a(lVar + " not valid for chronology " + v().y());
            }
        }
        return (a) v().f(lVar.addTo(this, j2));
    }

    public abstract a<D> P(long j2);

    public abstract a<D> Q(long j2);

    public abstract a<D> T(long j2);

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        b b2 = v().b(dVar);
        return lVar instanceof l.c.a.w.b ? l.c.a.e.T(this).i(b2, lVar) : lVar.between(this, b2);
    }

    @Override // l.c.a.t.b
    public c<?> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }
}

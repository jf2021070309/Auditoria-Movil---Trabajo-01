package l.c.a.t;

import l.c.a.t.b;
/* loaded from: classes2.dex */
public abstract class c<D extends b> extends l.c.a.v.b implements l.c.a.w.d, l.c.a.w.f, Comparable<c<?>> {
    public long B(l.c.a.q qVar) {
        e.j.d.w.k0(qVar, "offset");
        return ((I().G() * 86400) + K().T()) - qVar.f9708g;
    }

    public l.c.a.d G(l.c.a.q qVar) {
        return l.c.a.d.B(B(qVar), K().f9688g);
    }

    public abstract D I();

    public abstract l.c.a.g K();

    @Override // l.c.a.w.d
    /* renamed from: M */
    public c<D> b(l.c.a.w.f fVar) {
        return I().v().h(fVar.adjustInto(this));
    }

    @Override // l.c.a.w.d
    /* renamed from: P */
    public abstract c<D> a(l.c.a.w.i iVar, long j2);

    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.EPOCH_DAY, I().G()).a(l.c.a.w.a.NANO_OF_DAY, K().Q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        return I().hashCode() ^ K().hashCode();
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9809b) {
            return (R) v();
        }
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.NANOS;
        }
        if (kVar == l.c.a.w.j.f9813f) {
            return (R) l.c.a.e.l0(I().G());
        }
        if (kVar == l.c.a.w.j.f9814g) {
            return (R) K();
        }
        if (kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    public abstract f<D> t(l.c.a.p pVar);

    public String toString() {
        return I().toString() + 'T' + K().toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: u */
    public int compareTo(c<?> cVar) {
        int compareTo = I().compareTo(cVar.I());
        if (compareTo == 0) {
            int compareTo2 = K().compareTo(cVar.K());
            return compareTo2 == 0 ? v().compareTo(cVar.v()) : compareTo2;
        }
        return compareTo;
    }

    public h v() {
        return I().v();
    }

    @Override // l.c.a.v.b, l.c.a.w.d
    /* renamed from: y */
    public c<D> f(long j2, l.c.a.w.l lVar) {
        return I().v().h(super.f(j2, lVar));
    }

    @Override // l.c.a.w.d
    /* renamed from: z */
    public abstract c<D> h(long j2, l.c.a.w.l lVar);
}

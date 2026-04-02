package l.c.a.t;

import l.c.a.t.b;
/* loaded from: classes2.dex */
public abstract class f<D extends b> extends l.c.a.v.b implements l.c.a.w.d, Comparable<f<?>> {
    public long B() {
        return ((G().G() * 86400) + K().T()) - u().f9708g;
    }

    public D G() {
        return I().I();
    }

    public abstract c<D> I();

    public l.c.a.g K() {
        return I().K();
    }

    @Override // l.c.a.w.d
    /* renamed from: M */
    public f<D> b(l.c.a.w.f fVar) {
        return G().v().i(fVar.adjustInto(this));
    }

    @Override // l.c.a.w.d
    /* renamed from: P */
    public abstract f<D> a(l.c.a.w.i iVar, long j2);

    public abstract f<D> Q(l.c.a.p pVar);

    public abstract f<D> T(l.c.a.p pVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal != 28) {
                return ordinal != 29 ? I().get(iVar) : u().f9708g;
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Field too large for an int: ", iVar));
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            return ordinal != 28 ? ordinal != 29 ? I().getLong(iVar) : u().f9708g : B();
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        return (I().hashCode() ^ u().f9708g) ^ Integer.rotateLeft(v().hashCode(), 3);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return (kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9811d) ? (R) v() : kVar == l.c.a.w.j.f9809b ? (R) G().v() : kVar == l.c.a.w.j.f9810c ? (R) l.c.a.w.b.NANOS : kVar == l.c.a.w.j.f9812e ? (R) u() : kVar == l.c.a.w.j.f9813f ? (R) l.c.a.e.l0(G().G()) : kVar == l.c.a.w.j.f9814g ? (R) K() : (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? (iVar == l.c.a.w.a.INSTANT_SECONDS || iVar == l.c.a.w.a.OFFSET_SECONDS) ? iVar.range() : I().range(iVar) : iVar.rangeRefinedBy(this);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.c.a.t.b] */
    @Override // java.lang.Comparable
    /* renamed from: t */
    public int compareTo(f<?> fVar) {
        int u = e.j.d.w.u(B(), fVar.B());
        if (u == 0) {
            int i2 = K().f9688g - fVar.K().f9688g;
            if (i2 == 0) {
                int compareTo = I().compareTo(fVar.I());
                if (compareTo == 0) {
                    int compareTo2 = v().u().compareTo(fVar.v().u());
                    return compareTo2 == 0 ? G().v().compareTo(fVar.G().v()) : compareTo2;
                }
                return compareTo;
            }
            return i2;
        }
        return u;
    }

    public String toString() {
        String str = I().toString() + u().f9709h;
        if (u() != v()) {
            return str + '[' + v().toString() + ']';
        }
        return str;
    }

    public abstract l.c.a.q u();

    public abstract l.c.a.p v();

    @Override // l.c.a.v.b, l.c.a.w.d
    /* renamed from: y */
    public f<D> f(long j2, l.c.a.w.l lVar) {
        return G().v().i(super.f(j2, lVar));
    }

    @Override // l.c.a.w.d
    /* renamed from: z */
    public abstract f<D> h(long j2, l.c.a.w.l lVar);
}

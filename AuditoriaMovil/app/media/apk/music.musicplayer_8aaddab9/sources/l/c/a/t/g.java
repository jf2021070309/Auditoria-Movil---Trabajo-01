package l.c.a.t;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import l.c.a.t.b;
/* loaded from: classes2.dex */
public final class g<D extends b> extends f<D> implements Serializable {
    public final d<D> a;

    /* renamed from: b  reason: collision with root package name */
    public final l.c.a.q f9716b;

    /* renamed from: c  reason: collision with root package name */
    public final l.c.a.p f9717c;

    public g(d<D> dVar, l.c.a.q qVar, l.c.a.p pVar) {
        e.j.d.w.k0(dVar, "dateTime");
        this.a = dVar;
        e.j.d.w.k0(qVar, "offset");
        this.f9716b = qVar;
        e.j.d.w.k0(pVar, "zone");
        this.f9717c = pVar;
    }

    public static <R extends b> f<R> W(d<R> dVar, l.c.a.p pVar, l.c.a.q qVar) {
        e.j.d.w.k0(dVar, "localDateTime");
        e.j.d.w.k0(pVar, "zone");
        if (pVar instanceof l.c.a.q) {
            return new g(dVar, (l.c.a.q) pVar, pVar);
        }
        l.c.a.x.f v = pVar.v();
        l.c.a.f T = l.c.a.f.T(dVar);
        List<l.c.a.q> f2 = v.f(T);
        if (f2.size() == 1) {
            qVar = f2.get(0);
        } else if (f2.size() == 0) {
            l.c.a.x.d b2 = v.b(T);
            dVar = dVar.a0(dVar.a, 0L, 0L, l.c.a.c.f(b2.f9831c.f9708g - b2.f9830b.f9708g).f9672b, 0L);
            qVar = b2.f9831c;
        } else if (qVar == null || !f2.contains(qVar)) {
            qVar = f2.get(0);
        }
        e.j.d.w.k0(qVar, "offset");
        return new g(dVar, qVar, pVar);
    }

    public static <R extends b> g<R> a0(h hVar, l.c.a.d dVar, l.c.a.p pVar) {
        l.c.a.q a = pVar.v().a(dVar);
        e.j.d.w.k0(a, "offset");
        return new g<>((d) hVar.z(l.c.a.f.c0(dVar.f9674b, dVar.f9675c, a)), a, pVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    @Override // l.c.a.t.f
    public c<D> I() {
        return this.a;
    }

    @Override // l.c.a.t.f, l.c.a.w.d
    /* renamed from: P */
    public f<D> a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            int ordinal = aVar.ordinal();
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return W(this.a.a(iVar, j2), this.f9717c, this.f9716b);
                }
                return a0(G().v(), this.a.G(l.c.a.q.K(aVar.checkValidIntValue(j2))), this.f9717c);
            }
            return h(j2 - B(), l.c.a.w.b.SECONDS);
        }
        return G().v().i(iVar.adjustInto(this, j2));
    }

    @Override // l.c.a.t.f
    public f<D> Q(l.c.a.p pVar) {
        e.j.d.w.k0(pVar, "zone");
        if (this.f9717c.equals(pVar)) {
            return this;
        }
        return a0(G().v(), this.a.G(this.f9716b), pVar);
    }

    @Override // l.c.a.t.f
    public f<D> T(l.c.a.p pVar) {
        return W(this.a, pVar, this.f9716b);
    }

    @Override // l.c.a.t.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // l.c.a.t.f
    public int hashCode() {
        return (this.a.hashCode() ^ this.f9716b.f9708g) ^ Integer.rotateLeft(this.f9717c.hashCode(), 3);
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        f<?> I = G().v().I(dVar);
        if (lVar instanceof l.c.a.w.b) {
            return this.a.i(I.Q(this.f9716b).I(), lVar);
        }
        return lVar.between(this, I);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return (iVar instanceof l.c.a.w.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    @Override // l.c.a.t.f
    public String toString() {
        String str = this.a.toString() + this.f9716b.f9709h;
        if (this.f9716b != this.f9717c) {
            return str + '[' + this.f9717c.toString() + ']';
        }
        return str;
    }

    @Override // l.c.a.t.f
    public l.c.a.q u() {
        return this.f9716b;
    }

    @Override // l.c.a.t.f
    public l.c.a.p v() {
        return this.f9717c;
    }

    @Override // l.c.a.t.f, l.c.a.w.d
    /* renamed from: z */
    public f<D> h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            return G().v().i(this.a.z(j2, lVar).adjustInto(this));
        }
        return G().v().i(lVar.addTo(this, j2));
    }
}

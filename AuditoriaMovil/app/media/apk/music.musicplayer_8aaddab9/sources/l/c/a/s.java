package l.c.a;

import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes2.dex */
public final class s extends l.c.a.t.f<e> implements l.c.a.w.d, Serializable {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final q f9713b;

    /* renamed from: c  reason: collision with root package name */
    public final p f9714c;

    public s(f fVar, q qVar, p pVar) {
        this.a = fVar;
        this.f9713b = qVar;
        this.f9714c = pVar;
    }

    public static s W(long j2, int i2, p pVar) {
        q a = pVar.v().a(d.B(j2, i2));
        return new s(f.c0(j2, i2, a), a, pVar);
    }

    public static s a0(l.c.a.w.e eVar) {
        if (eVar instanceof s) {
            return (s) eVar;
        }
        try {
            p t = p.t(eVar);
            l.c.a.w.a aVar = l.c.a.w.a.INSTANT_SECONDS;
            if (eVar.isSupported(aVar)) {
                try {
                    return W(eVar.getLong(aVar), eVar.get(l.c.a.w.a.NANO_OF_SECOND), t);
                } catch (a unused) {
                }
            }
            return c0(f.T(eVar), t, null);
        } catch (a unused2) {
            throw new a("Unable to obtain ZonedDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static s c0(f fVar, p pVar, q qVar) {
        w.k0(fVar, "localDateTime");
        w.k0(pVar, "zone");
        if (pVar instanceof q) {
            return new s(fVar, (q) pVar, pVar);
        }
        l.c.a.x.f v = pVar.v();
        List<q> f2 = v.f(fVar);
        if (f2.size() == 1) {
            qVar = f2.get(0);
        } else if (f2.size() == 0) {
            l.c.a.x.d b2 = v.b(fVar);
            fVar = fVar.g0(c.f(b2.f9831c.f9708g - b2.f9830b.f9708g).f9672b);
            qVar = b2.f9831c;
        } else if (qVar == null || !f2.contains(qVar)) {
            q qVar2 = f2.get(0);
            w.k0(qVar2, "offset");
            qVar = qVar2;
        }
        return new s(fVar, qVar, pVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 6, this);
    }

    @Override // l.c.a.t.f
    public e G() {
        return this.a.f9681c;
    }

    @Override // l.c.a.t.f
    public l.c.a.t.c<e> I() {
        return this.a;
    }

    @Override // l.c.a.t.f
    public g K() {
        return this.a.f9682d;
    }

    @Override // l.c.a.t.f
    public l.c.a.t.f<e> T(p pVar) {
        w.k0(pVar, "zone");
        return this.f9714c.equals(pVar) ? this : c0(this.a, pVar, this.f9713b);
    }

    @Override // l.c.a.t.f
    /* renamed from: b0 */
    public s y(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1L, lVar) : z(-j2, lVar);
    }

    @Override // l.c.a.t.f
    /* renamed from: d0 */
    public s z(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            if (lVar.isDateBased()) {
                return e0(this.a.z(j2, lVar));
            }
            f z = this.a.z(j2, lVar);
            q qVar = this.f9713b;
            p pVar = this.f9714c;
            w.k0(z, "localDateTime");
            w.k0(qVar, "offset");
            w.k0(pVar, "zone");
            return W(z.B(qVar), z.f9682d.f9688g, pVar);
        }
        return (s) lVar.addTo(this, j2);
    }

    public final s e0(f fVar) {
        return c0(fVar, this.f9714c, this.f9713b);
    }

    @Override // l.c.a.t.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.a.equals(sVar.a) && this.f9713b.equals(sVar.f9713b) && this.f9714c.equals(sVar.f9714c);
        }
        return false;
    }

    public final s f0(q qVar) {
        return (qVar.equals(this.f9713b) || !this.f9714c.v().i(this.a, qVar)) ? this : new s(this.a, qVar, this.f9714c);
    }

    @Override // l.c.a.t.f, l.c.a.w.d
    /* renamed from: g0 */
    public s b(l.c.a.w.f fVar) {
        if (fVar instanceof e) {
            return c0(f.b0((e) fVar, this.a.f9682d), this.f9714c, this.f9713b);
        }
        if (fVar instanceof g) {
            return c0(f.b0(this.a.f9681c, (g) fVar), this.f9714c, this.f9713b);
        }
        if (fVar instanceof f) {
            return e0((f) fVar);
        }
        if (!(fVar instanceof d)) {
            return fVar instanceof q ? f0((q) fVar) : (s) fVar.adjustInto(this);
        }
        d dVar = (d) fVar;
        return W(dVar.f9674b, dVar.f9675c, this.f9714c);
    }

    @Override // l.c.a.t.f, l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal != 28) {
                return ordinal != 29 ? this.a.get(iVar) : this.f9713b.f9708g;
            }
            throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
        }
        return super.get(iVar);
    }

    @Override // l.c.a.t.f, l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            return ordinal != 28 ? ordinal != 29 ? this.a.getLong(iVar) : this.f9713b.f9708g : B();
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.t.f, l.c.a.w.d
    /* renamed from: h0 */
    public s a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            int ordinal = aVar.ordinal();
            return ordinal != 28 ? ordinal != 29 ? e0(this.a.a(iVar, j2)) : f0(q.K(aVar.checkValidIntValue(j2))) : W(j2, this.a.f9682d.f9688g, this.f9714c);
        }
        return (s) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.t.f
    public int hashCode() {
        return (this.a.hashCode() ^ this.f9713b.f9708g) ^ Integer.rotateLeft(this.f9714c.hashCode(), 3);
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        s a0 = a0(dVar);
        if (lVar instanceof l.c.a.w.b) {
            s Q = a0.Q(this.f9714c);
            return lVar.isDateBased() ? this.a.i(Q.a, lVar) : new j(this.a, this.f9713b).i(new j(Q.a, Q.f9713b), lVar);
        }
        return lVar.between(this, a0);
    }

    @Override // l.c.a.t.f
    /* renamed from: i0 */
    public s Q(p pVar) {
        w.k0(pVar, "zone");
        return this.f9714c.equals(pVar) ? this : W(this.a.B(this.f9713b), this.a.f9682d.f9688g, pVar);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return (iVar instanceof l.c.a.w.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    @Override // l.c.a.t.f, l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return kVar == l.c.a.w.j.f9813f ? (R) this.a.f9681c : (R) super.query(kVar);
    }

    @Override // l.c.a.t.f, l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? (iVar == l.c.a.w.a.INSTANT_SECONDS || iVar == l.c.a.w.a.OFFSET_SECONDS) ? iVar.range() : this.a.range(iVar) : iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.f
    public String toString() {
        String str = this.a.toString() + this.f9713b.f9709h;
        if (this.f9713b != this.f9714c) {
            return str + '[' + this.f9714c.toString() + ']';
        }
        return str;
    }

    @Override // l.c.a.t.f
    public q u() {
        return this.f9713b;
    }

    @Override // l.c.a.t.f
    public p v() {
        return this.f9714c;
    }
}

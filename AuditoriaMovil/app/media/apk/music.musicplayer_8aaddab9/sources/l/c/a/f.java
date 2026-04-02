package l.c.a;

import e.j.d.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class f extends l.c.a.t.c<e> implements l.c.a.w.d, l.c.a.w.f, Serializable {
    public static final f a = b0(e.a, g.a);

    /* renamed from: b  reason: collision with root package name */
    public static final f f9680b = b0(e.f9676b, g.f9683b);

    /* renamed from: c  reason: collision with root package name */
    public final e f9681c;

    /* renamed from: d  reason: collision with root package name */
    public final g f9682d;

    public f(e eVar, g gVar) {
        this.f9681c = eVar;
        this.f9682d = gVar;
    }

    public static f T(l.c.a.w.e eVar) {
        if (eVar instanceof f) {
            return (f) eVar;
        }
        if (eVar instanceof s) {
            return ((s) eVar).a;
        }
        try {
            return new f(e.T(eVar), g.v(eVar));
        } catch (a unused) {
            throw new a("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static f b0(e eVar, g gVar) {
        w.k0(eVar, "date");
        w.k0(gVar, "time");
        return new f(eVar, gVar);
    }

    public static f c0(long j2, int i2, q qVar) {
        int i3;
        w.k0(qVar, "offset");
        long j3 = j2 + qVar.f9708g;
        long G = w.G(j3, 86400L);
        int H = w.H(j3, 86400);
        e l0 = e.l0(G);
        long j4 = H;
        g gVar = g.a;
        l.c.a.w.a.SECOND_OF_DAY.checkValidValue(j4);
        l.c.a.w.a.NANO_OF_SECOND.checkValidValue(i2);
        int i4 = (int) (j4 / 3600);
        long j5 = j4 - (i4 * 3600);
        return new f(l0, g.u(i4, (int) (j5 / 60), (int) (j5 - (i3 * 60)), i2));
    }

    public static f i0(DataInput dataInput) throws IOException {
        e eVar = e.a;
        return b0(e.j0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), g.P(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 4, this);
    }

    @Override // l.c.a.t.c
    public e I() {
        return this.f9681c;
    }

    @Override // l.c.a.t.c
    public g K() {
        return this.f9682d;
    }

    public final int Q(f fVar) {
        int M = this.f9681c.M(fVar.f9681c);
        return M == 0 ? this.f9682d.compareTo(fVar.f9682d) : M;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.c.a.t.b] */
    public boolean W(l.c.a.t.c<?> cVar) {
        if (cVar instanceof f) {
            return Q((f) cVar) < 0;
        }
        long G = I().G();
        long G2 = cVar.I().G();
        return G < G2 || (G == G2 && K().Q() < cVar.K().Q());
    }

    @Override // l.c.a.t.c
    /* renamed from: a0 */
    public f y(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1L, lVar) : z(-j2, lVar);
    }

    @Override // l.c.a.t.c, l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return super.adjustInto(dVar);
    }

    @Override // l.c.a.t.c
    /* renamed from: d0 */
    public f z(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return f0(j2);
                case 1:
                    return e0(j2 / 86400000000L).f0((j2 % 86400000000L) * 1000);
                case 2:
                    return e0(j2 / 86400000).f0((j2 % 86400000) * 1000000);
                case 3:
                    return g0(j2);
                case 4:
                    return h0(this.f9681c, 0L, j2, 0L, 0L, 1);
                case 5:
                    return h0(this.f9681c, j2, 0L, 0L, 0L, 1);
                case 6:
                    f e0 = e0(j2 / 256);
                    return e0.h0(e0.f9681c, (j2 % 256) * 12, 0L, 0L, 0L, 1);
                default:
                    return j0(this.f9681c.h(j2, lVar), this.f9682d);
            }
        }
        return (f) lVar.addTo(this, j2);
    }

    public f e0(long j2) {
        return j0(this.f9681c.n0(j2), this.f9682d);
    }

    @Override // l.c.a.t.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f9681c.equals(fVar.f9681c) && this.f9682d.equals(fVar.f9682d);
        }
        return false;
    }

    public f f0(long j2) {
        return h0(this.f9681c, 0L, 0L, 0L, j2, 1);
    }

    public f g0(long j2) {
        return h0(this.f9681c, 0L, 0L, j2, 0L, 1);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9682d.get(iVar) : this.f9681c.get(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9682d.getLong(iVar) : this.f9681c.getLong(iVar) : iVar.getFrom(this);
    }

    public final f h0(e eVar, long j2, long j3, long j4, long j5, int i2) {
        if ((j2 | j3 | j4 | j5) == 0) {
            return j0(eVar, this.f9682d);
        }
        long j6 = i2;
        long Q = this.f9682d.Q();
        long j7 = ((((j2 % 24) * 3600000000000L) + ((j3 % 1440) * 60000000000L) + ((j4 % 86400) * 1000000000) + (j5 % 86400000000000L)) * j6) + Q;
        long G = w.G(j7, 86400000000000L) + (((j2 / 24) + (j3 / 1440) + (j4 / 86400) + (j5 / 86400000000000L)) * j6);
        long I = w.I(j7, 86400000000000L);
        return j0(eVar.n0(G), I == Q ? this.f9682d : g.z(I));
    }

    @Override // l.c.a.t.c
    public int hashCode() {
        return this.f9681c.hashCode() ^ this.f9682d.hashCode();
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        f T = T(dVar);
        if (lVar instanceof l.c.a.w.b) {
            l.c.a.w.b bVar = (l.c.a.w.b) lVar;
            if (!bVar.isTimeBased()) {
                e eVar = T.f9681c;
                e eVar2 = this.f9681c;
                Objects.requireNonNull(eVar);
                if (!(eVar2 instanceof e) ? eVar.G() <= eVar2.G() : eVar.M(eVar2) <= 0) {
                    if (T.f9682d.compareTo(this.f9682d) < 0) {
                        eVar = eVar.h0(1L);
                        return this.f9681c.i(eVar, lVar);
                    }
                }
                if (eVar.d0(this.f9681c)) {
                    if (T.f9682d.compareTo(this.f9682d) > 0) {
                        eVar = eVar.n0(1L);
                    }
                }
                return this.f9681c.i(eVar, lVar);
            }
            long Q = this.f9681c.Q(T.f9681c);
            long Q2 = T.f9682d.Q() - this.f9682d.Q();
            if (Q > 0 && Q2 < 0) {
                Q--;
                Q2 += 86400000000000L;
            } else if (Q < 0 && Q2 > 0) {
                Q++;
                Q2 -= 86400000000000L;
            }
            switch (bVar.ordinal()) {
                case 0:
                    return w.n0(w.q0(Q, 86400000000000L), Q2);
                case 1:
                    return w.n0(w.q0(Q, 86400000000L), Q2 / 1000);
                case 2:
                    return w.n0(w.q0(Q, 86400000L), Q2 / 1000000);
                case 3:
                    return w.n0(w.p0(Q, 86400), Q2 / 1000000000);
                case 4:
                    return w.n0(w.p0(Q, 1440), Q2 / 60000000000L);
                case 5:
                    return w.n0(w.p0(Q, 24), Q2 / 3600000000000L);
                case 6:
                    return w.n0(w.p0(Q, 2), Q2 / 43200000000000L);
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, T);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isDateBased() || iVar.isTimeBased() : iVar != null && iVar.isSupportedBy(this);
    }

    public final f j0(e eVar, g gVar) {
        return (this.f9681c == eVar && this.f9682d == gVar) ? this : new f(eVar, gVar);
    }

    @Override // l.c.a.t.c, l.c.a.w.d
    /* renamed from: k0 */
    public f b(l.c.a.w.f fVar) {
        return fVar instanceof e ? j0((e) fVar, this.f9682d) : fVar instanceof g ? j0(this.f9681c, (g) fVar) : fVar instanceof f ? (f) fVar : (f) fVar.adjustInto(this);
    }

    @Override // l.c.a.t.c, l.c.a.w.d
    /* renamed from: l0 */
    public f a(l.c.a.w.i iVar, long j2) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? j0(this.f9681c, this.f9682d.a(iVar, j2)) : j0(this.f9681c.a(iVar, j2), this.f9682d) : (f) iVar.adjustInto(this, j2);
    }

    public void m0(DataOutput dataOutput) throws IOException {
        e eVar = this.f9681c;
        dataOutput.writeInt(eVar.f9677c);
        dataOutput.writeByte(eVar.f9678d);
        dataOutput.writeByte(eVar.f9679e);
        this.f9682d.c0(dataOutput);
    }

    @Override // l.c.a.t.c, l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return kVar == l.c.a.w.j.f9813f ? (R) this.f9681c : (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9682d.range(iVar) : this.f9681c.range(iVar) : iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.c
    public l.c.a.t.f<e> t(p pVar) {
        return s.c0(this, pVar, null);
    }

    @Override // l.c.a.t.c
    public String toString() {
        return this.f9681c.toString() + 'T' + this.f9682d.toString();
    }

    @Override // l.c.a.t.c, java.lang.Comparable
    /* renamed from: u */
    public int compareTo(l.c.a.t.c<?> cVar) {
        return cVar instanceof f ? Q((f) cVar) : super.compareTo(cVar);
    }
}

package l.c.a.t;

import java.io.Serializable;
import l.c.a.t.b;
/* loaded from: classes2.dex */
public final class d<D extends b> extends c<D> implements l.c.a.w.d, l.c.a.w.f, Serializable {
    public final D a;

    /* renamed from: b  reason: collision with root package name */
    public final l.c.a.g f9715b;

    public d(D d2, l.c.a.g gVar) {
        e.j.d.w.k0(d2, "date");
        e.j.d.w.k0(gVar, "time");
        this.a = d2;
        this.f9715b = gVar;
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    @Override // l.c.a.t.c
    public D I() {
        return this.a;
    }

    @Override // l.c.a.t.c
    public l.c.a.g K() {
        return this.f9715b;
    }

    @Override // l.c.a.t.c
    /* renamed from: Q */
    public d<D> z(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return W(j2);
                case 1:
                    return T(j2 / 86400000000L).W((j2 % 86400000000L) * 1000);
                case 2:
                    return T(j2 / 86400000).W((j2 % 86400000) * 1000000);
                case 3:
                    return a0(this.a, 0L, 0L, j2, 0L);
                case 4:
                    return a0(this.a, 0L, j2, 0L, 0L);
                case 5:
                    return a0(this.a, j2, 0L, 0L, 0L);
                case 6:
                    d<D> T = T(j2 / 256);
                    return T.a0(T.a, (j2 % 256) * 12, 0L, 0L, 0L);
                default:
                    return b0(this.a.h(j2, lVar), this.f9715b);
            }
        }
        return this.a.v().h(lVar.addTo(this, j2));
    }

    public final d<D> T(long j2) {
        return b0(this.a.h(j2, l.c.a.w.b.DAYS), this.f9715b);
    }

    public final d<D> W(long j2) {
        return a0(this.a, 0L, 0L, 0L, j2);
    }

    public final d<D> a0(D d2, long j2, long j3, long j4, long j5) {
        if ((j2 | j3 | j4 | j5) == 0) {
            return b0(d2, this.f9715b);
        }
        long j6 = j2 / 24;
        long j7 = ((j2 % 24) * 3600000000000L) + ((j3 % 1440) * 60000000000L) + ((j4 % 86400) * 1000000000) + (j5 % 86400000000000L);
        long Q = this.f9715b.Q();
        long j8 = j7 + Q;
        long G = e.j.d.w.G(j8, 86400000000000L) + j6 + (j3 / 1440) + (j4 / 86400) + (j5 / 86400000000000L);
        long I = e.j.d.w.I(j8, 86400000000000L);
        return b0(d2.h(G, l.c.a.w.b.DAYS), I == Q ? this.f9715b : l.c.a.g.z(I));
    }

    public final d<D> b0(l.c.a.w.d dVar, l.c.a.g gVar) {
        D d2 = this.a;
        return (d2 == dVar && this.f9715b == gVar) ? this : new d<>(d2.v().f(dVar), gVar);
    }

    @Override // l.c.a.t.c, l.c.a.w.d
    /* renamed from: c0 */
    public d<D> b(l.c.a.w.f fVar) {
        return fVar instanceof b ? b0((b) fVar, this.f9715b) : fVar instanceof l.c.a.g ? b0(this.a, (l.c.a.g) fVar) : fVar instanceof d ? this.a.v().h((d) fVar) : this.a.v().h((d) fVar.adjustInto(this));
    }

    @Override // l.c.a.t.c, l.c.a.w.d
    /* renamed from: d0 */
    public d<D> a(l.c.a.w.i iVar, long j2) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? b0(this.a, this.f9715b.a(iVar, j2)) : b0(this.a.a(iVar, j2), this.f9715b) : this.a.v().h(iVar.adjustInto(this, j2));
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9715b.get(iVar) : this.a.get(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9715b.getLong(iVar) : this.a.getLong(iVar) : iVar.getFrom(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.c.a.t.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.c.a.w.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.c.a.t.b] */
    /* JADX WARN: Type inference failed for: r7v7, types: [D extends l.c.a.t.b, l.c.a.w.d] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.c.a.w.l] */
    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        c<?> z = this.a.v().z(dVar);
        if (lVar instanceof l.c.a.w.b) {
            l.c.a.w.b bVar = (l.c.a.w.b) lVar;
            if (!bVar.isTimeBased()) {
                ?? I = z.I();
                if (z.K().compareTo(this.f9715b) < 0) {
                    I = I.f(1L, l.c.a.w.b.DAYS);
                }
                return this.a.i(I, lVar);
            }
            l.c.a.w.a aVar = l.c.a.w.a.EPOCH_DAY;
            long j2 = z.getLong(aVar) - this.a.getLong(aVar);
            switch (bVar.ordinal()) {
                case 0:
                    j2 = e.j.d.w.q0(j2, 86400000000000L);
                    break;
                case 1:
                    j2 = e.j.d.w.q0(j2, 86400000000L);
                    break;
                case 2:
                    j2 = e.j.d.w.q0(j2, 86400000L);
                    break;
                case 3:
                    j2 = e.j.d.w.p0(j2, 86400);
                    break;
                case 4:
                    j2 = e.j.d.w.p0(j2, 1440);
                    break;
                case 5:
                    j2 = e.j.d.w.p0(j2, 24);
                    break;
                case 6:
                    j2 = e.j.d.w.p0(j2, 2);
                    break;
            }
            return e.j.d.w.n0(j2, this.f9715b.i(z.K(), lVar));
        }
        return lVar.between(this, z);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isDateBased() || iVar.isTimeBased() : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() ? this.f9715b.range(iVar) : this.a.range(iVar) : iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.c
    public f<D> t(l.c.a.p pVar) {
        return g.W(this, pVar, null);
    }
}

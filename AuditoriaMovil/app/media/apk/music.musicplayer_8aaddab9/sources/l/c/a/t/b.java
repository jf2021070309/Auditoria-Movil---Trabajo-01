package l.c.a.t;
/* loaded from: classes2.dex */
public abstract class b extends l.c.a.v.b implements l.c.a.w.d, l.c.a.w.f, Comparable<b> {
    @Override // l.c.a.w.d
    /* renamed from: B */
    public abstract b h(long j2, l.c.a.w.l lVar);

    public long G() {
        return getLong(l.c.a.w.a.EPOCH_DAY);
    }

    @Override // l.c.a.w.d
    /* renamed from: I */
    public b b(l.c.a.w.f fVar) {
        return v().f(fVar.adjustInto(this));
    }

    @Override // l.c.a.w.d
    /* renamed from: K */
    public abstract b a(l.c.a.w.i iVar, long j2);

    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.EPOCH_DAY, G());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public int hashCode() {
        long G = G();
        return v().hashCode() ^ ((int) (G ^ (G >>> 32)));
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isDateBased() : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9809b) {
            return (R) v();
        }
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.DAYS;
        }
        if (kVar == l.c.a.w.j.f9813f) {
            return (R) l.c.a.e.l0(G());
        }
        if (kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    public c<?> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }

    public String toString() {
        long j2 = getLong(l.c.a.w.a.YEAR_OF_ERA);
        long j3 = getLong(l.c.a.w.a.MONTH_OF_YEAR);
        long j4 = getLong(l.c.a.w.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(v().y());
        sb.append(" ");
        sb.append(y());
        sb.append(" ");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        sb.append(j4 >= 10 ? "-" : "-0");
        sb.append(j4);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: u */
    public int compareTo(b bVar) {
        int u = e.j.d.w.u(G(), bVar.G());
        return u == 0 ? v().compareTo(bVar.v()) : u;
    }

    public abstract h v();

    public i y() {
        return v().t(get(l.c.a.w.a.ERA));
    }

    @Override // l.c.a.v.b, l.c.a.w.d
    /* renamed from: z */
    public b f(long j2, l.c.a.w.l lVar) {
        return v().f(super.f(j2, lVar));
    }
}

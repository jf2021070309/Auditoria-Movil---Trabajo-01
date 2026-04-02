package l.c.a.v;

import l.c.a.t.i;
import l.c.a.t.q;
import l.c.a.w.d;
import l.c.a.w.j;
import l.c.a.w.k;
import l.c.a.w.m;
/* loaded from: classes2.dex */
public abstract class a extends c implements i {
    @Override // l.c.a.w.f
    public d adjustInto(d dVar) {
        return dVar.a(l.c.a.w.a.ERA, ((q) this).f9750g);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar == l.c.a.w.a.ERA ? ((q) this).f9750g : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.ERA) {
            return ((q) this).f9750g;
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.ERA : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(k<R> kVar) {
        if (kVar == j.f9810c) {
            return (R) l.c.a.w.b.ERAS;
        }
        if (kVar == j.f9809b || kVar == j.f9811d || kVar == j.a || kVar == j.f9812e || kVar == j.f9813f || kVar == j.f9814g) {
            return null;
        }
        return kVar.a(this);
    }
}

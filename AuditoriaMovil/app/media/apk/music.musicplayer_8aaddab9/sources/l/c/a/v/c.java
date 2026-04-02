package l.c.a.v;

import l.c.a.w.e;
import l.c.a.w.i;
import l.c.a.w.j;
import l.c.a.w.k;
import l.c.a.w.m;
import l.c.a.w.n;
/* loaded from: classes2.dex */
public abstract class c implements e {
    @Override // l.c.a.w.e
    public int get(i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public <R> R query(k<R> kVar) {
        if (kVar == j.a || kVar == j.f9809b || kVar == j.f9810c) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // l.c.a.w.e
    public n range(i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            if (isSupported(iVar)) {
                return iVar.range();
            }
            throw new m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }
}

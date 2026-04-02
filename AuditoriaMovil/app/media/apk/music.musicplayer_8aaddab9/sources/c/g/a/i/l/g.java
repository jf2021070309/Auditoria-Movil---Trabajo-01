package c.g.a.i.l;

import c.g.a.i.l.f;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f1785m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f1777e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f1777e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // c.g.a.i.l.f
    public void c(int i2) {
        if (this.f1782j) {
            return;
        }
        this.f1782j = true;
        this.f1779g = i2;
        for (d dVar : this.f1783k) {
            dVar.a(dVar);
        }
    }
}

package androidx.lifecycle;

import c.p.i;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.v;
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements n {
    public final i[] a;

    public CompositeGeneratedAdaptersObserver(i[] iVarArr) {
        this.a = iVarArr;
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        v vVar = new v();
        for (i iVar : this.a) {
            iVar.a(pVar, aVar, false, vVar);
        }
        for (i iVar2 : this.a) {
            iVar2.a(pVar, aVar, true, vVar);
        }
    }
}

package androidx.lifecycle;

import c.p.j;
import c.p.n;
import c.p.p;
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements n {
    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        h.o.c.j.e(pVar, "source");
        h.o.c.j.e(aVar, "event");
        if (aVar == j.a.upTo(null)) {
            throw null;
        }
        if (aVar == j.a.ON_DESTROY) {
            throw null;
        }
    }
}

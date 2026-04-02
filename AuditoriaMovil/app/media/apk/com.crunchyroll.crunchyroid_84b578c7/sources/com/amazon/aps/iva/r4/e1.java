package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: NormalizeCompositionTree.kt */
/* loaded from: classes.dex */
public final class e1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<v, n.c, v> {
    public static final e1 h = new e1();

    public e1() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final v invoke(v vVar, n.c cVar) {
        v vVar2 = vVar;
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(vVar2, "acc");
        com.amazon.aps.iva.yb0.j.f(cVar2, "modifier");
        if (!(cVar2 instanceof com.amazon.aps.iva.y4.r) && !(cVar2 instanceof com.amazon.aps.iva.y4.k)) {
            return v.a(vVar2, null, vVar2.b.d(cVar2), 1);
        }
        return v.a(vVar2, vVar2.a.d(cVar2), null, 2);
    }
}

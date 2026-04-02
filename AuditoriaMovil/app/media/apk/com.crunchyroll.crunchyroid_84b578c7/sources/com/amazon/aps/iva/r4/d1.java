package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: NormalizeCompositionTree.kt */
/* loaded from: classes.dex */
public final class d1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<n.c, Boolean> {
    public static final d1 h = new d1();

    public d1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(n.c cVar) {
        boolean z;
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "it");
        if (!(cVar2 instanceof com.amazon.aps.iva.y4.r) && !(cVar2 instanceof com.amazon.aps.iva.y4.k)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

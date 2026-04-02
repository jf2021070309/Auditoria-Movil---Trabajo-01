package com.amazon.aps.iva.g00;

import com.amazon.aps.iva.f00.p;
import com.amazon.aps.iva.f00.q;
import com.amazon.aps.iva.g00.a;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PlayableAssetItemOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.n70.d<q> {
    public final l<com.amazon.aps.iva.oh.a, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.gn.b b;

    public e(p.a aVar, com.amazon.aps.iva.gn.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(q qVar) {
        q qVar2 = qVar;
        j.f(qVar2, "data");
        ArrayList arrayList = new ArrayList();
        if (qVar2.r == t.EPISODE) {
            if (j.a(qVar2.m, a.h.d)) {
                arrayList.add(new com.amazon.aps.iva.n70.b(a.c.e, b.h));
            } else {
                arrayList.add(new com.amazon.aps.iva.n70.b(a.C0284a.e, new c(this, qVar2)));
            }
        }
        arrayList.add(new com.amazon.aps.iva.n70.b(a.b.e, new d(this, qVar2)));
        return arrayList;
    }
}

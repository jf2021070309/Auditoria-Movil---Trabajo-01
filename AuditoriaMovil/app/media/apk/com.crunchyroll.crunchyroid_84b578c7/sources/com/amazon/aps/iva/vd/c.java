package com.amazon.aps.iva.vd;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AuthFeature.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a>> {
    public final /* synthetic */ com.amazon.aps.iva.i60.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.t40.c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a> invoke(com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
        com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer> aVar2 = aVar;
        com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
        j.f(aVar2, "contract");
        j.f(bVar2, "result");
        com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a> registerForActivityResult = this.h.registerForActivityResult(aVar2, bVar2);
        j.e(registerForActivityResult, "activity.registerForActi…yResult(contract, result)");
        return registerForActivityResult;
    }
}

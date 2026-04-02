package com.amazon.aps.iva.h30;

import com.amazon.aps.iva.es.s;
import com.amazon.aps.iva.ks.a;
/* compiled from: BentoSubscriptionSuccessAnalytics.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.g30.d implements l {
    public final com.amazon.aps.iva.ds.a d;
    public final com.amazon.aps.iva.fs.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.fs.d dVar) {
        super(dVar, null);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.d = cVar;
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.h30.l
    public final void a(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.js.c cVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "checkoutSuccessActionProperty");
        this.d.e(new s(a.C0456a.c(com.amazon.aps.iva.ls.a.CHECKOUT_SUCCESS, bVar), cVar, com.amazon.aps.iva.js.i.CR_VOD_GAMEVAULT));
    }
}

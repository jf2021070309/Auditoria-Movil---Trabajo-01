package com.amazon.aps.iva.g0;

import com.amazon.aps.iva.o2.k;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> {
    public final /* synthetic */ com.amazon.aps.iva.e1.e h;
    public final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.e1.e eVar, g gVar) {
        super(0);
        this.h = eVar;
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.e1.e invoke() {
        com.amazon.aps.iva.e1.e eVar = this.h;
        if (eVar == null) {
            q t1 = this.i.t1();
            if (t1 != null) {
                return com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.c.b, k.b(t1.a()));
            }
            return null;
        }
        return eVar;
    }
}

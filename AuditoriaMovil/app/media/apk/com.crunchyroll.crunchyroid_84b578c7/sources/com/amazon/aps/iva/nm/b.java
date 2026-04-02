package com.amazon.aps.iva.nm;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lm.c;
import com.amazon.aps.iva.mm.c;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfilesDestinations.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.ui.c<c> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.ui.c<c> cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.lm.e.a(c.a.d, c.a.a(this.h), iVar2, 6);
        }
        return q.a;
    }
}

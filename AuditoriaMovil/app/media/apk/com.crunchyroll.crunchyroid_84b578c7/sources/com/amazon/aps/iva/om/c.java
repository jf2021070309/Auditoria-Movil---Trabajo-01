package com.amazon.aps.iva.om;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: ProfilesOnboardingModal.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(2);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            iVar2.s(1157296644);
            d dVar = this.h;
            boolean H = iVar2.H(dVar);
            Object t = iVar2.t();
            Object obj = i.a.a;
            if (H || t == obj) {
                t = new a(dVar);
                iVar2.n(t);
            }
            iVar2.G();
            com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) t;
            iVar2.s(1157296644);
            boolean H2 = iVar2.H(dVar);
            Object t2 = iVar2.t();
            if (H2 || t2 == obj) {
                t2 = new b(dVar);
                iVar2.n(t2);
            }
            iVar2.G();
            l.a(0, 1, iVar2, null, aVar, (com.amazon.aps.iva.xb0.a) t2);
        }
        return q.a;
    }
}

package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.r<com.amazon.aps.iva.e0.c, Integer, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List h;
    public final /* synthetic */ a i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.pe0.a aVar, a aVar2, com.amazon.aps.iva.xb0.l lVar, int i) {
        super(4);
        this.h = aVar;
        this.i = aVar2;
        this.j = lVar;
        this.k = i;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final com.amazon.aps.iva.kb0.q K(com.amazon.aps.iva.e0.c cVar, Integer num, com.amazon.aps.iva.o0.i iVar, Integer num2) {
        int i;
        int i2;
        int i3;
        com.amazon.aps.iva.e0.c cVar2 = cVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue2 = num2.intValue();
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$items");
        if ((intValue2 & 14) == 0) {
            if (iVar2.H(cVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (iVar2.c(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 731) == 146 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            int i4 = i & 14;
            com.amazon.aps.iva.hm.d dVar = (com.amazon.aps.iva.hm.d) this.h.get(intValue);
            iVar2.s(511388516);
            com.amazon.aps.iva.xb0.l lVar = this.j;
            boolean H = iVar2.H(lVar) | iVar2.H(dVar);
            Object t = iVar2.t();
            if (H || t == i.a.a) {
                t = new o(lVar, dVar);
                iVar2.n(t);
            }
            iVar2.G();
            int i5 = ((i4 >> 3) & 14) | (this.k & 896);
            this.i.a(dVar, (com.amazon.aps.iva.xb0.a) t, iVar2, i5);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

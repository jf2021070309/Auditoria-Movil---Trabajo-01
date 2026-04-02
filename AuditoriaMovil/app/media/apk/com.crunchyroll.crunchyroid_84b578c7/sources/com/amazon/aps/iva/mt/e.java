package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.r;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements r<com.amazon.aps.iva.e0.c, Integer, com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ List h;
    public final /* synthetic */ i i;
    public final /* synthetic */ float j;
    public final /* synthetic */ com.amazon.aps.iva.fs.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, i iVar, float f, com.amazon.aps.iva.fs.b bVar) {
        super(4);
        this.h = list;
        this.i = iVar;
        this.j = f;
        this.k = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final q K(com.amazon.aps.iva.e0.c cVar, Integer num, com.amazon.aps.iva.o0.i iVar, Integer num2) {
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
            int i4 = (i & 112) | (i & 14);
            com.amazon.aps.iva.yx.g gVar = (com.amazon.aps.iva.yx.g) this.h.get(intValue);
            i iVar3 = this.i;
            com.amazon.aps.iva.n70.d<com.amazon.aps.iva.yx.g> dVar = iVar3.j;
            boolean z = true;
            if (iVar3.getItems$home_feed_release().size() != 1) {
                z = false;
            }
            j.a(gVar, dVar, z, new c(iVar3, gVar, this.k, intValue), this.j, iVar2, Panel.$stable | 64 | ((i4 >> 6) & 14));
        }
        return q.a;
    }
}

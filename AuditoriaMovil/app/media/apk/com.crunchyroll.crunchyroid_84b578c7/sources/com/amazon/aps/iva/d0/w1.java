package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.d0.a;
/* compiled from: Row.kt */
/* loaded from: classes.dex */
public final class w1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ a.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a.d dVar) {
        super(5);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.s
    public final com.amazon.aps.iva.kb0.q V0(Integer num, int[] iArr, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar, int[] iArr2) {
        int intValue = num.intValue();
        int[] iArr3 = iArr;
        com.amazon.aps.iva.o2.l lVar2 = lVar;
        com.amazon.aps.iva.o2.c cVar2 = cVar;
        int[] iArr4 = iArr2;
        com.amazon.aps.iva.yb0.j.f(iArr3, "size");
        com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(cVar2, "density");
        com.amazon.aps.iva.yb0.j.f(iArr4, "outPosition");
        this.h.c(intValue, cVar2, lVar2, iArr3, iArr4);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

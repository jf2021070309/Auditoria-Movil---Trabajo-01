package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: NormalizeCompositionTree.kt */
/* loaded from: classes.dex */
public final class o1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, n.c, Integer> {
    public static final o1 h = new o1();

    public o1() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(Integer num, n.c cVar) {
        int intValue = num.intValue();
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "modifier");
        if (cVar2 instanceof com.amazon.aps.iva.q4.b) {
            intValue++;
        }
        return Integer.valueOf(intValue);
    }
}

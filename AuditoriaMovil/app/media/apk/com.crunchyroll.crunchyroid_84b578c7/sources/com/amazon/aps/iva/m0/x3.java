package com.amazon.aps.iva.m0;
/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class x3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.s1.l, Integer, Integer> {
    public static final x3 h = new x3();

    public x3() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(com.amazon.aps.iva.s1.l lVar, Integer num) {
        com.amazon.aps.iva.s1.l lVar2 = lVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(lVar2, "intrinsicMeasurable");
        return Integer.valueOf(lVar2.M(intValue));
    }
}

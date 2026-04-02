package com.amazon.aps.iva.d0;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.s1.l, Integer, Integer> {
    public static final p0 h = new p0();

    public p0() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(com.amazon.aps.iva.s1.l lVar, Integer num) {
        com.amazon.aps.iva.s1.l lVar2 = lVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(lVar2, "$this$intrinsicSize");
        return Integer.valueOf(lVar2.C(intValue));
    }
}

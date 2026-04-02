package com.amazon.aps.iva.d0;
/* compiled from: FlowLayout.kt */
/* loaded from: classes.dex */
public final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.s1.l, Integer, Integer, Integer> {
    public final /* synthetic */ int[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int[] iArr) {
        super(3);
        this.h = iArr;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Integer invoke(com.amazon.aps.iva.s1.l lVar, Integer num, Integer num2) {
        int intValue = num.intValue();
        num2.intValue();
        com.amazon.aps.iva.yb0.j.f(lVar, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.h[intValue]);
    }
}

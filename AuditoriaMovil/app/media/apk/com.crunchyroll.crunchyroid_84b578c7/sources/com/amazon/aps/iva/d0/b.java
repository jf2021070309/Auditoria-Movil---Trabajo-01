package com.amazon.aps.iva.d0;
/* compiled from: Arrangement.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.o2.l, Integer> {
    public static final b h = new b();

    public b() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(Integer num, com.amazon.aps.iva.o2.l lVar) {
        int intValue = num.intValue();
        com.amazon.aps.iva.o2.l lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
        int i = com.amazon.aps.iva.a1.a.a;
        float f = (intValue + 0) / 2.0f;
        float f2 = -1.0f;
        if (lVar2 != com.amazon.aps.iva.o2.l.Ltr) {
            f2 = (-1.0f) * (-1);
        }
        return Integer.valueOf(com.amazon.aps.iva.ob0.f.a((1 + f2) * f));
    }
}

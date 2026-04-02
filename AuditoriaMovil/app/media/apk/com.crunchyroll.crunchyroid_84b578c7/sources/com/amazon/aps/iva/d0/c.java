package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
/* compiled from: Arrangement.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.o2.l, Integer> {
    public final /* synthetic */ a.b h = a.C0097a.m;

    public c() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(Integer num, com.amazon.aps.iva.o2.l lVar) {
        int intValue = num.intValue();
        com.amazon.aps.iva.o2.l lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
        return Integer.valueOf(this.h.a(0, intValue, lVar2));
    }
}

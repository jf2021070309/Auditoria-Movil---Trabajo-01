package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public static final d h = new d();

    public d() {
        super(3);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar2, "$this$composed", iVar2, -2126899193);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        long j = ((com.amazon.aps.iva.l0.k0) iVar2.i(com.amazon.aps.iva.l0.l0.a)).a;
        com.amazon.aps.iva.f1.x xVar = new com.amazon.aps.iva.f1.x(j);
        iVar2.s(1157296644);
        boolean H = iVar2.H(xVar);
        Object t = iVar2.t();
        if (H || t == i.a.a) {
            t = new c(j);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f o = fVar2.o(androidx.compose.ui.draw.a.b((com.amazon.aps.iva.xb0.l) t));
        iVar2.G();
        return o;
    }
}

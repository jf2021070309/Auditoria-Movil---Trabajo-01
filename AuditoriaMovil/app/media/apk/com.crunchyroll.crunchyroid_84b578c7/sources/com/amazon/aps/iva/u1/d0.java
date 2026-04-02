package com.amazon.aps.iva.u1;

import java.util.Map;
/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public final class d0 extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b bVar) {
        super(bVar);
        com.amazon.aps.iva.yb0.j.f(bVar, "alignmentLinesOwner");
    }

    @Override // com.amazon.aps.iva.u1.a
    public final long b(androidx.compose.ui.node.o oVar, long j) {
        com.amazon.aps.iva.yb0.j.f(oVar, "$this$calculatePositionInParent");
        androidx.compose.ui.node.k p1 = oVar.p1();
        com.amazon.aps.iva.yb0.j.c(p1);
        long j2 = p1.j;
        return com.amazon.aps.iva.e1.c.f(com.amazon.aps.iva.e1.d.d((int) (j2 >> 32), com.amazon.aps.iva.o2.h.b(j2)), j);
    }

    @Override // com.amazon.aps.iva.u1.a
    public final Map<com.amazon.aps.iva.s1.a, Integer> c(androidx.compose.ui.node.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        androidx.compose.ui.node.k p1 = oVar.p1();
        com.amazon.aps.iva.yb0.j.c(p1);
        return p1.M0().c();
    }

    @Override // com.amazon.aps.iva.u1.a
    public final int d(androidx.compose.ui.node.o oVar, com.amazon.aps.iva.s1.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
        androidx.compose.ui.node.k p1 = oVar.p1();
        com.amazon.aps.iva.yb0.j.c(p1);
        return p1.e(aVar);
    }
}

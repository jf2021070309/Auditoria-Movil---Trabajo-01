package com.amazon.aps.iva.u1;

import java.util.Map;
/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public final class z extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b bVar) {
        super(bVar);
        com.amazon.aps.iva.yb0.j.f(bVar, "alignmentLinesOwner");
    }

    @Override // com.amazon.aps.iva.u1.a
    public final long b(androidx.compose.ui.node.o oVar, long j) {
        com.amazon.aps.iva.yb0.j.f(oVar, "$this$calculatePositionInParent");
        return oVar.I1(j);
    }

    @Override // com.amazon.aps.iva.u1.a
    public final Map<com.amazon.aps.iva.s1.a, Integer> c(androidx.compose.ui.node.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return oVar.M0().c();
    }

    @Override // com.amazon.aps.iva.u1.a
    public final int d(androidx.compose.ui.node.o oVar, com.amazon.aps.iva.s1.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
        return oVar.e(aVar);
    }
}

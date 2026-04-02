package com.amazon.aps.iva.u1;
/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes.dex */
public interface x extends h {
    default int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new com.amazon.aps.iva.s1.p(mVar, mVar.getLayoutDirection()), new l0(lVar, n0.Min, o0.Width), com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }

    default int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new com.amazon.aps.iva.s1.p(mVar, mVar.getLayoutDirection()), new l0(lVar, n0.Max, o0.Height), com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    default int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new com.amazon.aps.iva.s1.p(mVar, mVar.getLayoutDirection()), new l0(lVar, n0.Min, o0.Height), com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    default int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new com.amazon.aps.iva.s1.p(mVar, mVar.getLayoutDirection()), new l0(lVar, n0.Max, o0.Width), com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }

    com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j);
}

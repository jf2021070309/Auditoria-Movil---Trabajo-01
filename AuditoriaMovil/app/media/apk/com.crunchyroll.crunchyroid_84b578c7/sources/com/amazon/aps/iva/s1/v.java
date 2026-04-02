package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.a1.f;
/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
public interface v extends f.b {
    default int b(m mVar, l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new p(mVar, mVar.getLayoutDirection()), new h0(lVar, j0.Min, k0.Width), com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }

    default int c(m mVar, l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new p(mVar, mVar.getLayoutDirection()), new h0(lVar, j0.Max, k0.Height), com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    default int d(m mVar, l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new p(mVar, mVar.getLayoutDirection()), new h0(lVar, j0.Min, k0.Height), com.amazon.aps.iva.o2.b.b(i, 0, 13)).getHeight();
    }

    default int e(m mVar, l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return f(new p(mVar, mVar.getLayoutDirection()), new h0(lVar, j0.Max, k0.Width), com.amazon.aps.iva.o2.b.b(0, i, 7)).getWidth();
    }

    e0 f(f0 f0Var, c0 c0Var, long j);
}

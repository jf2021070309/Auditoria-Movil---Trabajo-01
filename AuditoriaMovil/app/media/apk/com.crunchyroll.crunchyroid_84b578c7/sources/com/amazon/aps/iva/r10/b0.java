package com.amazon.aps.iva.r10;

import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.r10.c0;
/* compiled from: HistoryListBoundaryCallback.kt */
/* loaded from: classes2.dex */
public final class b0 extends h.c<a0> {
    public final com.amazon.aps.iva.i5.v<c0> a;

    public b0(com.amazon.aps.iva.i5.v<c0> vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "historyListState");
        this.a = vVar;
    }

    @Override // com.amazon.aps.iva.j8.h.c
    public final void a(a0 a0Var) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "itemAtEnd");
        this.a.k(c0.c.a);
    }
}

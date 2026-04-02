package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.vt.g;
/* compiled from: CommentsListBoundaryCallback.kt */
/* loaded from: classes2.dex */
public final class f extends h.c<com.amazon.aps.iva.du.x> {
    public final com.amazon.aps.iva.i5.v<g> a;

    public f(com.amazon.aps.iva.i5.v<g> vVar) {
        this.a = vVar;
    }

    @Override // com.amazon.aps.iva.j8.h.c
    public final void a(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "itemAtEnd");
        this.a.k(g.e.a);
    }

    @Override // com.amazon.aps.iva.j8.h.c
    public final void b(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "itemAtFront");
    }

    @Override // com.amazon.aps.iva.j8.h.c
    public final void c() {
    }
}

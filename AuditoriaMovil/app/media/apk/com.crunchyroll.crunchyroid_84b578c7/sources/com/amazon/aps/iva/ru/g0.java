package com.amazon.aps.iva.ru;

import java.util.Iterator;
/* compiled from: CommentRepliesViewModel.kt */
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ h0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var) {
        super(1);
        this.h = h0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar) {
        h0 h0Var;
        com.amazon.aps.iva.du.x xVar;
        com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "pagedList");
        Iterator<com.amazon.aps.iva.du.x> it = hVar2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            h0Var = this.h;
            if (hasNext) {
                xVar = it.next();
                if (com.amazon.aps.iva.yb0.j.a(xVar.b, h0Var.b.b)) {
                    break;
                }
            } else {
                xVar = null;
                break;
            }
        }
        com.amazon.aps.iva.du.x xVar2 = xVar;
        if (xVar2 != null) {
            h0Var.b = xVar2;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.du.x> vVar = h0Var.j;
            com.amazon.aps.iva.du.x d = vVar.d();
            com.amazon.aps.iva.yb0.j.c(d);
            boolean z = d.s;
            com.amazon.aps.iva.du.x d2 = vVar.d();
            com.amazon.aps.iva.yb0.j.c(d2);
            vVar.k(com.amazon.aps.iva.du.x.a(xVar2, 0, false, 0, false, false, false, false, false, d2.r, z, 65023));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

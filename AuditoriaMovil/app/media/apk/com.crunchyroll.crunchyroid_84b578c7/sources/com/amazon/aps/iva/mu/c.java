package com.amazon.aps.iva.mu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentVotePresenter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<x, q> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(x xVar) {
        x xVar2 = xVar;
        j.f(xVar2, "updatedModel");
        this.h.getView().i1(xVar2);
        return q.a;
    }
}

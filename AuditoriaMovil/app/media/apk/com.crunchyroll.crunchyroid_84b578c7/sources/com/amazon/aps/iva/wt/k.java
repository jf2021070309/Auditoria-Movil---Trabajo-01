package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.wt.m;
/* compiled from: CommentActionPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "it");
        i iVar = this.h;
        i.q6(iVar).b();
        i.q6(iVar).showSnackbar(m.a.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

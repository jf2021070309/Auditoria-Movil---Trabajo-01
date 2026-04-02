package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.e4.l1;
/* compiled from: CommentsPresenter.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar) {
        com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "commentsPagedList");
        boolean w = l1.w(hVar2);
        l lVar = this.h;
        if (w) {
            l.q6(lVar).W1(hVar2);
        } else {
            l.r6(lVar);
            l.q6(lVar).W1(hVar2);
            l.q6(lVar).Y();
        }
        l.q6(lVar).o2();
        lVar.g.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

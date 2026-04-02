package com.amazon.aps.iva.ru;

import com.amazon.aps.iva.e4.l1;
/* compiled from: CommentRepliesPresenter.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar) {
        com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "commentsPagedList");
        boolean w = l1.w(hVar2);
        w wVar = this.h;
        if (w) {
            w.q6(wVar).W1(hVar2);
        } else {
            w.r6(wVar);
            w.q6(wVar).W1(hVar2);
            w.q6(wVar).Y();
        }
        w.q6(wVar).o2();
        wVar.g.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

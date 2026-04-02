package com.amazon.aps.iva.ru;

import com.amazon.aps.iva.vt.g;
/* compiled from: CommentRepliesViewModel.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Throwable, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object>, com.amazon.aps.iva.kb0.q> {
    public f0(Object obj) {
        super(2, obj, h0.class, "postErrorLoadingState", "postErrorLoadingState(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> lVar) {
        com.amazon.aps.iva.vt.g bVar;
        Throwable th2 = th;
        com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(th2, "p0");
        com.amazon.aps.iva.yb0.j.f(lVar2, "p1");
        h0 h0Var = (h0) this.receiver;
        h0Var.getClass();
        if (th2 instanceof com.amazon.aps.iva.cu.a) {
            bVar = new g.a(th2);
        } else if (th2 instanceof com.amazon.aps.iva.cu.c) {
            bVar = g.c.a;
        } else {
            bVar = new g.b(new j0(h0Var, lVar2));
        }
        h0Var.h.i(bVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

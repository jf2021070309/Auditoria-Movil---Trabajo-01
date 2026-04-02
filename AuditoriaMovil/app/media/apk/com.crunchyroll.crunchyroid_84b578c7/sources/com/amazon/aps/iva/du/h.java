package com.amazon.aps.iva.du;
/* compiled from: CommentItemPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ j i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, j jVar) {
        super(1);
        this.h = aVar;
        this.i = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(f fVar) {
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "$this$notify");
        x xVar = this.i.c;
        if (xVar != null) {
            fVar2.M0(this.h, xVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("commentUiModel");
        throw null;
    }
}

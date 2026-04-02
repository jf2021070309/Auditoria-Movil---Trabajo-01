package com.amazon.aps.iva.du;
/* compiled from: CommentItemPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, boolean z) {
        super(1);
        this.h = jVar;
        this.i = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(f fVar) {
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "$this$notify");
        x xVar = this.h.c;
        if (xVar != null) {
            fVar2.o(x.a(xVar, 0, false, 0, false, false, false, false, false, false, !this.i, 131071));
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("commentUiModel");
        throw null;
    }
}

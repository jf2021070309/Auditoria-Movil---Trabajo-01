package com.amazon.aps.iva.ku;
/* compiled from: PostCommentPresenter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "it");
        v vVar = this.h;
        if (vVar.g.c()) {
            vVar.getView().showSnackbar(com.amazon.aps.iva.bt.c.b);
        } else {
            vVar.getView().showSnackbar(r.b);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

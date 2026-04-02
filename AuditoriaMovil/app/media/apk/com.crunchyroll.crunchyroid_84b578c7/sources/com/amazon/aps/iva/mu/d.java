package com.amazon.aps.iva.mu;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentVotePresenter.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        j.f(th, "it");
        this.h.getView().showSnackbar(com.amazon.aps.iva.bt.c.b);
        return q.a;
    }
}

package com.amazon.aps.iva.yt;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentsInputPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        j.f(th, "it");
        this.h.getView().ma();
        return q.a;
    }
}

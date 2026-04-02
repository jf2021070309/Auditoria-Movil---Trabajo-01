package com.amazon.aps.iva.h20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.rs.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrPlusAlternativeFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        Throwable th2 = th;
        j.f(th2, "exception");
        if (th2 instanceof h) {
            this.h.getView().Wf();
        }
        return q.a;
    }
}

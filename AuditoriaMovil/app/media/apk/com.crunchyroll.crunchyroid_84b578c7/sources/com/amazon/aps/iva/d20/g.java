package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "it");
        i iVar = this.h;
        iVar.d.a(iVar);
        iVar.getView().N();
        return q.a;
    }
}

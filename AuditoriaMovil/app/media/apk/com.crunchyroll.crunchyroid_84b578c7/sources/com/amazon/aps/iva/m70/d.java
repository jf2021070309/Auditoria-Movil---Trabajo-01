package com.amazon.aps.iva.m70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LoadingStatePresenter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class d extends i implements com.amazon.aps.iva.xb0.a<q> {
    public d(e eVar) {
        super(0, eVar, e.class, "onRetry", "onRetry()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        e eVar = (e) this.receiver;
        eVar.getView().Bc();
        a aVar = eVar.b;
        j.d(aVar, "null cannot be cast to non-null type com.ellation.widgets.loadingstateadapter.LoadingState.Failure");
        ((a.b) aVar).c.invoke();
        return q.a;
    }
}

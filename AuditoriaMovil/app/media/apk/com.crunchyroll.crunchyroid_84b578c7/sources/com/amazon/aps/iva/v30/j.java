package com.amazon.aps.iva.v30;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SearchResultDetailPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        boolean z = th2 instanceof com.amazon.aps.iva.jz.c;
        k kVar = this.h;
        if (z) {
            k.q6(kVar).showSnackbar(b.b);
            com.amazon.aps.iva.mf0.a.a.d(th2);
        } else {
            k.q6(kVar).y0();
        }
        k.q6(kVar).b();
        kVar.e.B(th2.getMessage(), com.amazon.aps.iva.ls.a.SEARCH_RESULTS);
        return q.a;
    }
}

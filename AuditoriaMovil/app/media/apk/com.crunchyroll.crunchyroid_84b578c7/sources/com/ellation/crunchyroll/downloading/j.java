package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e0 e0Var) {
        super(1);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.M3(f1.J(this.h.a(e0.b.STARTED)));
        return com.amazon.aps.iva.kb0.q.a;
    }
}

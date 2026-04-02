package com.amazon.aps.iva.vv;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.sv.f2;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BulkDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.l<f2<a>, q> {
    public final /* synthetic */ com.amazon.aps.iva.hg.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.hg.c cVar) {
        super(1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(f2<a> f2Var) {
        f2<a> f2Var2 = f2Var;
        com.amazon.aps.iva.yb0.j.f(f2Var2, "$this$notify");
        f2Var2.c.F0().invoke(this.h);
        return q.a;
    }
}

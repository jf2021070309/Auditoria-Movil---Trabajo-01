package com.amazon.aps.iva.md;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DeleteAccountScreen.kt */
/* loaded from: classes.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
    public final /* synthetic */ q1<Boolean> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q1<Boolean> q1Var) {
        super(1);
        this.h = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "it");
        this.h.setValue(Boolean.TRUE);
        return q.a;
    }
}

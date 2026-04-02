package com.amazon.aps.iva.tz;

import java.util.List;
/* compiled from: BrowseAllPresenter.kt */
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var) {
        super(1);
        this.h = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g> jVar) {
        List<? extends com.amazon.aps.iva.uz.h> list;
        com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g> jVar2 = jVar;
        b0 b0Var = this.h;
        o0 q6 = b0.q6(b0Var);
        if (jVar2 != null) {
            list = (List) jVar2.b;
        } else {
            list = null;
        }
        com.amazon.aps.iva.yb0.j.c(list);
        q6.G0(list);
        b0.q6(b0Var).b2();
        b0.q6(b0Var).rf();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

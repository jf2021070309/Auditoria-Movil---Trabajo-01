package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ez.g;
import java.util.List;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class u0 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> {
    public u0(Object obj) {
        super(1, obj, p0.class, "onFirstPageLoaded", "onFirstPageLoaded(Ljava/util/List;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.uz.h> list) {
        List<? extends com.amazon.aps.iva.uz.h> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "p0");
        p0 p0Var = (p0) this.receiver;
        p0Var.getClass();
        p0Var.e.k(new g.c(list2, null));
        return com.amazon.aps.iva.kb0.q.a;
    }
}

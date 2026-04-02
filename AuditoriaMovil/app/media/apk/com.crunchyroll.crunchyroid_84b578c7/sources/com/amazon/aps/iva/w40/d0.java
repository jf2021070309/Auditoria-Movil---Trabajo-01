package com.amazon.aps.iva.w40;

import java.util.List;
/* compiled from: SimulcastPresenter.kt */
/* loaded from: classes2.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var) {
        super(1);
        this.h = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.uz.h> list) {
        boolean z;
        b0 b0Var = this.h;
        b0.q6(b0Var).g0();
        List<? extends com.amazon.aps.iva.uz.h> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            b0.q6(b0Var).v0();
        } else {
            b0.q6(b0Var).C0();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.w40;

import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.util.List;
/* compiled from: SimulcastPresenter.kt */
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends SimulcastSeason>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b0 b0Var) {
        super(1);
        this.h = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends SimulcastSeason> list) {
        List<? extends SimulcastSeason> list2 = list;
        b0 b0Var = this.h;
        b0.q6(b0Var).N();
        b0.q6(b0Var).Mh();
        n0 q6 = b0.q6(b0Var);
        if (list2 == null) {
            list2 = com.amazon.aps.iva.lb0.z.b;
        }
        q6.G2(list2);
        b0Var.g.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.util.List;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final class r0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends SimulcastSeason>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var) {
        super(1);
        this.h = p0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends SimulcastSeason> list) {
        List<? extends SimulcastSeason> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "seasons");
        p0 p0Var = this.h;
        p0Var.f.k(new g.c(list2, null));
        if (p0Var.g.d() == null) {
            p0Var.v4(list2.get(0));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

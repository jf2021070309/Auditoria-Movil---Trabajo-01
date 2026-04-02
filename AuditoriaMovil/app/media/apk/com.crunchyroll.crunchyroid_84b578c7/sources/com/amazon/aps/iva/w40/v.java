package com.amazon.aps.iva.w40;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
/* compiled from: SimulcastFragment.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ SimulcastFragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SimulcastFragment simulcastFragment) {
        super(1);
        this.h = simulcastFragment;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        b0 b0Var = this.h.o;
        if (b0Var != null) {
            com.amazon.aps.iva.oh.a B = com.amazon.aps.iva.e.w.B(panel2);
            String title = panel2.getTitle();
            com.amazon.aps.iva.yb0.j.f(title, "title");
            b0Var.getView().e(title, new i0(b0Var, B), m0.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("presenter");
        throw null;
    }
}

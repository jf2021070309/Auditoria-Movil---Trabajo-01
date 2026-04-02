package com.amazon.aps.iva.tz;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: BrowseAllFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class l extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Panel, Integer, com.amazon.aps.iva.kb0.q> {
    public l(b0 b0Var) {
        super(2, b0Var, z.class, "onItemClick", "onItemClick(Lcom/ellation/crunchyroll/model/Panel;I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel, Integer num) {
        Panel panel2 = panel;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        ((z) this.receiver).i(panel2, intValue);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.n10;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: GenreFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class p extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.r<Panel, Integer, Integer, String, com.amazon.aps.iva.kb0.q> {
    public p(w wVar) {
        super(4, wVar, s.class, "onItemClick", "onItemClick(Lcom/ellation/crunchyroll/model/Panel;IILjava/lang/String;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final com.amazon.aps.iva.kb0.q K(Panel panel, Integer num, Integer num2, String str) {
        Panel panel2 = panel;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        com.amazon.aps.iva.yb0.j.f(str2, "p3");
        ((s) this.receiver).e2(panel2, intValue, intValue2, str2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

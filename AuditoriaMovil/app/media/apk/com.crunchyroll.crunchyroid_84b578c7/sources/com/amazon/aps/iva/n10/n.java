package com.amazon.aps.iva.n10;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: GenreFragment.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        w wVar = this.h.i;
        if (wVar != null) {
            com.amazon.aps.iva.oh.a B = com.amazon.aps.iva.e.w.B(panel2);
            String title = panel2.getTitle();
            com.amazon.aps.iva.yb0.j.f(title, "title");
            wVar.getView().e(title, new x(wVar, B), y.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("presenter");
        throw null;
    }
}

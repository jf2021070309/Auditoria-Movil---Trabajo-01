package com.amazon.aps.iva.hv;

import com.amazon.aps.iva.hv.a;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistSearchFragment.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "it");
        a.C0345a c0345a = a.g;
        this.h.ei().getPresenter().i0(panel2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

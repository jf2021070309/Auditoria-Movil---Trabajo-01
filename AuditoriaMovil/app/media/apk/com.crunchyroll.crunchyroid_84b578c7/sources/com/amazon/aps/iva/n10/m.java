package com.amazon.aps.iva.n10;

import android.content.Context;
import com.amazon.aps.iva.i50.b;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: GenreFragment.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        Context requireContext = this.h.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        b.a.a(new com.amazon.aps.iva.i50.c(requireContext, new com.amazon.aps.iva.i50.a(requireContext, true)), panel2, com.amazon.aps.iva.no.a.OVERFLOW_WATCH_NOW, null, 12);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

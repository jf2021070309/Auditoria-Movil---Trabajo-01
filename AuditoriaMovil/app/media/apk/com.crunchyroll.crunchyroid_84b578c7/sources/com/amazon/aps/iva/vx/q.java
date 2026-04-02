package com.amazon.aps.iva.vx;

import android.app.Activity;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ HomeFeedScreenView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(HomeFeedScreenView homeFeedScreenView) {
        super(1);
        this.h = homeFeedScreenView;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        k kVar = defpackage.i.f;
        if (kVar != null) {
            n f = kVar.f();
            Activity a = com.amazon.aps.iva.xw.q.a(this.h.getContext());
            com.amazon.aps.iva.yb0.j.c(a);
            f.b(a).b(panel2);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
